package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.SucursalEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalEmpresaRepository extends JpaRepository<SucursalEmpresa, Long> {
}
