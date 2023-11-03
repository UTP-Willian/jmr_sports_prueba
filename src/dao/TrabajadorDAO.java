package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.interfaz.ITrabajadorDAO;
import modelo.Trabajador;
import modelo.Usuario;
import utils.BD;
import utils.ListaEnlazada;
import utils.Nodo;

public class TrabajadorDAO implements ITrabajadorDAO
{
	@Override
	public void agregar(Object objeto)
	{
		
	}
	@Override
	public ListaEnlazada buscar(String campo, String valor)
	{
		
		return null;
	}
	@Override
	public void eliminar(Object objeto)
	{
		
	}
	@Override
	public ListaEnlazada obtenerLista()
	{
		ListaEnlazada lista=new ListaEnlazada();
        String sql="select * from trabajador";
        try(PreparedStatement pstm=BD.obtenerConexion().prepareStatement(sql))
        {
            ResultSet rs=pstm.executeQuery();
            while(rs.next())
            {
            	String dni=rs.getString("id");
            	String nombre=rs.getString("nombre");
            	String apellido_paterno=rs.getString("apellido_paterno");
            	String apellido_materno=rs.getString("apellido_materno");
            	String user=rs.getString("usuario");
            	String contrasenna=rs.getString("contrasenna");
            	Usuario usuario=new Usuario(user, contrasenna);
            	int tienda=rs.getInt("tienda");
            	Trabajador trabajador=new Trabajador(dni, nombre, apellido_paterno, apellido_materno, usuario, tienda);
            	lista.agregarNodo(new Nodo<Trabajador>(trabajador));
            }
        }
        catch(SQLException excepcion)
        {
        	excepcion.getMessage();
        }
        return lista;
	}
	@Override
	public void modificar(Object objeto)
	{
		
	}
}
