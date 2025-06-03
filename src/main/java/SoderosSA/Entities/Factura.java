package SoderosSA.Entities;

import SoderosSA.Entities.Enums.FormaPago;
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

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

    //Relacion 1 a 1.
    @Setter
    private Pedido pedido;

    @Override
    public String toString() {
        return "Factura{" +
                "\nfechaFacturacion=" + fechaFacturacion +
                "\n, mpPaymentId=" + mpPaymentId +
                "\n, mpMerchantOrderId=" + mpMerchantOrderId +
                "\n, mpPreferenceId='" + mpPreferenceId + '\'' +
                "\n, mpPaymentType='" + mpPaymentType + '\'' +
                "\n, formaPago=" + formaPago +
                "\n, totalVenta=" + totalVenta +
                '}';
    }
}
