/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Izrux
 */
public class Coseno {
    Variables  c1 = new Variables ();


    public void inicio() {
        System.out.println("Para hacer iteraciones ");
    }
    
    
    double r,res=1,q,q1,q2,factorial=1,aux1,aux2=1,aux3;
    int i=2;
    boolean isNum(String cad) {

        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,"solo se admiten valores numericos");
        }
        return false;
    }


    public void datos(Variables y) {

        String aux;

        do aux = JOptionPane.showInputDialog("Introduzca el valor de X");
        while (!isNum(aux));
        y.setx((Double.parseDouble(aux)));

        

    }

    public void calculos() {
    int x = (int) c1.getx();
    int y = (int) c1.gety();
    int z = (int) c1.getz();
     
    q = Math.cos(x);
    JOptionPane.showMessageDialog(null,"\nEl valor real: " + q);
    while (q!=res) {
        
     q1=   Math.pow(x, i);
     q2=i;
     factorial=1;
         while ( q2!=0) {
      factorial=factorial*q2;
      q2--;
      
    }
        i=i+2;
        aux1=q1/factorial;
        if ((aux2 % 2) == 0)
{
    
        res = res+aux1;
        
}
else
{
        res = res-aux1;
}
      
    aux2++;
        
}
    }
    
    


    void resultados() { //No. 3 Imprimir
        
        JOptionPane.showMessageDialog(null,"\nEl valor " + res);
        JOptionPane.showMessageDialog(null,"\n Fue alcanzado en: "+ aux2 +" iteraciones \n");
        
    
    }

    public static void main(String[] args) throws IOException {
        Coseno a = new Coseno ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            resp = JOptionPane.showInputDialog("¿Desea calcular de nuevo? s/n");
            System.in.skip(2);
        }
    }
}

