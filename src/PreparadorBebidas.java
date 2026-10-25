/**
 * Version original (V1). Funciona, pero esta acoplada a exactamente tres equipos:
 * para agregar un cuarto hay que modificar atributos, constructor y metodos.
 */
public class PreparadorBebidas {
    private final EquipoCocina equipo1;
    private final EquipoCocina equipo2;
    private final EquipoCocina equipo3;

    public PreparadorBebidas(EquipoCocina equipo1, EquipoCocina equipo2, EquipoCocina equipo3) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
    }

    public void prepararDesayuno() {
        System.out.println("Iniciando preparacion del desayuno...");
        equipo1.encender();
        equipo1.preparar();
        equipo2.encender();
        equipo2.preparar();
        equipo3.encender();
        equipo3.preparar();
        System.out.println("Desayuno listo.");
    }

    public void apagarTodo() {
        System.out.println("Apagando equipos...");
        equipo1.apagar();
        equipo2.apagar();
        equipo3.apagar();
        System.out.println("Equipos apagados.");
    }
}
