package tp4;

import java.util.ArrayList;
/**
 * Representa a la entidad empresa,que contendra los empleados de la misma
 * @author JuanCruu21
 *
 */
public class Empresa {

	private ArrayList<Empleado> empleados;
/**
 * Crea un objeto empresa 
 */
	public Empresa() {
		empleados = new ArrayList<Empleado>();
	}
/**
 * Retorna los empleados que trabajan en la empresa
 * @return empleados en formato arraylist
 */
	public ArrayList<Empleado> getEmpleados() {
		return (ArrayList<Empleado>) empleados.clone();
	}
/**
 * Agrega un empleado a la empresa,siempre y cuando ya no se encuentre en la misma
 * @param empleado es el empleado men no seas menso
 */
	public void addEmpleado(Empleado empleado) {
		if (!empleados.contains(empleado)) {
			empleados.add(empleado);
		}
	}
/**
 * Retorna la fuerza de trabajo total de toda la empresa,es decir la suma de la fuerza de trabajo de todos los empleados
 * @return fuerzaDeTrabajo
 */
	public int fuerzadeTrabajoTotal() {
		int fuerzaDeTrabajoTotal = 0;
		if (this.empleados.size() != 0) {
			for (int i = 0; i < empleados.size(); i++) {
				fuerzaDeTrabajoTotal += empleados.get(i).getFuerzadeTrabajo();
			}
		}
		return fuerzaDeTrabajoTotal;
	}

	public String toString() {
		String retorno = "";
		for (int i = 0; i < this.empleados.size(); i++) {
			retorno += "[ " + this.empleados.get(i).getNombre() + " : " + this.empleados.get(i).getFuerzadeTrabajo()
					+ "] ";
		}

		return retorno;
	}

}
