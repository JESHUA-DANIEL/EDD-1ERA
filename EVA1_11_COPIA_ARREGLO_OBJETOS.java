package eva1_11_copia_arreglo_objetos;
public class EVA1_11_COPIA_ARREGLO_OBJETOS {
    public static void main(String[] args) {
        Persona[] arreglo = new Persona[2];
        arreglo[0] = new Persona("Juan Carlos", "Pérez Gómez");
        arreglo[1] = new Persona("María Fernanda", "Rodríguez López");
        Persona[] copia = new Persona[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = new Persona(arreglo[i].getNombres(), arreglo[i].getApellidos());
        }
        System.out.println("Arreglo original:");
        for (Persona p : arreglo) {
            System.out.println(p.getNombreCompleto());
        }
        System.out.println("\nCopia de respaldo:");
        for (Persona p : copia) {
            System.out.println(p.getNombreCompleto());
        }
        System.out.println(arreglo);
        System.out.println(copia);
    }
}
class Persona {
    private String nombres;
    private String apellidos;
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }
}