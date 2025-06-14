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

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    //Relacion 1 a muchos.
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    //Relacion 1 a 1.
    @Setter
    private UnidadMedida unidadMedida;
    @Setter
    private Categoria categoria;

    public void agregarImagenes(Imagen imagen){
        imagenes.add(imagen);
    }

}
