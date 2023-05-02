package presentation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUIMain extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mFile;
	private JMenu mOperations;
	private JMenu mHelp;
	private JMenuItem miOpen;
	private JMenuItem miSave;
	private JMenuItem miExit;
	private JMenuItem miStudents;
	private JMenuItem miAboutSystem;
	private JMenuItem miCourses;

	private int resultAcces;
	
	public GUIMain(int resultAcces) {
		
		this.resultAcces=resultAcces;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setSize(getMaximumSize());
	}
	
	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMFile());
			menuBar.add(getMOperations(resultAcces));
			menuBar.add(getMHelp());
		}
		return menuBar;
	}
	public JMenu getMFile() {
		if (mFile == null) {
			mFile = new JMenu("Archivo");
			mFile.add(getMiOpen());
			mFile.add(getMiSave());
			mFile.add(getMiExit());
		}
		return mFile;
	}
	public JMenu getMOperations(int resultAcces) {
		
		if (mOperations == null) {
			mOperations = new JMenu("Operaciones");
			
			if(resultAcces==1) {
				mOperations.add(getMiStudents());
				mOperations.add(getMiCourses());
			}else {
				mOperations.add(getMiStudents());
			}
		}
		return mOperations;
	}
	public JMenu getMHelp() {
		if (mHelp == null) {
			mHelp = new JMenu("Ayuda");
			mHelp.add(getMiAboutSystem());
		}
		return mHelp;
	}
	public JMenuItem getMiOpen() {
		if (miOpen == null) {
			miOpen = new JMenuItem("Abrir");
		}
		return miOpen;
	}
	public JMenuItem getMiSave() {
		if (miSave == null) {
			miSave = new JMenuItem("Guardar");
		}
		return miSave;
	}
	public JMenuItem getMiExit() {
		if (miExit == null) {
			miExit = new JMenuItem("Salir");
		}
		return miExit;
	}
	public JMenuItem getMiStudents() {
		if (miStudents == null) {
			miStudents = new JMenuItem("Estudiantes");
		}
		return miStudents;
	}
	public JMenuItem getMiAboutSystem() {
		if (miAboutSystem == null) {
			miAboutSystem = new JMenuItem("Acerca del Sistema");
		}
		return miAboutSystem;
	}
	public JMenuItem getMiCourses() {
		if (miCourses == null) {
			miCourses = new JMenuItem("Cursos");
		}
		return miCourses;
	}
}
