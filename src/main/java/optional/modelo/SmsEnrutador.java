package optional.modelo;

public class SmsEnrutador implements Enrutador {
    @Override
    public void enrutar(Mensaje mensaje) {
        System.out.println("Enrutamiento a una puerta de enlace SMS. Mensaje: " + mensaje);
    }
}
