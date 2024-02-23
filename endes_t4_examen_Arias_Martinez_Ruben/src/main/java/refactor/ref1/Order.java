package refactor.ref1;
/*
Tarea: Refactorizar el método processOrder para utilizar un objeto
de parámetro que contenga itemName, quantity, price, y customerName.
 */


class Order {

    //Creo un objeto
    ClaseParaElObjeto objeto = new ClaseParaElObjeto("Nombre",378426,45.5,"CustomerName");

// LE PASO EL OBJETO AL METODO
    void processOrder(ClaseParaElObjeto objeto) {
        // Procesamiento del pedido
    }
}

class ClaseParaElObjeto {
    //Atributos
    String itemName;
    int quantity;
    double price;
    String customerName;
    //Constructor
    public ClaseParaElObjeto(String nombre, int i, double v, String customerName) {
        this.customerName=customerName;
        this.itemName=nombre;
        this.price=v;
        this.quantity=i;
    }




}
