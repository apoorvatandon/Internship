package com.company;

public class CircularQueue {

    static final int MAX = 10;
    int[] arr = new int[MAX];
    int front;
    int rear;

    CircularQueue(){
        this.front = 0;
        this.rear = 0;
    }

    public void insert(int x){

        if((front == 0  && rear == MAX) || (rear == front - 1)){
            System.out.println("Queue is full");
        }
        else{
            arr[rear] = x;
            rear = (rear + 1) % MAX;
        }

    }

    public int remove(){
        if(front == rear + 1){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int x = arr[front];
            front = (front + 1) % MAX;
            return x;
        }

    }

    public void print(){
        int x = front;

        while(x != rear){
            System.out.print(arr[x] + " -> ");
            x++;
        }

    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.insert(6);
        cq.insert(7);
        cq.insert(8);
        cq.insert(9);
        cq.insert(10);

        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();


        cq.print();
    }

}
