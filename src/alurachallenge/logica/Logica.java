/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alurachallenge.logica;

import java.util.Scanner;
import alurachallenge.logica.monedas;
/**
 *
 * @author Alberto
 */
public class Logica {
    
   
    public double  total;
    public double cantidad;
    public int opcion;
    
    public double pesosA(){
    Scanner teclado = new Scanner(System.in);
     System.out.print("""
                     Ingrese la moneda a convertir
                     1.Libra esterlina.
                     2.Euro
                     3.Dolar
                     4.Yen Japones
                     5.Won Sul (Core del sur)
                     """);
    opcion = teclado.nextInt();
        switch(opcion){            
            case 1:
                System.out.println("Ingrese la cantidad a convertir a libras");
                cantidad = teclado.nextDouble();
                total = cantidad / monedas.LIBRA_ESTERLINA.getValue();
                System.out.print("La cantidad es %.3f pesos colombianos equivalanete a libra esterlina es %.3f ".formatted(cantidad,total));                
                break;
            case 2:
                System.out.println("Ingrese la cantidad a convertir a Euros");
                cantidad = teclado.nextDouble();
                total = cantidad / monedas.EURO.getValue();
                System.out.print("La cantidad es %.3f pesos colombianos equivalente a Euros es %.3f ".formatted(cantidad,total));    
                break;
            case 3:
                System.out.println("Ingrese la cantidad a convertir a dólares");
                cantidad = teclado.nextDouble();
                total = cantidad / monedas.DOLAR.getValue();
                System.out.print("La cantidad es %.3f pesos colombianos equivalente a d+olares es %.3f ".formatted(cantidad,total));
                break;
            case 4:
                System.out.println("Ingrese la cantidad a convertir a Yenes");
                cantidad = teclado.nextDouble();
                total = cantidad / monedas.YEN.getValue();
                System.out.print("La cantidad es %.3f pesos colombianos equivalente a yenes es %.3f ".formatted(cantidad,total));
                break;
            case 5:
                System.out.println("Ingrese la cantidad a convertir a Won Suls");
                cantidad = teclado.nextDouble();
                total = cantidad / monedas.WONSUN.getValue();
                System.out.print("La cantidad es %.3f pesos colombianos equivalentes a Won Suls es %.3f ".formatted(cantidad,total));
                break;
            default:
                cantidad = teclado.nextDouble();
                System.out.print("Opción no disponible");
                break;                
        }      
      return total;  
    }
    
    public double monedaAPeso(){
        Scanner teclado = new Scanner(System.in);
     System.out.print("""
                     Ingrese la moneda a convertir
                     1.Libra esterlina.
                     2.Euro
                     3.Dolar
                     4.Yen Japones
                     5.Won Sul (Core del sur)
                     """);
    opcion = teclado.nextInt();
        switch(opcion){            
            case 1:
                System.out.println("Ingrese la cantidad a convertir a libras");
                cantidad = teclado.nextDouble();
                total = cantidad * monedas.LIBRA_ESTERLINA.getValue();
                System.out.print("La cantidad es %.2f pesos colombianos ".formatted(total));                
                break;
            case 2:
                System.out.println("Ingrese la cantidad a convertir a Euros");
                cantidad = teclado.nextDouble();
                total = cantidad * monedas.EURO.getValue();
                System.out.print("La cantidad es %.2f pesos colombianos ".formatted(total));    
                break;
            case 3:
                System.out.println("Ingrese la cantidad a convertir a dólares");
                cantidad = teclado.nextDouble();
                total = cantidad * monedas.DOLAR.getValue();
                System.out.print("La cantidad es %.2f pesos colombianos ".formatted(total));
                break;
            case 4:
                System.out.println("Ingrese la cantidad a convertir a Yenes");
                cantidad = teclado.nextDouble();
                total = cantidad * monedas.YEN.getValue();
                System.out.print("La cantidad es %.2f pesos colombianos ".formatted(total));
                break;
            case 5:
                System.out.println("Ingrese la cantidad a convertir a Won Suls");
                cantidad = teclado.nextDouble();
                total = cantidad * monedas.WONSUN.getValue();
                System.out.print("La cantidad es %.2f pesos colombianos ".formatted(total));
                break;
            default:
                cantidad = teclado.nextDouble();
                System.out.print("Opción no disponible");
                break;                
        }      
      return total;
        
}
}
