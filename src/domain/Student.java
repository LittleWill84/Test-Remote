package domain;

public class Student extends Person{
	
	private String idS;
	private String career;
	private String schedule;
	private int scholarship;
	
	public Student() {}
	
	public Student(String id, String name, int age, String gender,
			String idS, String career, String schedule, int scholarship) {
		
		super(id,name,age,gender);
		this.idS = idS;
		this.career = career;
		this.schedule = schedule;
		this.scholarship = scholarship;
	}

	public String getIdS() {
		return idS;
	}

	public void setIdS(String idS) {
		this.idS = idS;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public int getScholarship() {
		return this.scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return getId() + "-" + getName() +"-" + getAge() + "-" + getGender()+
				"-" + idS + "-" + career + "-" +schedule+"-" + scholarship;
	}
	
	
}
