package Constructor;

public class GetterSetterStudent {
	

		private String name;
		    private int age;
		    private String major;
		    private double gpa;
		    private boolean isFullTime;
		
		    // Default Constructor
		    public GetterSetterStudent() {
		        this.name = "Unknown";
		        this.age = 18;
		        this.major = "Undeclared";
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }
		
		    // Parameterized Constructor 1
		    public GetterSetterStudent(String name, int age) {
		        this.name = name;
		        this.age = age;
		        this.major = "Undeclared";
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }
		
		    // Parameterized Constructor 2
		    public GetterSetterStudent(String name, int age, String major) {
		        this.name = name;
		        this.age = age;
		        this.major = major;
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }
		
		    // Parameterized Constructor 3
		    public GetterSetterStudent(String name, int age, String major, double gpa, boolean isFullTime) {
		        this.name = name;
		        this.age = age;
		        this.major = major;
		        this.gpa = gpa;
		        this.isFullTime = isFullTime;
		    }
		
		    // Getter and Setter methods
		    public String getName() {
		        return name;
		    }
		
		    public void setName(String name) {
		        this.name = name;
		    }
		
		    public int getAge() {
		        return age;
		    }
		
		    public void setAge(int age) {
		        this.age = age;
		    }
		
		    public String getMajor() {
		        return major;
		    }
		
		    public void setMajor(String major) {
		        this.major = major;
		    }
		
		    public double getGpa() {
		        return gpa;
		    }
		
		    public void setGpa(double gpa) {
		        this.gpa = gpa;
		    }
		
		    public boolean isFullTime() {
		        return isFullTime;
		    }
		
		    public void setFullTime(boolean isFullTime) {
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
		




