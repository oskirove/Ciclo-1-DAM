package app;

import java.util.List;

public class Pedido {
    private int codigo;
    private List<Producto> producto;
    private TipoVenta venta;
    private double precioTotal;
    private String domicilio;

    public Pedido(int codigo, List<Producto> producto, TipoVenta venta, String domicilio, double precioTotal)
            throws CodigoPedidoInvalidoException {
        if (codigo < 1 || codigo > 1000) {
            throw new CodigoPedidoInvalidoException(
                    "Error: El código del producto no puede ser mayor a 1000 ni menor que 1.");
        }

        if (venta == TipoVenta.DOMICILIO && (domicilio == null || domicilio.trim().isEmpty())) {
            throw new IllegalArgumentException("Se requiere un domicilio para entregas a domicilio.");
        }

        this.codigo = codigo;
        this.producto = producto;
        this.venta = venta;
        this.domicilio = venta == TipoVenta.DOMICILIO ? domicilio : null;
        this.precioTotal = precioTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setTipoVenta(TipoVenta venta) {
        this.venta = venta;
    }

    public TipoVenta getTipoVenta() {
        return venta;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        if (venta == TipoVenta.DOMICILIO) {
            this.domicilio = domicilio;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido:\n");
        sb.append("- Código: ").append(codigo).append("\n");
        sb.append("- Tipo de Venta: ").append(venta).append("\n");

        if (venta == TipoVenta.DOMICILIO) {
            sb.append("- Domicilio: ").append(domicilio).append("\n");
        }

        sb.append("- Productos:\n");
        for (Producto p : producto) {
            sb.append("  • ").append(p.getTipoProducto());

            if (!p.getIngredientes().isEmpty()) {
                sb.append(" (Ingredientes: ").append(String.join(", ", p.getIngredientes())).append(")");
            }

            if (p.getTipoProducto() == TipoProducto.REFRESCO || p.getTipoProducto() == TipoProducto.HELADO) {
                sb.append(" - Sabor: ").append(p.getSabor());
            }

            sb.append(" - Precio: ").append(p.getPrecio()).append("€\n");
        }

        sb.append("- Precio Total: ").append(precioTotal).append("€");
        return sb.toString();
    }

}
