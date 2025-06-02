package SoderosSA.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

//Getters, Setters y Constructores.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    //Relacion 1 a 1.
    private Empresa empresa;
    private Domicilio domicilio;

    //Relación 1 a muchos.
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    //Metodo para asignar un Domicilio.
    public void asignarDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Sucursal\n{" +
                "nombre='" + nombre + '\n' +
                ", horarioApertura=" + horarioApertura +
                "\n, horarioCierre=" + horarioCierre +
                "\n, empresa=" + (empresa != null ? empresa.getNombre() : "No asignada") + '\n' +
                ", domicilio=" + domicilio +
                '}';
    }
}
