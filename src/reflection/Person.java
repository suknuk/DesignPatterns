package reflection;

public class Person {

	private String idcode = "100";

	public Person() {
		System.out.println("Constructor without arguments");
	}
	
	public Person(int number, String randString) {
		System.out.println("You sent: " + number + " " + randString);
	}
	
	private String getPrivate() {
		return "How did you get this";
	}

	private String getOtherPrivate(int thisInt, String thatString) {
		return "How did you get here " + thisInt + " " + thatString;
	}
	
	public void setIdcode(String idcode) {
		this.idcode = idcode;
	}
	
	public String getIdcode() {
		return this.idcode;
	}
	

}
