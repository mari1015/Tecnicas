
package com.mycompany.tecnicas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class ingenieria {
    DecimalFormat df=new DecimalFormat("#.00");
   double promedio,parcial1,parcial2,examenfinal;
   //programacion,calculo,ingles,algebra
   public void programacion(){
       parcial1=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
       parcial2=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del segundo parcial"));
       examenfinal=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del examen final"));
       promedio=(parcial1+parcial2+examenfinal)/3;
       JOptionPane.showMessageDialog(null,"el promedio es: "+(df.format (promedio)));
   }
   public void calculo(){
    parcial1=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
       parcial2=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del segundo parcial"));
       examenfinal=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del examen final"));
       promedio=(parcial1+parcial2+examenfinal)/3;
       JOptionPane.showMessageDialog(null,"el promedio es: "+(df.format ( promedio)));   
   }
   public void ingles(){
       parcial1=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
       parcial2=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del segundo parcial"));
       examenfinal=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del examen final"));
       promedio=(parcial1+parcial2+examenfinal)/3;
       JOptionPane.showMessageDialog(null,"el promedio es: "+ (df.format (promedio)));
   }
   public void algebra (){
       parcial1=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
       parcial2=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del segundo parcial"));
       examenfinal=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del examen final"));
       promedio=(parcial1+parcial2+examenfinal)/3;
       JOptionPane.showMessageDialog(null,"el promedio es: "+ (df.format (promedio)));
   }
public static void main (String[] args){
    ingenieria notas=new ingenieria();
    int menu;
    do {
          menu=Integer.parseInt(JOptionPane.showInputDialog("digite el promedio segun corresponda"
          +"\n 1) programacion"
          +"\n 2) calculo"
          +"\n 3) ingles"
          +"\n 4) algebra"
          +"\n 0) salir"));
          switch (menu){
              case 1:
                  notas.programacion();
                  break;
              case 2:
                  notas.calculo();
                  break;
              case 3:
                  notas.ingles ();
                  break;
              case 4:
                  notas.algebra ();
          }
                  
    }while (menu!=0);
}
}
        
        

