package vo;

public class StudentVO {
	//학번 이름 학과명 평점
	private String studentNo;
	private String studentName;
	private String majorName;
	private int majorNo;
	private double score;
	private String gender;
	
	public StudentVO(String studentNo, String studentName, int majorNo, double score, String gender) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorNo = majorNo;
		this.score = score;
		this.gender = gender;
	}

	public StudentVO(String studentNo, String studentName, String majorName, double score, String gender) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
		this.gender = gender;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public int getMajorNo() {
		return majorNo;
	}

	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %d %f %s", 
				studentNo, studentName, majorName, majorNo, score,gender);
	}
	
}










