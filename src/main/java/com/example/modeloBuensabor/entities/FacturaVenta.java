package com.example.modeloBuensabor.entities;
import com.example.modeloBuensabor.entities.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class FacturaVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaFacturacion;
    private String numeroComprobante;

    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    private BigDecimal subTotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;
}
