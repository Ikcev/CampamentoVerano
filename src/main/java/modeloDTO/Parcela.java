package modeloDTO;

public class Parcela {
	private Integer id;
	private Zona zona;
	private Tipo tipo;
	private Integer grupo;
	private Boolean limpia;
	private Integer cantidadMax;
	private Integer cantidadMin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	public Boolean getLimpia() {
		return limpia;
	}
	public void setLimpia(Boolean limpia) {
		this.limpia = limpia;
	}
	public Integer getCantidadMax() {
		return cantidadMax;
	}
	public void setCantidadMax(Integer cantidadMax) {
		this.cantidadMax = cantidadMax;
	}
	public Integer getCantidadMin() {
		return cantidadMin;
	}
	public void setCantidadMin(Integer cantidadMin) {
		this.cantidadMin = cantidadMin;
	}
	
	public Parcela(Integer id, Zona zona, Tipo tipo, Integer grupo, Boolean limpia, Integer cantidadMax,
			Integer cantidadMin) {
		super();
		this.id = id;
		this.zona = zona;
		this.tipo = tipo;
		this.grupo = grupo;
		this.limpia = limpia;
		this.cantidadMax = cantidadMax;
		this.cantidadMin = cantidadMin;
	}
	public Parcela() {
		super();
	}
	
}
