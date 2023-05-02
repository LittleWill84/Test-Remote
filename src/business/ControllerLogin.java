package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import data.FilesTxt;
import data.LogicFilesTxt;
import domain.Student;
import presentation.GUI;
import presentation.GUILogin;

public class ControllerLogin implements ActionListener{

	//Declaración de instancias de clases y variables
	private GUILogin guiL;
	private FilesTxt fTxt;
	private LogicFilesTxt lFTxt;
	
	private int resultAcces;

	public ControllerLogin() {
		
		//Inicializo Instancias
		guiL = new GUILogin();
		fTxt = new FilesTxt();
		lFTxt = new LogicFilesTxt();
		
		initializerAction();
	}

	public void initializerAction() {

		guiL.getBLoguin().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==guiL.getBLoguin()) {
			
			resultAcces= lFTxt.getLogin("Users.txt",guiL.getTUser().getText(),String.valueOf(guiL.getPassword().getPassword()));
				
				new ControllerMain(resultAcces);
				guiL.dispose();
		/*	}else {
				guiL.showMessage("Acceso Inválido");
			}*/

		}
	}
}
