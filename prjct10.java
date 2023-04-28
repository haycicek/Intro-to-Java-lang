/*Design a clas named Person and its two subclasses, Student and Employee. Make Faculty and Staff subclasses of Employee.

A Person object has a name, address, phone number, and email address (all Strings).

A Student has a class status (freshman, sophomore, junior, or senior). Define the status as a final String variable.

An Employee has an office number , salary (both ints), and a date hired. Use the MyDate class defined below to create an object for date hired:

class MyDate{
private String date; //date in the form mm/dd/yy

public MyDate(String date){
this.date = date;
}

public String getDate(){
return date;
}
}

A Faculty object has office hours and a rank (both Strings), while a Staff object has a title (as a String).

For the Student, Faculty, and Staff classes, create toString methods that store information about the object (in the format shown in the examples below).

Test your classes in a Driver class (within the same file) that asks the user what type of object they'd to create as well as what information they'd like it to have. The program then uses the object's toString method to print information about that object. */

import java.util.Scanner;

//***************************MY DATE*************************
class MyDate{
	private String date;
	
	public MyDate(String date){
		this.date = date;
	}
	
	public String getDate(){
		return date;
	}
}

//**************************PERSON**************************
class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public Person(String n, String a, String p, String e){
		name = n;
		address = a;
		phoneNumber = p;
		email = e;
	}
	
	//-------------ACCESSORS------------------
	public String getName(){
		return name;	
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getEmail(){
		return email;
	}
}

//**************************STUDENT************************
class Student extends Person {
	private final String STATUS;
	
	public Student(String n, String a, String p, String e, String s){
		super(n, a, p, e);
		STATUS = s;
	}
	
	public String getStatus(){
		return STATUS;
	}
	
	public String toString() {
		return "Student: " + this.getName() + "\nStatus: " + this.getStatus() + "\nAddress: " 
			+ this.getAddress() + "\nPhone Number: " + this.getPhoneNumber() + "\nEmail Address: " + this.getEmail();
	}
}

//****************************EMPLOYEE****************************
class Employee extends Person {
	private int office;
	private int salary;
	private MyDate dateHired;
	
	public Employee(String n, String a, String p, String e){
		super(n, a, p, e);
	}

	//-----------------ACCESSORS----------------
	public int getOffice(){
		return office;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public String getDateHired(){
		return dateHired.getDate();
	}
	
	//-----------------------MUTATORS--------------
	public void setOffice(int o){
		office = o;
	}
	
	public void setSalary(int s){
		salary = s;
	}
	
	public void setDate(String date){
		dateHired = new MyDate(date);
	}
}

//****************************FACULTY*****************************
class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	public Faculty(String n, String a, String p, String e){
		super(n, a, p, e);
	}
	
	//-------------------ACCESSORS------------------
	public String getOfficeHours(){
		return officeHours;
	}
	
	public String getRank(){
		return rank;
	}
	
	//----------------------MUTATORS-----------------
	public void setOfficeHours(String o){
		officeHours = o;
	}
	
	public void setRank(String r){
		rank = r;
	}
	
	public String toString(){
		return "Faculty: " + this.getName() + "\nRank: " + this.getRank() + "\nSalary: $" + this.getSalary() +
			"\nDate Hired: " + this.getDateHired() + "\n\nOffice Hours: " + this.getOfficeHours() + 
			"\nOffice: " + this.getOffice() + "\nAddress: " + this.getAddress() + "\nPhone Number: " + this.getPhoneNumber()
			+ "\nEmail: " + this.getEmail();
	}
}

//******************************STAFF*****************************
class Staff extends Employee {
	private String title;
	
	public Staff(String n, String a, String p, String e){
		super(n, a, p, e);
	}
	
	//---------------ACCESSORS----------------
	public String getTitle(){
		return title;
	}
	
	//------------------MUTATORS-----------------
	public void setTitle(String t){
		title = t;
	}
	
	public String toString(){
		return "Staff: " + this.getName() + "\nSalary: $" + this.getSalary() + "\nDate Hired: " + this.getDateHired()
			+ "\n\nOffice: " + this.getOffice() + "\nAddress: " + this.getAddress() + "\nPhone Number: " +
			this.getPhoneNumber() + "\nEmail: " + this.getEmail();
	}
}

//************************DRIVER**************************
class Driver {
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter\n1)To create a student\n2)To create an employee:");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter name:");
		String name = scanner.nextLine();
		System.out.print("Enter address:");
		String address = scanner.nextLine();
		System.out.print("Enter phone number:");
		String phone = scanner.nextLine();
		System.out.print("Enter email:");
		String email = scanner.nextLine();
		
		if(choice == 1){
			System.out.print("Enter student's status:");
			String STATUS = scanner.nextLine();
			
			Student student1 = new Student(name, address, phone, email, STATUS);
			
			System.out.print(student1.toString());
			
		}else if(choice == 2){
		
			System.out.print("Enter\n1)To create a faculty member\n2)To create a staff member:");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter office number:");
			int office = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter salary:");
			int salary = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter date hired (mm/dd/yy):");
			String date = scanner.nextLine();
			
			if(choice == 1){
				System.out.print("Enter office hours:");
				String officeHours = scanner.nextLine();
				System.out.print("Enter rank:");
				String rank = scanner.nextLine();
				
				Faculty faculty = new Faculty(name, address, phone, email);
				faculty.setOffice(office);
				faculty.setSalary(salary);
				faculty.setDate(date);
				faculty.setOfficeHours(officeHours);
				faculty.setRank(rank);
				
				System.out.print(faculty.toString());
			}else if(choice == 2){
				System.out.print("Enter title:");
				String title = scanner.nextLine();
				
				Staff staff = new Staff(name, address, phone, email);
				staff.setOffice(office);
				staff.setSalary(salary);
				staff.setDate(date);
				staff.setTitle(title);
				
				System.out.print(staff.toString());
				
				
			}
		}
	}
}