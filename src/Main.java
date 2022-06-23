public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(24, 332233, "Juan", 30000);
        System.out.printf("Nombre: " + cliente.nombre + " Edad: " + cliente.edad + " Tel: "
            + cliente.telefono + " Credito: $" + cliente.credito + "\n");
        Trabajador trabajador = new Trabajador(25, 112233, "Pedro", 2000);
        System.out.printf("Nombre: " + trabajador.nombre + " Edad: " + trabajador.edad + " Tel: "
                + trabajador.telefono + " Salario: $" + trabajador.salario);
    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;

    public Persona(){

    }
}

class Cliente extends Persona {
    int credito;
    public Cliente(int edad, int telefono, String nombre, int credito) {
        this.edad = edad;
        this.credito = credito;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

class Trabajador extends Persona {
    int salario;
    public Trabajador(int edad, int telefono, String nombre, int salario) {
        this.edad = edad;
        this.salario = salario;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
