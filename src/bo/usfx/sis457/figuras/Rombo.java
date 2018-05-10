/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author FX
 */
public class Rombo {

    private double Alto;
    private double Largo;
    private double Lados;
    
    
     public Rombo(double Alto, double Largo, double Lados) {
        this.Alto = Alto;
        this.Largo = Largo;
        this.Lados = Lados;
    
     }
     
     
     public Rombo(){
      this(0, 0, 0);
      
     }
     
     public double getAlto() {
        return Alto;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Alto Valor de tipo double
     */
    public void setAlto(double Alto) {
        this.Alto = Alto;
    }
    
    public double getLargo() {
        return Largo;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Largo Valor de tipo double
     */
    public void setLargo(double Largo) {
        this.Largo = Largo;
    }
    
    
    public double getLados() {
        return Lados;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Lados Valor de tipo double
     */
    public void setLados(double Lados) {
        this.Lados = Lados;
    }
    
    /**
     * Método que retorna el area del Rectangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (0.5 * this.Largo * this.Alto);
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (4 * this.Lados);
    }    
}
