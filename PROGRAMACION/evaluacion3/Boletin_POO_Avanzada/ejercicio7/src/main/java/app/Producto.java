package app;

import java.util.List;

public class Producto {
    private TipoProducto tipo;
    private List<String> ingredientes;
    private String sabor;
    private double precio;

    public Producto(TipoProducto tipo, List<String> ingredientes, String sabor, double precio) {
        this.tipo = tipo;

        if (tipo == TipoProducto.PIZZA || tipo == TipoProducto.BOCADILLO) {
            this.ingredientes = ingredientes;
        } else {
            this.ingredientes = null;
        }

        if (tipo == TipoProducto.REFRESCO || tipo == TipoProducto.HELADO) {
            this.sabor = sabor;
        } else {
            this.sabor = null;
        }

        this.precio = precio;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public TipoProducto getTipoProducto() {
        return tipo;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
