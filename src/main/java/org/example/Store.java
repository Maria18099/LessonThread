package org.example;

public class Store {
    private int product = 0;
    public synchronized void get(){
        while (product == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("We buy 1 product. Products = "+product);
        notify();
    }
    public synchronized void put(){
        while (product == 3){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product++;
        System.out.println("We produce the product. Products = "+product);
        notify();
    }
}
