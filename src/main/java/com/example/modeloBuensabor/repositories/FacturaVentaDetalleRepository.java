package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.FacturaVentaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaVentaDetalleRepository extends JpaRepository<FacturaVentaDetalle, Long> {
}
