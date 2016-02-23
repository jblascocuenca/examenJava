package com.examen.persistencia;

import java.sql.SQLException;
import java.util.Collection;

import com.examen.entidades.Colega;

public interface ColegaDao {

	void insercion(Colega colega) throws SQLException;
	
	void borrado(int id) throws SQLException;
	
	Colega visualizarPorId(int id) throws SQLException;
	
	Collection<Colega> visualizar() throws SQLException;
	
	void modificar(Colega colega) throws SQLException;
	
	
}
