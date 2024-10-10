/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1prograbysmh;

/**
 *
 * @author majag
 */

public class Practica1prograbysmh {
    public static void main(String[] args) {
        int cantidadEmpleados = 3;
        double[] salarios = {300000, 250000, 400000};
        double totalSEM = 0;
        double totalIVM = 0;
        for (int i = 0; i < cantidadEmpleados; i++) {
            double salario = salarios[i];
            double montoSEM = salario * 0.0925;
            double montoIVM = salario * 0.0508;
            totalSEM += montoSEM;
            totalIVM += montoIVM;
        }
        double totalPagar = totalSEM + totalIVM;
        System.out.printf("La empresa deberá abonar a la CCSS el monto de %.2f por concepto de SEM y IVM.%n", totalPagar);
    }
}
