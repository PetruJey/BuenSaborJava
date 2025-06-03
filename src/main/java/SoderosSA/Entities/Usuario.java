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

public class Usuario extends Base{
    private String auth0Id;
    private String username;

    @Override
    public String toString() {
        return "Usuario{" +
                "\nusername='" + username + '\'' +
                "\n, auth0Id='" + auth0Id + '\'' +
                '}';
    }
}
