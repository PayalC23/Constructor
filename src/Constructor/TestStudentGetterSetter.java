package Constructor;

public class TestStudentGetterSetter {

	public static void main(String[] args) {
		// Testing Default Constructor
        GetterSetterStudent student1 = new GetterSetterStudent();
        System.out.println("Student 1 (Default Constructor):");
        student1.printDetails();

        // Testing Parameterized Constructor 1
        GetterSetterStudent student2 = new GetterSetterStudent("Pooja Lokhande", 20);
        System.out.println("Student 2 (Parameterized Constructor 1):");
        student2.printDetails();

        // Testing Parameterized Constructor 2
        GetterSetterStudent student3 = new GetterSetterStudent("Vivek Metkari", 21, "Civil Enginner");
        System.out.println("Student 3 (Parameterized Constructor 2):");
        student3.printDetails();

        // Testing Parameterized Constructor 3
        GetterSetterStudent student4 = new GetterSetterStudent("Adhya Chaudhari", 22, "Java", 9.8, false);
        System.out.println("Student 4 (Parameterized Constructor 3):");
        student4.printDetails();

        // Getter methods for student objects
        System.out.println("Student 1 Name: " + getGetterSetterStudentName(student1));
        System.out.println("Student 2 Age: " + getGetterSetterStudentAge(student2));
        System.out.println("Student 3 Major: " + getGetterSetterStudentMajor(student3));
        System.out.println("Student 4 GPA: " + getGetterSetterStudentGpa(student4));
        System.out.println("Student 4 Is Full Time: " + isGetterSetterStudentFullTime(student4));
    }

    // Getter method for student name
    public static String getGetterSetterStudentName(GetterSetterStudent student) {
        return student.getName();
    }

    // Getter method for student age
    public static int getGetterSetterStudentAge(GetterSetterStudent student) {
        return student.getAge();
    }

    // Getter method for student major
    public static String getGetterSetterStudentMajor(GetterSetterStudent student) {
        return student.getMajor();
    }

    // Getter method for student GPA
    public static double getGetterSetterStudentGpa(GetterSetterStudent student) {
        return student.getGpa();
    }

    // Getter method for student full-time status
    public static boolean isGetterSetterStudentFullTime(GetterSetterStudent student) {
        return student.isFullTime();
    }


	}


