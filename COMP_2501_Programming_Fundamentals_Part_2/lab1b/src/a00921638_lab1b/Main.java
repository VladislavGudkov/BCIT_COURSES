package a00921638_lab1b;
/**
 * @author Vladislav Gudkov (A009
 */

public class Main {

	//main method
	public static void main(String[] args) 
	{
		 Student student1 = new Student(new Name("Tiger","Woods"), "A00123456", new Date(1975,12,30),true);
	     Student student2 = new Student(new Name("Bill","Gates"), "A00987654", new Date(1955,10,28), false);
	     
	     String name;
	     
	     System.out.println(student1.getStudentName().getFullName()
	    		 +" ("+student1.getStudentName().getInitials()+")"
	    		 +" (st# "+student1.getStudentNumber()+")"
	    		 +" was born on"
	    		 + ("+student1.getDateOfBirth().getYyMmDd()+") //could not get string literal to work here for some reason
	    		 +" The student has "+student1.checkGraduated());
	     
	   
	     System.out.println(student2.getStudentName().getFullName()
	    		 +" ("+student2.getStudentName().getInitials()+")"
	    		 +" (st# "+student2.getStudentNumber()+")"
	    		 +" was born on"
	    		 + ("+student2.getDateOfBirth().getYyMmDd()+") //could not get string literal to work here for some reason
	    		 +" The student has "+student2.checkGraduated());   
	}

}
