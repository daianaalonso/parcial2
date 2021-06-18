package nullobject;

import nullobject.modelo.Enrutador;
import nullobject.modelo.EnrutadorFactory;
import nullobject.modelo.Mensaje;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mensaje> mensajes = Arrays.asList(
                new Mensaje("Aviso", "alta"),
                new Mensaje("Advertencia", "media"),
                new Mensaje("Notificacion", null),
                new Mensaje("Notificacion", "baja"));

        for (Mensaje mensaje : mensajes) {
            Enrutador enrutador = EnrutadorFactory.enrutadorPorMensaje(mensaje);
            enrutador.enrutar(mensaje);
        }
    }
}
