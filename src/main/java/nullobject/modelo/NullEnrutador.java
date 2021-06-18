package nullobject.modelo;

public class NullEnrutador implements Enrutador {
    @Override
    public void enrutar(Mensaje mensaje) {
        System.out.println("No se puede enrutar un objeto nulo.");
    }
}
