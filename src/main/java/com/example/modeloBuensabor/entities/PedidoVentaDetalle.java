package com.example.modeloBuensabor.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PedidoVentaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double cantidad;
    private double subtotal;
}
