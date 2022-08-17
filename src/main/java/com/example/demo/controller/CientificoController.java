package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.CientificoServiceImpl;
import com.example.demo.dto.Cientifico;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos() {
		return cientificoServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name="id") String id) {
		
		Cientifico Cientifico_xid= new Cientifico();
		
		Cientifico_xid=cientificoServiceImpl.cientificoXID(id);
		
		System.out.println("Cientifico XID: "+Cientifico_xid);
		
		return Cientifico_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="id")String id,@RequestBody Cientifico cientifico) {
		
		Cientifico cientifico_seleccionado= new Cientifico();
		Cientifico cientifico_actualizado= new Cientifico();
		
		cientifico_seleccionado= cientificoServiceImpl.cientificoXID(id);
		
		cientifico_seleccionado.setNomApels(cientifico.getNomApels());
		
		cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		System.out.println("El cientifico actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name="id")String id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
	
}
