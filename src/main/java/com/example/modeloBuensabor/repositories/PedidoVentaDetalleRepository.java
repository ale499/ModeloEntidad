package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.PedidoVentaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoVentaDetalleRepository extends JpaRepository<PedidoVentaDetalle, Long> {
}
