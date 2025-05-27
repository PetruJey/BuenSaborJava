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

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    //Relacion 1 a 1.
    private ArticuloManufacturadoDetalle articuloManufacturadoDetalle;
}
