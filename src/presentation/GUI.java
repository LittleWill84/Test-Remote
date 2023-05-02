package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class GUI extends JFrame{

	//Etiquetas
	private JLabel lId;
	private JLabel lName;
	private JLabel lAge;
	private JLabel lGender;
	
	private JLabel lIdS;
	private JLabel lCareer;
	private JLabel lSchedule;
	
	private JLabel lScholarship;

	//Campos de texto
	private JTextField tId;
	private JTextField tName;
	private JTextField tAge;
	private JTextField tIds;
	private JTextField tCareer;
	private JTextField tSchedule;
	private JTextField tScholarship;

	//ComboBox
	private JComboBox cxGender;

	public String arrayComboGender[]={"Ninguno","Masculino","Femenino"};

	private JTextArea taComments;

	private JScrollPane spComments;

	//Botones
	private JButton bRegister;
	private JButton bRead;
	private JButton bSearch;

	//Constructor
	public GUI() {

		setLId("Cédula");
		setLName("Nombre");
		setLAge("Edad");
		setLGender("Género");

		setLIdS("Carnét");
		setLCareer("Carrera");
		setLSchedule("Horario");
		setLScholarship("Beca");

		setTId();
		setTName();
		setTAge();
		setTIds();
		setTCareer();		
		setTSchedule();
		setTScholarship();
		
		setCXGender(arrayComboGender);

		setTAComments();
		setSPComments(taComments);

		setBRead("Leer");
		setBRegister("Registrar");
		setBSearch("Buscar");

		//Agregan los componentes a la Ventana (JFrame)
		add(lId);
		add(lName);
		add(lAge);
		add(lGender);

		add(lIdS);
		add(lCareer);
		add(lSchedule);
		add(lScholarship);

		add(tId);
		add(tName);
		add(tAge);


		add(tIds);
		add(tCareer);
		add(tSchedule);
		add(tScholarship);
		
		add(cxGender);
		
		add(spComments);

		add(bRead);
		add(bRegister);
		add(bSearch);

		initializer();
	}

	public void initializer() {

		setTitle("Sistema Progra II");//Título de la ventana
		setLayout(null);//Método de ordenamiento de los componentes
		setSize(500,300);//Tamaño de la ventana
		setVisible(true);//Visibilidad de la ventana
		setLocationRelativeTo(null);//Centrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Borrar de memoria luego darle click a la X de la ventana
	}

	public void setLId(String name) {

		lId = new JLabel(name);//Inicialización del componente
		//lId.setText(name);//Asignar un texto al componente
		lId.setBounds(10, 10, 100, 20);//Las coordenadas y tamaño del componente	
	}

	public JLabel getLId() {

		return this.lId;
	}

	public void setLName(String name) {

		lName = new JLabel();
		lName.setText(name);
		lName.setBounds(130, 10, 100, 20);	
	}

	public JLabel getLName() {

		return this.lName;
	}

	public void setLAge(String name) {

		lAge = new JLabel();
		lAge.setText(name);
		lAge.setBounds(250, 10, 100, 20);	
	}

	public JLabel getLAge() {

		return this.lName;
	}

	public void setLGender(String name) {

		lGender = new JLabel();
		lGender.setText(name);
		lGender.setBounds(370, 10, 100, 20);	
	}

	public JLabel getLGender() {

		return this.lGender;
	}

	public void setLIdS(String name) {

		this.lIdS = new JLabel();
		this.lIdS.setText(name);
		this.lIdS.setBounds(10, 70, 100, 20);	
	}

	public JLabel getLIdS() {

		return this.lIdS;
	}

	public void setLCareer(String name) {

		this.lCareer = new JLabel();
		this.lCareer.setText(name);
		this.lCareer.setBounds(130, 70, 100, 20);	
	}

	public JLabel getLCareer() {

		return this.lCareer;
	}

	public void setLSchedule(String name) {

		this.lSchedule = new JLabel();
		this.lSchedule.setText(name);
		this.lSchedule.setBounds(250, 70, 100, 20);	
	}

	public JLabel getLSchedule() {

		return this.lSchedule;
	}

	public void setLScholarship(String name) {

		this.lScholarship = new JLabel();
		this.lScholarship.setText(name);
		this.lScholarship.setBounds(370, 70, 100, 20);	
	}

	public JLabel getLScholarship() {

		return this.lScholarship;
	}

	public void setTId() {

		tId = new JTextField();
		tId.setBounds(10,35,100,20);
	}

	public JTextField getTId(){

		return this.tId;
	}

	public void setTName() {

		tName = new JTextField();
		tName.setBounds(130,35,100,20);
	}

	public JTextField getTName(){

		return this.tName;
	}

	public void setTAge() {

		tAge = new JTextField();
		tAge.setBounds(250,35,100,20);
	}

	public JTextField getTAge(){

		return this.tAge;
	}

	public void setTIds() {

		tIds = new JTextField();
		tIds.setBounds(10,90,100,20);
	}

	public JTextField getTIds(){

		return this.tIds;
	}

	public void setTCareer() {

		tCareer = new JTextField();
		tCareer.setBounds(130,90,100,20);
	}

	public JTextField getTCareer(){

		return this.tCareer;
	}

	public void setTSchedule() {

		tSchedule = new JTextField();
		tSchedule.setBounds(250,90,100,20);
	}

	public JTextField getTSchedule(){

		return this.tSchedule;
	}

	public void setTScholarship() {

		tScholarship = new JTextField();
		tScholarship.setBounds(370,90,100,20);
	}

	public JTextField getTScholarship(){

		return this.tScholarship;
	}

	public void setCXGender(String arrayComboGender[]){  
		this.cxGender = new JComboBox(arrayComboGender);
		this.cxGender.setSelectedIndex(0);//El primer valor por defecto
		this.cxGender.setBounds(370,35,100,20);
	}
	
	public JComboBox getCXGender(){
		return this.cxGender;
	}

	public void setTAComments() {

		taComments = new JTextArea();
		taComments.setLineWrap(true);//Salto de línea
	}

	public JTextArea getTAComments(){

		return this.taComments;
	}

	public void setSPComments(JTextArea taComments) {

		spComments = new JScrollPane(taComments);
		spComments.setBounds(10,140,460,80);
	}

	public JScrollPane getSPComments(){

		return this.spComments;
	}

	public void setBRegister(String name) {

		bRegister = new JButton();
		bRegister.setText(name);
		bRegister.setBounds(370,230,100,20);
	}

	public JButton getBRegister(){

		return this.bRegister;
	}

	public void setBRead(String name) {

		bRead = new JButton();
		bRead.setText(name);
		bRead.setBounds(10,230,100,20);
	}

	public JButton getBRead(){

		return this.bRead;
	}
	
	public void setBSearch(String name) {

		this.bSearch = new JButton();
		this.bSearch.setText(name);
		this.bSearch.setBounds(190,230,100,20);
	}

	public JButton getBSearch(){

		return this.bSearch;
	}

	public void cleanForm() {

		tId.setText("");
		tName.setText("");
		tAge.setText("");
		this.cxGender.setSelectedIndex(0);//El primer valor por defecto
		tIds.setText("");
		tCareer.setText("");
		tSchedule.setText("");
		tScholarship.setText("");
	}

	public void showMessage(String message) {

		JOptionPane.showMessageDialog(null, message);
	}
}
