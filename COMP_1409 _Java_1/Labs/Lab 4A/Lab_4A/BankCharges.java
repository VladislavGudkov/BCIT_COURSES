
/**
 * This program takes user inputs for clientName , endingBalance and numberOfCheques and returns the bank service fees calculateBankServiceFees
 * based on the values endingBalance and numberOfCheques
 *
 * @author Vlad Gudkov
 * @version (October 3 2019)
 */
public class BankCharges
{
    public static final double FIRST_CHEQUES_CHARGE = 0.10; 
    public static final double SECOND_CHEQUES_CHARGE = 0.08;

    public static final double THIRD_CHEQUES_CHARGE = 0.06;
    public static final double FOURTH_CHEQUES_CHARGE = 0.04;

    public static final int BANK_CHARGE = 10;

    public static final int BANK_LOW_BALANCE_CHARGE = 15;
    public static final int LOW_BALANCE_LIMIT = 400;

    public static final int FIRST_CHEQUES_LEVEL=20;
    public static final int SECOND_CHEQUES_LEVEL = 40; 
    public static final int THIRD_CHEQUES_LEVEL = 60;

    String clientName ;
    double endingBalance;
    int numberOfCheques;

    /**
     * Constructor for objects of class BankCharges
     * @param clientName takes a String input, and returns an exception if the input was null
     * @param endingBalance takes a double input and returns an exception if the input was less than 0
     * @param numberOfCheques takes an int input and returns an exception if the input was less than 0
     */
    public BankCharges()
    {
        clientName = "unknown";
        endingBalance = 0;
        numberOfCheques= 0;

    }

    public  BankCharges(String cName,double cEndingBalance,int cNumberOfCheques)
    {
        if (cName == null)
        {
            throw new IllegalArgumentException ("name cannot be null");
        }
        else 
        {
            clientName = cName;
        }
        if ( cEndingBalance < 0)
        {
            throw new IllegalArgumentException ("ending balance cannot be less than 0");
        }
        else 
        {
            endingBalance = cEndingBalance;
        }
        if ( cNumberOfCheques < 0)
        {
            throw new IllegalArgumentException ("number of cheques cannot be less than 0");
        }
        else 
        {
            numberOfCheques = cNumberOfCheques;
        }
    }

    //accesors
    /**
     * @param getClientName  is the geter method for returning clientName
     */
    public String getClientName ()

    {
        return clientName;
    }

    /**
     * @param getEndingBalance is the geter method for returning endingBalance
     */
    public double getEndingBalance()

    {
        return endingBalance;
    }

    /**
     * @param getNumberOfCheques is the geter method for returning numberOfCheques
     */
    public int getNumberOfCheques ()

    {
        return numberOfCheques;
    }

    //mutators
    /**
     * @param setClientName  is the setter method which reads the getter getClientName  and returns clientName 
     */
    public void  setClientName  (String getClientName )
    {
        if (getClientName  == null)
        {
            throw new IllegalArgumentException ("Client name cant be null");  
        }
        else
        {
            clientName  = getClientName ;
        }
    }

    /**
     * @param setEndingBalance is the setter method which reads the getter getEndingBalance and returns endingBalance
     */
    public void setEndingBalance (double getEndingBalance)
    {
        if (getEndingBalance < 0 )
        {
            throw new IllegalArgumentException ("Ending balance cannot be less than 0");  
        }
        else
        {
            endingBalance = getEndingBalance;
        }
    }

    /**
     * @param setNumberOfCheques is the setter method which reads the getter getNumberOfCheques and returns numberOfCheques
     */
    public void setNumberOfCheques (int getNumberOfCheques)
    {
        if (getNumberOfCheques < 0 )
        {
            throw new IllegalArgumentException ("Number of cheques cannot be less than 0");  
        }
        else
        {
            numberOfCheques = getNumberOfCheques;
        }

    }

    
    public void calculateBankServiceFees(int getNumberOfCheques )
    /**
     * @param calculateBankServiceFees takes the input for getNumberOfCheques and returns the bank service fees based on the account balance
     * @return calculateBankServiceFees returns the ending balance epending on the number of cheques written and if the account is below the LOW_BALANCE_LIMIT
     */
    {
        if (endingBalance < LOW_BALANCE_LIMIT)
        {
            endingBalance  = endingBalance - BANK_LOW_BALANCE_CHARGE;   
            System.out.println("The bank has charged you:  $  "+BANK_LOW_BALANCE_CHARGE +"for a low balance fee");

        }

        if (numberOfCheques < FIRST_CHEQUES_LEVEL)
        {
            endingBalance  = endingBalance - BANK_CHARGE - (numberOfCheques * FIRST_CHEQUES_CHARGE);   
            System.out.println("The bank service fees are:  $  "+(BANK_CHARGE + numberOfCheques*FIRST_CHEQUES_CHARGE));
        }
        else if (numberOfCheques < SECOND_CHEQUES_LEVEL && numberOfCheques >= FIRST_CHEQUES_LEVEL)
        {
            endingBalance  = endingBalance - BANK_CHARGE - (numberOfCheques * SECOND_CHEQUES_CHARGE);   
            System.out.println("The bank service fees are: $  "+(BANK_CHARGE + numberOfCheques*SECOND_CHEQUES_CHARGE));
        }
        else if (numberOfCheques < THIRD_CHEQUES_LEVEL && numberOfCheques >= SECOND_CHEQUES_LEVEL)
        {
            endingBalance  = endingBalance - BANK_CHARGE - (numberOfCheques * THIRD_CHEQUES_CHARGE);   
            System.out.println("The bank service fees are:  $  "+(BANK_CHARGE + numberOfCheques*THIRD_CHEQUES_CHARGE));
        }
        else if (numberOfCheques > THIRD_CHEQUES_LEVEL)
        {
            endingBalance  = endingBalance - BANK_CHARGE - (numberOfCheques * FOURTH_CHEQUES_CHARGE);   
            System.out.println("The bank service fees are: $ "+(BANK_CHARGE + numberOfCheques*FOURTH_CHEQUES_CHARGE));
        }

    }

    
}
