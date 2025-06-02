package SoderosSA.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    //Relacion 1 a 1.
    @Setter
    private Imagen imagen;
    @Setter
    private Usuario usuario;

    //Relacion 1 a muchos.
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();
}
