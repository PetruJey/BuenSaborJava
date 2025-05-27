package SoderosSA.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    //Relacion 1 a 1.
    private Empresa empresa;
    private Domicilio domicilio;

    //Relación 1 a muchos.
    private Set<Promocion> promociones = new HashSet<>();
}
