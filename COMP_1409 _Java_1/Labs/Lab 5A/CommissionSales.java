
/**

 * @author Vladislav Gudkov
 * @version October 10 2019
 */
public class CommissionSales
{
    // instance variables - replace the example below with your own
    public static final double RATE_A = 0.05 ;
    public static final double RATE_B = 0.10  ;
    public static final double RATE_C = 0.13  ;
    public static final double RATE_D = 0.18  ;
    public static final double RATE_E=  0.22  ;
    public static final int DIVISION_FACTOR = 10000;

    public static final int TIER_RATE_A = 19999;
    public static final int TIER_RATE_B = 29999;
    public static final int TIER_RATE_C = 39999;
    public static final int TIER_RATE_D = 49999;
    public static final int TIER_RATE_E = 59999;

    private String salesPersonName;
    private int salesAmountInCAD;
    private double payInCad ;

    /**
     * Constructor for objects of class CommissionSales
     * @param CommissionSales takes string input of salesperson name and int input of sales amount in CAD
     */
    public CommissionSales(String inputSalesPersonName, int inputSalesAmountInCAD)
    {
        if (inputSalesPersonName == null)
        {
            throw new IllegalArgumentException(" Sales person name cannot be null");
        }
        else 
        {
            salesPersonName   = inputSalesPersonName;
        }

        if (inputSalesAmountInCAD < 0 || inputSalesAmountInCAD > TIER_RATE_E)
        {
            throw new IllegalArgumentException("Sales amount cannot be less than 0 or greater than 59999");
        }
        else
        {
            salesAmountInCAD = inputSalesAmountInCAD;
        }
    }

    /**
     * @param CommissionSales default constructor
     */
    public CommissionSales()
    {
        salesPersonName = "unknown";
    }

    //accesors (getters)
    /**
     * @param getSalesPersonName is the accesor method for salesPersonName
     * @retun salesPersonName
     */
    public String getSalesPersonName()
    {
        return salesPersonName;
    }

    /**
     * @param getSalesAmountInCAD is the accesor method for salesAmountInCAD
     * @return salesAmountInCAD
     */
    public int getSalesAmountInCAD()
    {
        return salesAmountInCAD;   
    }

    /**
     * @param getPayInCad is the accesor method for payInCad 
     * @return payInCad 
     */
    public double getPayInCad()
    {
        return payInCad ;
    }

    //mutators (setters)
    /**
     * @param setSalesAmountInCAD is the mutator method for salesAmountInCAD, if the sales amount is not
     * within the specified range, an illegal argument exception is thrown
     */
    public void setSalesAmountInCAD (int inputSalesAmountInCAD)
    {
        if (inputSalesAmountInCAD < 0 || inputSalesAmountInCAD > TIER_RATE_E)
        {
            throw new IllegalArgumentException("Sales amount cannot be less than 0 or greater than 59999");
        }
        else
        {
            salesAmountInCAD = inputSalesAmountInCAD;
        }
    }

    /**
     * @setSalesPersonName is the mutator method for salesPersonName, if the input is null, an exception is thrown
     */
    public void setSalesPersonName (String inputSalesPersonName)
    {
        if (inputSalesPersonName == null)
        {
            throw new IllegalArgumentException(" Sales person name cannot be null");
        }
        else 
        {
            salesPersonName   = inputSalesPersonName;
        } 
    }

    //methods
    /**
     * @param calculatePay is the method used to calculate commision payout based on sales
     * @return payInCad
     */
    public double calculatePay() {
        payInCad = 0; 
        double commisionAmount = 0.0 ;
        {
            switch ( salesAmountInCAD / DIVISION_FACTOR){
                case 1:  
                commisionAmount = RATE_A;
                break;
                case 2:  
                commisionAmount = RATE_B;
                break;
                case 3:  
                commisionAmount = RATE_C;
                break;
                case 4: 
                commisionAmount = RATE_D;
                break;
                case 5:
                commisionAmount = RATE_E;
                break;
                default:
                commisionAmount = 0.0;
                System.out.println("The sales amount is invalid or outside the acceptable range");
            }
        }

        payInCad = salesAmountInCAD * commisionAmount;
        return payInCad;

    }

    /**
     * @param displayDetails is the display method for showing salesPersonName and payInCad
     */
    public void displayDetails() {
        System.out.println("Salesperson Name: " +salesPersonName);
        System.out.println("Salesperson Pay: " +payInCad);
    }
}

