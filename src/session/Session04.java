package session;

public class Session04 {

    public void run() {
        String[][] alumnosPorSalon = new String[][] {
                {"Alumno1", "Alumno2", "Alumno3", "Alumno4"},
                {"AlumnaA", "AlumnaB", "AlumnaC", "AlumnaD"},
        };

        System.out.println(alumnosPorSalon[1][3]);

        for (int i = 0; i < alumnosPorSalon.length; i++) {
            String[] salon = alumnosPorSalon[i];
            for (int j = 0; j < salon.length; j++) {
                System.out.println(alumnosPorSalon[i][j]);
            }
        }
    }

}
