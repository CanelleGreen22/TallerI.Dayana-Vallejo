public class Exprimidor implements EquipoCocina {
    private boolean encendido = false;
    private int velocidad = 1;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Exprimidor encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Exprimidor apagado.");
    }

    @Override
    public void preparar() {
        if (encendido) {
            System.out.println("Exprimiendo frutas a velocidad " + velocidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendido && velocidad < 3) {
            velocidad++;
            System.out.println("Velocidad del exprimidor: " + velocidad + ".");
        }
    }
}
