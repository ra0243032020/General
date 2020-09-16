/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.unab.LoguicaPromedio;

/**
 *
 * @author FAMILIA
 */
public class ClsOperacionesProm {

    private Double Laboratoio1;
    private Double Parcail1;
    private Double Laboratoio2;
    private Double Parcail2;
    private Double Laboratoio3;
    private Double Parcail3;

    public Double getLaboratoio1() {
        return Laboratoio1;
    }

    public void setLaboratoio1(Double Laboratoio1) {
        this.Laboratoio1 = Laboratoio1;
    }

    public Double getParcail1() {
        return Parcail1;
    }

    public void setParcail1(Double Parcail1) {
        this.Parcail1 = Parcail1;
    }

    public Double getLaboratoio2() {
        return Laboratoio2;
    }

    public void setLaboratoio2(Double Laboratoio2) {
        this.Laboratoio2 = Laboratoio2;
    }

    public Double getParcail2() {
        return Parcail2;
    }

    public void setParcail2(Double Parcail2) {
        this.Parcail2 = Parcail2;
    }

    public Double getLaboratoio3() {
        return Laboratoio3;
    }

    public void setLaboratoio3(Double Laboratoio3) {
        this.Laboratoio3 = Laboratoio3;
    }

    public Double getParcail3() {
        return Parcail3;
    }

    public void setParcail3(Double Parcail3) {
        this.Parcail3 = Parcail3;
    }

    public ClsOperacionesProm(Double Laboratoio1, Double Parcail1, Double Laboratoio2, Double Parcail2, Double Laboratoio3, Double Parcail3) {
        this.Laboratoio1 = Laboratoio1;
        this.Parcail1 = Parcail1;
        this.Laboratoio2 = Laboratoio2;
        this.Parcail2 = Parcail2;
        this.Laboratoio3 = Laboratoio3;
        this.Parcail3 = Parcail3;
        
       return Laboratoio1 * 0.4 + Parcail1 * 0.6 + Laboratoio2 * 0.4 + Parcail2 * 0.6 + Laboratoio3 * 0.4 + Parcail3*0.6/3;
    }

}
