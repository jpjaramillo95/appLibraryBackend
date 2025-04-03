package com.example.appLibraryBackend.repositorios;

import com.example.appLibraryBackend.modelos.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {//Long porque se pone el tipo de dato que es la PRIMARY KEY

}
