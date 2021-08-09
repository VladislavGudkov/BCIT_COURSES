package a00921638_lab1b;
/**
 * @author Vladislav Gudkov (A009
 */


public class Student 
{
	//instance variables
	private Name studentName;
	private String studentNumber;
	private Date dateOfBirth;
	private boolean graduated;
	
	//constructor for class Student
	public Student(Name studentName, String studentNumber, Date dateOfBirth, boolean graduated)
	{
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.dateOfBirth = dateOfBirth;
		this.graduated = graduated;
	}

	//getter for studentName
	public Name getStudentName() 
	{
		return studentName;
	}

	//getter for studentNumber
	public String getStudentNumber() 
	{
		return studentNumber;
	}

	//getter for dateOfBirth
	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	//getter for graduated
	public boolean isGraduated() 
	{
		return graduated;
	}
	
	//method to check graduated and put in string at end
	public String checkGraduated()
	{
		if (graduated == true) 
		{
			return "graduated";
	 	}
		else 
	    {
	      return "not graduated";
	    }   
	}
}
