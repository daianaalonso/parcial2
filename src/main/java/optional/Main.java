package optional;

import optional.modelo.Enrutador;
import optional.modelo.EnrutadorFactory;
import optional.modelo.Mensaje;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Mensaje> mensajes = Arrays.asList(
                new Mensaje("Aviso", "alta"),
                new Mensaje("Advertencia", "media"),
                new Mensaje("Notificacion", "baja"),
                new Mensaje("Notificacion", null));

        for (Mensaje mensaje : mensajes) {
            Optional<Enrutador> optionalEnrutador = EnrutadorFactory.enrutadorPorMensaje(mensaje);
            optionalEnrutador.ifPresent((enrutador) -> {
                enrutador.enrutar(mensaje);
            });
        }

    }

}
