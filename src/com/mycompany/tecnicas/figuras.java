package com.mycompany.tecnicas;

import javax.swing.JOptionPane;

public class figuras {
   public void cuadrado() {
       int lado;
       int area;
       lado=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño del lado"));
       area=lado*lado;
       JOptionPane.showMessageDialog(null,"el area del cuadrado es: "+area);
   } 
   public void triangulo (){
       int base,altura,area;
       base=Integer.parseInt(JOptionPane.showInputDialog("ingrese la base del triangulo"));
       altura=Integer.parseInt(JOptionPane.showInputDialog("digite la altura del triangulo "));
       area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"el area del triangulo es: "+ area);
   }
   public void circulo(){
       double radio,pi=3.1416,area;
       radio=Double.parseDouble(JOptionPane.showInputDialog("digite el radio del circulo"));
       area=pi*Math.pow(radio,2);
       JOptionPane.showMessageDialog(null,"el area del circulo es: "+ area);
       
   }
}
