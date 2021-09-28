package tp4;

import java.util.ArrayList;
import java.util.Collections;

public class Greedy {

	private ArrayList<Empleado>empleados;
	private ArrayList<Empleado>grupoA;
	private ArrayList<Empleado>grupoB;
	int contador=0;
	
	public Greedy(Empresa empleados) {
		this.empleados=empleados.getEmpleados();
		this.grupoA=new ArrayList<Empleado>();
		this.grupoB=new ArrayList<Empleado>();
		
	}
	
	private ArrayList<ArrayList<Empleado>> Solucion(){
	
		ArrayList<ArrayList<Empleado>>solucion= new ArrayList<ArrayList<Empleado>>();
		ArrayList<Empleado> empleadosOrdenados=Ordenar(this.empleados);
		 while (!empleadosOrdenados.isEmpty())  {	 
				this.contador++;
			 Empleado e = empleados.remove(0);
			 if(fuerzadeTrabajoTotal(grupoA)>fuerzadeTrabajoTotal(grupoB)) {
				 grupoB.add(e);
			 }else if(fuerzadeTrabajoTotal(grupoA)<fuerzadeTrabajoTotal(grupoB)){
				 grupoA.add(e);
			 }else {
				 grupoB.add(e);
			 }
		 }
		 solucion.add(grupoA);
		 solucion.add(grupoB);
		 System.out.println("Cantidad de interaciones: "+this.contador);
		 return solucion;
	 }
	public ArrayList<ArrayList<Empleado>>CrearSolucion(){
		ArrayList<ArrayList<Empleado>>solucion=Solucion();
		System.out.println("GrupoA : "+fuerzadeTrabajoTotal(solucion.get(0))+" "+ solucion.get(0));
		System.out.println("GrupoB : "+fuerzadeTrabajoTotal(solucion.get(1))+" "+ solucion.get(1));
		return solucion;
		
	}
	
	public ArrayList<Empleado> Ordenar(ArrayList<Empleado>e){
		Collections.sort(e);
		return e;
	}
	
	public int fuerzadeTrabajoTotal(ArrayList<Empleado>Grupo) {
		int fuerzaDeTrabajoTotal=0;
		if(Grupo.size()!=0) {
			for(int i =0;i<Grupo.size();i++) {
				fuerzaDeTrabajoTotal+=Grupo.get(i).getFuerzadeTrabajo();
			}
		}
		return fuerzaDeTrabajoTotal;
	}
	
	
	
	
	
	
	
	
}

