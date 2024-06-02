package Constructor;

public class TestStudent {

	public static void main(String[] args) {
		// Testing Default Constructor
		Student student1 = new Student();
		System.out.println("Student 1 (Default Constructor):");
		student1.printDetails();

		// Testing Parameterized Constructor 1
		Student student2 = new Student("Pooja Lokhande", 20);
		System.out.println("Student 2 (Parameterized Constructor 1):");
		student2.printDetails();

		// Testing Parameterized Constructor 2
		Student student3 = new Student("Vivek Metkari", 21, "Civil Enginner");
		System.out.println("Student 3 (Parameterized Constructor 2):");
		student3.printDetails();

		// Testing Parameterized Constructor 3
		Student student4 = new Student("Adhya Chaudhari", 22, "Java", 9.8, false);
		System.out.println("Student 4 (Parameterized Constructor 3):");
		student4.printDetails();
	}

}


