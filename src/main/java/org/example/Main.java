package org.example;

public class Main {
    public static void main(String[] args) {
        Works works = new Works();
        Students students = new Students(works);
        Theacher theacher = new Theacher(works);
        students.start();
        theacher.start();
    }
}