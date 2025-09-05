public class Temperaturas {

    public static void main(String[] args) {
        // Definir ciudades, días y semanas
        String[] ciudades = {"Santo Domingo de los Tsáchilas", "Quito"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int semanas = 2; // mínimo 2 semanas

        // Declarar matriz 3D: [ciudad][día][semana]
        double[][][] temperaturas = new double[ciudades.length][dias.length][semanas];

        // Llenar la matriz con valores de ejemplo
        for (int c = 0; c < ciudades.length; c++) {
            for (int s = 0; s < semanas; s++) {
                for (int d = 0; d < dias.length; d++) {
                    // Temperatura simulada (ejemplo)
                    temperaturas[c][d][s] = 15 + Math.random() * 15; 
                }
            }
        }

        // Calcular y mostrar el promedio de cada ciudad por semana
        for (int c = 0; c < ciudades.length; c++) {
            System.out.println("\nCiudad: " + ciudades[c]);

            for (int s = 0; s < semanas; s++) {
                double suma = 0;
                for (int d = 0; d < dias.length; d++) {
                    suma += temperaturas[c][d][s];
                }
                double promedio = suma / dias.length;
                System.out.printf("Semana %d: Promedio = %.2f °C%n", (s + 1), promedio);
            }
        }
    }
}
