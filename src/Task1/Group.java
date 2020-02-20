package Task1;
import java.util.Arrays;
public class Group {
	 private Student[] gr = new Student[10];
	
	 public Group() {
		 
	 }

	public Group(Student[] gr) {
		super();
		this.gr = gr;
	}

	public Student[] getGr() {
		return gr;
	}

	public void setGr(Student[] gr) {
		this.gr = gr;
	}
	
	public void addStudent(Student a){
		try{for(int i = 0;i<gr.length;) {
			if(i==9&&gr[i]!=null) 
				throw new IllegalArgumentException();
		if(gr[i]==null) {
			gr[i] = a;
			break;
		}else 
			i = i+1;
		}
	}catch(IllegalArgumentException e) {
		System.out.println("Мест в группе больше нет");
	}
		
	}
	public void deleteStudent(Student a) {
		for(int i = 0;i<gr.length;i++) {
			if(gr[i]==a) {
				gr[i]= null;
			}
		}
	}
	
	public String findStudent(Student a) {
		for(int i = 0;i<gr.length;i++) {
			try {
			if(gr[i].getSecondName()==a.getSecondName()) {
				 return "Студент с индексом:  "+i;
			}
			}catch(NullPointerException e) { 	
			}	
	}return "Такого студента нет";
}
	
	@Override
	public String toString() {
		return "Group [gr=" + Arrays.toString(gr) + "]";
	}
	 
}
