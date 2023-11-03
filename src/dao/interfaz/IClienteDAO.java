package dao.interfaz;

import utils.ListaEnlazada;

public interface IClienteDAO extends CRUD
{
	public ListaEnlazada obtenerLista();
}
