package modelo;

public class Cliente
{
	private String identificacion; //DNI o RUC
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String telefono;
	private String direccion;
	//
	public Cliente(String identificacion, String nombre, String apellido_paterno, String apellido_materno, String telefono, String direccion)
	{
		this.identificacion=identificacion;
		this.nombre=nombre;
		this.apellido_paterno=apellido_paterno;
		this.apellido_materno=apellido_materno;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	public Cliente(String identificacion, String nombre, String telefono, String direccion)
	{
		this.identificacion=identificacion;
		this.nombre=nombre;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	//
	public String getIdentificacion()
	{
		return identificacion;
	}
	public void setIdentificacion(String identificacion)
	{
		this.identificacion = identificacion;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido_paterno()
	{
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno)
	{
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno()
	{
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno)
	{
		this.apellido_materno = apellido_materno;
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
}
