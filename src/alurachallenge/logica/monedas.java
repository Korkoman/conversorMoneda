/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package alurachallenge.logica;

/**
 *
 * @author Alberto
 */
public enum monedas {
    LIBRA_ESTERLINA(4862.09),
    EURO(4180.36),
    DOLAR(3907.57),
    YEN(25.24),
    WONSUN(2.85),
    PESO_COLOMBIANO(1.00);
    
    private double valor;
    @Override
    public String toString() {
        return "monedas{" + "valor=" + valor + '}';
    }
    private monedas(double valor) {
        this.valor = valor;
    }
    
    public double getValue(){
    return valor;
}
    
    
}
