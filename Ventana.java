/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ventana;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author scuad
 */
public class Ventana extends JFrame {
   private JPanel panel;
   private JLabel eti1;
   private JLabel eti2;
   private JButton btn;
   private JButton btn2;
   
   public  Ventana(){
       
       setSize(500,600);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setTitle("prueba");
       panel();
   }
   
  
   
   private void panel(){
       panel=new JPanel();
       this.getContentPane().add(panel);
       panel.setLayout(null);
       button();
       etiq();
       
   }
   
   private void etiq(){
       eti1=new JLabel("¿Eres gay?",SwingConstants.CENTER);
       eti1.setFont(new Font("arial",1,15));
       eti1.setSize(80, 25);
       eti1.setLocation(200, 25);
       panel.add(eti1);
       
       ImageIcon img =new ImageIcon("curioso.png" );
       eti2 = new JLabel(img,SwingConstants.CENTER);
       eti2.setSize(200,200);
       eti2.setLocation(135,100 );
       eti2.setIcon(new ImageIcon (img.getImage().getScaledInstance(eti2.getWidth(), eti2.getHeight(), Image.SCALE_SMOOTH)));
       panel.add(eti2);
       
       
   }
   
   private void button(){
       btn=new JButton("NO");
       btn.setSize(60,30);
       btn.setLocation(125, 380);
       panel.add(btn);
       
       MouseListener oyenteDeRaton = new MouseListener ( ){
            @Override
            public void mouseClicked(MouseEvent e) {
             int ancho=(int) (Math.random()*400);
             int largo= (int) (Math.random()*500);
             
              btn.setLocation(ancho,largo);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
             int ancho=(int) (Math.random()*400);
             int largo= (int) (Math.random()*500);
             
              btn.setLocation(ancho,largo);
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
        
       btn.addMouseListener(oyenteDeRaton);
       
       btn2= new JButton("SI");
       btn2.setSize(60,30);
       btn2.setLocation(300, 380);
       panel.add(btn2);
       
       MouseListener oyenteDeRaton2 = new MouseListener ( ){
            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon img1=new ImageIcon("png.png");
                eti2.setIcon(new ImageIcon(img1.getImage().getScaledInstance(eti2.getWidth(), eti2.getHeight(), Image.SCALE_SMOOTH)));
                eti1.setText("MARICON");
                btn.setVisible(false);
                btn2.setVisible(false);
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
       btn2.addMouseListener(oyenteDeRaton2);

   }
   
}
