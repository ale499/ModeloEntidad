package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.DatosMercadoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosMercadoPagoRepository extends JpaRepository<DatosMercadoPago, Long> {
}
