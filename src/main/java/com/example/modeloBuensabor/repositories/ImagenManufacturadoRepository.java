package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.ImagenManufacturado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenManufacturadoRepository extends JpaRepository<ImagenManufacturado, Long> {
}
