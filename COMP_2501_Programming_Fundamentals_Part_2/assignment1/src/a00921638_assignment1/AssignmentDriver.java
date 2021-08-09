package a00921638_assignment1;

/**
 * 
 * @author Vladislav Gudkov (A00921638)
 *
 */


import java.util.ArrayList;

public class AssignmentDriver 
{
	//test data
	private Address a1 = new Address("1a", 777, "56th avenue", "v7n2m8", "surrey");
    private Property p1 = new Property("abc123", "residence", 499000.00, a1, 2, false);

    private Address a2 = new Address(null, 123, "main street", "v7r2g2", "west vancouver");
    private Property p2 = new Property("xyz789", "residence", 5999999.00, a2, 5, true);

    private Address a3 = new Address(null, 456, "elm street", "90210", "los angeles");
    private Property p3 = new Property("777def", "residence", 2500000.00, a3, 6, true);

    private Address a4 = new Address("44", 1111, "maple street", "v8y3r5", "vancouver");
    private Property p4 = new Property("876tru", "retail", 1000000.00, a4, 1, false);

    private Address a5 = new Address("9", 99, "gretzky way", "t6v7h3", "toronto");
    private Property p5 = new Property("9999", "commercial", 99999.00, a5, 1, false);

    private Address a6 = new Address("b", 711, "country road", "v8h5f5", "maple ridge");
    private Property p6 = new Property("mr6789", "residence", 740100.00, a6, 3, false);

    private Address a7 = new Address(null, 8785, "pinnacle avenue", "v9u3h3", "north vancouver");
    private Property p7 = new Property("78444a", "residence", 15000000.00, a7, 20, true);

    private Address a8 = new Address(null, 800, "elm street", "90557", "los angeles");
    private Property p8 = new Property("mmm33", "residence", 7100000.00, a8, 10, false);

    private Address a9 = new Address(null, 1515,"main street", "v8y7r3", "west vancouver");
    private Property p9 = new Property("678T", "commercial", 4000000.00, a9, 2, true);

    private Address a10 = new Address("6", 60, "60th street", "v8u9b1", "burnaby");
    private Property p10 = new Property("y6yyy", "retail", 700000.00, a10, 2, true);

    private Address a11 = new Address("7h", 1500, "railway avenue", "v9v5v4", "richmond");
    private Property p11 = new Property("A1212", "commercial", 840000.00, a11, 4, false);

    private Address a12 = new Address(null, 333, "elm street", "90111", "los angeles");
    private Property p12 = new Property("9000a", "residence", 1600000.00, a12, 3, false);
	
    
      //Address[] ADDRESS_DATA  (a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12);
	  //Property[] PROPERTY_DATA = (p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
	
	
	public void run()
	{
		Agency agency=new Agency("BCIT");
		agency.addProperty(p1);
		agency.addProperty(p2);
		agency.addProperty(p3);
		agency.addProperty(p4);
		agency.addProperty(p5);
		agency.addProperty(p6);
		agency.addProperty(p7);
		agency.addProperty(p8);
		agency.addProperty(p9);
		agency.addProperty(p10);
		agency.addProperty(p11);
		agency.addProperty(p12);
		agency.removeProperty(null);
		agency.getProperty("abc123");
		
	}


	public static void main(String[] args) 
	{
		new AssignmentDriver().run();
	}

}
