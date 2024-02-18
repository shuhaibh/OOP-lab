//Program to implement a Traffic Light
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Trafficlight extends JPanel implements ActionListener
{
        JRadioButton r1;
        JRadioButton r2;
        JRadioButton r3;

        Color c_red;
        Color c_green;
        Color c_yellow;

        public Trafficlight()
        {
                setBounds(0,0,640,480);
                r1= new JRadioButton("Red");
                r2= new JRadioButton("Green");
                r3= new JRadioButton("Yellow");

                ButtonGroup bg = new ButtonGroup();
                bg.add(r1);
                bg.add(r2);
                bg.add(r3);

                r1.setSelected(true);
                c_red=Color.red;
                c_green=getBackground();
                c_yellow=getBackground();

                add(r1);
                add(r2);
                add(r3);

                r1.addActionListener(this);
                r2.addActionListener(this);
                r3.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e)
        {
                if(r1.isSelected()==true)
                {
                        c_red=Color.red;
                        c_green=getBackground();
                        c_yellow=getBackground();
                }
                else if(r2.isSelected()==true)
                {
                        c_red=getBackground();
                        c_green=Color.green;
                        c_yellow=getBackground();
                }
                else if(r3.isSelected()==true)
                {
                        c_red=getBackground();
                        c_green=getBackground();
                        c_yellow=Color.yellow;
                }
                repaint();
        }
        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
                g.drawOval(50,50,50,50);
                g.drawOval(50,50,50,50);
                g.drawOval(50,50,50,50);

                g.setColor(c_red);
                g.fillOval(50,50,50,50);

                g.setColor(c_green);
                g.fillOval(50,110,50,50);

                g.setColor(c_yellow);
                g.fillOval(50,170,50,50);
        }
}
public class Traffic extends JFrame
{
        public static void main(String[] args)
        {
                JFrame f = new JFrame();
                f.setVisible(true);
                f.setSize(640,480);
                f.setLayout(null);
                Trafficlight t = new Trafficlight();
                f.add(t);
        }
}
