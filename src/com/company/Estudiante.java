package com.company;

public class Estudiante extends Persona{
    public String escuela;
    public String grado;

    public Estudiante(){
        super("", "");
        this.escuela = "";
        this.grado = null;

    }

    public Estudiante(String nombre, String direccion,String escuela, String grado){
        super(nombre, direccion);
        this.escuela = escuela;
        this.grado = grado;
    }

    public Object getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "escuela='" + escuela + '\'' +
                ", grado='" + grado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
