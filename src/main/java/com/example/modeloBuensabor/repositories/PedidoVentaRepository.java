package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.PedidoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoVentaRepository extends JpaRepository<PedidoVenta, Long> {
}
