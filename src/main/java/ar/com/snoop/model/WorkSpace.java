package ar.com.snoop.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * Created by root on 17/07/15.
 */

@Entity
@Table(name="WORKSPACE")
public class WorkSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String nombre;

    @Basic
    private int limiteFiguras;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "workSpace", cascade = CascadeType.ALL)
    private List<Figura> figuras ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLimiteFiguras() {
        return limiteFiguras;
    }

    public void setLimiteFiguras(int limiteFiguras) {
        this.limiteFiguras = limiteFiguras;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras =  figuras;
    }
}
