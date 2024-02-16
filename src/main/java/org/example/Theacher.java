package org.example;

public class Theacher extends Thread{
    private Works works;

    public Theacher(Works works) {
        this.works = works;
    }
    public void run(){
        for (int i = 0; i < 25; i++) {
            works.check();
        }
    }
}
