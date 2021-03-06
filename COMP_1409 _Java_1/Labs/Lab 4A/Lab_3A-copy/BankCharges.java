
/**
 * Write a description of class BankCharges here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCharges
{
    public static final double FIRST_CHEQUES_CHARGE = 0.10; 
    public static final double SECOND_CHEQUES_CHARGE =0.08;

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
    public String getClientName ()
    {
        return clientName;
    }

    public double getEndingBalance()
    {
        return endingBalance;
    }

    public int getNumberOfCheques ()
    {
        return numberOfCheques;
    }

}
