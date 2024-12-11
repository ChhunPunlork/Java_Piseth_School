package GuiSwing.creating;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;

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

public class Student_form extends JFrame {
	private JPanel panel;
	private JLabel lblName, lblGender;
	private JTextField txtName;
	private JRadioButton rdoMale;
	private JRadioButton rdoFamale;
	private ButtonGroup btGroup;
	private JButton btSave, btDelete;
	private JPanel pnGender;
	private JLabel lblGrade;
	private JLabel lblAge;
	private JTextField txtAge;
	private JComboBox<Integer> cbxGrade;
	private int selectedRow = -1;
	private Integer[] Grades = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	private JTable table = new JTable();
	
	FileServiceStudent fileServiceStudent  = new FileServiceStudent();

	public Student_form() {
		this.setTitle("Student Information");
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JPanel form = CreateForm();
		this.getContentPane().add(form, BorderLayout.NORTH);

		table = CreateTable();
		JScrollPane JS = new JScrollPane();
		JS.getViewport().add(table);

		addMouseClickEventToTable();

		this.getContentPane().add(JS);
		this.setVisible(true);
	}

	private JPanel CreateForm() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));
		// Name form
		lblName = new JLabel("Name: ");
		txtName = new JTextField();

		// Gender form
		lblGender = new JLabel("Gender: ");
		rdoMale = new JRadioButton("Male");
		rdoFamale = new JRadioButton("Famale");
		btGroup = new ButtonGroup();
		btGroup.add(rdoMale);
		btGroup.add(rdoFamale);
		pnGender = new JPanel(new FlowLayout());
		pnGender.add(rdoMale);
		pnGender.add(rdoFamale);

		// Grade form
		lblGrade = new JLabel("Grade: ");
		cbxGrade = new JComboBox<Integer>(Grades);

		// Age form
		lblAge = new JLabel("Age: ");
		txtAge = new JTextField();

		// Save button
		btSave = new JButton("Save");
		btDelete = new JButton("Delete");

		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblGender);
		panel.add(pnGender);
		panel.add(lblGrade);
		panel.add(cbxGrade);
		panel.add(lblAge);
		panel.add(txtAge);
		panel.add(btSave);
		panel.add(btDelete);
		btSave.addActionListener(new ClickListener());
		btDelete.addActionListener(new ClickListener());

		return panel;
	}

	private JTable CreateTable() {
		String[] ColumnName = new String[] { "Name", "Gender", "grade", "Age" };
		Object[][] rowData = {};
		DefaultTableModel DfTb = new DefaultTableModel(rowData, ColumnName);
		table = new JTable(DfTb);

		return table;
	}

	private class ClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == btSave) {
				SaveOrUpdate();
			}
			else if(e.getSource() == btDelete) {
				RemoveRowData();
			}

		}

	}

	private void addMouseClickEventToTable() {
		table.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				SetFormValue();
				super.mouseClicked(e);
			}

		});
	}

	private void SetFormValue() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		selectedRow = table.getSelectedRow();
		Object name = model.getValueAt(selectedRow, 0);
		Object gender = model.getValueAt(selectedRow, 1);
		Object grade = model.getValueAt(selectedRow, 2);
		Object age = model.getValueAt(selectedRow, 3);

		txtName.setText(name.toString());
		if (gender.toString().equals("Male")) {
			rdoMale.setSelected(true);
		} else {
			rdoFamale.setSelected(true);
		}
		cbxGrade.setSelectedItem(Integer.parseInt(grade.toString()));
		txtAge.setText(age.toString());
	}

	private void ClearForm() {
		txtName.setText("");
		rdoMale.setSelected(true);
		cbxGrade.setSelectedIndex(0);
		txtAge.setText("");
	}
	
	private void SaveOrUpdate() {
		int count = 0;
		String gender = "Male";
		if (rdoFamale.isSelected()) {
			gender = "Famale";
		}
		if (selectedRow != -1) {
			table.setValueAt(txtName.getText(), selectedRow, 0);
			table.setValueAt(gender, selectedRow, 1);
			table.setValueAt(cbxGrade.getSelectedItem().toString(), selectedRow, 2);
			table.setValueAt(txtAge.getText(), selectedRow, 3);
			selectedRow = -1;
		} else {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] data = { txtName.getText(), gender, cbxGrade.getSelectedItem().toString(), txtAge.getText() };
			model.addRow(data);
		}
		String nameToFile = txtName.getText();
		String genderToFile = gender; 
		String gradetoFile = cbxGrade.getSelectedItem().toString();
		String ageTofile =  txtAge.getText();
		fileServiceStudent.SaveFile(nameToFile, genderToFile, gradetoFile, ageTofile);
		ClearForm();
	}
	private void RemoveRowData() {
		DefaultTableModel model = (DefaultTableModel) table.getModel(); //model is data we put
		if(selectedRow != -1) {
			model.removeRow(selectedRow);
			selectedRow = -1;
		}
		ClearForm();
	}
//	private void SaveToFile() {
//		String nameToFile = txtName.getText();
//		String genderToFile = 
//		
//		
//		
//		
//	}
}
