# Sistema de Notificaciones y Dispositivos de Oficina

Este proyecto implementa una serie de actividades centradas en el uso de interfaces, polimorfismo y clases anónimas en Java, aplicadas a escenarios prácticos dentro de una empresa.

---

## Contenido

* Actividad 3: Centralita de Notificaciones
* Actividad 4: Dispositivos de Oficina
* Actividad 5: Notificación Temporal
* Conceptos Clave

---

## Actividad 3: Centralita de Notificaciones

### Descripción

Se diseña un sistema de comunicación empresarial que permite enviar mensajes a clientes a través de distintos canales: correo electrónico, SMS y notificaciones push.

### Implementación

Se define una interfaz `Notificable` que establece un contrato común mediante el método:

```java
void enviarNotificacion(String mensaje);
```

Se implementan tres clases que representan los distintos canales de comunicación:

* `NotificacionEmail`
* `NotificacionSMS`
* `NotificacionPush`

Cada clase implementa la interfaz y define su propio comportamiento para el envío de notificaciones.

### Polimorfismo

En el método principal (`main`), se agrupan los distintos tipos de notificación en una estructura común basada en la interfaz `Notificable`. Esto permite recorrerlos y ejecutar el mismo método sobre cada uno de ellos, independientemente de su implementación concreta.

---

## Actividad 4: Dispositivos de Oficina

### Descripción

Se modelan dispositivos de oficina con distintas capacidades utilizando interfaces para definir comportamientos específicos.

### Implementación

Se crean las siguientes interfaces:

* `Imprimible`, que define el método `imprimir()`
* `Escaneable`, que define el método `escanear()`
* `Multifuncion`, que hereda de ambas interfaces

Se implementan dos clases:

* `ImpresoraBasica`, que implementa únicamente la interfaz `Imprimible`
* `ImpresoraAvanzada`, que implementa la interfaz `Multifuncion`

### Restricciones del compilador

La clase `ImpresoraBasica` no implementa la interfaz `Escaneable`, por lo que no dispone del método `escanear()`. Intentar invocar este método sobre una instancia de esta clase genera un error de compilación, ya que incumple el contrato definido por las interfaces.

---

## Actividad 5: Notificación Temporal

### Descripción

Se plantea la necesidad de implementar un canal de comunicación excepcional y no reutilizable.

### Implementación

Se utiliza una clase anónima que implementa la interfaz `Notificable` directamente dentro del método `main`. Esta solución permite definir un comportamiento específico sin necesidad de crear una clase adicional en el proyecto.

Este canal se utiliza para enviar un único mensaje, cumpliendo con el contrato definido por la interfaz.

### Justificación

El uso de clases anónimas es adecuado en este caso debido a que se trata de una implementación puntual que no requiere reutilización ni mantenimiento independiente.

---

## Conceptos Clave

* Uso de interfaces como contratos de comportamiento
* Implementación de múltiples interfaces
* Aplicación del polimorfismo
* Separación de responsabilidades
* Uso de clases anónimas para casos específicos

---

## Ejecución

Para compilar y ejecutar el proyecto:

```bash
javac Main.java
java Main
```

---

## Autor

Proyecto académico orientado al aprendizaje de programación orientada a objetos en Java.
