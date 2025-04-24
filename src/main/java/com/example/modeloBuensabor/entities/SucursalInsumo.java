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
public class SucursalInsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double stockActual;
    private Double stockMinimo;
    private Double stockMaximo;
}
