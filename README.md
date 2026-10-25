# TIFC2DEV-JAVA-MJ6 - Laboratorio Cafeteria

Refactor de un preparador de bebidas usando la interfaz `EquipoCocina`.

## Estructura (`src/`)

| Archivo | Descripcion |
|---|---|
| `EquipoCocina.java` | Interfaz comun: `encender`, `apagar`, `preparar`, `ajustarIntensidad` |
| `Cafetera.java`, `Licuadora.java`, `MaquinaTe.java`, `Exprimidor.java` | Equipos que implementan la interfaz |
| `PreparadorBebidas.java` | Version original (V1), acoplada a exactamente tres equipos |
| `PreparadorBebidasV2.java` | Version refactorizada: recibe una `List<EquipoCocina>` |
| `TestAnalisis.java` | Ejecuta la V1 y explica sus problemas |
| `TestPreparadorBebidasV2.java` | Ejecuta la V2 y agrega equipos nuevos sin modificar el preparador |

## Problema de la V1

`PreparadorBebidas` recibe exactamente tres equipos. Para agregar uno nuevo (por ejemplo un `Exprimidor`)
hay que modificar atributos, constructor, `prepararDesayuno()` y `apagarTodo()`.

## Solucion (V2)

`PreparadorBebidasV2` depende solo de la interfaz `EquipoCocina` y recorre una lista, asi que acepta
cualquier cantidad y tipo de equipo sin cambiar su codigo (principio abierto/cerrado e inversion de dependencias).

## Ejecutar

```
javac -d out src/*.java
java -cp out TestAnalisis
java -cp out TestPreparadorBebidasV2
```
