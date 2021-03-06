/**
 * Write a description of class Student here.
 *
 * @author (Vladislav Gudkov)
 * @version (26 September 2019)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String studentName;
    private String studentID;
    private int testScore;
    private double courseFeesInCAD;
    private boolean isEligibleForDiscount;

    public Student(String inputStudentName,String inputStudentID, int inputTestScore, int inputCourseFeesInCAD)
    {
        /**
         * Constructor for objects of class Student
         * @param inputStudentName is a String that puts its input into studentName
         * @param inputStudentID is a String that puts its input into studentID
         * @param inputTestScore is an int that puts its input into testScore
         * @param inputCourseFeesInCAD is a double that puts its input into courseFeesInCAD
         */ 
        if(inputTestScore < 0)
        {
            throw new IllegalArgumentException ("Test score cannot be less than 0");
        }
        else
        { 
            testScore = inputTestScore;
        }
        if(inputCourseFeesInCAD < 0)
        {
            throw new IllegalArgumentException ("Course Fees cannot be less than 0");
        }
        else 
        {
            courseFeesInCAD = inputCourseFeesInCAD;
        }

        if(inputStudentName != null)
        {
            studentName = inputStudentName; 
        }
        else
        {
            throw new IllegalArgumentException ("Please enter a student name");
        }
        if(inputStudentID != null)
        {
            studentID = inputStudentID; 
        }
        else
        {
            throw new IllegalArgumentException ("Please enter a Student ID");
        }
        isEligibleForDiscount = false;
    }
    //accesor methods
    /**
     * @param getStudentName accesor to access instance variablestudentName
     * param getStudentID accesor to access instance studentID
     * param getTestScore accesor to access instance testScore
     * param getCourseFeesInCAD accesor to access instance courseFeesInCAD
     */
    public String getStudentName()
    {
        return studentName;                 
    }

    public String getStudentID()
    {
        return studentID;
    }

    public int getTestScore()
    {
        return testScore;
    }

    public double getCourseFeesInCAD ()
    {
        return courseFeesInCAD;
    }

    //mutator methods

    public void setStudentName(String inputStudentName)
    {
        /**
         * @param inputStudentName mutator for instance variable studentName
         */
        if(inputStudentName == null)
        {
            throw new IllegalArgumentException ("Please enter a student name");
        }
        else 
        {
            studentName = inputStudentName;
        }   
    }

    public void setStudentID(String inputStudentID)
    {
        /**
         * @param inputStudentID mutator for instance variable setStudentID
         */
        if(inputStudentID != null)
        {
            studentID = inputStudentID;
        }
        else 
        {
            throw new IllegalArgumentException ("Please enter a student ID"); 
        }   
    }

    public void setcourseFeesInCAD (double inputCourseFeesInCAD)
    {
        /**
         * @param setcourseFeesInCAD mutator for instance variable CourseFeesInCAD
         */
        if(inputCourseFeesInCAD < 0 )
        {
            throw new IllegalArgumentException ("course fees cannot be less than 0 ");
        }
        else 
        {
            courseFeesInCAD = inputCourseFeesInCAD;
        }   
    }

    public void setTestScore (int inputTestScore)
    {
        /**
         * @param setTestScore mutator for instance variable testScore
         */
        if(inputTestScore < 0 )
        {
            throw new IllegalArgumentException ("test score cannot be less than 0 ");
        }
        else 
        {
            testScore = inputTestScore;
        }   
    }

    public void checkForDiscount (double inputCourseFeesInCAD)
    {
        if(inputCourseFeesInCAD >= 700)
        { 
            courseFeesInCAD =  inputCourseFeesInCAD * 0.85 ;
            isEligibleForDiscount = true;
        }
        else
        {
            courseFeesInCAD =  inputCourseFeesInCAD;
            isEligibleForDiscount = false;
        }

    }

    public void printStudentDetails()
    {
        System.out.println("Student Name:  "+studentName);
        System.out.println("StudentID:  "+studentID);
        System.out.println("Test Score : "+testScore);
        System.out.println("Course Fees:  "+courseFeesInCAD);

        if(isEligibleForDiscount == true)
        {
            System.out.println("This student got a discount of 15 % ");
        }
        else

        {
            System.out.println("This student does not get a discount");
        }
    }

     
}

