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

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;

    private Sucursal sucursal;
    private Localidad localidad;
}
