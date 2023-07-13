import javax.swing.*;    
public class ToolTipDemo {
    public static void main(String[] args) {
        JFrame j=new JFrame("Password file example:");
        JPasswordField value=new JPasswordField();
        value.setBounds(100,80,100,50);
        JLabel jlab=new JLabel("Password:");
        jlab.setBounds(30,100,100,50);
        j.add(value);
        j.add(jlab);
        j.setSize(300,300);
        j.setLayout(null);
        j.setVisible(true);
    }
}
