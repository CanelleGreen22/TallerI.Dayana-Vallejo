/**
 * Parte 6: el mismo PreparadorBebidas funciona con distintas combinaciones
 * de equipos sin modificar su codigo.
 */
public class TestPreparadorBebidas {
    public static void main(String[] args) {
        System.out.println("=== Configuracion 1: Cafetera + Licuadora ===");
        PreparadorBebidas original = new PreparadorBebidas(new Cafetera(), new Licuadora());
        original.prepararDesayuno();
        original.apagarTodo();

        System.out.println();
        System.out.println("=== Configuracion 2: Maquina de te + Exprimidor ===");
        PreparadorBebidas nuevos = new PreparadorBebidas(new MaquinaTe(), new Exprimidor());
        nuevos.prepararDesayuno();
        nuevos.apagarTodo();

        System.out.println();
        System.out.println("=== Configuracion 3: Cafetera + Maquina de te ===");
        PreparadorBebidas mixto = new PreparadorBebidas(new Cafetera(), new MaquinaTe());
        mixto.prepararDesayuno();
        mixto.apagarTodo();
    }
}
