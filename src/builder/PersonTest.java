package builder;

public class PersonTest {

	public static void main(String[] args) {
		Person dave = new Person.PersonBuilder()
				.setAge(25)
				.setFirstName("Dave")
				.build();

		System.out.println("Name: " + dave.getFirstName());

	}

}
