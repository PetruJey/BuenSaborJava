package SoderosSA.Entities;

import java.util.HashSet;
import java.util.Set;

import lombok.*;
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

    //Relacion 1 a muchos.
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        articuloManufacturadoDetalles.add(articuloManufacturadoDetalle);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "\ndescripcion='" + descripcion + '\'' +
                "\n, tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                "\n, preparacion='" + preparacion + '\'' +
                "\n, articuloManufacturadoDetalles=" + articuloManufacturadoDetalles +
                '}';
    }
}
