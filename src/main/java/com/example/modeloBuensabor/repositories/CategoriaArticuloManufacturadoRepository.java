package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.CategoriaArticuloManufacturado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaArticuloManufacturadoRepository extends JpaRepository<CategoriaArticuloManufacturado, Long> {
}
