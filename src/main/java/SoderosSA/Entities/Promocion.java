package SoderosSA.Entities;

import SoderosSA.Entities.Enums.TipoPromocion;
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

public class Promocion extends Base{
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    //Relación 1 a muchos.
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    public void agregarImagenes(Imagen imagen){
        imagenes.add(imagen);
    }
    public void agregarSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "\ndenominacion='" + denominacion + '\'' +
                "\n, FechaDesde=" + FechaDesde +
                "\n, FechaHasta=" + FechaHasta +
                "\n, HoraDesde=" + HoraDesde +
                "\n, HoraHasta=" + HoraHasta +
                "\n, descripcionDescuento='" + descripcionDescuento + '\'' +
                "\n, precioPromocional=" + precioPromocional +
                "\n, tipoPromocion=" + tipoPromocion +
                "\n, sucursales=" + sucursales.stream()
                .map(Sucursal::getNombre)
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("No hay sucursales") +
                ", imagenes=" + imagenes +
                '}';
    }
}
