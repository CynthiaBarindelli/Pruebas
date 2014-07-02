package bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")

public class Persona  {
	@Id
	@Column(name="ci")
	private int ci;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	
	public int getCi(){
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;	
	}

	public void setNombre(String nombre) {
		this.nombre= nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido= apellido;
	}
	
	public Persona(){};
}
