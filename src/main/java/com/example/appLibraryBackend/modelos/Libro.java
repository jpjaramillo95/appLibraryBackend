package com.example.appLibraryBackend.modelos;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data //Genera automáticamente métodos como getters, setters,
// toString, equals, y hashCode para la clase.
@NoArgsConstructor //Genera un constructor sin parámetros para
// tu clase, muy útil cuando necesitas inicializar objetos sin valores predeterminados.
@AllArgsConstructor//Genera un constructor con un parámetro para cada atributo de tu clase.
// Este es útil para inicializar objetos con valores específicos al momento de crearlos.
@Setter
@Getter
@Entity//Es una anotación de JPA (Java Persistence API) que marca la clase como una entidad.
// Esto significa que la clase estará mapeada a una tabla en la base de datos.
//@Table(name="tbllibro")
public class Libro {
    //Estas anotaciones afectan a la primer variable que este por debajo, las demás no las afecta
    @Id //Crea automaticamente la variable id como PRIMARY KEY (Colocar el que empieza por org)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementar automaticamente desde 1
    //@Column(name = "idbook", nullable = false, length = 20, unique = true)//Darle nombre a la columna
    @Column(length = 20)
    // - nullable no puede quedar el campo vacio
    // - length definir el tamaño del campo
    // - unique el valor no se puede repetir
    private Long id;
    @Column(nullable = false, length = 30)
    private String name;

    //Relación o asociación de que un libro puede tener varios prestamos
    @OneToMany(mappedBy = "libro") //modeo entidad relación sql uno a muchos - mappedBy Entidad de libro toma la relación principal
    @JsonManagedReference
    private List<Prestamo> prestamos;
    //Constructores
    public Libro(){}

    public Libro(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
