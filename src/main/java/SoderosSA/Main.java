package SoderosSA;

import SoderosSA.Entities.*;
import SoderosSA.Entities.Enums.*;

import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = Empresa.builder()
                .nombre("Wine Up")
                .razonSocial("AMPAGEO S.R.L.")
                .cuil(71553352)
                .build();
        Sucursal sucursal = Sucursal.builder()
                .nombre("AMPAGEO S.R.L. Distribuidora")
                .horarioApertura(LocalTime.of(9, 0))
                .horarioCierre(LocalTime.of(17, 0))
                .build();
        Domicilio domicilio = Domicilio.builder()
                .calle("Alsina")
                .numero(3786)
                .cp(5511)
                .build();
        Localidad localidad = Localidad.builder()
                .nombre("Maipu")
                .build();
        Provincia provincia = Provincia.builder()
                .nombre("Mendoza")
                .build();
        Pais pais = Pais.builder()
                .nombre("Argentina")
                .build();
        ArticuloInsumo articuloInsumo = ArticuloInsumo.builder()
                .denominacion("Vino Malbec")
                .precioCompra(1500.0)
                .stockActual(100)
                .build();
        ArticuloManufacturado articuloManufacturado = ArticuloManufacturado.builder()
                .descripcion("Pack de vinos seleccionados")
                .precioVenta(5000.0)
                .build();
        ArticuloManufacturadoDetalle articuloManufacturadoDetalle = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .build();
        Cliente cliente = Cliente.builder()
                .nombre("Jeremias")
                .apellido("Montiel")
                .telefono("261-4567890")
                .email("jeremias@email.com")
                .fechaNacimiento(LocalDate.of(2002,11,15))
                .build();
        Pedido pedido = Pedido.builder()
                .total(5000.0)
                .totalCosto(3300.0)
                .build();
        DetallePedido detallePedido = DetallePedido.builder()
                .cantidad(1)
                .build();
        Promocion promocion = Promocion.builder()
                .descripcionDescuento("20% de descuento en todos los packs")
                .precioPromocional(20.0)
                .build();

        //Se crean relaciones.
        empresa.agregarSucursal(sucursal);

    }
}