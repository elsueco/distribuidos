package distribuidos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import distribuidos.dao.RegistroDAO;
import distribuidos.model.Registro;


@Controller
@Scope("request")
public class RegistroController {

	private String nombre;
	private String placa1;
	
	private List<Registro> listaPlaca1;
	private List<Registro> listaConsulta1;
	
	@Autowired
	RegistroDAO registroDAO;
	
	@PostConstruct
	public void init(){
		listaConsulta1 = new ArrayList<Registro>();
		listaPlaca1 = new ArrayList<Registro>();
	}
	
	public void consulta1(){
		listaConsulta1 = registroDAO.listarXNombre("%"+nombre+"%");
	} 
	
	public void consulta2(){
		listaPlaca1 = registroDAO.listarXPlaca("%" + placa1 + "%");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Registro> getListaConsulta1() {
		return listaConsulta1;
	}

	public void setListaConsulta1(List<Registro> listaConsulta1) {
		this.listaConsulta1 = listaConsulta1;
	}

	public String getPlaca1() {
		return placa1;
	}

	public void setPlaca1(String placa1) {
		this.placa1 = placa1;
	}

	public List<Registro> getListaPlaca1() {
		return listaPlaca1;
	}

	public void setListaPlaca1(List<Registro> listaPlaca1) {
		this.listaPlaca1 = listaPlaca1;
	}
	
}
