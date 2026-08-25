public class Main {

    // declaracion de la estructura (clase Nodo con sus punteros)
    static class Nodo {
        int valor;
        Nodo superior, medio, inferior;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {

        Nodo n20 = new Nodo(20);
        Nodo n23 = new Nodo(23);
        Nodo n19 = new Nodo(19);
        Nodo n57 = new Nodo(57);
        Nodo n67 = new Nodo(67);
        Nodo n99 = new Nodo(99);

        //punto de inicio
        Nodo head = n20;

        // se hacen las conexiones
        head.superior = n23;
        head.medio = n19;
        head.inferior = null;

        // conexion del 23
        n23.superior = null;
        n23.medio = n57;
        n23.inferior = null;

        // conexion del 19
        n19.superior = null;
        n19.medio = null;
        n19.inferior = n67;

        // conexion del 67
        n67.medio = n99;
        // n57 y n99 no tienen hijos en el diagrama

        // impresion
        System.out.println("--- Impresion de Nodos desde Head ---");
        System.out.println("Nodo con valor 99: " + head.medio.inferior.medio.valor);
        System.out.println("Nodo con valor 57: " + head.superior.medio.valor);
    }
}