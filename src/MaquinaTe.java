public class MaquinaTe implements EquipoCocina {
    private static final int INTENSIDAD_MAXIMA = 3;

    private boolean encendida = false;
    private int intensidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Maquina de te encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Maquina de te apagada.");
    }

    @Override
    public void preparar() {
        if (!encendida) {
            System.out.println("La maquina de te esta apagada, no se puede preparar te.");
            return;
        }
        System.out.println("Calentando agua e infusionando hierbas con intensidad " + intensidad + ".");
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < INTENSIDAD_MAXIMA) {
            intensidad++;
            System.out.println("Intensidad del te: " + intensidad);
        }
    }

    // Metodo propio de la maquina de te: no forma parte de la interfaz
    public void agregarHierbasFrutales() {
        if (encendida) {
            System.out.println("Agregando hierbas frutales al te.");
        }
    }
}
