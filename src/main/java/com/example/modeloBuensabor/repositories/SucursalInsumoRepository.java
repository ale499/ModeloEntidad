package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.SucursalInsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalInsumoRepository extends JpaRepository<SucursalInsumo, Long> {
}
