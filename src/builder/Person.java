package builder;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	public Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static class PersonBuilder {
		private String firstName;
		private String middleName;
		private String lastName;
		private int age;
		private double height;
		private double weight;

		public PersonBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public PersonBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setHeight(double height) {
			this.height = height;
			return this;
		}

		public PersonBuilder setWeight(double weight) {
			this.weight = weight;
			return this;
		}

		public Person build() {
			return new Person(firstName, middleName, lastName, age, height, weight);
		}

	}

}
