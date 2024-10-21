import javax.swing.*;
import java.util.Scanner;

public class Estudiante {
    // Declaración de atributos.
    private String nombre;
    private String apellido;
    private String carrera;
    private String semestre;
    private String banner;

    // Instanciar el escaner.
    Scanner sc = new Scanner(System.in);

    // Creación de constructores.
    public Estudiante(){

    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String apellido) {
        this(nombre);
        this.apellido = apellido;
    }

    public Estudiante(String nombre, String apellido, String carrera) {
        this(nombre,apellido);
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String apellido, String carrera, String semestre) {
        this(nombre, apellido, carrera);
        this.semestre = semestre;
    }

    public Estudiante(String nombre, String apellido, String carrera, String semestre, String banner) {
        this(nombre,apellido,carrera,semestre);
        this.banner = banner;
    }

    // Creación de getters y setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }


    // Creación de métodos propios

    public void ingresoInformacion(){
        // Ingreso de datos del usuario. Considerar que dentro de la clase no es necesario el get o el set

        System.out.print("Nombre: ");
        String nombre = sc.nextLine(); // Podemos crear una variable
        setNombre(nombre);             // Luego le asignamos con un setter.

        System.out.print("Apellido: ");
        apellido = sc.nextLine();  // Asignamos directamente con un set y dentro el scanner.

        System.out.print("Carrera: ");
        setCarrera(sc.nextLine());

        System.out.print("Semestre: ");
        setSemestre(sc.nextLine());

        System.out.print("Codigo Banner: ");
        setBanner(sc.nextLine());

        JOptionPane.showMessageDialog(null, "Gracias por la información!");

    }

    public String imprimir() {
        String usuario = String.format("|  %-5s |  %-5s |  %-5s |  %-5s |  %-5s |",
                getNombre(), getApellido(), getCarrera(), getSemestre(), getBanner());
        return usuario;
    }



}
