package tp4;

import java.util.ArrayList;

/**
 * Es la clase encargada de generar el algoritmo de backtraking
 * 
 * @author JuanCruu21
 *
 */
public class Backtracking {

	ArrayList<Empleado> empleados;
	ArrayList<ArrayList<Empleado>> subgrupos;
	ArrayList<ArrayList<Empleado>> mejorDistribucion;
	int mejorDivicion;
	int fuerzaMaximaPosible;
	int contador = 0;

	/**
	 * crea y setea el objeto algorimo con los empleados que se pasan por parametros
	 * 
	 * @param grupo de empleados
	 */
	public Backtracking(Empresa grupo) {

		this.empleados = grupo.getEmpleados();
		ArrayList<Empleado> grupoA = new ArrayList<Empleado>();
		ArrayList<Empleado> grupoB = new ArrayList<Empleado>();

		this.mejorDistribucion = new ArrayList<ArrayList<Empleado>>();
		this.subgrupos = new ArrayList<ArrayList<Empleado>>();
		subgrupos.add(grupoA);
		subgrupos.add(grupoB);
		mejorDivicion = 99999;

	}

	/**
	 * retorna e imprime un array con dos subgrupos de empleados con fuerzas de
	 * trabajo totales similar
	 * 
	 * @return Arraylist de 2 Arraylist de empleados
	 */
	public ArrayList<ArrayList<Empleado>> CrearSolucion() {

		this.fuerzaMaximaPosible = fuerzadeTrabajoTotal(this.empleados);
		Solucion(this.empleados, this.subgrupos, 0);
		System.out.println("GrupoA : " + fuerzadeTrabajoTotal(this.mejorDistribucion.get(0)) + " "
				+ this.mejorDistribucion.get(0));
		System.out.println("GrupoB : " + fuerzadeTrabajoTotal(this.mejorDistribucion.get(1)) + " "
				+ this.mejorDistribucion.get(1));
		System.out.println("Iteraciones realizadas:" + this.contador);
		return this.mejorDistribucion;
	}

	private int diferencia(ArrayList<Empleado> grupo1, ArrayList<Empleado> grupo2) {
		return fuerzadeTrabajoTotal(grupo1) - fuerzadeTrabajoTotal(grupo2);
	}

	private void Solucion(ArrayList<Empleado> empleados, ArrayList<ArrayList<Empleado>> grupo, int indice) {
		this.contador++;
		if ((grupo.get(0).size() + grupo.get(1).size()) == empleados.size()) {

			if (fuerzadeTrabajoTotal(grupo.get(0)) + fuerzadeTrabajoTotal(grupo.get(1)) == this.fuerzaMaximaPosible) {

				if ((diferencia(grupo.get(0), grupo.get(1)) >= 0)
						&& (diferencia(grupo.get(0), grupo.get(1)) < this.mejorDivicion)) {
					this.mejorDivicion = diferencia(grupo.get(0), grupo.get(1));

					ArrayList<ArrayList<Empleado>> solucionRetorno = new ArrayList<ArrayList<Empleado>>();
					ArrayList<Empleado> copiaGrupoA = new ArrayList<Empleado>();
					ArrayList<Empleado> copiaGrupoB = new ArrayList<Empleado>();

					copiaGrupoA.addAll(grupo.get(0));
					copiaGrupoB.addAll(grupo.get(1));
					solucionRetorno.add(copiaGrupoA);
					solucionRetorno.add(copiaGrupoB);

					this.mejorDistribucion = solucionRetorno;

				}
			}
		}

		else {

			grupo.get(0).add(empleados.get(indice));
			Solucion(empleados, grupo, indice + 1);
			grupo.get(0).remove(grupo.get(0).size() - 1);

			grupo.get(1).add(empleados.get(indice));
			Solucion(empleados, grupo, indice + 1);
			grupo.get(1).remove(grupo.get(1).size() - 1);

		}

	}

	/**
	 * Suma y retorna la fuerza de trabajo total del grupo de empleados
	 * 
	 * @param Grupo
	 * @return fuerzaDeTrabajoTotal
	 */
	public int fuerzadeTrabajoTotal(ArrayList<Empleado> Grupo) {
		int fuerzaDeTrabajoTotal = 0;
		if (Grupo.size() != 0) {
			for (int i = 0; i < Grupo.size(); i++) {
				fuerzaDeTrabajoTotal += Grupo.get(i).getFuerzadeTrabajo();
			}
		}
		return fuerzaDeTrabajoTotal;
	}

}
