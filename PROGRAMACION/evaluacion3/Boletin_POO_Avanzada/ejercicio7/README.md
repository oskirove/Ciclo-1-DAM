# Gestión de Pedidos para Empresa de Comidas Rápidas 🍔🍕🍦

Se desea realizar un programa para la **gestión de pedidos** de una empresa de comercialización de comidas rápidas. Este programa se desarrollará utilizando **colecciones anidadas**.

## Estructura del Programa

### Colección Principal: **Pedidos de Clientes**
- **Tipo de estructura:** Cola clásica (FIFO: First In, First Out).
- **Clase utilizada:** `Queue` (ver Apéndice I del tema anterior).
- **Funcionamiento:**
  - Los nuevos pedidos se **insertan al final** de la cola.
  - Los pedidos se **extraen por el principio**.

### Detalles de Cada Pedido
Cada pedido será un objeto que contendrá los siguientes datos:

#### **1. Lista de Productos**
- **Tipo Base (Enumerado):**
  - Opciones: `Pizza`, `Bocadillo`, `Refresco`, `Helado`.
- **Lista de Ingredientes:**
  - Una colección de `String` que contiene un ingrediente adicional en cada posición.
- **Sabor (`String`):**
  - Especificado solo para **refrescos** y **helados**.
- **Precio:**
  - **Cálculo:**
    - **Pizza o Bocadillo:** Precio base + (número de ingredientes × precio por ingrediente).
    - **Refrescos o Helados:** Solo el precio del producto base.

#### **2. Código de Pedido**
- **Tipo:** Número o referencia única.
- **Restricción:** Si es un número entero, debe estar entre **1 y 1000** (máximo de 1000 pedidos en la cola).
- **Excepción personalizada:** Crear una nueva excepción para controlar este rango.

#### **3. Tipo de Venta (Enumerado)**
- Opciones: `Domicilio`, `Local`, `Recoger`.

#### **4. Domicilio del Cliente**
- **Requerido solo si:** El tipo de venta es `Domicilio`.
- **Tipo:** `String`.

---

## Menú Principal del Programa

El programa contará con un menú con las siguientes opciones:

### **1. Nuevo Pedido**
- Se solicitarán todos los datos del pedido al cliente.
- Antes de añadir el pedido a la cola:
  - Se mostrará **todo el pedido en pantalla**.
  - Se preguntará al cliente si los datos son correctos.

```plaintext
Ejemplo:
Pedido: 
- Código: 123
- Tipo de Venta: Domicilio
- Productos: Pizza (Ingredientes: Queso, Jamón)
¿Es correcto? (S/N)
```

---

### **2. Despachar Pedido**
- Extraerá un pedido de la cola y lo mostrará en pantalla.

```plaintext
Ejemplo:
Despachando Pedido:
- Código: 123
- Tipo de Venta: Domicilio
- Productos: Pizza (Ingredientes: Queso, Jamón)
```

---

### **3. Mostrar Cola de Pedidos**
- Mostrará únicamente el **código** y el **tipo de venta** de cada pedido en la cola.

```plaintext
Ejemplo:
Cola de Pedidos:
1. Código: 123 | Tipo de Venta: Domicilio
2. Código: 124 | Tipo de Venta: Local
```

---

## **Persistencia de Datos**
El programa contará con **persistencia de datos**, es decir, los pedidos se guardarán en una **base de datos** para su posterior recuperación.

---

## **Notas Importantes**

>[!IMPORTANT]
> - Asegúrate de implementar correctamente la excepción para controlar el rango del **Código de Pedido**.

>[!TIP]
> - Utiliza enumerados (`enum`) para los campos como **Tipo Base** y **Tipo de Venta** para mejorar la legibilidad y evitar errores.

>[!NOTE]
> - La clase `Queue` es ideal para implementar la estructura FIFO requerida para la cola de pedidos.

---

¡Buena suerte desarrollando este programa! 🚀