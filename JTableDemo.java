import javax.swing.*;
import java.awt.*;
public class JTableDemo {
    String[] colHeads={"Name","Phone","Address"};
    Object[][] data={{"Ram","12","hyd"},{"Jill","23","usa"}};
    public JTableDemo()
    {
        JFrame j=new JFrame("JTable");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300,300);
        JTable jt=new JTable(data,colHeads);
        JScrollPane jsp=new JScrollPane(jt);
        j.add(jsp);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new JTableDemo();
            }
        });
    }
}
