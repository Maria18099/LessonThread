package org.example;

public class Works {
    private int works = 0;
    public synchronized void check(){
        while (works==0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Work was checked. Works = "+works);
        works--;
        notify();
    }
    public synchronized void put(){
        while (works==5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        works++;
        System.out.println("I put work. Works = "+works);
        notify();
    }
}
