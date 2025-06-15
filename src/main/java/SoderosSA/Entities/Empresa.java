package SoderosSA.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private Integer cuil;

    //Relacion 1 a muchos.
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    //Metodo para agregar sucursales.
    public void agregarSucursal(Sucursal sucursal){
        sucursal.setEmpresa(this);
        sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "\nnombre='" + nombre +
                "\n, razonSocial='" + razonSocial +
                "\n, cuil=" + cuil +
                "\n, sucursales=" + sucursales.stream()
                .map(Sucursal::getNombre)
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("No hay sucursales") +
                '}';
    }

}
