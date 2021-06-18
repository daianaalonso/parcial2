package nullobject.modelo;

public class Mensaje {
    private final String cuerpo;
    private final String prioridad;

    public Mensaje(String cuerpo, String prioridad) {
        this.cuerpo = cuerpo;
        this.prioridad = prioridad;
    }

    public String prioridad() {
        return this.prioridad;
    }

    @Override
    public String toString() {
        return "cuerpo='" + cuerpo + '\'' +
                ", prioridad='" + prioridad + '\'';
    }
}
