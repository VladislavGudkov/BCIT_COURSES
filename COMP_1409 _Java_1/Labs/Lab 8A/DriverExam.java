
/**
 * @author (Vladislav Gudkov)
 * @version (Nov 7 2019)
 */
public class DriverExam
{
    //constants and static variables
    public static final String[] ANSWERS = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"};
    public static final String[] INPUT_OPTIONS = {"A","B","C","D"};
    public static final int PASSING_MARK = 15;
    public static final int MAXIMUM_POSSIBLE_MARK = 20; 
    
    // instance vairables
    private String[] driverAnswers;     
    private InputReader inputAnswers;   

    /**
     * Constructor for objects of class DriverExam
     * @param driverAnswers is a string input 
     * @param inputAnswers calls inputReader
     */
    public DriverExam()
    {
        driverAnswers = new String[MAXIMUM_POSSIBLE_MARK];
        inputAnswers = new InputReader();
    }

    //method to check for valid input options
    /**
     * Method checkValidity
     * @param answer A parameter to check if answer is a valid input
     * @return True if answer is not null and answer matches answer string
     * @return false if not true
     */
    public Boolean checkValidity (String answer)
    {
        for (int choiceSelected = 0 ; choiceSelected <  INPUT_OPTIONS.length;  choiceSelected++)
        {
            if(answer != null && answer.equals(INPUT_OPTIONS[choiceSelected]))
            {
                return true;
            }
        }
        return false;
    }

    
    /**
     * Method promptStudentAnswers
     *This method prompts student Answers for the exam and returns to the student which ones they score correctly
     */
    public void promptStudentAnswers()
    {
        for (int i = 0; i < ANSWERS.length; i++)
        {
            System.out.println("select an answer for question "+(i+1));
            String answer = inputAnswers.readString().toUpperCase(); //investigate for later

            if(checkValidity(answer))
            {
                System.out.println("Correct !");
                driverAnswers[i] = answer;
            }
            else
            {
                System.out.println("Incorrect! "+(i+1));
                i--;
            }
            
        }
        System.out.println("You answered " +getTotalCorrectAnswers() +" questions correctly");
        System.out.println("You answered " +getTotalIncorrectAnswers() +" questions incorrectly");
        
    }

    /**
     * Method getTotalCorrectAnswers
     * @return correctAnswer i.e. the number of correct Answers on the exam
     */
    public int getTotalCorrectAnswers()
    {
        int correctAnswer = 0;

        for(int i = 0; i < ANSWERS.length; i++)
        {
            if(driverAnswers[i] !=null && driverAnswers[i].equals(ANSWERS[i]))
            {
                correctAnswer++;
            }
        }
        return correctAnswer;
    }
    
    /**
     * Method getTotalIncorrectAnswers
     * @return the number of correctAnswers subtracted from the ANSWERS string
     */
    public int getTotalIncorrectAnswers()
    {
        return ANSWERS.length - getTotalCorrectAnswers();
    }
    
    /**
     * Method PassOrFail
     * @return true if student passes the exam
     * @return false if the student fails the exam
     */
    public Boolean PassOrFail()
    {
      if(getTotalCorrectAnswers() >=   PASSING_MARK)
      {
        System.out.println("You pass!");
        return true;
      }
      else
      {
         System.out.println("You have failed");  
         return false;
      }
    }
    
    /**
     * Method main
     * @param args A parameter is the parameter for the Main method
     */
    public static void main(String[] args)
    {
      DriverExam exam = new DriverExam();  
      exam.promptStudentAnswers();
      exam.PassOrFail();
    }

  
}
