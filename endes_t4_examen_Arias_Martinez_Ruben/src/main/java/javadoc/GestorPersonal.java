package javadoc;

import java.util.ArrayList;
import java.util.List;
/**
 *La clase GestorPersonal gestiona en una lista los empleados con tres metodos, contratar despedir y cambiar sueldo.
 *
 *
 * @author Rubén Arias Martinez
 * @version 1.0
 * @since 2024-02-23
 */

public class GestorPersonal {

    /**
     * Lista de empleados
     */
    private List<Empleado> empleados;

    /**
     * Inicializa la lista empleados
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Metodo que representa contratar un empleado, añade a la lista empleados un empleado
     * @param empleado
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Metodo que representa despedir a un empleado.
     * Elimina de la lista un empleado segun su id.
     * @param id
     * @return
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }


    /**
     * Metodo para cambiarSueldo segun el id del empleado,
     * si el metodo no encuentra al empleado retorna false.
     * @param id
     * @param nuevoSueldo
     * @return un boolean que representa si se ha encontrado al empleado y se ha cambiado el sueldo correctamente.
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }


    /**
     * Metodo que obtiene la lista empleados
     * @return lista empleados
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
