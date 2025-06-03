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

public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subTotal;

    //Relacion 1 a 1.
    @Setter
    private Articulo articulo;
    @Setter
    private Pedido pedido;

    @Override
    public String toString() {
        return "DetallePedido{" +
                "\ncantidad=" + cantidad +
                "\n, subTotal=" + subTotal +
                "\n, articulo=" + articulo.getDenominacion() +
                '}';
    }
}
