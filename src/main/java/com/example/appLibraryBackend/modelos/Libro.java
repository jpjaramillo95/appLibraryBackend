package com.example.appLibraryBackend.modelos;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

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
@Table(name="tbllibro")
public class Libro {
    //Estas anotaciones afectan a la primer variable que este por debajo, las demás no las afecta
    @Id //Crea automaticamente la variable id como PRIMARY KEY (Colocar el que empieza por org)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementar automaticamente desde 1
    @Column(name = "idbook", nullable = false, length = 20, unique = true)//Darle nombre a la columna
    // - nullable no puede quedar el campo vacio
    // - length definir el tamaño del campo
    // - unique el valor no se puede repetir
    private Long id;
    private String name;
}
