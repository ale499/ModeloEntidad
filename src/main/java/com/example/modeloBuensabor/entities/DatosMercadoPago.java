package com.example.modeloBuensabor.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DatosMercadoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_created;
    private Date date_approved;
    private Date date_last_updated;
    private String payment_type_id;
    private String payment_method_id;
    private String status;
    private String status_detail;
}
