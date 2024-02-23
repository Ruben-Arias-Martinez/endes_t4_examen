package javadoc;

/**
 * La clase empleado representa a un empleado.
 * Tiene 3 atributos, un constructor, getters y setter y un metodo.
 *
 * @author Rubén Arias Martinez
 * @version 1.0
 * @since 2024-02-23
 */
public class Empleado {
    // Atributos de la clase

    /**
     * Nombre del empleado
     */
    private String nombre;


    /**
     * Identificador del empleado
     */
    private String id;


    /**
     * Sueldo del empleado
     */
    private double sueldo;



    /**
     * Constructor de la clase, que recibe tres prametros:
     * Nombre,identificador y sueldo del empleado.
     *
     * @param nombre
     * @param id
     * @param sueldo
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }


    /**
     * Obtiene el nombre del empleado
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Actualiza el nombre del empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Obtiene el Id del empleado
     *
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Obtiene el sueldo del empleado
     *
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     * Actualiza el sueldo del empleado
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    /**
     * Metodo que incrementa el valor del sueldo,
     * actualiza la variable sueldo sumandole el incremento.
     *
     * @param incremento
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Metodo toString para ver los valores de los atributos
     * @return una cadena con los valores de los atributos, nombre, id y sueldo del empleado
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
