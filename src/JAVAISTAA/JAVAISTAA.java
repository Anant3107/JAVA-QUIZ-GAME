package JAVAISTAA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class JAVAISTAA extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1;
    JAVAISTAA(){
        setBounds( 400, 200, 1200, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);
        
        JLabel l2 = new JLabel("JAVAISTA");
        l2.setFont(new Font("Viner Hand ITC",Font.BOLD, 35));
        l2.setForeground(Color.BLUE);
        l2.setBounds(750, 70, 300, 30);
        add(l2);
        
         JLabel l3 = new JLabel("Enter your name");
        l3.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        l3.setForeground(Color.BLUE);
        l3.setBounds(810, 160, 300, 20);
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(730, 200, 300, 25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);
        
        b1= new JButton("RULES");
        b1.setBounds(730, 260, 120, 25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2= new JButton("EXIT");
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.setBounds(910, 260, 120, 25);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           String name=t1.getText();
           this.setVisible(false);
           new Rules(name);
       }else{
           System.exit(0);
       }
   }
    public static void main(String[] args) {
        new JAVAISTAA();
    }
    
}
