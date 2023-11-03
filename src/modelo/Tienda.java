package modelo;

public class Tienda
{
	private String id;
	private String galeria;
	private String piso;
	private String stand;
	//
	public Tienda(String id, String galeria, String piso, String stand)
	{
		this.id = id;
		this.galeria = galeria;
		this.piso = piso;
		this.stand = stand;
	}
	public Tienda(String galeria, String piso, String stand)
	{
		this.galeria = galeria;
		this.piso = piso;
		this.stand = stand;
	}
	//
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getGaleria()
	{
		return galeria;
	}
	public void setGaleria(String galeria)
	{
		this.galeria = galeria;
	}
	public String getPiso()
	{
		return piso;
	}
	public void setPiso(String piso)
	{
		this.piso = piso;
	}
	public String getStand()
	{
		return stand;
	}
	public void setStand(String stand)
	{
		this.stand = stand;
	}
}
