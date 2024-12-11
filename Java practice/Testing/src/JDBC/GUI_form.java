package JDBC;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUI_form extends JFrame {
	private JLabel lblName, lblGender, lblGrade, lblId;
	private static JTextField txtName;
	private static JTextField txtId;
	private Integer[] grades = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	private static JComboBox<Integer> cbxGrade;
	private JRadioButton rdoMale;
	private static JRadioButton rdoFamale;
	private ButtonGroup buttonGroup;
	private JPanel pGender;
	private JButton btSave, btDelete;
	private JTable table = new JTable();
	private int seletedRow = -1;
	private Connection connection;

	public GUI_form(Connection connection) {
		this.connection = connection;
		this.setSize(400, 500);
		this.setTitle("Student form");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel form = CreateForm();
		this.getContentPane().add(form, BorderLayout.NORTH);
		table = CreateTable();
		JScrollPane JS = new JScrollPane();
		JS.getViewport().add(table);
		addMouseEventClickToTable();
		this.getContentPane().add(JS);

		this.setVisible(true);
	}

	private JPanel CreateForm() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));

		// id
		lblId = new JLabel("Id: ");
		txtId = new JTextField();

		// Name
		lblName = new JLabel("Name: ");
		txtName = new JTextField();

		// gender
		lblGender = new JLabel("Gender: ");
		rdoMale = new JRadioButton("Male");
		rdoFamale = new JRadioButton("Famale");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdoMale);
		buttonGroup.add(rdoFamale);
		pGender = new JPanel(new FlowLayout());
		pGender.add(rdoMale);
		pGender.add(rdoFamale);

		// grade
		lblGrade = new JLabel("Grade: ");
		cbxGrade = new JComboBox<>(grades);

		// button
		btSave = new JButton("Save");
		btDelete = new JButton("Delete");

		panel.add(lblId);
		panel.add(txtId);
		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblGender);
		panel.add(pGender);
		panel.add(lblGrade);
		panel.add(cbxGrade);
		panel.add(btSave);

		btSave.addActionListener(new ClickListener());

		return panel;
	}

	private void ClearForm() {
		txtId.setText("");
		txtName.setText("");
		rdoMale.setSelected(true);
		cbxGrade.setSelectedIndex(0);
	}

	private JTable CreateTable() {

		String[] ColumnName = new String[] { "id", "name", "gender", "grade" };
		Object[][] RowData = {

		};

		DefaultTableModel model = new DefaultTableModel(RowData, ColumnName);
		JTable table = new JTable(model);
		return table;
	}

	private class ClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String gender = "Male";
			if (rdoFamale.isSelected()) {
				gender = "Famale";
			}
			if (seletedRow != -1) {
				table.setValueAt(txtId.getText(), seletedRow, 0);
				table.setValueAt(txtName.getText(), seletedRow, 1);
				table.setValueAt(gender, seletedRow, 2);
				table.setValueAt(cbxGrade.getSelectedItem().toString(), seletedRow, 3);
			} else {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object[] data = { 
						txtId.getText(),
						txtName.getText(), 
						gender, 
						cbxGrade.getSelectedItem().toString()
				};
				model.addRow(data);
				ClearForm();
				  Student student = new Student(
	                        Integer.parseInt(txtId.getText()),
	                        txtName.getText(),
	                        gender,
	                        (Integer) cbxGrade.getSelectedItem()
	                );
			}
		}

	}

	private void SetValue() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		seletedRow = table.getSelectedRow();
		Object id = model.getValueAt(seletedRow, 0);
		Object name = model.getValueAt(seletedRow, 1);
		Object gender = model.getValueAt(seletedRow, 2);
		Object grade = model.getValueAt(seletedRow, 3);

		txtId.setText(id.toString());
		txtName.setText(name.toString());
		if (gender.toString().equals("Male")) {
			rdoMale.setSelected(true);
		} else {
			rdoFamale.setSelected(false);
		}
		cbxGrade.setSelectedItem(grade.toString());
	}
	private void addMouseEventClickToTable() {
		table.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 SetValue();
				 
			 }
		});
	}
//	public static Student ToStudent() {
//		GUI_form form = new GUI_form();
////		int studentid = Integer.parseInt(txtId.getText());
//		String studentName = txtName.getText();
//		String gender = "Male";
//		if(rdoFamale.isSelected()) {
//			gender = "Famale";
//		}
//		String studentGender = gender;
//		int studentGrade = Integer.parseInt(cbxGrade.getSelectedItem().toString());
//		Student student = new Student(studentName, studentGender, studentGrade);
//		return student;

//	public static Student st1() {
//		System.out.println("==================================================");
//		System.out.print("\t- Input your name  : "); String name = sc.next();
//		System.out.print("\t- Input your gender: "); String gender = sc.next();
//		System.out.print("\t- Input your grade : "); int grade = Integer.parseInt(sc.next());
//		System.out.println("==================================================");
//		Student student = new Student(name, gender, grade);
//		return student;
	}
