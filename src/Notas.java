
import java.util.Scanner;

public class Notas {

    // Declaración de atributos
    private float nota1;
    private float nota2;
    private float nota3;
    private float promedio;

    // Creación de constructores.

    public Notas(){

    }

    public Notas(float nota1) {
        this.nota1 = nota1;
    }

    public Notas(float nota1, float nota2) {
        this(nota1);
        this.nota2 = nota2;
    }

    public Notas(float nota1, float nota2, float nota3) {
        this(nota1,nota2);
        this.nota3 = nota3;
    }

    public Notas(float nota1, float nota2, float nota3, float promedio) {
        this(nota1,nota2,nota3);
        this.promedio = promedio;
    }

    // Creación de getters y setters.

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    // Creación de metodo para calcular el promedio
    public float calculoPromedio(float x1, float x2, float x3){
        float promedio = (x1 + x2 + x3) / 3;
        return promedio;
    }
    // Creación de metodo para ingresar las notas.
    public void ingresoNotas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1: ");
        setNota1(sc.nextFloat());
        System.out.println("Nota 2: ");
        setNota2(sc.nextFloat());
        System.out.println("Nota 3: ");
        setNota3(sc.nextFloat());
        setPromedio(calculoPromedio(nota1, nota2, nota3));
    }
    // Creación de metodo para mostrar notas.
    public String mostrarNotas(){
        String notas = " | " +getNota1() + " | " +getNota2() + " | " + getNota3() + " | " + getPromedio() + " | ";
        return notas;
    }

    /*public String mostrarNotas() {
    // Formato para asegurar que cada nota y el promedio ocupen un espacio fijo de 10 caracteres con 4 decimales
    String notas = String.format("| %-10.4f | %-10.4f | %-10.4f | %-10.4f |",
                                  getNota1(), getNota2(), getNota3(), getPromedio());
    return notas;
    }*/

}
