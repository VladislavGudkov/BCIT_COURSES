/**
 * @author Vladislav Gudkov (A00921638)
 */
public class Student 
{
	//fields
	private String firstName;
	private String lastName;
	private String idNumber;
	private int age;
	private double grade;
	private boolean pass;
	
	
	//default constructor
	public Student()
	{
		
	}
	
	//Overloaded constructor
	public Student (String firstName, String lastName, String idNumber, int age, double grade)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setIdNumber(idNumber);
		setAge(age);
		setGrade(grade);
		
		if(grade >= 60)
		{
			this.pass = true;
		}
		else
		{
			this.pass = false;
		}
	}

	//Getters and Setters
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		if(firstName != null && !firstName.isEmpty())
		{
			this.firstName = firstName;
		}
		else throw new IllegalArgumentException("last name cannot be null or an empty String");
	}

	

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		if(lastName != null && !lastName.isEmpty())
		{
			this.lastName = lastName;
		}
		else throw new IllegalArgumentException("last name cannot be null or an empty String");
	}

	public String getIdNumber() 
	{
		return idNumber;
	}

	public void setIdNumber(String idNumber) 
	{
		if((!idNumber.toUpperCase().startsWith("A00")) || idNumber.length() != 9)
		{
			throw new IllegalArgumentException("id number must start with A00 and be 9 characters in total length");
		}
		else
		{
			this.idNumber = idNumber;
		}	
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		if(age < 18 || age > 100)
		{
			throw new IllegalArgumentException("age must be between 18 and 100");
		}
		else
		{
			this.age = age;
		}
		
	}

	public double getGrade() 
	{
		return grade;
	}

	public void setGrade(double grade) 
	{
		if(grade < 0.00 || grade > 100.00)
		{
			throw new IllegalArgumentException("grade must be between 1 and 100");
		}
		else
		{
			this.grade = grade;	
		}
		
	}

	public boolean isPass() 
	{
		return pass;
	}

	public void setPass(boolean pass) 
	{
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber + ", age=" + age
				+ ", grade=" + grade + ", pass=" + pass + "]";
	}
	
	
	
	

}
