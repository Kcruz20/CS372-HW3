package HW3;
//Teacher class
/**
 * Teacher are sub class of person and also employees
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person implements Employee 
{
	int Grade;
	String Certification;
	
	public Teacher(String newName, int newAge, int newPhone, int newGrade, String newCert) 
	{
		Name = newName;
		Age = newAge;
		PhoneNum = newPhone;
		Grade = newGrade;
		Certification = newCert;	
	}
	
	private ArrayList<String>employee = new ArrayList<String>();
	
	public int Pay()
	{
		int Pay = 1550;
		return Pay;
	} 
	
	public int ID() 
	{
		Scanner input = new Scanner(System.in);
		int ID = input.nextInt();
		return ID;
	}
	
}

