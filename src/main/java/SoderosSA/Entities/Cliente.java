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
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    public void agregarDomicilio(Domicilio domicilio){
        domicilios.add(domicilio);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\nnombre='" + nombre + '\'' +
                "\n, apellido='" + apellido + '\'' +
                "\n, telefono='" + telefono + '\'' +
                "\n, email='" + email + '\'' +
                "\n, fechaNacimiento=" + fechaNacimiento +
                "\n, imagen=" + imagen +
                "\n, usuario=" + usuario +
                "\n, domicilios=" + domicilios +
                '}';
    }
}
