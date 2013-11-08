package distribuidos.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import distribuidos.model.Registro;

public interface RegistroDAO {

	public List<Registro> listarXNombre(@Param("nombre") String nombre);
	public List<Registro> listarXPlaca(@Param("placa") String placa);
	
}
