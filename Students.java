package week3.day1;

public class Students {
	
	
	public void getStudentinfo(int id) {
		System.out.println(id);
		

	}
	public void getStudentinfo(int id,String name) {
		System.out.println(id+","+name);
		

	}
	public void getStudentinfo(String email,int phoneNumber) {
		System.out.println(email+","+phoneNumber);
		

	}

	public static void main(String[] args) {
		Students j = new Students();
	    j.getStudentinfo(1234);
	    j.getStudentinfo(5678, "Bala");
	    j.getStudentinfo("bala12@gmail.com", 98765);
		
		

	}

}
