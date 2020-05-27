/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2;

/**
 *
 * @author Izrux
 */
import java.lang.Math;
import java.io.*;
import javax.swing.JOptionPane;

public class NewtonRaphson {

    double a,tol,b,c,cont,res,x1,x2;
    
    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Solo se admiten numeros ");
        }
        return false;
}
    
    
    public void datos(){
        String primerNumero;
         String segundoNumero ;
             do  primerNumero = JOptionPane.showInputDialog("Primer aproximacion");
           while (!isNum(primerNumero));
              a = Double.parseDouble(primerNumero);
          
       do  segundoNumero = JOptionPane.showInputDialog("Tolerancia");
           while (!isNum(segundoNumero));
          tol = Double.parseDouble(segundoNumero);
    }
    
    public void MetodoNewtonRaphson() {    
        do {
            b = a - ((a*a*a)-(2*a)-2) / ((3*a*a) - 2);
            c = (Math.abs((a - b)/b))*100;
            a = b;
            x1=(a*a*a)-(2*a)-2;
            x2=((3*a*a) - 2);
            res = c;
            System.out.println(b+" "+x1+" "+x2+" "+res+"%");
            cont++;
        } while (c > tol);
    }
    
    public void print(){
           JOptionPane.showMessageDialog(null, "La raiz es: " + b +" \n Con: "
                   +cont+" iteraciones y un porcentaje de error del " + res+"%", "Raiz por NewtonRaphson", JOptionPane.PLAIN_MESSAGE);
    }

    public double lee() {
        double num;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String sdato;
            sdato = br.readLine();
            num = Double.parseDouble(sdato);
        } catch (IOException ioe) {
            num = 0.0;
        }
        return num;
    }

    public static void main(String args[]) {
        NewtonRaphson Proyecto = new NewtonRaphson();
        Proyecto.datos();
        Proyecto.MetodoNewtonRaphson(); //solo se manda a llamar a menu desde aqui, ya que menu llama a los demas metodos posteriromente
        Proyecto.print();;
    }
}
