package HW3;
//School class
/**
 * School class with sub class of building
 * array list of occupants
 */
import java.util.ArrayList;

public class School extends Building 
{
		public School(String newName, String newAddress)
		{
			Name = newName;
			Address = newAddress;
		}
		
		public ArrayList<String>occupants = new ArrayList<String>();
		
		public void addOcc(String Name) 
		{
			occupants.add(Name);
		}
		
		public void showOcc() 
		{
			System.out.printf("-----------------------------------");
			System.out.printf("\nPeople in School: \n");
			for(String oc:occupants)
				System.out.printf(" %s \n",oc);
		}

		public void addEmployee(String teacher1) {
			// TODO Auto-generated method stub
			
		}

		public void removeEmployee(String teacher1) {
			// TODO Auto-generated method stub
			
		}

}
