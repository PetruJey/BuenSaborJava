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

public class ArticuloManufacturadoDetalle extends Base {
    private Integer cantidad;

    //Relacion 1 a 1.
    @Setter
    private ArticuloInsumo articuloInsumo;

    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "\ncantidad=" + cantidad +
                "\n, articuloInsumo=" + articuloInsumo +
                '}';
    }
}
