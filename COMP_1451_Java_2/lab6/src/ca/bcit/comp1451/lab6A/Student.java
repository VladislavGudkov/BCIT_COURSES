package ca.bcit.comp1451.lab6A;

public class Student extends Person
{
	//Instance variables
	private boolean isFullTimeStudent;
	double gpa;
	
	//Constructor for class Student
	public Student(String name, int ageInYears, boolean isFullTimeStudent, double gpa)
	{
		super(name, ageInYears);
		setFullTimeStudent(isFullTimeStudent);
		setGpa(gpa);
	}

	//Getter method for isFullTimeStudent
	public boolean isFullTimeStudent()
	{
		return isFullTimeStudent;
	}

	//Setter method for isFullTimeStudent
	public void setFullTimeStudent(boolean isFullTimeStudent)
	{
		this.isFullTimeStudent = isFullTimeStudent;
	}

	//Getter method for gpa
	public double getGpa()
	{
		return gpa;
	}

	//Setter method for gpa
	public void setGpa(double gpa)
	{
		if(gpa >= 0 && gpa <= 100)
		{
			this.gpa = gpa;
		}
		else
		{
			throw new IllegalArgumentException("GPA must be greater than or equal 0 and less than or equal to 100");
		}
	}
	
	@Override
	public String toString() 
	{
		String s;
		
		if (isFullTimeStudent) {
			s = "This Students's name is " + getName() + " and the age is " + getAgeInYears() + " years old. This student is a full time student with the gpa of " + getGpa();
		} else {
			s = "This Students's name is " + getName() + " and the age is " + getAgeInYears() + " years old. This student is a part time student with the gpa of " + getGpa();
		}
		return s;
	}
	
	//override equals method
	@Override
	public boolean equals(Object object) 
	{
		boolean value = true;
		Student a = (Student) object;
		
		if (this == object)
		{
			return value;
		} 
		
		if (object == null) 
		{
			value = false;
		}
		
		if (!(object instanceof Student))
		{
			value = false;
		}
		
		if (getName() == null) 
		{
			if (a.getName() != null)
			{
				value = false;
			}
		} 
		
		else if (!getName().equals(a.getName()) ) 
		{
			value = false;
		}
		
		else if (!(getGpa() == a.getGpa())) 
		{
			value = false;
		}
		
		return value;
	}
	
	
	
	
	
	
}
