package nullobject.modelo;

public class EnrutadorFactory {

    public static Enrutador enrutadorPorMensaje(Mensaje mensaje) {

        if (mensaje.prioridad() == null)
            return new NullEnrutador();

        switch (mensaje.prioridad()) {
            case "alta":
                return new SmsEnrutador();
            case "media":
                return new JmsEnrutador();
            default:
                return new NullEnrutador();
        }
    }
}
