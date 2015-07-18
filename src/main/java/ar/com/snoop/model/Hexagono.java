package ar.com.snoop.model;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by root on 17/07/15.
 */
@Entity
@DiscriminatorValue("HEX")
public class Hexagono extends Figura {

    @Basic
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }




}
