import java.util.List;

/**
 * Segunda version del preparador: en lugar de dos equipos fijos recibe
 * una lista y controla a todos los equipos que contenga.
 */
public class PreparadorBebidasV2 {
    private List<EquipoCocina> equipos;

    public PreparadorBebidasV2(List<EquipoCocina> equipos) {
        this.equipos = equipos;
    }

    public void prepararDesayuno() {
        System.out.println("Iniciando preparacion del desayuno...");
        for (EquipoCocina equipo : equipos) {
            equipo.encender();
            equipo.preparar();
        }
        System.out.println("Desayuno listo.");
    }

    public void apagarTodo() {
        System.out.println("Apagando equipos...");
        for (EquipoCocina equipo : equipos) {
            equipo.apagar();
        }
        System.out.println("Equipos apagados.");
    }
}
