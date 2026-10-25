import java.util.ArrayList;
import java.util.List;

/**
 * Parte 7: PreparadorBebidasV2 controla una lista con cuatro equipos distintos.
 */
public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {
        List<EquipoCocina> equipos = new ArrayList<>();
        equipos.add(new Cafetera());
        equipos.add(new Licuadora());
        equipos.add(new MaquinaTe());
        equipos.add(new Exprimidor());

        PreparadorBebidasV2 preparador = new PreparadorBebidasV2(equipos);

        System.out.println("=== PreparadorBebidasV2 con " + equipos.size() + " equipos ===");
        preparador.prepararDesayuno();
        preparador.apagarTodo();
    }
}
