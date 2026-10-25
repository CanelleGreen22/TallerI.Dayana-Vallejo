public class Cafetera implements EquipoCocina {
    private boolean encendida = false;
    private int intensidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Cafetera encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Cafetera apagada.");
    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Preparando cafe con intensidad " + intensidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < 5) {
            intensidad++;
            System.out.println("Intensidad del cafe: " + intensidad);
        }
    }
}
