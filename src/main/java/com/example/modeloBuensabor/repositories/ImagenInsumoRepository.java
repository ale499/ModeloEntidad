package com.example.modeloBuensabor.repositories;
import com.example.modeloBuensabor.entities.ImagenInsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenInsumoRepository extends JpaRepository<ImagenInsumo, Long> {
}
