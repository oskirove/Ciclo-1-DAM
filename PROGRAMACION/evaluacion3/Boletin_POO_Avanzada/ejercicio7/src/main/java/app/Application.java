
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GestorPedidos gestor = new GestorPedidos();

    boolean salir = false;
    while (!salir) {
      System.out.println("1. Nuevo Pedido\n2. Despachar Pedido\n3. Mostrar Cola de Pedidos\n4. Salir");
      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          try {
            System.out.print("Código del pedido (1-1000): ");
            int codigo = Integer.parseInt(scanner.nextLine());

            System.out.print("Tipo de venta (LOCAL, DOMICILIO, RECOGER): ");
            TipoVenta tipoVenta = TipoVenta.valueOf(scanner.nextLine().toUpperCase());

            String domicilio = null;
            if (tipoVenta == TipoVenta.DOMICILIO) {
              System.out.print("Domicilio del cliente: ");
              domicilio = scanner.nextLine();
            }

            List<Producto> productos = new ArrayList<>();
            boolean agregarOtroProducto = true;

            while (agregarOtroProducto) {
              System.out.print("Tipo de producto (PIZZA, BOCADILLO, REFRESCO, HELADO): ");
              TipoProducto tipoProducto = TipoProducto.valueOf(scanner.nextLine().toUpperCase());

              List<String> ingredientes = new ArrayList<>();
              String sabor = null;
              double precioBase = 0;

              if (tipoProducto == TipoProducto.PIZZA || tipoProducto == TipoProducto.BOCADILLO) {
                System.out.println("Introduce ingredientes (escribe 'fin' para terminar):");
                while (true) {
                  String ingrediente = scanner.nextLine();
                  if (ingrediente.equalsIgnoreCase("fin"))
                    break;
                  ingredientes.add(ingrediente);
                }
                precioBase = 5.0 + ingredientes.size() * 0.5;
              } else {
                System.out.print("Sabor del producto: ");
                sabor = scanner.nextLine();
                precioBase = 2.5; 
              }

              Producto producto = new Producto(tipoProducto, ingredientes, sabor, precioBase);
              productos.add(producto);

              System.out.print("¿Agregar otro producto? (S/N): ");
              String respuesta = scanner.nextLine();
              agregarOtroProducto = respuesta.equalsIgnoreCase("S");
            }

            double precioTotal = productos.stream().mapToDouble(Producto::getPrecio).sum();

            Pedido nuevo = new Pedido(codigo, productos, tipoVenta, domicilio, precioTotal);

            System.out.println("Resumen del pedido:");
            System.out.println(nuevo);
            System.out.print("¿Es correcto? (S/N): ");
            String confirmacion = scanner.nextLine();

            if (confirmacion.equalsIgnoreCase("S")) {
              gestor.agregarPedido(nuevo);
              System.out.println("Pedido agregado a la cola.");
            } else {
              System.out.println("Pedido cancelado.");
            }
          } catch (Exception e) {
            System.out.println("Error al crear pedido: " + e.getMessage());
          }
          break;

      }
    }

    scanner.close();
  }
}
