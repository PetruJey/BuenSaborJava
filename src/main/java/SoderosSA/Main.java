package SoderosSA;

import SoderosSA.Entities.*;
import SoderosSA.Entities.Enums.*;
import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Se inicializan los objetos.
        //Imagen Vino
        Imagen imagenV = Imagen.builder().denominacion("imagenVino.jpg").build();
        //Imagen Promocion
        Imagen imagenP = Imagen.builder().denominacion("imagenPromocion.png").build();
        //Imagen Usuario
        Imagen imagenU = Imagen.builder().denominacion("imagenUsuario.png").build();
        //Categoria Vinos
        Categoria C_vinos = Categoria.builder().denominacion("Vinos").build();
        //Unidad de medida.
        UnidadMedida unidadMedida = UnidadMedida.builder().denominacion("ml").build();
        //Provincia
        Provincia provincia = Provincia.builder()
                .nombre("Mendoza")
                .build();
        //Pais
        Pais pais = Pais.builder().nombre("Argentina").build();
        //Localidades
        Localidad localidad1 = Localidad.builder()
                .nombre("Maipu")
                .build();
        Localidad localidad2 = Localidad.builder()
                .nombre("Godoy Cruz")
                .build();
        //Empresa
        Empresa empresa1 = Empresa.builder()
                .nombre("Wine Up")
                .razonSocial("AMPAGEO S.R.L.")
                .cuil(71553352)
                .build();
        //Sucursal
        Sucursal sucursal = Sucursal.builder()
                .nombre("AMPAGEO S.R.L. Distribuidora")
                .horarioApertura(LocalTime.of(9, 0))
                .horarioCierre(LocalTime.of(17, 0))
                .build();
        //Domicilio Sucursal
        Domicilio domicilioS = Domicilio.builder()
                .calle("Alsina")
                .numero(3786)
                .cp(5511)
                .build();
        //Domicilio Cliente
        Domicilio domicilioC = Domicilio.builder()
                .calle("Pergamino")
                .numero(979)
                .cp(5503)
                .build();
        //Articulo
        ArticuloInsumo articuloInsumo = ArticuloInsumo.builder()
                .denominacion("Vino Malbec")
                .precioCompra(1200.0)
                .precioVenta(1500.0)
                .stockActual(100)
                .esParaElaborar(false)
                .build();
        //Articulo Manufacturado
        ArticuloManufacturado articuloManufacturado = ArticuloManufacturado.builder()
                .descripcion("Pack de vinos seleccionados")
                .precioVenta(5000.0)
                .build();
        //Articulo Manufacturado Detalle
        ArticuloManufacturadoDetalle articuloManufacturadoDetalle = ArticuloManufacturadoDetalle.builder()
                .cantidad(6)
                .build();
        //Usuario
        Usuario usuario1 = Usuario.builder()
                .auth0Id("ksdim2osm1")
                .username("Jere15")
                .build();
        // Cliente
        Cliente cliente = Cliente.builder()
                .nombre("Jeremias")
                .apellido("Montiel")
                .telefono("261-4567890")
                .email("jeremias@email.com")
                .fechaNacimiento(LocalDate.of(2002,11,15))
                .build();
        //Pedido
        Pedido pedido = Pedido.builder()
                .total(5000.0)
                .totalCosto(3300.0)
                .estado(Estado.PENDIENTE)
                .tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.MERCADOPAGO)
                .FechaPedido(LocalDate.of(2025, 5, 28))
                .build();
        //Factura
        Factura factura = Factura.builder()
                .fechaFacturacion(LocalDate.of(2025, 6, 2))
                .mpPaymentId(114)
                .mpMerchantOrderId(634)
                .mpPreferenceId("Jere15")
                .mpPaymentType("Transferencia Bancaria")
                .formaPago(FormaPago.MERCADOPAGO)
                .totalVenta(5000.0)
                .build();
        //Detalle Pedido
        DetallePedido detallePedido = DetallePedido.builder()
                .cantidad(1)
                .subTotal(3300.0)
                .build();
        //Promocion
        Promocion promocion = Promocion.builder()
                .denominacion("Wine Weeks")
                .descripcionDescuento("20% de descuento en todos los packs")
                .precioPromocional(20.0)
                .FechaDesde(LocalDate.of(2025, 3, 15))
                .FechaHasta(LocalDate.of(2025, 5, 29))
                .HoraDesde(LocalTime.of(15, 30))
                .HoraHasta(LocalTime.of(20, 30))
                .tipoPromocion(TipoPromocion.HAPPYHOUR)
                .build();


        //Se crean relaciones de la empresa.
        empresa1.agregarSucursal(sucursal);
        sucursal.setDomicilio(domicilioS);
        sucursal.agregarPromociones(promocion);

        //Se crean relaciones de localidades.
        provincia.setPais(pais);
        domicilioS.setLocalidad(localidad1);
        domicilioC.setLocalidad(localidad2);
        localidad1.setProvincia(provincia);
        localidad2.setProvincia(provincia);


        //Se crean relaciones de un pedido.
        pedido.setSucursal(sucursal);
        pedido.agregarDetallePedidos(detallePedido);
        detallePedido.setArticulo(articuloInsumo);
        detallePedido.setPedido(pedido);
        pedido.setFactura(factura);
        pedido.setCliente(cliente);

        //Se crean relaciones del articulo.
        articuloManufacturado.agregarArticuloManufacturadoDetalle(articuloManufacturadoDetalle);
        articuloManufacturadoDetalle.setArticuloInsumo(articuloInsumo);
        articuloInsumo.agregarImagenes(imagenV);
        articuloInsumo.setUnidadMedida(unidadMedida);
        articuloInsumo.setCategoria(C_vinos);
        promocion.agregarImagenes(imagenP);
        promocion.agregarSucursal(sucursal);
        C_vinos.agregarArticulos(articuloInsumo);

        //Se crean relaciones del cliente
        cliente.setImagen(imagenU);
        cliente.setUsuario(usuario1);
        cliente.agregarDomicilio(domicilioC);


        System.out.println(promocion);
        System.out.println("---------");
        System.out.println(cliente);
        System.out.println("---------");
        System.out.println(pedido);
        System.out.println("---------");
        System.out.println(empresa1);
        System.out.println("---------");
        System.out.println(factura);
        System.out.println("---------");
        System.out.println(articuloInsumo);
    }
}