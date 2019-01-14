/**
 * HW3
 * This is the UI for the city. 
 * When you click a character or building it will give you information 
 * You can drag the characters
 * Information will be printed about each character or building. 
 */

package HW3;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Font;


public class UI extends JComponent implements MouseMotionListener, MouseListener, ActionListener 
{
	int KidX = 50;
	int KidY = 450;
	int drag = 0;
	int SchoolX = 550;
	int SchoolY = 25;
	int CityHallX = 150;
	int CityHallY = 25;
	int TeacherX = 250;
	int TeacherY = 450;
	int PoliceX = 650;
	int PoliceY = 450;
	
	int x=100, y=725;
	int x1 = 100, y1= 750;
	
	JFrame frame;


	Person[] People = 
		{
			new Teacher("Ms. Martinez", 32, 1234567,5, "Education"), 
			new Police("Captain Smith" , 23, 2345678, Police.Role.Captain), 
			new Kid("Chris", 9, 3123456, "Kit Kat")
		};
	
	Building[] building = 
		{
			new CityHall("City Hall", " 123 Hawthorn Rd."),
			new School("Mountain School", " 345 Hawthorn rd.")
		};

    String Kid1 = People[2].getName();
    String Police1 = People[1].getName();
    String Teacher1 = People[0].getName();
    
    School s = (School) building[1];
    CityHall c = (CityHall) building[0];
    
    Image imageKid, imageSchool, imageCityHall, imageTeacher, imagePolice;
    
    public UI (Image kid, Image school, Image cityhall, Image teacher, Image police)
    {
    	imageKid = kid;
    	imageSchool = school;
    	imageCityHall = cityhall;
    	imageTeacher = teacher;
    	imagePolice = police;
    	addMouseMotionListener(this);
        addMouseListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getX() > SchoolX && e.getX() < SchoolX + 300 && e.getY() > SchoolY && e.getY() < SchoolY + 250)
		{
			JOptionPane.showMessageDialog(null,"This is the School");
			System.out.printf("%s,%s\n",building[1].Name,building[1].Address);
			s.showOcc();
		}
		else if (e.getX() > CityHallX && e.getX() < CityHallX + 300 && e.getY() > CityHallY && e.getY() < CityHallY + 250)
		{
			JOptionPane.showMessageDialog(null,"This is City Hall");
			System.out.printf("%s,%s\n",building[0].Name,building[0].Address);
			c.showOcc();
		}
		else if (e.getX() > KidX && e.getX()< KidX + 200 && e.getY() > KidY && e.getY() < KidY + 200){
			JOptionPane.showMessageDialog(null,"This is Chris, he goes to school");
			System.out.printf("%s\n",People[2].getName());
		}
		else if (e.getX() > TeacherX && e.getX()< TeacherX + 200 && e.getY() > TeacherY && e.getY() < TeacherY + 200){
			JOptionPane.showMessageDialog(null,"This is Ms. Martinez, she teaches at school");
			System.out.printf("%s\n",People[0].getName());
		}
		else if (e.getX() > PoliceX && e.getX()< PoliceX + 200 && e.getY() > PoliceY && e.getY() < PoliceY + 200){
			JOptionPane.showMessageDialog(null,"This is Captain Smith, she works in city hall");
			System.out.printf("%s\n",People[1].getName());
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getX() >= KidX && e.getX() <= KidX + 100 && e.getY()>= KidY && e.getY() <= KidY +100)
		{
			drag = 3;
		}
		else if(e.getX() >= TeacherX && e.getX() <= TeacherX + 100 && e.getY() >= TeacherY && e.getY() <= TeacherY + 100)
		{
			drag = 2;
		}
		else if (e.getX() >= PoliceX && e.getX() <= PoliceX + 100 && e.getY()>= PoliceY && e.getY() <= PoliceY +100)
    	{
			drag = 1;
    	}
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		drag = 0;
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
		
	if (drag == 3)
    {
    	KidX = e.getX();
    	KidY = e.getY();
    	if (KidX > 450 && KidX < 550 && KidY > 150 && KidY < 200)
    	{
	    	s.addEmployee(Kid1);
    	}
    	else if (KidX > 450 || KidX < 550 || KidY >150 || KidY < 200)
    	{
    		s.removeEmployee(Kid1);
    	}
    }	
		
	if (drag == 2)
    {
		TeacherX = e.getX();
		TeacherY = e.getY();
		 if (TeacherX > 450 && TeacherX < 550 && TeacherY > 150 && TeacherY < 200)
        	{
	    	  s.addEmployee(Teacher1);
        	}
        else if (TeacherX > 450 || TeacherX < 550 || TeacherY >150 || TeacherY < 200)
        	{
				s.removeEmployee(Teacher1);
        	}
    }
		
	if (drag == 1) 
	{
		 PoliceX = e.getX();
		 PoliceY = e.getY();
		  if (PoliceX > 450 && PoliceX < 550 && PoliceY > 150 && PoliceY < 200)
		   {
		     c.addEmployee(Police1);
		   }
		  else if (PoliceX > 450 || PoliceX < 550 || PoliceY > 150 || PoliceY < 200)
		   {
			 c.removeEmployee(Police1);
		    }
	}
      repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}
	
	public void paint(Graphics C) 
	{
	      Graphics City = (Graphics)C;
	      Graphics2D C2 = (Graphics2D)C;

	      City.drawImage(imageSchool, SchoolX, SchoolY, this);
	      City.drawImage(imageCityHall, CityHallX, CityHallY, this);
	      City.drawImage(imageKid, KidX, KidY, this);
	      City.drawImage(imageTeacher, TeacherX, TeacherY, this);
	      City.drawImage(imagePolice, PoliceX, PoliceY, this);
	      
	      super.paint(C);
	      Font font = new Font("Tahoma", Font.BOLD+Font.PLAIN,15);
	      C2.setFont(font);
	      C2.drawString("When you click a character or building it will give you information and it will be printed", x, y);
	      C2.drawString("You can move characters", x1, y1);
	}
	
	
	
	public static void main(String[] args)
    {
    	
		String kid = "kid.jpeg";
		String School = "School1.jpeg";
		String cityhall = "CityHall.jpeg";
		String teacher = "Teacher.png";
		String police = "Police.jpg";
		
	       
	    Image imageS = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(School));
	       imageS = imageS.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
	     
	    Image imageCH = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(cityhall));
	     	imageCH = imageCH.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
	    
	    Image imagek = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(kid));
		     imagek = imagek.getScaledInstance(100, 125, Image.SCALE_SMOOTH);
	    
	    Image imageT = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(teacher));
		     imageT = imageT.getScaledInstance(100, 125, Image.SCALE_SMOOTH);
	          
		Image imageP = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(police));
		     imageP = imageP.getScaledInstance(100, 125, Image.SCALE_SMOOTH);
	          
	    JFrame frame = new JFrame("HW3 - UI");
	       
	    frame.add( new UI( imagek, imageS, imageCH, imageT, imageP) );
	    frame.setSize(900, 800);     
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );     
	    frame.setVisible(true);  
	   

	       
    }
	
}

