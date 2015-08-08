package ar.com.snoop.model;


import org.hibernate.annotations.ForceDiscriminator;

import javax.persistence.*;

/**
 * Created by root on 17/07/15.
 */

@Inheritance
@DiscriminatorColumn(name="figura_type")
@Entity(name="figuras")
public abstract class Figura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Basic
    private int numLados;


    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="WORKSPACE_ID")
    private WorkSpace workSpace;

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
