public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto() {

    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void imprimir(String nombre) {
        System.out.println("el nombre del producto es:" + nombre);
    }

    public void imprimir(String nombre, int precio) {
        System.out.println("el nombre del producto es:" + nombre);
        System.out.println("el precio del producto es:" + precio);
    }

    public void imprimir(String nombre, int precio, int cantidad) {
        System.out.println("el nombre del producto es:" + nombre);
        System.out.println("el precio del producto es:" + precio);
        System.out.println("la cantidad es:" + cantidad);
    }

}

