package tp4;

public class MainBacktracking {

	public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", "Perez", 32, 48);
        Empleado e2 = new Empleado("Roberto", "Hernandez", 45, 57);
        Empleado e3 = new Empleado("Camila", "Gutierrez", 33, 51);
        Empleado e4 = new Empleado("Francisco", "Martinez", 22, 73);
        Empleado e5 = new Empleado("Benjamin", "Nunez", 55, 15);
        Empleado e6 = new Empleado("Mateo", "Morales", 24, 33);
        Empleado e7 = new Empleado("Delfina", "Lopez", 36, 92);
        Empleado e8 = new Empleado("Catalina", "Cruz", 51, 71);
        Empleado e9 = new Empleado("Benicio", "Montero", 48, 19);
        Empleado e10 = new Empleado("Valentino", "Gonzalez", 58, 22);
        Empleado e11 = new Empleado("Olivia", "Gomez", 33, 41);
        Empleado e12 = new Empleado("Martina", "Diaz", 21, 49);
        Empleado e13 = new Empleado("Joaquin", "Cabrera", 22, 14);
        Empleado e14 = new Empleado("Bautista", "Dominguez", 36, 33);
        Empleado e15 = new Empleado("Emilia", "Paz", 40, 16);
        Empleado e16 = new Empleado("Francesca", "Figueroa", 43, 21);
        Empleado e17 = new Empleado("Santino", "Blanco", 25, 79);
        Empleado e18 = new Empleado("Ignacio", "Ibarra", 61, 32);
        Empleado e19 = new Empleado("Andrea", "Chavez", 27, 78);
        Empleado e20 = new Empleado("Elena", "Mengochea", 52, 67);

        Empresa entrada1 = new Empresa();
        entrada1.addEmpleado(e1);
        entrada1.addEmpleado(e2);
        entrada1.addEmpleado(e3);
        entrada1.addEmpleado(e4);
        entrada1.addEmpleado(e5);
        entrada1.addEmpleado(e6);

        Empresa entrada2 = new Empresa();
        entrada2.addEmpleado(e7);
        entrada2.addEmpleado(e4);
        entrada2.addEmpleado(e8);
        entrada2.addEmpleado(e15);

        Empresa entrada3 = new Empresa();
        entrada3.addEmpleado(e19);
        entrada3.addEmpleado(e12);
        entrada3.addEmpleado(e11);
        entrada3.addEmpleado(e13);

        Empresa entrada4 = new Empresa();
        entrada4.addEmpleado(e19);
        entrada4.addEmpleado(e18);
        entrada4.addEmpleado(e14);
        entrada4.addEmpleado(e16);

        Empresa entrada5 = new Empresa();
        entrada5.addEmpleado(e7);
        entrada5.addEmpleado(e8);
        entrada5.addEmpleado(e20);
        entrada5.addEmpleado(e3);
        entrada5.addEmpleado(e16);

        Empresa entrada6 = new Empresa();
        entrada6.addEmpleado(e6);
        entrada6.addEmpleado(e15);
        entrada6.addEmpleado(e17);
        entrada6.addEmpleado(e13);
        entrada6.addEmpleado(e16);
        entrada6.addEmpleado(e10);

        Empresa entrada7 = new Empresa();
        entrada7.addEmpleado(e17);
        entrada7.addEmpleado(e2);
        entrada7.addEmpleado(e19);
        entrada7.addEmpleado(e20);
        entrada7.addEmpleado(e4);
        entrada7.addEmpleado(e12);
        entrada7.addEmpleado(e15);

        Empresa entrada8 = new Empresa();
        entrada8.addEmpleado(e12);
        entrada8.addEmpleado(e14);
        entrada8.addEmpleado(e18);
        entrada8.addEmpleado(e6);
        entrada8.addEmpleado(e2);
        entrada8.addEmpleado(e9);
        entrada8.addEmpleado(e10);
        entrada8.addEmpleado(e16);

        Empresa entrada9 = new Empresa();
        entrada9.addEmpleado(e1);
        entrada9.addEmpleado(e2);
        entrada9.addEmpleado(e3);
        entrada9.addEmpleado(e4);
        entrada9.addEmpleado(e5);
        entrada9.addEmpleado(e6);
        entrada9.addEmpleado(e7);
        entrada9.addEmpleado(e8);
        entrada9.addEmpleado(e9);
        entrada9.addEmpleado(e10);
        entrada9.addEmpleado(e11);
        entrada9.addEmpleado(e12);
        entrada9.addEmpleado(e13);
        entrada9.addEmpleado(e14);
        entrada9.addEmpleado(e15);
        entrada9.addEmpleado(e16);
        entrada9.addEmpleado(e17);
        entrada9.addEmpleado(e18);
        entrada9.addEmpleado(e19);
        entrada9.addEmpleado(e20);

        Backtracking Backtracking  = new Backtracking(entrada1);
        System.out.println("-Entrada 1------- ");
        System.out.println("Grupo de trabajo : "+entrada1.fuerzadeTrabajoTotal()+" " + entrada1);
        System.out.println("Resultado:");
        Backtracking.CrearSolucion();
        System.out.println("");
        

        Backtracking  = new Backtracking(entrada2);
        System.out.println("-Entrada 2------- ");
        System.out.println("Grupo de trabajo : "+entrada2.fuerzadeTrabajoTotal()+" " + entrada2);
        System.out.println("Resultado:");
        Backtracking.CrearSolucion();
        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada3);
//        System.out.println("-Entrada 3------- ");
//        System.out.println("Grupo de trabajo : "+entrada3.fuerzadeTrabajoTotal()+" " + entrada3);
//        System.out.println("Resultado:");
//        Backtracking.CrearSolucion();
//        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada4);
//        System.out.println("-Entrada 4------- ");
//        System.out.println("Grupo de trabajo : "+entrada2.fuerzadeTrabajoTotal()+" " + entrada4);
//        System.out.println("Resultado:");
//        Backtracking.CrearSolucion();
//        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada5);
//        System.out.println("-Entrada 5------- ");
//        System.out.println("Grupo de trabajo : "+entrada5.fuerzadeTrabajoTotal()+" " + entrada5);
//        System.out.println("Resultado:");
//        Backtracking.CrearSolucion();
//        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada6);
//        System.out.println("-Entrada 6------- ");
//        System.out.println("Grupo de trabajo : "+entrada6.fuerzadeTrabajoTotal()+" " + entrada6);
//        System.out.println("Resultado:");
//        Backtracking.CrearSolucion();
//        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada7);
//        System.out.println("-Entrada 7------- ");
//        System.out.println("Grupo de trabajo : "+entrada7.fuerzadeTrabajoTotal()+" " + entrada7);
//        System.out.println("Resultado: ");
//        Backtracking.CrearSolucion();
//        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada8);
//        System.out.println("-Entrada 8------- ");
//        System.out.println("Grupo de trabajo : "+entrada8.fuerzadeTrabajoTotal()+" " + entrada8);
//        System.out.println("Resultado:");
//        Backtracking.CrearSolucion();
//        System.out.println("");
//
//        Backtracking  = new Backtracking(entrada9);
//        System.out.println("-Entrada 9------- ");
//        System.out.println("Grupo de trabajo : "+entrada9.fuerzadeTrabajoTotal()+" " + entrada9);
//        System.out.println("Resultado:");
//        Backtracking.CrearSolucion();
//        System.out.println("");
    }
}

