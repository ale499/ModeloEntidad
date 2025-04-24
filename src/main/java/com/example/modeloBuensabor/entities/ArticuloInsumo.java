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

public class ArticuloInsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private boolean esParaElaborar;
}
