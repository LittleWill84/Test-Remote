package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import data.FilesTxt;
import data.LogicFilesTxt;
import domain.Student;
import presentation.GUI;

public class Controller implements ActionListener{

	//Declaración de instancias de clases y variables
	private GUI gui;
	private FilesTxt fTxt;
	private LogicFilesTxt lFTxt;
	
	private Student stu;
	


	public Controller() {
		//Inicializo Instancias
		gui = new GUI();
		fTxt = new FilesTxt();
		lFTxt = new LogicFilesTxt();
		
		initializerAction();

	}

	public void initializerAction() {

		gui.getBRegister().addActionListener(this);
		gui.getBRead().addActionListener(this);
		gui.getBSearch().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==gui.getBRegister()) {


			stu = new Student(gui.getTId().getText(),gui.getTName().getText(),
					Integer.parseInt(gui.getTAge().getText()),
					gui.getCXGender().getSelectedItem().toString(),
					gui.getTIds().getText(),gui.getTCareer().getText(),
					gui.getTSchedule().getText(),
					Integer.parseInt(gui.getTScholarship().getText()));

			fTxt.writeFile("Estudiantes.txt", stu.toString());
			
			gui.cleanForm();
		}

		if(e.getSource()==gui.getBRead()) {
	
			gui.getTAComments().setText(fTxt.readFile("Estudiantes.txt"));

		}
		
		if(e.getSource()==gui.getBSearch()) {
			
		//	stu = lFTxt.searchStudent("Estudiantes.txt", gui.getTId().getText());
			
			gui.getTName().setText(stu.getName());
			gui.getTAge().setText(String.valueOf(stu.getAge()));
		}
	}

}
