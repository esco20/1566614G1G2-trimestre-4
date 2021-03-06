/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controller.dao;

import co.edu.sena.model.dao.dto.*;
import co.edu.sena.controller.dao.exceptions.*;

public interface ClienteDao
{
	/** 
	 * Inserts a new row in the cliente table.
	 */
	public ClientePk insert(Cliente dto) throws ClienteDaoException;

	/** 
	 * Updates a single row in the cliente table.
	 */
	public void update(ClientePk pk, Cliente dto) throws ClienteDaoException;

	/** 
	 * Deletes a single row in the cliente table.
	 */
	public void delete(ClientePk pk) throws ClienteDaoException;

	/** 
	 * Returns the rows from the cliente table that matches the specified primary-key value.
	 */
	public Cliente findByPrimaryKey(ClientePk pk) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'tipo_documento = :tipoDocumento AND numero_documento = :numeroDocumento'.
	 */
	public Cliente findByPrimaryKey(String tipoDocumento, String numeroDocumento) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria ''.
	 */
	public Cliente[] findAll() throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'tipo_documento = :tipoDocumento'.
	 */
	public Cliente[] findByTipoDocumento(String tipoDocumento) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'tipo_documento = :tipoDocumento'.
	 */
	public Cliente[] findWhereTipoDocumentoEquals(String tipoDocumento) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'numero_documento = :numeroDocumento'.
	 */
	public Cliente[] findWhereNumeroDocumentoEquals(String numeroDocumento) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'primer_nombre = :primerNombre'.
	 */
	public Cliente[] findWherePrimerNombreEquals(String primerNombre) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'segundo_nombre = :segundoNombre'.
	 */
	public Cliente[] findWhereSegundoNombreEquals(String segundoNombre) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'primer_apellido = :primerApellido'.
	 */
	public Cliente[] findWherePrimerApellidoEquals(String primerApellido) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'segundo_apellido = :segundoApellido'.
	 */
	public Cliente[] findWhereSegundoApellidoEquals(String segundoApellido) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the criteria 'foto = :foto'.
	 */
	public Cliente[] findWhereFotoEquals(byte[] foto) throws ClienteDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cliente table that match the specified arbitrary SQL statement
	 */
	public Cliente[] findByDynamicSelect(String sql, Object[] sqlParams) throws ClienteDaoException;

	/** 
	 * Returns all rows from the cliente table that match the specified arbitrary SQL statement
	 */
	public Cliente[] findByDynamicWhere(String sql, Object[] sqlParams) throws ClienteDaoException;

}
