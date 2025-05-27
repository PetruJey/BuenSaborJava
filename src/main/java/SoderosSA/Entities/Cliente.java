package SoderosSA.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;

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
}
