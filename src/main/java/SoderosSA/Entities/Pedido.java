package SoderosSA.Entities;

import SoderosSA.Entities.Enums.Estado;
import SoderosSA.Entities.Enums.FormaPago;
import SoderosSA.Entities.Enums.TipoEnvio;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;

    //Relacion 1 a muchos.
    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    //Relacion 1 a 1.
    @Setter
    private Sucursal sucursal;
    private Domicilio domicilio;
    @Setter
    private Factura factura;
    @Setter
    private Cliente cliente;
}
