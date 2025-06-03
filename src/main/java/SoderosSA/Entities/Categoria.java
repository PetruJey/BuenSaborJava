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

    public void agregarArticulos(Articulo articulo){
        articulos.add(articulo);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "\ndenominacion='" + denominacion + '\'' +
                "\n, articulos=" + articulos.stream()
                .map(Articulo::getDenominacion)
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("No hay articulos") + +
                '}';
    }
}
