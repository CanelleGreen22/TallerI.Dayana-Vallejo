# TIFC2DEV-JAVA-MJ6 - Laboratorio Interfaces e Inyeccion de Dependencias

Refactor del sistema de la cafeteria para que el preparador de bebidas trabaje con
cualquier equipo que cumpla el contrato `EquipoCocina`, sin modificar su codigo.

## Entregables (`src/`)

| # | Archivo | Parte |
|---|---|---|
| 1 | `TestAnalisis.java` | Parte 1: analisis del codigo original |
| 2 | `EquipoCocina.java` | Parte 2: interfaz (contrato) |
| 3 | `Cafetera.java` | Parte 3: refactorizado, implementa `EquipoCocina` |
| 4 | `Licuadora.java` | Parte 3: refactorizado, implementa `EquipoCocina` |
| 5 | `PreparadorBebidas.java` | Parte 4: inyeccion de dependencias por constructor |
| 6 | `MaquinaTe.java` | Parte 5: nueva implementacion |
| 7 | `Exprimidor.java` | Parte 5: nueva implementacion |
| 8 | `TestPreparadorBebidas.java` | Parte 6: tres configuraciones |
| 9 | `PreparadorBebidasV2.java` | Parte 7: recibe una `List<EquipoCocina>` |
| 10 | `TestPreparadorBebidasV2.java` | Parte 7: prueba con cuatro equipos |

## Problema detectado

El `PreparadorBebidas` original creaba sus equipos con `new Cafetera()` y `new Licuadora()`.
Estaba amarrado a esas dos clases concretas: cambiar de marca o agregar un equipo obligaba
a modificar el preparador.

## Solucion

1. Se creo la interfaz `EquipoCocina` con `encender()`, `apagar()`, `preparar()` y `ajustarIntensidad()`.
2. `Cafetera` y `Licuadora` implementan la interfaz (sus metodos no cambiaron, solo se agrego `@Override`).
3. `PreparadorBebidas` declara sus atributos como `EquipoCocina` y los recibe por constructor.
4. `MaquinaTe` y `Exprimidor` se usan con el mismo preparador sin modificarlo.
5. `PreparadorBebidasV2` recibe una lista y controla cualquier cantidad de equipos.

## Ejecutar

```
javac -d out src/*.java
java -cp out TestAnalisis
java -cp out TestPreparadorBebidas
java -cp out TestPreparadorBebidasV2
```

## Salida del programa

### TestAnalisis

```
Iniciando preparacion del desayuno...
Cafetera encendida.
Preparando cafe con intensidad 1.
Licuadora encendida.
Licuando ingredientes a velocidad 1.
Desayuno listo.
Apagando equipos...
Cafetera apagada.
Licuadora apagada.
Equipos apagados.
// El preparador esta amarrado a Cafetera y Licuadora: cambiar o agregar un equipo obliga a modificar su codigo.
```

### TestPreparadorBebidas

```
=== Configuracion 1: Cafetera + Licuadora ===
Iniciando preparacion del desayuno...
Cafetera encendida.
Preparando cafe con intensidad 1.
Licuadora encendida.
Licuando ingredientes a velocidad 1.
Desayuno listo.
Apagando equipos...
Cafetera apagada.
Licuadora apagada.
Equipos apagados.

=== Configuracion 2: Maquina de te + Exprimidor ===
Iniciando preparacion del desayuno...
Maquina de te encendida, calentando agua.
Preparando te con intensidad 1.
Exprimidor encendido.
Exprimiendo frutas a velocidad 1.
Desayuno listo.
Apagando equipos...
Maquina de te apagada.
Exprimidor apagado.
Equipos apagados.

=== Configuracion 3: Cafetera + Maquina de te ===
Iniciando preparacion del desayuno...
Cafetera encendida.
Preparando cafe con intensidad 1.
Maquina de te encendida, calentando agua.
Preparando te con intensidad 1.
Desayuno listo.
Apagando equipos...
Cafetera apagada.
Maquina de te apagada.
Equipos apagados.
```

### TestPreparadorBebidasV2

```
=== PreparadorBebidasV2 con 4 equipos ===
Iniciando preparacion del desayuno...
Cafetera encendida.
Preparando cafe con intensidad 1.
Licuadora encendida.
Licuando ingredientes a velocidad 1.
Maquina de te encendida, calentando agua.
Preparando te con intensidad 1.
Exprimidor encendido.
Exprimiendo frutas a velocidad 1.
Desayuno listo.
Apagando equipos...
Cafetera apagada.
Licuadora apagada.
Maquina de te apagada.
Exprimidor apagado.
Equipos apagados.
```
