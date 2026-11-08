# Práctica de pilas y colas

**Nombre:Naren Josue Dimate Torres**
**Número de lista:**

## Ejercicio 1: Pila
Salida de la consola:
```
Cima: 1
Contenido: [1]  <- la cima es el de la derecha

Cima: 31
Contenido: [1, 31]  <- la cima es el de la derecha

Cima: 8
Contenido: [1, 31, 8]  <- la cima es el de la derecha


La posicion de mi numero de lista es 3

Eliminando datos con pop()
Cima: 31
Contenido: [1, 31]  <- la cima es el de la derecha

Cima: 1
Contenido: [1]  <- la cima es el de la derecha

La pila esta vacia
```
- ¿Por qué tu número de lista está en la posición 3?
El 8 está en la cima por eso es que search() cuenta desde allí y empieza en 1.
- ¿Qué pasaría con while(true)?
Se repitiria el ciclo indefinidamente por que siempre va a ser verdadero y al final arrojaria error.

## Ejercicio 2: Cola
Salida de la consola:
```
Tamano: 1
Cabeza: 1
Contenido: [1]  <- la cabeza es el de la izquierda

Tamano: 2
Cabeza: 1
Contenido: [1, 31]  <- la cabeza es el de la izquierda

Tamano: 3
Cabeza: 1
Contenido: [1, 31, 8]  <- la cabeza es el de la izquierda

Se atendio a 1
Tamano: 1
Cabeza: 8
Contenido: [8]  <- la cabeza es el de la izquierda

La cola esta vacia

//DIFERENCIAS QUEUE
Cola llena: [10, 20, 30]
offer(40) devolvio: false
add(50) lanzo: java.lang.IllegalStateException: Queue full

poll() en cola vacia: null
peek() en cola vacia: null
remove() lanzo: java.util.NoSuchElementException
element() lanzo: java.util.NoSuchElementException
```
- ¿Por qué la cabeza siempre es la misma?
Porque es el primer dato ingresado y el primer dato que tiene que salir.
- ¿Por qué la pila y la cola sacaron los datos en orden contrario?
Por que la logica de la cola es sacar primero al que entra y la de la pila es sacar primero al ultimo que llego.

## Ejercicio 3: Cola de prioridad
Salida de la consola:
```
[Bogota, Java, Tecnologia Informatica, Naren]
Bogota
Sale Bogota
Sale Java
Sale Naren
Sale Tecnologia Informatica
```
- ¿Acertaste tu predicción?
No.
- ¿Por qué println salió desordenado y poll en orden?
Por que la logica de prioridad esta aplicando solamente al sacar los datos y no al ordenarlos.

## Ejercicio 4: Sala de emergencias
Salida de la consola:
```
Juan - Gravedad 1
Paciente Juan en estado Leve
Orden de llegada [Paciente Juan en estado Leve, Paciente Raquel en estado Grave, Paciente Ignacio en estado Moderado, Paciente Omar en estado Muy grave, Paciente Beatriz en estado Grave, Paciente Xochilt en estado Leve, Paciente Simon en estado Grave, Paciente Rodolfo en estado Grave, Paciente Brenda en estado Grave]
Paciente Omar en estado Muy grave

Atenciendo a Paciente Omar en estado Muy grave
Atenciendo a Paciente Brenda en estado Grave
Atenciendo a Paciente Raquel en estado Grave
Atenciendo a Paciente Rodolfo en estado Grave
Atenciendo a Paciente Beatriz en estado Grave
Atenciendo a Paciente Simon en estado Grave
Atenciendo a Paciente Ignacio en estado Moderado
Atenciendo a Paciente Xochilt en estado Leve
Atenciendo a Paciente Juan en estado Leve

Ultimo paciente atendido: Paciente Juan en estado Leve
Total de pacientes atendidos: 9
```
- ¿Por qué falló en el paso 4 y no con String?
Por que java no sabia que tenia que comparar en el objeto.
- Reto: ¿cómo harías que se respete el orden de llegada?
