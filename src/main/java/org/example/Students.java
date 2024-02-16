package org.example;

public class Students extends Thread{
    private Works works;

    public Students(Works works) {
        this.works = works;
    }
    public void run(){
        for (int i = 0; i < 25; i++) {
            works.put();
        }
    }
}
