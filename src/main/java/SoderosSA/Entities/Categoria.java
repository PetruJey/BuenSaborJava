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

public class Categoria extends Base{
    private String denominacion;

    //Relacion 1 a muchos.
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
}
