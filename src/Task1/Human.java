package Task1;

public class Human {
	private int age;
	private String gender;
	private String secondName;
	private String name;
	
	public Human() {
	
	}

	public Human(int age, String gender, String secondName, String name) {
		super();
		this.age = age;
		this.gender = gender;
		this.secondName = secondName;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", gender=" + gender + ", secondName=" + secondName + ", name=" + name + "]";
	}

}
