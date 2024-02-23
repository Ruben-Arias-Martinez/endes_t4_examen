package refactor.ref3;

/*
Tarea: Renombrar "s" e "y" a nombres más descriptivos.
 */

public class Employee {
    int salarioPorHora;
    int horasTrabajadasUnMes;

    int calculateSalary() {
        return salarioPorHora * horasTrabajadasUnMes;
    }
}
