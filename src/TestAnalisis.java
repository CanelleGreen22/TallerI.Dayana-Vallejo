/**
 * Parte 1: analisis del sistema original.
 *
 * El PreparadorBebidas original creaba sus equipos internamente:
 *     this.cafetera = new Cafetera();
 *     this.licuadora = new Licuadora();
 * Despues del refactor el preparador recibe los equipos por constructor, asi que
 * aqui se le inyecta la misma combinacion original (Cafetera + Licuadora) para
 * reproducir la salida de referencia.
 */
public class TestAnalisis {
    public static void main(String[] args) {
        PreparadorBebidas preparador = new PreparadorBebidas(new Cafetera(), new Licuadora());

        preparador.prepararDesayuno();
        preparador.apagarTodo();

        System.out.println("// El preparador esta amarrado a Cafetera y Licuadora: cambiar o agregar un equipo obliga a modificar su codigo.");
    }
}
