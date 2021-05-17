package JAVAISTAA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    Score(String username , int score){
        setBounds(580,140,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i2= i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(10,200, 300,250);
        add(l1);
        ;
        
        JLabel l2= new JLabel("THANK YOU FOR PLAYING JAVAISTAA");
        l2.setBounds(105,35,750,30);
        l2.setFont(new Font("RALEWAY", Font.BOLD, 26));
        add(l2);
     
        JLabel l3= new JLabel("Your Score is "+score);
        l3.setBounds(350,200,300,30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199,21,133));
        add(l3);
        
        JButton b1= new JButton("PLAY AGAIN");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(400, 270, 120, 30);
        add(b1);
        
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new JAVAISTAA().setVisible(true);
    }
    public static void main(String []args){
        new Score("",0).setVisible(true);
    }
}

