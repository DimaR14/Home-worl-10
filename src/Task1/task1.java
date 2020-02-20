package Task1;
public class task1 {

	public static void main(String[] args) {
		Student std = new Student(18,"boy","Ford","Jim",true);
		System.out.println(std.toString());
		Student std1 = new Student(19,"girl","Claret","Sara",false);
		System.out.println(std1.toString());
		Student std2 = new Student(19,"girl","Mora","Lisa",true);
		Group gr1 = new Group();
		gr1.addStudent(std);
		gr1.addStudent(std1);
		gr1.addStudent(std2);
		gr1.addStudent(std2);
		gr1.addStudent(std);
		gr1.addStudent(std2);
		gr1.addStudent(std1);
		gr1.addStudent(std2);
		gr1.addStudent(std2);
		gr1.addStudent(std2);
		gr1.addStudent(std2);
		Group gr2 = new Group();
		System.out.println(gr1);
		System.out.println(gr1.findStudent(std2));
	

}
}