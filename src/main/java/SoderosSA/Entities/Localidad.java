package SoderosSA.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Localidad extends Base{
    private String nombre;

    //Relacion 1 a 1.
    private Provincia provincia;

    //Metodo para asignar una provincia.
    public void asignarProvincia(Provincia provincia){
        this.provincia = provincia;
    }
}
