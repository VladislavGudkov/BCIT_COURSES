//Start of Program
/* Name: Vladislav Gudkov
 * Student ID: A00921638
 * Class: COMP 1409 Saturday 9am-12pm
 * Lab 2-A
 */

public class Employee {
    private String employeeName;
    private int employeeAgeInYears;
    private String employeeAddress;
    private int numberOfYearsEmployed;
    private double annualPayInCAD;
    private boolean isFullTime;
   
//constructors
public Employee() {  //constructor 1: takes no parameters
    employeeName = "unknown"; 
    employeeAgeInYears =1;
    employeeAddress = "unknown";
    numberOfYearsEmployed = 1;
    annualPayInCAD =1;
    isFullTime = false;
    
    /** 
    * @param employeeName takes no input as this is a default constructor, displays "unknown" to user by default
    * @param employeeAgeInYears takes no input, as this is a default constructor, displays "1" to user by default
    * @param employeeAddress takes no input, as this is a default constructor, displays "unknown" to user by default
    * @param numberOfYearsEmployed takes no input, as this is a default constructor, displays "1" to user by default
    * @param annualPayInCAD takes no input, as this is a default constructor, displays "1" to user by default
    * @param isFullTime takes no input, as this is a default constructor, displays "false" to user by default
    */
}
public Employee(String inputName, int inputAgeInYears, String inputAddress, int inputYearsEmployed, double inputAnnualPayInCad, boolean inputFullTimeStatus)
// constructor 2: takes the parameters in line above to initialize all instance variables
 
{
    if(inputName == null) {
    throw new IllegalArgumentException("Name can’t be null ");
   } else {
   employeeName = inputName;
  /** 
    * @param inputName takes an input from user and puts that input into employeeName, 
    * an illegal argument exception is thrown if inputName is null
    */
   }
   if (inputAgeInYears <= 0){
   throw new IllegalArgumentException("age must be greater than 0");
} else{
    employeeAgeInYears = inputAgeInYears;
 /** 
   * @param inputAgeInYears takes an input from user and puts that input into EmployeeAgeinYears,
   * an illegal argument exception is thrown if inputAgeInYears is less than or equal to 0
   */
}
   if(inputAddress == null) {
    throw new IllegalArgumentException("Address can’t be null ");
   } else {
   employeeAddress = inputAddress;
   /** 
   * @param inputAddress takes an input from user and puts that input into employeeAddress,
   * an illegal argument exception is thrown if inputAddress is null
   */
   }
 if (inputYearsEmployed <= 0){
   throw new IllegalArgumentException("Number of years employed must be greater than 0");
} else{
    numberOfYearsEmployed = inputYearsEmployed;
    /** 
   * @param inputYearsEmployed takes an input from user and puts that input into numberOfYearsEmployed,
   * an illegal argument exception is thrown if inputYearsEmployed is less than or equal to 0
   */
}
if (inputAnnualPayInCad <= 0){
   throw new IllegalArgumentException("Annual pay must be greater than 0");
} else{
    annualPayInCAD = inputAnnualPayInCad;
     /** 
   * @param inputAnnualPayInCad takes an input from user and puts that input into annualPayInCAD,
   * an illegal argument exception is thrown if inputAnnualPayInCad is null
   */
}
isFullTime = inputFullTimeStatus;
 /** 
   * @param inputFullTimeStatus takes an input from user and puts that input into isFullTime,
   * this value is bool, so it can only be true or false
   */
} //end of constructor 2


} //end of program





