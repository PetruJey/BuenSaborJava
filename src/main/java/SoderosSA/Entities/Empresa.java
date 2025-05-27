package SoderosSA.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private Integer cuil;

    private Set<Sucursal> sucursales = new HashSet<>();
}
