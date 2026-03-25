# 🖨️ Dispositivos de Oficina — Interfaces en C#

## 📌 Descripción

Este proyecto modela distintos dispositivos de oficina utilizando **interfaces en C#**, aplicando principios de diseño como la **segregación de interfaces** y la **composición de comportamientos**.

El objetivo es representar cómo algunos dispositivos tienen funcionalidades limitadas (como imprimir) mientras que otros ofrecen múltiples capacidades (como imprimir y escanear).

---

## 🧩 Estructura del Proyecto

### 🔹 Interfaces

Se definen tres interfaces:

* **Imprimible**

  * Obliga a implementar la acción de imprimir documentos.

* **Escaneable**

  * Obliga a implementar la acción de escanear documentos.

* **Multifuncion**

  * Combina ambas interfaces (`Imprimible` y `Escaneable`).
  * Representa dispositivos más completos.

---

### 🖨️ Clases

* **ImpresoraBasica**

  * Implementa únicamente la interfaz `Imprimible`.
  * Solo puede imprimir.

* **ImpresoraAvanzada**

  * Implementa la interfaz `Multifuncion`.
  * Puede imprimir y escanear.

---

## 🚀 Ejemplo de uso

```csharp
ImpresoraBasica impresoraBuena = new ImpresoraBasica();
ImpresoraAvanzada impresoraMala = new ImpresoraAvanzada();

// Array de impresoras
ImpresoraBasica[] array = new ImpresoraBasica[] { impresoraBuena };

// Uso básico
impresoraBuena.Imprimir("Documento 1");

// Esto funcionará:
impresoraMala.Imprimir("Documento 2");
impresoraMala.Escanear("Documento 3");

// ❌ Error de compilación:
// impresoraBuena.Escanear("Documento 4");
```

---

## ⚠️ ¿Por qué ocurre el error?

La clase `ImpresoraBasica` **no implementa la interfaz `Escaneable`**, por lo tanto:

* El método `Escanear()` **no existe** en esa clase.
* El compilador detecta esto y lanza un error.

💡 Esto es intencional y correcto, ya que:

* Obliga a usar cada objeto según sus capacidades reales.
* Evita llamadas a métodos que no están definidos.

---

## 🧠 Conceptos clave

* **Interfaces**: Definen contratos que las clases deben cumplir.
* **Segregación de interfaces (ISP)**: No obligar a una clase a implementar métodos que no necesita.
* **Polimorfismo**: Permite tratar distintos objetos de forma uniforme según su tipo común.

---

## ✅ Conclusión

Este ejercicio demuestra cómo diseñar sistemas más flexibles y mantenibles usando interfaces. Separar responsabilidades permite crear clases más claras, reutilizables y fáciles de extender.

---

## 📎 Posibles mejoras

* Añadir más tipos de dispositivos (fotocopiadoras, fax, etc.).
* Implementar herencia adicional.
* Simular una cola de impresión o escaneo.

---

Si necesitas el código completo de las interfaces y clases, dímelo y te lo preparo 👍
