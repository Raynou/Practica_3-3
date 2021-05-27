package com.company;

public class Main {

    public static void main(String[] args) {
//        Instancias de la clase persona

        Persona pablo = new Persona("Pablo Martinez", "Calle genérica No.000, Col Estándar");

        Persona ana = new Persona("Ana Salgado", "Calle Ébano #911, Col Del Bosque");

//        Instancias de Estudiante

        Estudiante rafael = new Estudiante("Rafael García", "Calle El Pino, #22, Col El Pino", "ITCM",
                "3er semestre ");

        Estudiante armando = new Estudiante("Armando González", "Calle Olmo #403, Col Los Pinos ", "UAT",
                "4rto semestre");

//        Instancias de Maestro

        Maestro federico = new Maestro("Federico", "Desconocida",
                "Desarrollo de aplicaciones móviles");

        Maestro ruben = new Maestro("Rubén Camacho", "Desconocida",
                "POO/Programación estructurada");

//        Instancia de estudiante de intercambio

        EstudianteDeIntercambio valentin = new EstudianteDeIntercambio(
                "Valentin Schurmann", "Desconocida", "CBTis 103 ", "5to semestre ",
                "Argentina");

        EstudianteDeIntercambio juliette = new EstudianteDeIntercambio("Juliette Feynman", "Desconocida",
                "ITCM", "2do semestre", "EEUU");


        System.out.println(pablo+"\n");
        System.out.println(ana+"\n");
        System.out.println(rafael+"\n");
        System.out.println(armando+"\n");
        System.out.println(federico+"\n");
        System.out.println(ruben+"\n");
        System.out.println(valentin+"\n");
        System.out.println(juliette+"\n");
    }
}
