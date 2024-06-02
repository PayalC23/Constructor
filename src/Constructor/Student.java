package Constructor;

public class Student {
	
		 private String name;
		    private int age;
		    private String major;
		    private double gpa;
		    private boolean isFullTime;

		    // Default Constructor
		    public Student() {
		        this.name = "Unknown";
		        this.age = 18;
		        this.major = "Undeclared";
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }

		    // Parameterized Constructor 1
		    public Student(String name, int age) {
		        this.name = name;
		        this.age = age;
		        this.major = "Undeclared";
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }

		    // Parameterized Constructor 2
		    public Student(String name, int age, String major) {
		        this.name = name;
		        this.age = age;
		        this.major = major;
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }

		    // Parameterized Constructor 3
		    public Student(String name, int age, String major, double gpa, boolean isFullTime) {
		        this.name = name;
		        this.age = age;
		        this.major = major;
		        this.gpa = gpa;
		        this.isFullTime = isFullTime;
		    }

		    // Method to print student details
		    public void printDetails() {
		        System.out.println("Name: " + this.name);
		        System.out.println("Age: " + this.age);
		        System.out.println("Major: " + this.major);
		        System.out.println("GPA: " + this.gpa);
		        System.out.println("Is Full Time: " + this.isFullTime);
		        System.out.println();
		    }
		}




