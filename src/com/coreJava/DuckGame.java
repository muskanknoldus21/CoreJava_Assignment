package com.coreJava;
public class DuckGame{

    enum DuckType {
        RUBBER, MALLARD, REDHEAD;
    }

    public interface IsShowDetail {

        void ShowDetails();
    }

    static class Duck implements IsShowDetail {

        private double weight;
        private int NumberOfWings;
        private DuckType duckType;
        //common Class
        public Duck(double weight, int numberOfWings, DuckType duckType) {
            this.weight =weight;
            this.NumberOfWings =NumberOfWings;
            this.duckType =duckType;
        }

        public void ShowDetails() {
            if (duckType == DuckType.MALLARD) {
                System.out.println("Mallard Duck:");
            }

            if (duckType == DuckType.RUBBER) {
                System.out.println("Rubber Duck:");
            }

            if (duckType == DuckType.REDHEAD) {
                System.out.println("Redhead Duck:");
            }

            System.out.println("Weight: "+  weight + " Kg");
            System.out.println("Number Of Wings: "+ NumberOfWings);
        }
    }
    //Rubber Duck class Started....
    static class RubberDuck extends Duck {

        public RubberDuck(double weight, int NumberOfWings, DuckType duckType) {
            super(weight, NumberOfWings, duckType);
        }

        public void ShowDetails() {
            super.ShowDetails();
            System.out.println("Rubber ducks don't fly and squeak.");
        }
    }
    static class MallardDuck extends Duck {
        public MallardDuck(double weight, int numberOfWings, DuckType duckType) {
            super(weight, numberOfWings, duckType);
        }

        public void ShowDetails() {
            super.ShowDetails();
            System.out.println("Mallard ducks fly fast and quack loud.");
        }
    }

    static class RedheadDuck extends Duck {

        public RedheadDuck(double weight, int numberOfWings, DuckType duckType) {
            super(weight, numberOfWings, duckType);
        }

        public void ShowDetails() {
            super.ShowDetails();
            System.out.println("Redhead ducks fly slow and quack mild.");
        }
    }

    public static void main(String[] args) {
        int i;
        IsShowDetail[] ducks = new IsShowDetail[3];
        ducks[0] = new RubberDuck(1.9, 2, DuckType.RUBBER);
        ducks[1] = new MallardDuck(1.7, 2, DuckType.MALLARD);
        ducks[2] = new RedheadDuck(1.2, 2, DuckType.REDHEAD);
        for (i = 0; i < 3; i++) {
            ducks[i].ShowDetails();
            System.out.println(" ");
        }
    }
}