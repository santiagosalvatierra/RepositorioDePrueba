
package com.mycompany.repositorioprueba.entidades;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Editorial {
    @Id
        @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    String id;
    String nombre;
    Boolean alta;

    public Editorial() {
        this.alta=true;
        this.id=null;
    }

    public Editorial( String nombre, Boolean alta) {
       
        this.nombre = nombre;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
       return  nombre ;
    }
    
}
