package Task1;

public class Student extends Human{ 
	private boolean budgetPlace;

	public Student() {
		super();
	}

	public Student(int age, String gender, String secondName, String name,boolean budgetPlace) {
		super(age, gender, secondName, name);
		this.budgetPlace = budgetPlace;
	}

	public boolean isBudgetPlace() {
		return budgetPlace;
	}

	public void setBudgetPlace(boolean budgetPlace) {
		this.budgetPlace = budgetPlace;
	}

	@Override
	public String toString() {
		return "Student [budgetPlace: " + budgetPlace + ", " +"age : " + super.getAge()+", "+"gender: "+super.getGender()+", "+"secondName: "+super.getSecondName()+", "+"name: "+super.getName() + "]";
	}
	

}
