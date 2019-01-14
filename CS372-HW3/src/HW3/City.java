package HW3;
//This is the city class
/**
 * @version 1.00 
 * @param args
 * City class 
 */

import java.util.ArrayList;

public class City 
{

	public static void main(String[] args) 
	{
		
	//Building names and address 
		
		Building[] building = {  
									new CityHall(" City Hall","789 Hawthorn rd."), 
									new School(" Evergreen High School","123 wakiki rd."),
									new School(" Silver High School","456 Hawthorn rd."),
									new School(" Rainer Elementry School","789 north Ave.")};
	//people in the city name, age, phone, job or favorite candy
		Person[] people = { 
									new Police("Esther",40,1234567,Police.Role.Captain),
									new Police("George",35,2345678,Police.Role.Sargeant), 
									new Police("Toby",45,3456789,Police.Role.Chief),
									new Police("Edward",27,4567890,Police.Role.Captain),
									new Teacher("Mat",24,5678901,8,"Science"),
									new Teacher("Duke",45,6789012,11,"Spanish"),
									new Teacher("Luke",43,7890123,12,"Math"),
									new Teacher("John",40,7123123,10,"Writting"),
									new Kid("Alex",7,8901234,"M&M"),
									new Kid("Zo",4,9012345,"Sour Patches"),
									new Kid("Kyle",9,9342145,"Kit Kat"),
									new Kid("Anthony",10,7654321,"Skittles")};
			
		//Output the people in this city and some information about them
		System.out.printf("-----------------------------------\n");

		System.out.printf("Here is the people in the city: ");
		System.out.printf("(Name, Age, Phone number)\n");
		
		for(int i=0; i < people.length; i++) 
		{
			System.out.printf("%s, %d, %d \n", people[i].getName(), people[i].getAge(), people[i].getPhone());
			
		}
		
		System.out.printf("-----------------------------------\n");
		
		String Police1 = people[0].getName();
		String Police2 = people[1].getName();
		String Police3 = people[3].getName();
		String Teacher1 = people[4].getName();
		String Teacher2 = people[6].getName();
		String Teacher3 = people[5].getName();
		String Kid1 = people[8].getName();
		String Kid2 = people[9].getName();
		String Kid3 = people[10].getName();
	
		
		CityHall ch = (CityHall) building[0];
		ch.addOcc(Police1);
		ch.addOcc(Police2);
		ch.addOcc(Police3);
		ch.showOcc();
		
		School s = (School) building[1];
		s.addOcc(Teacher1);
		s.addOcc(Teacher2);
		s.addOcc(Kid1);
		s.addOcc(Kid2);
		s.addOcc(Kid3);
		s.addOcc(Teacher3);
		s.showOcc();
		
		//Outputs the monthy paycheck
		
		Teacher t1 = (Teacher) people[5];
		t1.Pay();
		System.out.printf("-----------------------------------");
		System.out.printf("\n%s's monthly paycheck is: $%d \n", t1.Name, t1.Pay());
		Police p1 = (Police) people[2];
		p1.Pay();
		System.out.printf("%s's monthly paycheck is: $%d \n", p1.Name, p1.Pay());
		
		System.out.printf("-----------------------------------\n");
		
		//output buildings name and address
		
		System.out.printf("The buildings in this city: \n");
		
		for(int i=0; i < building.length; i++) 
		{
			System.out.printf("%s, %s \n", building[i].Name, building[i].Address);
		}
		
		System.out.printf("-----------------------------------");
	}

}

