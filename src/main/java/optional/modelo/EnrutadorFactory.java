package optional.modelo;

import java.util.Optional;

public class EnrutadorFactory {

    public static Optional<Enrutador> enrutadorPorMensaje(Mensaje mensaje) {
        Enrutador enrutador = null;

        if (mensaje.prioridad() == null)
            return Optional.empty();

        if (mensaje.prioridad().equalsIgnoreCase("alta"))
            enrutador = new SmsEnrutador();

        if (mensaje.prioridad().equalsIgnoreCase("media"))
            enrutador = new JmsEnrutador();

        return Optional.ofNullable(enrutador);
    }
}
