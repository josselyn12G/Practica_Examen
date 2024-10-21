import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciar el escaner.
        Scanner sc = new Scanner(System.in);

        /* ¿Cómo asignamos atributos?
            1. Utilizando los getters y setters.
            2. Mandando los parámetros en el constructor cuando se instancia.
         */

        // Instanciar objetos de la clase Universidad para acceder a sus atributos y propiedades.
        Universidad university1 = new Universidad();
        Universidad university2 = new Universidad();
        Universidad university3 = new Universidad();

        // Instanciar objetos de la clase Materia.
        Materia mat1 = new Materia();
        Materia mat2 = new Materia();
        Materia mat3 = new Materia();

        // Instanciar objetos de la clase Estudiante.
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();

        // Instanciar objetos de la clase Notas.
        Notas notas_est1 = new Notas();
        Notas notas_est2 = new Notas();
        Notas notas_est3 = new Notas();


        // Ingreso de datos para cada estudiante.
        JOptionPane.showMessageDialog(null,"Estudiante #1");
        university1.ingresoInfo();
        System.out.println("Datos del estudiante 1:");
        // Datos del estudiante
        est1.ingresoInformacion();
        // Informacion de la materia.
        mat1.ingreso();
        // Ingreso de notas
        notas_est1.ingresoNotas();
        System.out.println("Universidad      | Código     | Dirección       | Teléfono    | Nombre      | Apellido     | Carrera      | Semestre    | Materia     | Créditos  | Nota 1   | Nota 2   | Nota 3         | Promedio       ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(university1.mostrarInfo()+ est1.imprimir() + mat1.mostrar() + notas_est1.mostrarNotas());

        // Ingreso de datos para estudiante 2.
        JOptionPane.showMessageDialog(null,"Estudiante #2");
        university2.ingresoInfo();
        System.out.println("Datos del estudiante 2:");
        // Datos del estudiante.
        est2.ingresoInformacion();
        // Información de la materia.
        mat2.ingreso();
        // Ingreso de notas.
        notas_est2.ingresoNotas();


        // Ingreso de datos para estudiante 3.
        JOptionPane.showMessageDialog(null,"Estudiante #3");
        university2.ingresoInfo();
        System.out.println("Datos del estudiante 3:");
        // Datos del estudiante.
        est3.ingresoInformacion();
        // Información de la materia.
        mat3.ingreso();
        // Ingreso de notas.
        notas_est3.ingresoNotas();




        // Encabezado de la tabla
        System.out.println("Universidad      | Código     | Dirección       | Teléfono    | Nombre      | Apellido     | Carrera      | Semestre    | Materia     | Créditos  | Nota 1   | Nota 2   | Nota 3         | Promedio       ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Impresión de la tabla completa.
        System.out.println(university1.mostrarInfo()+ est1.imprimir() + mat1.mostrar() + notas_est1.mostrarNotas());
        System.out.println(university2.mostrarInfo()+ est2.imprimir()+ mat2.mostrar() + notas_est2.mostrarNotas());
        System.out.println(university3.mostrarInfo()+ est3.imprimir() + mat3.mostrar() + notas_est3.mostrarNotas());














    }
}

// sc.nextLine() = PARA CARACTERES.


// Leer el nombre de la universidad.
//++++++++++++++++++++++++++++++++++++++ ALTERNATIVA1 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//String nombre_universidad = JOptionPane.showInputDialog(null,"Nombre de la universidad");
//++++++++++++++++++++++++++++++++++++++ ALTERNATIVA2 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        /*university.setNombre(JOptionPane.showInputDialog(null,"Nombre de la universidad"));
        university.setCodigo(JOptionPane.showInputDialog(null,"Codigo:"));
        university.infoUniversidad();*/