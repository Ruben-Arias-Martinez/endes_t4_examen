package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        printTitulo();
        printContenidos();
        printConclusion();
    }

    void printTitulo(){
        // imprimir título
        System.out.println("Título del Reporte");
    }

    void printContenidos(){
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...
    }

    void printConclusion(){
        // imprimir conclusión
        System.out.println("Conclusión del Reporte");
    }


}
