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

public class Localidad extends Base{
    private String nombre;

    //Relacion 1 a 1.
    @Setter
    private Provincia provincia;

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", provincia=" + (provincia != null ? provincia.getNombre() : "No asignada") + '\'' +
                '}';
    }
}
