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
public class Paralelogramo {
    private double Lado;
    private double Base;
    private double Altura; 
    
    
        public Paralelogramo(double Lado, double Base, double Altura) {
        this.Lado = Lado;
        this.Base = Base;
        this.Altura = Altura;
    
     }
     
     
     public Paralelogramo(){
      this(0, 0, 0);
      
     }
     
     public double getLado() {
        return Lado;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Lado Valor de tipo double
     */
    public void setLado(double Lado) {
        this.Lado = Lado;
    }
    
    public double getBase() {
        return Base;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Base Valor de tipo double
     */
    public void setBase(double Base) {
        this.Base = Base;
    }
    
    
    public double getAltura() {
        return Altura;
    }

    /**
     * Método que modifica el valor de la Base
     * @param Altura Valor de tipo double
     */
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    /**
     * Método que retorna el area del Rectangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (this.Base * this.Altura);
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2 * (this.Lado + this.Base));
    }    
}
