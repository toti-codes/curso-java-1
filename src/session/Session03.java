package session;

import java.util.Date;

public class Session03 {

    public void run() {
        /*
        Control structures
        if (condition) {
            // code
            } else if (condition) {

            } else {

            }

            Ternary operator
            condition ? true : false;
         */
        String isAnoNuevo;

        if (new Date().equals("01/01/2024")) {
            isAnoNuevo = "Si es año nuevo";
        } else {
            isAnoNuevo = "No es año nuevo";
        }

        isAnoNuevo = new Date().equals("01/01/2024") ? "Si es año nuevo" : "No es año nuevo";

        /*
        Switch

        switch (variable) {
            case value1:
                // code
                break;
            case value2:
                // code
                break;
            default:
                // code
                break;
         */

        String day = "Lunes";

        switch (day) {
            case "Lunes":
                System.out.println("Es lunes");
                break;
            case "Martes":
                System.out.println("Es martes");
                break;
            default:
                System.out.println("No es lunes ni martes");
                break;
        }

        /*
        Loops
        for (int i = 0; i < 10; i++) {
            // code
            }

        for (type var : array) {

        }

        while (condition) {
        }

        do {

        } while (condition);
         */

        //0         1       2
        String[] names = {"Daniel", "Juan", "Pedro"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        Date startDate = new Date();
        boolean isPause = false;
        while (!isPause) {
            System.out.println("Draw game");

            if (startDate.getTime() >= 350000) {
                break;
            }

            System.out.println("Add point");
        }

        do {
            System.out.println("Draw game");
        } while (!isPause);
    }

}
