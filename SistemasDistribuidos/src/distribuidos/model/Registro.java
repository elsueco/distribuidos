package distribuidos.model;

import org.apache.ibatis.type.Alias;

@Alias("registroModel")
public class Registro {
	
	private String placa;
	private String nombre_modalidad_servicio;
	private String nombre_clase_vehiculo;
	private String ano_fabricacion;
	private String nombre_modelo;
	private String nombre_marca;
	private String numero_serie;
	private String numero_serie_motor;
	private String nombre_tipo_combustible;
	private String peso_seco;
	private String peso_bruto;
	private String longitud;
	private String altura;
	private String ancho;
	private String carga_util;
	private int capacidad_pasajero;
	private int numero_asiento;
	private int numero_rueda;
	private int numero_eje;
	private int numero_puerta;
	private String fecha_inscripcion_vehiculo;
	private String nombre_tipo_documento;
	private String documento;
	private String propietario;
	

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNombre_modalidad_servicio() {
		return nombre_modalidad_servicio;
	}
	public void setNombre_modalidad_servicio(String nombre_modalidad_servicio) {
		this.nombre_modalidad_servicio = nombre_modalidad_servicio;
	}
	public String getNombre_clase_vehiculo() {
		return nombre_clase_vehiculo;
	}
	public void setNombre_clase_vehiculo(String nombre_clase_vehiculo) {
		this.nombre_clase_vehiculo = nombre_clase_vehiculo;
	}
	public String getAno_fabricacion() {
		return ano_fabricacion;
	}
	public void setAno_fabricacion(String ano_fabricacion) {
		this.ano_fabricacion = ano_fabricacion;
	}
	public String getNombre_modelo() {
		return nombre_modelo;
	}
	public void setNombre_modelo(String nombre_modelo) {
		this.nombre_modelo = nombre_modelo;
	}
	public String getNombre_marca() {
		return nombre_marca;
	}
	public void setNombre_marca(String nombre_marca) {
		this.nombre_marca = nombre_marca;
	}
	public String getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}
	public String getNumero_serie_motor() {
		return numero_serie_motor;
	}
	public void setNumero_serie_motor(String numero_serie_motor) {
		this.numero_serie_motor = numero_serie_motor;
	}
	public String getNombre_tipo_combustible() {
		return nombre_tipo_combustible;
	}
	public void setNombre_tipo_combustible(String nombre_tipo_combustible) {
		this.nombre_tipo_combustible = nombre_tipo_combustible;
	}
	public String getPeso_seco() {
		return peso_seco;
	}
	public void setPeso_seco(String peso_seco) {
		this.peso_seco = peso_seco;
	}
	public String getPeso_bruto() {
		return peso_bruto;
	}
	public void setPeso_bruto(String peso_bruto) {
		this.peso_bruto = peso_bruto;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getAncho() {
		return ancho;
	}
	public void setAncho(String ancho) {
		this.ancho = ancho;
	}
	public String getCarga_util() {
		return carga_util;
	}
	public void setCarga_util(String carga_util) {
		this.carga_util = carga_util;
	}
	public int getCapacidad_pasajero() {
		return capacidad_pasajero;
	}
	public void setCapacidad_pasajero(int capacidad_pasajero) {
		this.capacidad_pasajero = capacidad_pasajero;
	}
	public int getNumero_asiento() {
		return numero_asiento;
	}
	public void setNumero_asiento(int numero_asiento) {
		this.numero_asiento = numero_asiento;
	}
	public int getNumero_rueda() {
		return numero_rueda;
	}
	public void setNumero_rueda(int numero_rueda) {
		this.numero_rueda = numero_rueda;
	}
	public int getNumero_eje() {
		return numero_eje;
	}
	public void setNumero_eje(int numero_eje) {
		this.numero_eje = numero_eje;
	}
	public int getNumero_puerta() {
		return numero_puerta;
	}
	public void setNumero_puerta(int numero_puerta) {
		this.numero_puerta = numero_puerta;
	}
	public String getFecha_inscripcion_vehiculo() {
		return fecha_inscripcion_vehiculo;
	}
	public void setFecha_inscripcion_vehiculo(String fecha_inscripcion_vehiculo) {
		this.fecha_inscripcion_vehiculo = fecha_inscripcion_vehiculo;
	}
	public String getNombre_tipo_documento() {
		return nombre_tipo_documento;
	}
	public void setNombre_tipo_documento(String nombre_tipo_documento) {
		this.nombre_tipo_documento = nombre_tipo_documento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	
}
