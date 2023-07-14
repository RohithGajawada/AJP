import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class SwingDivide {
    JTextField t1=new JTextField(10);
    JTextField t2=new JTextField(20);
    JTextField t3=new JTextField(30);
    Button b1=new Button("Compute");
    SwingDivide()
    {
        JFrame j=new JFrame();
        j.setLayout(new FlowLayout(FlowLayout.CENTER));
        j.setSize(300,300);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1=new JLabel("Divide A/B");
        JLabel l2=new JLabel("Enter A");
        JLabel l3=new JLabel("Enter B");
        JLabel l4=new JLabel("Result A/B");

        j.add(l1);
        j.add(l2);
        j.add(t1);
        j.add(l3);
        j.add(t2);
        j.add(b1);
        j.add(l4);
        j.add(t3);
        b1.addActionListener(new ActionListener(){
            public void ActionPerformed(ActionEvent ae){
                int c;
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                c=a/b;
                String s=""+c;
                t3.setText(s);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new SwingDivide();
            }
        });
    }
    
}
