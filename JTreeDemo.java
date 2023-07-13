import java.awt.*;    
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class JTreeDemo {
    public JTreeDemo(){
        JFrame j=new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300,300);
        j.setVisible(true);
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("options");
        DefaultMutableTreeNode a=new DefaultMutableTreeNode("A", true);
        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("a1");
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("a2");
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("b");
        DefaultMutableTreeNode b1=new DefaultMutableTreeNode("b1");
        DefaultMutableTreeNode b2=new DefaultMutableTreeNode("b2");
        top.add(a);
        a.add(a1);
        a.add(a2);
        top.add(b);
        b.add(b1);
        b.add(b2);

        JTree jt=new JTree(top, true);
        JScrollPane jsp=new JScrollPane(jt);

        j.add(jsp);

        JLabel jl=new JLabel();
        j.add(jl,BorderLayout.SOUTH);

        jt.addTreeSelectionListener(new TreeSelectionListener() {
           public void valueChanged(TreeSelectionEvent tse){
            jl.setText("Selection:"+tse.getPath());
           } 
        });
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    new JTreeDemo();
                }
            });
        }


}
