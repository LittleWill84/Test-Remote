package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentation.GUIMain;

public class ControllerMain implements ActionListener{

	//Declaración de instancias de clases y variables
	private GUIMain guiM;

	
	public ControllerMain(int resultAcces) {
		
		System.out.println("Segunda Prueba GIT");
		//Inicializo Instancias
		guiM = new GUIMain(resultAcces);
		
		initializerAction();

	}

	public void initializerAction() {

		guiM.getMiStudents().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==guiM.getMiStudents()) {

			new Controller();
		}
	}
}
