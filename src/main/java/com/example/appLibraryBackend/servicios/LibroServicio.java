package com.example.appLibraryBackend.servicios;

import com.example.appLibraryBackend.modelos.Libro;
import com.example.appLibraryBackend.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    //Instanciar el repositorio del libro
    @Autowired //Permite inyectar objetos en esta clase (repositorio respectivo)
    private LibroRepositorio libroRepositorio;

    //Metodo constructor de este servicio
    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    //MEtodo guardar un libro
    public Libro guardarLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    // metodo para listar todos los libros
    public List<Libro> obtenerLibros(){
        return libroRepositorio.findAll();
    }
}
