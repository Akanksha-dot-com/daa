import java.awt.*;
import java.awt.event.*;
class Do
{
	public static void main(String args[])
	{
		Frame f = new Frame("my frame");
		
		Label l1 = new Label("First");
		Label l2 = new Label("Second");
		
		TextField t1 = new TextField(10);
		TextField t2 = new TextField(10);
		
		Button b = new Button("OK");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String temp = t1.getText();
				t1.setText(t2.getText());
				t2.setText(temp);
			}});
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b);
		
		f.setLayout(new FlowLayout());
		f.setSize(300,300);
		f.setVisible(true);	
	}
}