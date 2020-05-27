/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad5;

/**
 *
 * @author Izrux
 */
public class Lagrange {

    double res = 0;
    double valorcalcular = 8;
    double x[] = {0, 1.8, 5, 6};
    double y[] = {26, 16.415, 5.375, 3.75};
    double a[] = new double[x.length];

    public void Polinomio() {
        for (int i = 0; i < x.length; i++) {
            double mult = 1;
            double div = 1;
            for (int j = 0; j < x.length; j++) {
                if (j == i) 
                    continue;
                mult = (valorcalcular - x[j]) * mult;
                div = (x[i] - x[j]) * div;
            }
            a[i] = mult / div;
        }
    }

    public void Calculos() {

        for (int i = 0; i < x.length; i++) {
            res = (a[i] * y[i]) + res;
        }
    }

    public void print() {
        System.out.print(res);
    }

    public static void main(String[] args) {
        Lagrange l = new Lagrange();
        l.Polinomio();
        l.Calculos();
        l.print();
    }

}
