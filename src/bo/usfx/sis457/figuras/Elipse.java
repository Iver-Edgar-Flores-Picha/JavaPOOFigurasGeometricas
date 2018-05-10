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
public class Elipse {
    private double Alt;
    private double Larg;
    
    
        public Elipse(double Alt, double Larg) {
        this.Alt = Alt;
        this.Larg = Larg;
    
     }
     
     
     public Elipse(){
      this(0, 0);
      
     }
     
     public double getAlt() {
        return Alt;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Alt Valor de tipo double
     */
    public void setAlt(double Alt) {
        this.Alt = Alt;
    }
    
    public double getLargo() {
        return Larg;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Larg Valor de tipo double
     */
    public void setLarg(double Larg) {
        this.Larg = Larg;
    }
    
    
    /**
     * Método que retorna el area del Rectangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (Math.PI * this.Larg * this.Alt);
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2 * Math.PI * Math.sqrt(((this.Alt * this.Alt)+(this.Larg * this.Larg))/2));
    }    
}
