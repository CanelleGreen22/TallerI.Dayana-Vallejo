import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Version refactorizada. Recibe cualquier cantidad de equipos a traves de la
 * interfaz EquipoCocina, asi que un equipo nuevo no obliga a cambiar esta clase
 * (principio abierto/cerrado e inversion de dependencias).
 */
public class PreparadorBebidasV2 {
    private final List<EquipoCocina> equipos;

    public PreparadorBebidasV2(List<EquipoCocina> equipos) {
        Objects.requireNonNull(equipos, "La lista de equipos no puede ser nula");
        // Copia defensiva: cambios externos a la lista no afectan al preparador
        this.equipos = new ArrayList<>(equipos);
    }

    public void agregarEquipo(EquipoCocina equipo) {
        equipos.add(Objects.requireNonNull(equipo, "El equipo no puede ser nulo"));
    }

    public int cantidadEquipos() {
        return equipos.size();
    }

    public void prepararDesayuno() {
        System.out.println("Iniciando preparacion del desayuno...");
        for (EquipoCocina equipo : equipos) {
            equipo.encender();
            equipo.preparar();
        }
        System.out.println("Desayuno listo.");
    }

    public void subirIntensidadATodos() {
        System.out.println("Subiendo intensidad de los equipos...");
        for (EquipoCocina equipo : equipos) {
            equipo.ajustarIntensidad();
        }
    }

    public void apagarTodo() {
        System.out.println("Apagando equipos...");
        for (EquipoCocina equipo : equipos) {
            equipo.apagar();
        }
        System.out.println("Equipos apagados.");
    }
}
