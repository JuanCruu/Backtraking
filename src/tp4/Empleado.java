package tp4;
/**
 *empleado representa a las personas que trabajan en la empresa 
 * @author JuanCruu21
 * @version 69.420
 */
public class Empleado implements Comparable<Empleado> {

	private Integer edad;
	private String nombre;
	private String apellido;
	private Integer FuerzadeTrabajo;
/**
 * constructor de empleado
 * @param nombre 
 * @param apellido
 * @param edad
 * @param FuerzadeTrabajo la fuerza de trabajo representa el valor del individuo para la empresa 
 */
	public Empleado(String nombre, String apellido, Integer edad, Integer FuerzadeTrabajo) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.FuerzadeTrabajo = FuerzadeTrabajo;
	}
/**
 * retorna la edad del empleado
 * @return  edad
 */
	public Integer getEdad() {
		return edad;
	}
/**
 * actualiza la edad del empleado
 * @param edad 
 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
/**
 * retorna el nombre del empleado
 * @return nombre 
 */
	public String getNombre() {
		return nombre;
	}
/**
 * actualiza el nombre del empleado
 * @param nombre 
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 *  retorna el nombre del apellido
 * @return apellido
 */
	public String getApellido() {
		return apellido;
	}
/**
 * contendra un apellido Actualizado para el empleado
 * @param apellido 
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
/**
 * retorna la fuerza de trabajo del empleado
 * @return FuerzadeTrabajo
 */
	public Integer getFuerzadeTrabajo() {
		return FuerzadeTrabajo;
	}
	/**
	 * actualiza la fuerza del trabajo del empleado
	 * @param fuerzadeTrabajo
	 */
	public void setFuerzadeTrabajo(Integer fuerzadeTrabajo) {
		FuerzadeTrabajo = fuerzadeTrabajo;
	}
	
	@Override
	public int compareTo(Empleado e) {
		return e.getFuerzadeTrabajo() - this.getFuerzadeTrabajo();
	}

	@Override
	public String toString() {

		String retorno = this.getNombre() + ":" + this.getFuerzadeTrabajo();
		return retorno;
	}

}
