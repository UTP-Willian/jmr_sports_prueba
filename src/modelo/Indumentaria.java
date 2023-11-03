package modelo;

public class Indumentaria 
{
	private String id;
	private String nombre;
	private double precio;
	private int stock;
	
	public Indumentaria(String id, String nombre, double precio, int stock)
	{
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public Indumentaria(String nombre, double precio, int stock)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public Indumentaria(String id, String nombre, int stock)
	{
		this.id=id;
		this.nombre=nombre;
		this.stock=stock;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public double getPrecio()
	{
		return precio;
	}
	public void setPrecio(double precio)
	{
		this.precio=precio;
	}
	public int getStock()
	{
		return stock;
	}
	public void setStock(int stock)
	{
		this.stock=stock;
	}
}
