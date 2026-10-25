import java.util.ArrayList;
import java.util.List;

/**
 * Prueba la version refactorizada: mismos equipos que V1 y luego un equipo
 * nuevo (Exprimidor) sin tocar el codigo de PreparadorBebidasV2.
 */
public class TestPreparadorBebidasV2 {
    private static final String SEPARADOR = "-----------------------------------------";

    public static void main(String[] args) {
        List<EquipoCocina> equipos = new ArrayList<>();
        equipos.add(new Cafetera());
        equipos.add(new Licuadora());

        MaquinaTe maquinaTe = new MaquinaTe();
        equipos.add(maquinaTe);

        PreparadorBebidasV2 preparador = new PreparadorBebidasV2(equipos);

        System.out.println(SEPARADOR);
        System.out.println("V2 - desayuno con " + preparador.cantidadEquipos() + " equipos");
        System.out.println(SEPARADOR);
        preparador.prepararDesayuno();
        // Funcionalidad propia de MaquinaTe, usada desde su tipo concreto
        maquinaTe.agregarHierbasFrutales();

        System.out.println(SEPARADOR);
        System.out.println("V2 - agregando equipos nuevos sin modificar el preparador");
        System.out.println(SEPARADOR);
        preparador.agregarEquipo(new Exprimidor());
        preparador.agregarEquipo(new Cafetera());
        System.out.println("Equipos registrados: " + preparador.cantidadEquipos());
        preparador.prepararDesayuno();

        System.out.println(SEPARADOR);
        System.out.println("V2 - ajustando intensidad (polimorfismo)");
        System.out.println(SEPARADOR);
        preparador.subirIntensidadATodos();
        preparador.subirIntensidadATodos();

        System.out.println(SEPARADOR);
        System.out.println("V2 - apagarTodo()");
        System.out.println(SEPARADOR);
        preparador.apagarTodo();

        System.out.println(SEPARADOR);
        System.out.println("Conclusion: el preparador depende de la interfaz EquipoCocina,");
        System.out.println("por eso acepta cualquier cantidad y tipo de equipo.");
        System.out.println(SEPARADOR);
    }
}
