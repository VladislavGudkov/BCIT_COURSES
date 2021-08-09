package ca.bcit.comp1451.lab3A;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDatabase
{
	//instance variables
	private HashMap<String, int[]> quizMarks;
	
	//symbolic constants
	public static final int NUM_QUIZZES	= 10;
	public static final int MIN_GRADE = 0;
	public static final int MAX_GRADE = 100;
	
	//constructor
	public StudentDatabase() 
	{
		quizMarks = new HashMap<String, int[]>();
	}
	
	/** @return the properly-formatted name. */
	private String formatName(String name)
	{
		return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	}
	
	//method to add student to the hashmap
	public void addStudent(String studentName)
	{
	int[] defaultQuizMark = new int[MIN_GRADE];
	
		if(!quizMarks.containsKey(formatName(studentName))) 
		{
			quizMarks.put(formatName(studentName), defaultQuizMark);
		}
	}
	
	//Method to display quizzes for a student
	public void displayQuizzes(String student)
	{
		Set<Map.Entry<String, int[]>> QuizSet = quizMarks.entrySet();
		
		for (Map.Entry<String, int[]> set: QuizSet)
		{
			for(int index=0; index < set.getValue().length; index++  ) 
			{ 
				System.out.print(set.getValue()[index]+"  , ");
					if(index == (set.getValue().length-1)) 
					{
						System.out.print(set.getValue()[index]+" ");
					}
			}
		}
	}
	
	//Method to Change quizMarks
	public void changeQuizMark(String studentName, int whichQuiz, int newMark)
	{
		Set<Map.Entry<String, int[]>> QuizSet = quizMarks.entrySet();
		if (!quizMarks.containsKey(studentName) && (whichQuiz < NUM_QUIZZES) && (newMark > MIN_GRADE && newMark < MAX_GRADE)) 
		{
			for (Map.Entry<String, int[]> set : QuizSet) 
			{
				if (set.getKey().equals(formatName(studentName))) 
				{
					int [] studentQuiz = set.getValue();
					studentQuiz[whichQuiz] = newMark;
					quizMarks.put(studentName, studentQuiz);
				}
			}
		}
	}
	
	//Method to show quiz marks
	public void showQuizMarks()
	{
		Set<Map.Entry<String, int[]>> DisplayQuizSet = quizMarks.entrySet();
		for (Map.Entry<String, int[]> displaySet: DisplayQuizSet) 
		{
			System.out.println("Quiz marks for: "+ displaySet.getKey());
			System.out.println((displaySet.getValue()));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
		}
	}
	
	



}
