package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.interfaz.ITiendaDAO;
import modelo.Camiseta;
import modelo.Tienda;
import utils.BD;
import utils.ListaEnlazada;
import utils.Nodo;

public class TiendaDAO implements ITiendaDAO
{

	@Override
	public ListaEnlazada obtenerLista()
	{
		ListaEnlazada lista=new ListaEnlazada();
		String sql="select * from tienda";
		try(PreparedStatement pstm=BD.obtenerConexion().prepareStatement(sql))
		{
			ResultSet rs=pstm.executeQuery();
			while(rs.next())
			{
				String id=rs.getString("id");
            	String galeria=rs.getString("galeria");
            	String piso=rs.getString("piso");
            	String stand=rs.getString("stand");
            	Tienda tienda=new Tienda(id, galeria, piso, stand);
            	lista.agregarNodo(new Nodo<Tienda>(tienda));
			}
		}
		catch(SQLException excepcion)
		{
			excepcion.printStackTrace();
		}
		return lista;
	}

}
