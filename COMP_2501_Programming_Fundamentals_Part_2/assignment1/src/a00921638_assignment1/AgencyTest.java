package a00921638_assignment1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AgencyTest
{
    private Agency agency;

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


    @BeforeEach
    void setUp()
    {
        agency = new Agency("BCIT Ltd");





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

    }


    @AfterEach
    void tearDown()
    {
        agency = null;
    }




    @Test
    void addGetProperty()
    {
        assertNull(agency.getProperty("x"));

        Address a13 = new Address(null, 333, "elm street", "90111", "los angeles");
        Property p13 = new Property("x", "residence", 1600000.00, a13, 3, false);

        agency.addProperty(p13);

        assertSame(p13, agency.getProperty("x"));
    }


    @Test
    void removeProperty()
    {
        assertNull(agency.getProperty("x"));

        Address a13 = new Address(null, 333, "elm street", "90111", "los angeles");
        Property p13 = new Property("x", "residence", 1600000.00, a13, 3, false);

        agency.addProperty(p13);

        assertSame(p13, agency.getProperty("x"));

        agency.removeProperty("x");

        assertNull(agency.getProperty("x"));

    }

    @Test
    void getTotalPropertyValues()
    {
        assertEquals(40079098, agency.getTotalPropertyValues());
    }

    @Test
    void getPropertiesWithPools()
    {
        ArrayList<Property> propertiesWithPools = new ArrayList<>();
        propertiesWithPools.add(p2);
        propertiesWithPools.add(p3);
        propertiesWithPools.add(p7);
        propertiesWithPools.add(p9);
        propertiesWithPools.add(p10);




        assertTrue(propertiesWithPools.size() == agency.getPropertiesWithPools().size() &&
                propertiesWithPools.containsAll(agency.getPropertiesWithPools()) &&
                agency.getPropertiesWithPools().containsAll(propertiesWithPools));



    }

    @Test
    void getPropertiesBetween()
    {
        Property[] matches = new Property[5];
        Property[] agencyResults = agency.getPropertiesBetween(700001, 2500000);

        assertTrue(agencyResults.length == 5);

        matches[0] = p3;
        matches[1] = p4;
        matches[2] = p6;
        matches[3] = p11;
        matches[4] = p12;

        boolean found0 = false;
        boolean found1 = false;
        boolean found2 = false;
        boolean found3 = false;
        boolean found4 = false;



        for(Property property: agencyResults)
        {
            if(property.getPropertyId().equalsIgnoreCase(matches[0].getPropertyId()))
            {
                found0 = true;
            }

            if(property.getPropertyId().equalsIgnoreCase(matches[1].getPropertyId()))
            {
                found1 = true;
            }

            if(property.getPropertyId().equalsIgnoreCase(matches[2].getPropertyId()))
            {
                found2 = true;
            }

            if(property.getPropertyId().equalsIgnoreCase(matches[3].getPropertyId()))
            {
                found3 = true;
            }

            if(property.getPropertyId().equalsIgnoreCase(matches[4].getPropertyId()))
            {
                found4 = true;
            }
        }

        assertTrue(found0 && found1 && found2 && found3 && found4);



    }

    @Test
    void getPropertiesOn()
    {
        ArrayList<Address> propertiesOnElmStreet = new ArrayList<>();
        propertiesOnElmStreet.add(p3.getAddress());
        propertiesOnElmStreet.add(p8.getAddress());
        propertiesOnElmStreet.add(p12.getAddress());


        assertTrue(propertiesOnElmStreet.size() == agency.getPropertiesOn("elm street").size() &&
                propertiesOnElmStreet.containsAll(agency.getPropertiesOn("elm street")) &&
                agency.getPropertiesOn("elm street").containsAll(propertiesOnElmStreet));

    }



    @Test
    void getPropertiesWithBedrooms()
    {
        HashMap<String, Property> expectedMatches = new HashMap<>();

        expectedMatches.put(p2.getPropertyId(), p2);
        expectedMatches.put(p3.getPropertyId(), p3);
        expectedMatches.put(p8.getPropertyId(), p8);
        expectedMatches.put(p11.getPropertyId(), p11);

        HashMap<String, Property> fromAgency = agency.getPropertiesWithBedrooms(4,12);

        assertEquals(expectedMatches.size(), fromAgency.size());


        Set<String> propertyIds = expectedMatches.keySet();

        // are all four expected properties in the agency?
        for(String expectedPropertyId: propertyIds)
        {
            assertTrue(fromAgency.containsKey(expectedPropertyId));
        }



        assertNull(agency.getPropertiesWithBedrooms(7, 9));




    }

    @Test
    void getPropertiesOfType()
    {

        ArrayList<Property> agencyData = agency.getPropertiesOfType("commerCIAl");

        boolean s1found = false;
        boolean s2found = false;
        boolean s3found = false;
        boolean s4found = false;

        //Type: COMMERCIAL
        String s1 = "Property ID: 678T, Type: commercial, Price: $4000000.00, Address: 1515, main street, v8y7r3, west vancouver";
        String s2 = "Property ID: A1212, Type: commercial, Price: $840000.00, Address:7h 1500, railway avenue, v9v5v4, richmond";
        String s3 = "Property ID: 9999, Type: commercial, Price: $99999.00, Address:9 99, gretzky way, t6v7h3, toronto";

        // order doesn't matter, so the numbers don't matter, but the strings must be present
        for(Property property: agencyData)
        {
            if(property.getPropertyDetails().contains(s1))
            {
                s1found = true;

            }
            if(property.getPropertyDetails().contains(s2))
            {
                s2found = true;

            }
            if(property.getPropertyDetails().contains(s3))
            {
                s3found = true;

            }
            
        }
        assertEquals(3, agencyData.size());
        assertTrue(s1found && s2found && s3found);

        // new check, for property type that does not exist

        boolean s5found = false;
        boolean s6found = false;

        /*ArrayList<Property> agencyData2 = agency.getPropertiesOfType("rental");
        // order doesn't matter, so the numbers don't matter, but the strings must be present

        assertEquals(2, agencyData2.size());
        for(property string2: agencyData2)
        {
            if (string2.contains("Type: FAKE FAKE FAKE"))
            {
                s5found = true;

            }
            if (string2.contains("<none found>"))
            {
                s6found = true;
            }
        }
        assertTrue(s5found && s6found);*/

    }
}