

package com.sis324.gestionColas.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sis324.gestionColas.service.PacienteService;
import com.sis324.gestionColas.model.Paciente;

@RestController
@RequestMapping("/Pacientes")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public ArrayList<Paciente> showUsers(){
		return pacienteService.getPacientes();
	}
	
	@PostMapping
	public Paciente insert(@RequestBody Paciente paciente){
		return pacienteService.save(paciente);
	}
	
	@PutMapping
    
	public Paciente edit(@RequestBody Paciente paciente){
		return pacienteService.save(paciente);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return pacienteService.delete(id);
	}    
}