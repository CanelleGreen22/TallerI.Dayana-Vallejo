/**
 * Equipo nuevo agregado despues del refactor. Basta con implementar
 * EquipoCocina para que PreparadorBebidasV2 lo use sin modificarlo.
 */
public class Exprimidor implements EquipoCocina {
    private static final int PRESION_MAXIMA = 3;

    private boolean encendido = false;
    private int presion = 1;

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
        if (!encendido) {
            System.out.println("El exprimidor esta apagado, no se puede hacer jugo.");
            return;
        }
        System.out.println("Exprimiendo fruta con presion " + presion + ".");
    }

    @Override
    public void ajustarIntensidad() {
        if (encendido && presion < PRESION_MAXIMA) {
            presion++;
            System.out.println("Presion del exprimidor: " + presion);
        }
    }
}
