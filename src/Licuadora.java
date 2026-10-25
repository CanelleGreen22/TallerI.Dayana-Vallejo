public class Licuadora implements EquipoCocina {
    private static final int VELOCIDAD_MAXIMA = 5;

    private boolean encendida = false;
    private int velocidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Licuadora encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Licuadora apagada.");
    }

    @Override
    public void preparar() {
        if (!encendida) {
            System.out.println("La licuadora esta apagada, no se puede licuar.");
            return;
        }
        System.out.println("Licuando ingredientes a velocidad " + velocidad + ".");
    }

    // En la licuadora la "intensidad" es la velocidad del motor
    @Override
    public void ajustarIntensidad() {
        if (encendida && velocidad < VELOCIDAD_MAXIMA) {
            velocidad++;
            System.out.println("Velocidad de la licuadora: " + velocidad);
        }
    }
}
