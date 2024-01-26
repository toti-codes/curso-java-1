package session;

public class Session02 {
    public void run() {
        //String nombre = "Daniel";
        int edad = 30;
        int modulo = 6;

        /*
            Operaciones aritmeticas
            + suma
            - resta
            * multiplicacion
            / division
            % modulo
         */

        /*
            Operadores de asignacion
            = asignacion
            += suma y asignacion
            -= resta y asignacion
            *= multiplicacion y asignacion
            /= division y asignacion
            %= modulo y asignacion
         */

        edad = edad + 1; // 30
        edad += 1; // 31

        /*
            Operadores de incremento y decremento
            ++ incremento
            -- decremento
         */

        edad++; //32
        // 33

        ++edad; //34

        /*
            Operadores de comparacion
            == igualdad
            != desigualdad
            > mayor que
            < menor que
            >= mayor o igual que
            <= menor o igual que
         */

        if (edad % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        /*
            Operadores logicos
            && and
            || or
            ! not
         */

        boolean esMayorDeEdad = edad >= 18;

        if (!esMayorDeEdad) {
            System.out.println("Es menor de edad");
        }

        System.out.println("Modulo " + edad + " % " + modulo + " " + (edad % modulo));
    }
}
