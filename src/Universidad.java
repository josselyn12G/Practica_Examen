import javax.swing.*;
import java.util.Scanner;

public class Universidad {
    // Declaración de atributos.

    private String nombre;
    private String codigo;
    private String direccion;
    private String telefono;

    // Instanciar el escaner.

    Scanner sc = new Scanner(System.in);

    // Creacion de constructores.

    public Universidad(){

    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public Universidad(String nombre, String codigo) {
        this(nombre);
        this.codigo = codigo;
    }

    public Universidad(String nombre, String codigo, String direccion) {
        this(nombre, codigo);
        this.direccion = direccion;
    }

    public Universidad(String nombre, String codigo, String direccion, String telefono) {
        this(nombre,codigo,direccion);
        this.telefono = telefono;
    }

    // Creación de getters y setters.

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    // Creación de metodo propio para leer los atributos de la Universidad.
    public void ingresoInfo(){

        // Usar el setter para el nombre es correcto
        setNombre(JOptionPane.showInputDialog(null, "Nombre de la Universidad: "));

        // Aquí deberías usar el setter para el código también, para mantener la consistencia
        setCodigo(JOptionPane.showInputDialog(null, "Código: "));

        // Usar el setter para la dirección es correcto
        setDireccion(JOptionPane.showInputDialog(null, "Dirección: "));

        // También usar el setter para el teléfono es una buena práctica
        setTelefono(JOptionPane.showInputDialog(null, "Teléfono: "));

        JOptionPane.showMessageDialog(null, "Gracias por la información!");
    }
    // Creación de metodo para mostrar información.
    public String mostrarInfo() {
        StringBuilder sb = new StringBuilder();

        // Usar formato para asegurarnos que cada campo ocupa un espacio fijo de 15 caracteres
        sb.append(String.format("%-15s", getNombre()));
        sb.append("| ").append(String.format("%-15s", getCodigo()));
        sb.append("| ").append(String.format("%-20s", getDireccion()));
        sb.append("| ").append(String.format("%-15s", getTelefono()));

        return sb.toString();
    }

}
