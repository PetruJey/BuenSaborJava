package SoderosSA.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Provincia extends Base{
    private String nombre;

    //Relacion 1 a 1.
    @Setter
    private Pais pais;

    @Override
    public String toString() {
        return "Provincia{" +
                "\nnombre='" + nombre + '\n' +
                "\n, pais=" + (pais != null ? pais.getNombre() : "No asignado") + '\n' +
                '}';
    }
}
