package SoderosSA.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    //Relacion 1 a muchos.
    private Set<Imagen> imagenes = new HashSet<>();

    //Relacion 1 a 1.
    private UnidadMedida unidadMedida;
    private Categoria categoria;
}
