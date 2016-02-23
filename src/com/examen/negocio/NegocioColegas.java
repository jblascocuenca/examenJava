package com.examen.negocio;

import java.sql.SQLException;
import java.util.Collection;

import com.examen.entidades.Colega;
import com.examen.persistencia.ColegaDao;

public class NegocioColegas implements NegocioColegasInterfaz {

	private ColegaDao colegaDao;
	
	public NegocioColegas(ColegaDao colegaDao) {
		super();
		this.colegaDao = colegaDao;
	}

	public void setColegaDao(ColegaDao colegaDao) {
		this.colegaDao = colegaDao;
	}
	
	

	@Override
	public void altaColega(Colega colega) throws SQLException {
		colegaDao.insercion(colega);
	}

	@Override
	public void bajaColega(int id) throws SQLException {
		colegaDao.borrado(id);
		
	}

	@Override
	public Colega consultaPorId(int id) throws SQLException {
		
		Colega colega = colegaDao.visualizarPorId( id);
		return colega;
	}

	@Override
	public Collection<Colega> consultaTodos() throws SQLException {
		
		Collection<Colega> colegas = colegaDao.visualizar();
		return colegas;
	}

	@Override
	public void actualizar(Colega colega) throws SQLException {
	
		colegaDao.modificar(colega);
		
	}




	
	
	
}
