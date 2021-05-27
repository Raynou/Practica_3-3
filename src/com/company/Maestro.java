package com.company;

public class Maestro extends Persona{
    private String materiaQueImparte;

    public Maestro(){
        super("", "");
        this.materiaQueImparte ="";
    }

    public Maestro(String nombre, String direccion, String materiaQueImparte) {
        super(nombre, direccion);
        this.materiaQueImparte = materiaQueImparte;
    }

    public String getMateriaQueImparte() {
        return materiaQueImparte;
    }

    public void setMateriaQueImparte(String materiaQueImparte) {
        this.materiaQueImparte = materiaQueImparte;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "materiaQueImparte='" + materiaQueImparte + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
