package praxis.cl.proyectohospitalpost.service;

import java.util.List;

public interface ICrudGeneral <T>{
    List<T> listar();
    T buscarPorId(int id);
    T crear(T t);
    T actualizar(T t);
    void remover(int id);
}
