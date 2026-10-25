/**
 * Contrato que todo equipo de cocina debe cumplir para poder
 * ser usado por el preparador de bebidas.
 */
public interface EquipoCocina {
    void encender();

    void apagar();

    void preparar();

    void ajustarIntensidad();
}
