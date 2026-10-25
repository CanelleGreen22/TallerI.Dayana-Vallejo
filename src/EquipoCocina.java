/**
 * Contrato comun para cualquier equipo de cocina de la cafeteria.
 * El preparador de bebidas depende solo de esta interfaz, no de clases concretas.
 */
public interface EquipoCocina {
    void encender();

    void apagar();

    void preparar();

    void ajustarIntensidad();
}
