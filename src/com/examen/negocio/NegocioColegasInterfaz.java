package com.examen.negocio;

import java.sql.SQLException;
import java.util.Collection;

import com.examen.entidades.Colega;

public interface NegocioColegasInterfaz {

	public void altaColega(Colega colega) throws SQLException;

	public void bajaColega(int id) throws SQLException;

	public Colega consultaPorId(int id) throws SQLException;

	public Collection<Colega> consultaTodos() throws SQLException;

	public void actualizar(Colega colega) throws SQLException;

}
