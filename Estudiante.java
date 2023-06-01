public class Estudiante {
    private String nombre;
    private double[] calificaciones;

    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        double promedio = calcularPromedio();
        System.out.println("Promedio: " + promedio);
        char calificacion = obtenerCalificacionFinal(promedio);
        System.out.println("Calificación: " + calificacion);
    }

    public static void main(String[] args) {
        double[] calificaciones = {75, 88, 92, 60, 77};
        Estudiante estudiante = new Estudiante("Miguel Guerra", calificaciones);
        estudiante.imprimirResultados();
    }
}
