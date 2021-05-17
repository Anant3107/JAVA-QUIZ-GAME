package JAVAISTAA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    JButton b1,b2;
    String username;
    Rules(String username){
        this.username=username;
       setBounds(600,200, 800, 650);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
      
       
       JLabel l1= new JLabel("Welcome "+ username +" to JAVAISTAA ");
       l1.setForeground(new Color(30, 144, 255));
       l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
       l1.setBounds(50, 20, 700, 30);
       add(l1);
       
       JLabel l2=new JLabel("");
       l2.setFont(new Font("Tahoma", Font.PLAIN,16));
       l2.setBounds(20, 90, 600,350);
       l2.setText(
           "<html>"+
               "1.You are trained to be a programmer not a story teller , answer point to point"+"<br><br>"+
               "2.do not smile unnnecessarily to the person next to you , they may also not know the answer"+"<br><br>"+
               "3.Crying is allowed but please do it quitely"+"<br><br>"+
               "4.do not get nervous if your frnd is answering more may be he/doing jai mata di"+"<br><br>"+
               "5.May you know more than Jon Snow Knows, Good Luck"+"<br><br>"+
           "<html>"
            );
       add(l2);
       b1= new JButton("Back");
       b1.setBounds(250, 400, 100, 30);
       b1.setBackground(new Color(30, 144, 255));
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       add(b1);
      
       b2= new JButton("Start");
       b2.setBounds(400, 400, 100, 30);
       b2.setBackground(new Color(30, 144, 255));
       b2.setForeground(Color.white);
       b2.addActionListener(this);
       add(b2);
       
       
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            this.setVisible(false);
            new JAVAISTAA().setVisible(true);
        }else if(ae.getSource()== b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);              
        }
                        
    }
    public static void main(String []args){
        new Rules("");
        
    }
}
