package ar.com.snoop.model;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by root on 17/07/15.
 */
@Entity
@DiscriminatorValue("TRI")
public class Triangulo extends Figura {
    @Basic
    private int base;

    @Basic
    private int altura;

    @Basic
    private int hipotenusa;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
}
