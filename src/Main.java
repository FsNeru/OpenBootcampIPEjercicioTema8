import Models.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Neru","FaintSmile",18,"333444555");

        Persona persona2 = new Persona();

        persona2.setNombre("Diovan");
        persona2.setApellido("FaintSmile");
        persona2.setEdad(20);
        persona2.setNumTelefono("444555666");

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(mostrarDatos(persona1));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(mostrarDatos(persona2));
        System.out.println("--------------------------------------------------------------------------------------------");



    }
    public static String mostrarDatos(Persona persona){
        return "Mi nombre es " + persona.getNombre() + " " + persona.getApellido() +". Tengo " + persona.getEdad() + " años de edad. Mi numero de telefono es: " + persona.getNumTelefono();
    }
}
