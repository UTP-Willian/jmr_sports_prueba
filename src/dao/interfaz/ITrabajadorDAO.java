package dao.interfaz;

import utils.ListaEnlazada;

public interface ITrabajadorDAO extends CRUD
{
	public ListaEnlazada obtenerLista();
}
