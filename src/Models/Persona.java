package Models;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String numTelefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numTelefono = numTelefono;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
}
