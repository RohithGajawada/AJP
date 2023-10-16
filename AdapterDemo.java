import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame{
String msg=" ";//hello
public AdapterDemo(){
addMouseListener(new MyMouseAdapter(this));
addMouseMotionListener(new MyMouseAdapter(this));
//addWindowListener(new MyWindowAdapter());
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}
});
}
public void paint(Graphics g)
{
g.drawString(msg,20,80);
}
public static void main(String args[])
{
AdapterDemo ad=new AdapterDemo();
ad.setSize(500,300);
ad.setTitle("AdapterDemo");
ad.setVisible(true);
}
}
class MyMouseAdapter extends MouseAdapter{
AdapterDemo adapterDemo;
public MyMouseAdapter(AdapterDemo adapterDemo){
this.adapterDemo=adapterDemo;
}
public void mouseClicked(MouseEvent me){
adapterDemo.msg="Mouse clicked";
adapterDemo.repaint();
}
public void mouseDragged(MouseEvent me){
adapterDemo.msg="Mouse Dragged";
adapterDemo.repaint();
}

/*class MyWindowAdapter extends WindowAdapter{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}*/
}

