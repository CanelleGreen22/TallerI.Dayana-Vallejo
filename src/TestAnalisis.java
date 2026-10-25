/**
 * Ejecuta la version original (V1) y explica por que hay que refactorizarla.
 */
public class TestAnalisis {
    private static final String SEPARADOR = "-----------------------------------------";

    public static void main(String[] args) {
        PreparadorBebidas preparador = new PreparadorBebidas(
                new Cafetera(), new Licuadora(), new MaquinaTe());

        System.out.println(SEPARADOR);
        System.out.println("V1 - prepararDesayuno()");
        System.out.println(SEPARADOR);
        preparador.prepararDesayuno();

        System.out.println(SEPARADOR);
        System.out.println("V1 - apagarTodo()");
        System.out.println(SEPARADOR);
        preparador.apagarTodo();

        System.out.println(SEPARADOR);
        System.out.println("Problemas encontrados en V1:");
        System.out.println(" 1. Acepta exactamente tres equipos, ni uno mas ni uno menos.");
        System.out.println(" 2. Para agregar un Exprimidor hay que modificar atributos,");
        System.out.println("    constructor, prepararDesayuno() y apagarTodo().");
        System.out.println(" 3. El codigo se repite por cada equipo (encender, preparar, apagar).");
        System.out.println("Solucion: recibir una List<EquipoCocina> y recorrerla (ver V2).");
        System.out.println(SEPARADOR);
    }
}
