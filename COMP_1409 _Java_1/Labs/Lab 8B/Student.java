
/**
 * This method takes the input of a name, prompts the user to enter 10 marks and displays the
 * results along with an average and whether or not the use passed all exams
 *
 * @author (Vladislav Gudkov)
 * @version (November 7 2019)
 */
public class Student
{

    public static final int HIGHEST_MARK = 100;
    public static final int LOWEST_MARK = 0;
    public static final int PASSING_MARK = 50;
    public static final int NUMBER_OF_EXAMS = 10;

    private String studentName;
    private int[] examMarks;
    private InputReader examMarkInput;

    /**
     * Student Constructor
     *
     * @param inputStudentName is a parameter for setStudentName
     * @param examMarks creates an array
     */
    public Student(String inputStudentName)
    {
        examMarks = new int[NUMBER_OF_EXAMS];
        examMarkInput = new InputReader();
        setStudentName(inputStudentName);
    }

    //acessor methods
    /**
     * Method getStudentName is the accesor method for studentName
     * @return studentName
     */
    public String getStudentName()
    {
        return studentName;  
    }

    //mutator method
    /**
     * Method setStudentName
     * @param inputStudentName is the parameter for the mutator method setStudentName
     * This method sets student name if inputStudentName is not null AND not an empty String
     */
    public void setStudentName(String inputStudentName)
    {
        if(inputStudentName != null && !inputStudentName.equals(""))
        {
            this.studentName = inputStudentName;
        } 
        else if (this.studentName == null || this.studentName.equals(""))
        {
            throw new IllegalArgumentException("name cannot be null or an empty String"); 
        }
    }

    /**
     * Method promptStudentMarks
     *Thus method prompts the user to input marks, if they are valid they will be
     *entered into the array, if they are invalid the user is prompted to try again
     */
    public void promptStudentMarks()
    {
        for(int i = 0; i < examMarks.length; i++) 
        {
            System.out.println("Enter a grade " +(i+1));
            int mark = examMarkInput.readInt();

            if(mark >= LOWEST_MARK && mark <= HIGHEST_MARK) 
            {
                System.out.println("Valid mark value entered for exam " +(i+1));
                examMarks[i] = mark;
            } 
            else 
            {
                System.out.println("Invalid mark value entered, please try again " +(i+1));
                i--;
            }
        }
        System.out.println("All marks have been entered");  
    }

    /**
     * Method calculateAverageMark
     *@return the average of all exam marks which is the sum of exam marks divided b the number of exams taken
     */
    public int calculateAverageMark() 
    {
        int markSum = 0;
        for(int i = 0; i < examMarks.length ; i++)
        {
            markSum = markSum + examMarks[i];
        }

        return markSum / 10 ;
    }

    /**
     * Method calculateTotalPassedExams
     * @return numberOfPassedExams the number of passed exams i.e. that have a mark greater or equal to 50
     */
    public int calculateTotalPassedExams()
    {
        int numberOfPassedExams  = 0;
        for(int i = 0; i < examMarks.length ; i++)
        {
            if( examMarks[i] >= PASSING_MARK)
            {
                numberOfPassedExams++; 
            }
        }
        return numberOfPassedExams;
    }

    /**
     * Method allExamsPassed
     * @return true if all exams have a passing mark
     * @return false if 1 or more exams is a failing mark
     */
    public Boolean allExamsPassed()
    {
        for(int i = 0; i < examMarks.length ; i++)
        {
            if( examMarks[i] >= PASSING_MARK)
            {
                return true; 
            }    
        }
        return false;
    }

    /**
     * Method main
     * @param args is the parameter of values pased to the main method
     * This method creates a studentName, then prompts the user to enter 10 exam marks
     * The method then returns the average mark of the 10 exams, how many exams were passed
     * as well as if all exams were passed or not
     */
    public static void main(String[] args) 
    {        
        Student student = new Student("Vlad");
        student.promptStudentMarks();
        System.out.println("Student name: " +student.studentName);
        System.out.println("Average exam mark: " +student.calculateAverageMark());
        System.out.println("Number of exams passed: " +student.calculateTotalPassedExams());
        if(student.allExamsPassed()) {
            System.out.println("Student has passed all exams");
        } else {
            System.out.println("Student has failed one or more exams");
        }      
    }
}
