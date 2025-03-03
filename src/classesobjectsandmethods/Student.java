package classesobjectsandmethods;

public class Student implements Cloneable {
	
	int rollNo;
	String studName;
	
	Student(int rollNo, String studName) {
		this.rollNo = rollNo;
		this.studName = studName;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString() {
		return this.rollNo + ", " + this.studName;
	}

	public static void main(String[] args) {
		try
		{
			Student s1 = new Student(101, "John Doe");
			Student s2 = (Student) s1.clone();
			
			System.out.println(s1);
			System.out.println(s2);
		}
		catch (CloneNotSupportedException c) {
			System.out.println("CloneNotSupportedException occured.");
		}

	}

}
