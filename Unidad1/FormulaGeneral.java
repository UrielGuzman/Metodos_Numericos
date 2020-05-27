package Unidad1;

/* FormulaGeneral.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
alumno(a): Edvin Uriel Guzman Ruiz
*/

import java.io.IOException;
import java.lang.Math;
import javax.swing.JOptionPane;


public class FormulaGeneral {

        Variables  c1 = new Variables ();



    public void inicio() {
        System.out.println("Para calcular las raices de una ecuacion ");
        System.out.println("de la forma Ax^2+Bx+C ");
    }
    
    double w;
    double q;
    double q1;
    double q2;

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

        do aux = JOptionPane.showInputDialog("Introduzca el valor de A");
        while (!isNum(aux));
        y.setx((Double.parseDouble(aux)));

        do aux = JOptionPane.showInputDialog("Ingrese el valor de B: ");
        while (!isNum(aux));
        y.sety((Double.parseDouble(aux)));
        
        do aux = JOptionPane.showInputDialog("Ingrese el valor de C: ");
        while (!isNum(aux));
        y.setz((Double.parseDouble(aux)));
        

    }

    public void calculos() {
    int x = (int) c1.getx();
    int y = (int) c1.gety();
    int z = (int) c1.getz();
     
    w = ((y*y)-4);
    q = Math.sqrt(q);
    q1 = (-y+x)/(2*x);
    q2 = (-y-x)/(2*x);
    }


    void resultados() { //No. 3 Imprimir
        
        if (w<0) {
            JOptionPane.showMessageDialog(null,"\n La ecuacion se indetermina por raiz negativa\n");
        }
        else  {
        JOptionPane.showMessageDialog(null,"\nLas raices de la ecuacion\n" + c1.printStates());
        JOptionPane.showMessageDialog(null,"\n Es igual a: " + q1 + " y " +q2+ "\n");
        
    }
    }

    public static void main(String[] args) throws IOException {
        FormulaGeneral a = new FormulaGeneral ();
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