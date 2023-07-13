import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/*<applet code=KeyEvent1 width=600 height=500>
</applet>*/

public class keyEvent1 extends Applet implements KeyListener
{
int x=40,y=50;
String msg="Key Events";

public void init(){
setBackground(Color.black);
setForeground(Color.yellow);
addKeyListener(this);
}

public void KeyPressed(KeyEvent Ke)
{
showStatus("Key Pressed");
}
public void KeyReleased(KeyEvent Ke)
{
showStatus("Key Released");
}
public void KeyTyped(KeyEvent ke){
msg="Key Typed";
msg+=ke.getKeyChar();
showStatus("keyTyped");
}
public void paint(Graphics g)
{
g.drawString(msg,x,y);
}
}