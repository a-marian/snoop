package ar.com.snoop.model;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by root on 17/07/15.
 */
@Entity
@DiscriminatorValue("CUA")
public class Cuadrado extends Figura {

    @Basic
    private String lado;

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }
}
