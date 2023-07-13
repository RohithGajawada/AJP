import javax.swing.*;
public class JButtonDemo{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton btn=new JButton("Click");
        btn.setBounds(100,130,100,50);
        f.add(btn);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
