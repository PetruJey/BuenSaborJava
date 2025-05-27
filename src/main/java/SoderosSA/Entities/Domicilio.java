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

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;

    //Relacion 1 a 1.
    private Sucursal sucursal;
    private Localidad localidad;

    //Relacion 1 a muchos.
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Cliente> clientes = new HashSet<>();
}
