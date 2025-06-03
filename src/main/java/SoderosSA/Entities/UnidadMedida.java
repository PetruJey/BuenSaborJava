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

public class UnidadMedida {
    private String denominacion;

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "\ndenominacion='" + denominacion + '\'' +
                '}';
    }
}
