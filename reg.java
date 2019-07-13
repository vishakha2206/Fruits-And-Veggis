import java.awt.*;
import java.applet.Applet;

public class reg extends Frame
{
	public static void main(String args[])
	{
		Frame f=new Frame("Registration form");
		Label l1=new Label("First name");
		l1.setBounds(50,50,100,20);
		f.add(l1);
		
		TextField t1=new TextField();
		t1.setBounds(150,50,100,20);
		f.add(t1);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		Label l2=new Label("Last name");
		l2.setBounds(50,80,100,20);
		f.add(l2);
		
		TextField t2=new TextField();
		t2.setBounds(150,80,100,20);
		f.add(t2);
		
		CheckboxGroup C=new CheckboxGroup();
		Checkbox c1=new Checkbox("Male",C,false);
		c1.setBounds(50,110,100,20);
		f.add(c1);
		
		Checkbox c2=new Checkbox("Female",C,false);
		c2.setBounds(150,110,100,20);
		f.add(c2);
		
		Button b1=new Button("Submit");
		b1.setBounds(50,150,100,20);
		f.add(b1);
		
		
		
		
	}
}