package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import domain.Student;

public class LogicFilesTxt {

	//Es la ubicación con el archivo a leer
	File fileAddress;
	//Objeto que permite leer el archivo seleccionado
	FileReader fr;
	//Objeto que almacena el archivo leido
	BufferedReader br;

	public LogicFilesTxt() {
		// TODO Auto-generated constructor stub
	}

	public int getLogin(String address, String user, String password){

		String line="";
		String data[ ];
		int result = 0;
		
		try {
			fileAddress = new File("Users.txt");

			fr = new FileReader (fileAddress);//lee el archivo
			br = new BufferedReader(fr);

			while((line=br.readLine())!=null){   
				data=line.split("-");

				if(data[0].equals(user) && data[1].equals(String.valueOf(password)) && (Integer.parseInt(data[2])==1) && Boolean.parseBoolean(data[3])) {
					result=1;

				}else  if(data[0].equals(user) && data[1].equals(String.valueOf(password)) && (Integer.parseInt(data[2])==2) && Boolean.parseBoolean(data[3])) {
					result=2;
				}

			}

		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{                    
				if(fr != null ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
		return result; 
	}
}
