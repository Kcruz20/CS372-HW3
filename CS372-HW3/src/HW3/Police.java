package HW3;
//Police class
/**
 * police class of person and employee
 * different roles that police employees have
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Police extends Person implements Employee
{
	
	public Police(String newName, int newAge, int newPhone, Role R) 
	{
		Name = newName;
		Age = newAge;
		PhoneNum = newPhone;
		ROLE = R; 
	}
	
	public enum Role {Patrol, Sargeant, Captain, Chief};
	
	private Role ROLE;
	
	public Role getRole() {return ROLE;}
	
	public void setRole(Role R){ROLE = R;}
	
	public int ID() 
	{
		Scanner input = new Scanner(System.in);
		int ID = input.nextInt();
		return ID;
	}
	
	public int Pay()
	{
		int Pay = 2500;
		return Pay;
	} 
	
}

