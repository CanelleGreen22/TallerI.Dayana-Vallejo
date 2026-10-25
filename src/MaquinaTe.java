public class MaquinaTe implements EquipoCocina {
    private boolean encendida = false;
    private int intensidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Maquina de te encendida, calentando agua.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Maquina de te apagada.");
    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Preparando te con intensidad " + intensidad + ".");
        }
    }

    // El te admite menos niveles que el cafe para no amargarse
    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < 3) {
            intensidad++;
            System.out.println("Intensidad del te: " + intensidad + ".");
        }
    }
}
