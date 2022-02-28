

public class Student {
	private int studentId;
	private String strudentName;
	private float cgpa;
	private String email;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String strudentName, float cgpa, String email) {
		super();
		this.studentId = studentId;
		this.strudentName = strudentName;
		this.cgpa = cgpa;
		this.email = email;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStrudentName() {
		return strudentName;
	}
	public void setStrudentName(String strudentName) {
		this.strudentName = strudentName;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
