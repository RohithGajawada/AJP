import javax.swing.*;
public class JLabelDemo{
    JLabelDemo(){
    JFrame j=new JFrame();
    JLabel jlab=new JLabel("First Label Application");
    j.setSize(400,400);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.add(jlab);
    j.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new JLabelDemo();
            }
        });
        System.out.println("This appears first");
        System.out.println("");
        
        }
}
