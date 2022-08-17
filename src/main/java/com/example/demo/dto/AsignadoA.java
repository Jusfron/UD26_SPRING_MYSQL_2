package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name ="asignado_a")
public class AsignadoA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cientifico")
	Cientifico cientifico;
	
	@ManyToOne
	@JoinColumn(name = "proyecto")
	Proyecto proyecto;

	public AsignadoA() {
		super();
	}	

	public AsignadoA(int id, Cientifico cientifico, Proyecto proyecto) {
		super();
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
	
	
}
