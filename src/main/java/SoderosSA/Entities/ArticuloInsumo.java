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

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "\nprecioCompra=" + precioCompra +
                "\n, stockActual=" + stockActual +
                "\n, stockMaximo=" + stockMaximo +
                "\n, esParaElaborar=" + esParaElaborar +
                "\n, denominacion='" + denominacion + '\'' +
                "\n, precioVenta=" + precioVenta +
                "\n, categoria=" + getCategoria().getDenominacion() +
                '}';
    }

}
