package Li;

public class ListaDoblementeEnlazada {
    Nodo inicio;
    public ListaDoblementeEnlazada(){
        inicio=null;

    }
    public boolean estavacio(){
        return inicio==null;

    }
    public void insertar(Object dato){
        if (estavacio()){
            Nodo nuevo = new Nodo(null, dato, null);
            inicio = nuevo;

        }else{
            Nodo nuevo = new Nodo(null, dato, inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }

    }
    public void eliminar(){
        if (estavacio()){
            if (inicio.getSiguiente()==null);
            inicio=inicio.getSiguiente();
            inicio.setAnterior(null);
        }

    }
    public void mostrar(){
        if (!estavacio()) {
            Nodo r = inicio;
            while (r!=inicio){
                System.out.println(r.getDato()+"");
                r = r.getSiguiente();
            }
            System.out.println();

        }
    }
    public void mostrarback(){
        if (!estavacio()){
            Nodo t = inicio;
            while (t.getSiguiente()!=null){
                t = t.getSiguiente();
            }
            Nodo y = t;
            while ( y != null);{
                System.out.println(y.getDato()+"");
                y = y.getAnterior();
            }
            System.out.println();
        }
    }


}

