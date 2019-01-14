package HW3;
//City hall class
/**
 * Array with Occupants
 */

import java.util.ArrayList;

public class CityHall extends Building 
{
	public CityHall(String newName, String newAddress)
	{
		Name = newName;
		Address = newAddress;
	}
	
	public ArrayList<String>Occupants = new ArrayList<String>();
	
	public void addOcc(String Name) 
	{
		Occupants.add(Name);
	}
	
	public void showOcc() 
	{
		System.out.printf("People in CityHall: \n");
		for(String oc:Occupants)
			System.out.printf(" %s \n",oc);
	}

	public void addEmployee(String policeOfficer) {
		// TODO Auto-generated method stub
		
	}

	public void removeEmployee(String policeOfficer) {
		// TODO Auto-generated method stub
		
	}

}

