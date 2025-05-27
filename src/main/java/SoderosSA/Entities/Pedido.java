package SoderosSA.Entities;

import SoderosSA.Entities.Enums.Estado;
import SoderosSA.Entities.Enums.FormaPago;
import SoderosSA.Entities.Enums.TipoEnvio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    //Relacion 1 a 1.
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Factura factura;
    private Cliente cliente;
}
