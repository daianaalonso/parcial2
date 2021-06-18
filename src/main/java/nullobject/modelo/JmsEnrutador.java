package nullobject.modelo;

public class JmsEnrutador implements Enrutador {
    @Override
    public void enrutar(Mensaje mensaje) {
        System.out.println("Enrutamiento a una cola JMS. Mensaje: " + mensaje);
    }
}
