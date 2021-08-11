package Li;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estavacio());

        listaDoblementeEnlazada.insertar(1);
        listaDoblementeEnlazada.insertar(2);
        listaDoblementeEnlazada.insertar(3);
        listaDoblementeEnlazada.mostrar();

    }
}
