package javadocproj;
/**
 * <b>this is a short description of class</b><br>
 * this is a program to implement a student class<br>
 *
 * <b>this is a short description of class</b>
 * This is the class the implements the following method <br>
 * 1.constructor with no parameter<br>
 * 2.constructor with parameter<br>
 * 3.setter for name<br>
 * 4.getter for name<br>
 * 5.setter for roll no.<br>
 * 6.getter for roll no.<br>
 * 7.display methods
 * @author subash
 * @version 1.0
 *
 */

public class student {
	String name;
	String rollno;
	int age;
	
	/**
	 * This is a constructor to initialize the attributes
	 * the name is set to a default value of xxxxx
	 * the roll number is set to default rbca19xxx
	 * the  default age is set to 28
	 * 
	 */
	public student()
	{
		name="xxxx";
		rollno="rbca19xxx";
		age=28;
	}
	
	/**
	 * This is a parameterized constructor to initialize the attributes
	 * @param name the name of the student
	 * @param rollno the roll number of the student
	 * @param age the age of the student
	 */
	public student(String name,String rollno,int age)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
    /**
     * this is the setter for the student name
     * @param name
     */

	public void setName(String name) 
	{
		this.name = name;
	}
    /**
     * this is the getter for the student name
     * @return
     */
	public String getName() 
	{
		return name;
	}
    /**
     * this is the setter for roll number
     * @param rollno
     */
	public void setRollno(String rollno) 
	{
		this.rollno = rollno;
	}
	/**
	 * this is the getter for roll number
	 * @return
	 */
	public String getRollno() 
	{
		return rollno;
	}
    /**
     * this is the setter for age
     * @param age
     */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * this is the getter for age
	 * @return the age of the student
	 */
	public int getAge() {
		return age;
	}
	/**
	 * this is a method to display the name,rollno,age of the student
	 * @see getName()
	 * @see getRollno()
	 * @see getAge()
	 */
    public void display()
    {
    	System.out.println("students name"+getName());
    	System.out.println("students roll num"+getRollno());
    	System.out.println("students age" +getAge());
    }
    /**
     * this is the entry point of the execution of the program
     * @param args not used
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
