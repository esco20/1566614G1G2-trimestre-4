/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.pruebas;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import co.edu.sena.controller.dao.ItemCheckerDao;
import co.edu.sena.model.dao.dto.ItemChecker;
import co.edu.sena.controller.dao.exceptions.ItemCheckerDaoException;
import co.edu.sena.controller.factory.ItemCheckerDaoFactory;

public class ItemCheckerDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByListaChequeo("");
		// findByRae("", "", "");
		// findWhereListaChequeoEquals("");
		// findWhereIdItemEquals(0);
		// findWherePreguntaEquals("");
		// findWhereRaeCodigoEquals("");
		// findWhereCompetenciaCodigoEquals("");
		// findWhereProgramaCodigoVersionEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByListaChequeo'
	 * 
	 * @param listaChequeo
	 */
	public static void findByListaChequeo(String listaChequeo)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findByListaChequeo(listaChequeo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByRae'
	 * 
	 * @param raeCodigo
	 * @param competenciaCodigo
	 * @param programaCodigoVersion
	 */
	public static void findByRae(String raeCodigo, String competenciaCodigo, String programaCodigoVersion)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findByRae(raeCodigo, competenciaCodigo, programaCodigoVersion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereListaChequeoEquals'
	 * 
	 * @param listaChequeo
	 */
	public static void findWhereListaChequeoEquals(String listaChequeo)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findWhereListaChequeoEquals(listaChequeo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdItemEquals'
	 * 
	 * @param idItem
	 */
	public static void findWhereIdItemEquals(int idItem)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findWhereIdItemEquals(idItem);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePreguntaEquals'
	 * 
	 * @param pregunta
	 */
	public static void findWherePreguntaEquals(String pregunta)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findWherePreguntaEquals(pregunta);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRaeCodigoEquals'
	 * 
	 * @param raeCodigo
	 */
	public static void findWhereRaeCodigoEquals(String raeCodigo)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findWhereRaeCodigoEquals(raeCodigo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCompetenciaCodigoEquals'
	 * 
	 * @param competenciaCodigo
	 */
	public static void findWhereCompetenciaCodigoEquals(String competenciaCodigo)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findWhereCompetenciaCodigoEquals(competenciaCodigo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProgramaCodigoVersionEquals'
	 * 
	 * @param programaCodigoVersion
	 */
	public static void findWhereProgramaCodigoVersionEquals(String programaCodigoVersion)
	{
		try {
			ItemCheckerDao _dao = getItemCheckerDao();
			ItemChecker _result[] = _dao.findWhereProgramaCodigoVersionEquals(programaCodigoVersion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getItemCheckerDao'
	 * 
	 * @return ItemCheckerDao
	 */
	public static ItemCheckerDao getItemCheckerDao()
	{
		return ItemCheckerDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ItemChecker dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getListaChequeo() );
		buf.append( ", " );
		buf.append( dto.getIdItem() );
		buf.append( ", " );
		buf.append( dto.getPregunta() );
		buf.append( ", " );
		buf.append( dto.getRaeCodigo() );
		buf.append( ", " );
		buf.append( dto.getCompetenciaCodigo() );
		buf.append( ", " );
		buf.append( dto.getProgramaCodigoVersion() );
		System.out.println( buf.toString() );
	}

}