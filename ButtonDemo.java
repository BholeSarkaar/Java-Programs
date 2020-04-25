import java.awt.*;
import java.awt.event.*;
class ButtonDemo extends Frame
  {
            Label L1,L2;
        ButtonDemo()
           {
                FlowLayout f1=new FlowLayout();
                setLayout(f1);
                Button b1=new Button("click me");
	   
                L1=new Label("Rohit");
	   L2=new Label("		");
	   add(L1);add(L2);add(b1);
         }
    public void actionPerformed(ActionEvent ae)
       {
	String a=L1.getText();
	L2.setText(a);
       }
   public static void main(String args[])
      {
            ButtonDemo B1=new ButtonDemo();
	B1.setTitle("button");
	B1.setSize(500,400);
	B1.setVisible(true);
       }
 }