package com.company;

public class EstudianteDeIntercambio extends Estudiante{
    private String paisDeOrigen;


    public EstudianteDeIntercambio() {
        super("", null, "", "");
        this.paisDeOrigen = "";
    }

    public EstudianteDeIntercambio(String nombre, String direccion,String escuela, String grado, String paisDeOrigen) {
        super(escuela, grado, nombre, direccion);
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return "EstudianteDeIntercambio{" +
                "escuela='" + escuela + '\'' +
                ", grado=" + grado +
                ", paisDeOrigen='" + paisDeOrigen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
