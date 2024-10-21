import javax.swing.*;

public class Materia {
    // Declaración de atributos
    private String nombre;
    private int creditos;
    // Creación de constructores.
    public Materia(){

    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre, int creditos) {
        this(nombre);
        this.creditos = creditos;
    }

    // Creación de getters y setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    // Creación de metodo para ingresar la información de la materia.
    public void ingreso(){
        setNombre(JOptionPane.showInputDialog(null,"Nombre de la materia"));
        // Pasar el argumento como entero.
        setCreditos(Integer.parseInt(JOptionPane.showInputDialog(null, "Creditos de la carrera")));
    }

    // Creación de metodo para mostrar la información.
    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("  " +getNombre());
        sb.append(" | " +getCreditos());
        return sb.toString();
    }
}
