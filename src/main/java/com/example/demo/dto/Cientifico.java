package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="cientificos")
public class Cientifico {
	
	@Id
	private String id;
	@Column(name = "nom_apels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<AsignadoA> asignadoA;

	public Cientifico() {
		super();
	}

	public Cientifico(String id, String nomApels, List<AsignadoA> asignadoA) {
		super();
		this.id = id;
		this.nomApels = nomApels;
		this.asignadoA = asignadoA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getasignadoA() {
		return asignadoA;
	}

	public void setasignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Pieza [id=" + id + ", nombre=" + nomApels + ", asignadoA=" + asignadoA + "]";
	}
	
	

}
