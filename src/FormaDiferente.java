/* public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creación manual de 3 objetos Universidad y Estudiante
        Universidad universidad1 = new Universidad();
        Estudiante estudiante1 = new Estudiante();

        Universidad universidad2 = new Universidad();
        Estudiante estudiante2 = new Estudiante();

        Universidad universidad3 = new Universidad();
        Estudiante estudiante3 = new Estudiante();

        // Ingreso de datos para el primer estudiante y universidad
        System.out.println("Ingresando datos del estudiante 1:");
        ingresarDatosUniversidad(sc, universidad1);
        ingresarDatosEstudiante(sc, estudiante1);

        // Ingreso de datos para el segundo estudiante y universidad
        System.out.println("Ingresando datos del estudiante 2:");
        ingresarDatosUniversidad(sc, universidad2);
        ingresarDatosEstudiante(sc, estudiante2);

        // Ingreso de datos para el tercer estudiante y universidad
        System.out.println("Ingresando datos del estudiante 3:");
        ingresarDatosUniversidad(sc, universidad3);
        ingresarDatosEstudiante(sc, estudiante3);

        // Imprimir los resultados en una tabla
        System.out.println("\nTabla de estudiantes:");
        System.out.println("| Universidad | Código | Dirección | Teléfono | Nombre | Apellido | Carrera | Semestre | Código Banner |");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(universidad1.mostrarInfo() + " " + estudiante1.imprimir());
        System.out.println(universidad2.mostrarInfo() + " " + estudiante2.imprimir());
        System.out.println(universidad3.mostrarInfo() + " " + estudiante3.imprimir());
    }

    // Método para ingresar datos de la universidad
    public static void ingresarDatosUniversidad(Scanner sc, Universidad universidad) {
        System.out.print("Nombre de la Universidad: ");
        universidad.setNombre(sc.nextLine());

        System.out.print("Código de la Universidad: ");
        universidad.setCodigo(sc.nextLine());

        System.out.print("Dirección de la Universidad: ");
        universidad.setDireccion(sc.nextLine());

        System.out.print("Teléfono de la Universidad: ");
        universidad.setTelefono(sc.nextLine());
    }

    // Método para ingresar datos del estudiante
    public static void ingresarDatosEstudiante(Scanner sc, Estudiante estudiante) {
        System.out.print("Nombre del estudiante: ");
        estudiante.setNombre(sc.nextLine());

        System.out.print("Apellido del estudiante: ");
        estudiante.setApellido(sc.nextLine());

        System.out.print("Carrera del estudiante: ");
        estudiante.setCarrera(sc.nextLine());

        System.out.print("Semestre del estudiante: ");
        estudiante.setSemestre(sc.nextLine());

        System.out.print("Código Banner del estudiante: ");
        estudiante.setBanner(sc.nextLine());
    }
}*/