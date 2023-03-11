package lesson1;

public class Homework2 {
    public static void main(String[] args) {
        //Hw1---------------------
        Cat catOne = new Cat();
        Dog dogOne = new Dog(catOne);

        //Hw2--------------------
        Car car = new Car(10, 4);

    }
    //Hw1------------------------
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
        Cat() {
            sayHello();
        }
    }
    public static class Dog {
        public Dog(Cat cat) {
            catchCat();
            sayHello();
        }
        public Dog() {

        }

        public void sayHello() {
            System.out.println("Гав!");
        }
        public void catchCat() {
            System.out.println("Кошка поймана");
        }

    }

    //Hw2-----------------------
    public static class Car {
        static int quantityPassenger;
        static int money;
        public static int countMoney() {
            return quantityPassenger * money;
        }
        Car(int money, int quantityPassenger) {
            this.money = money;
            this.quantityPassenger = quantityPassenger;
            if (quantityPassenger > 4) {
                System.out.println("Пассажиров более 4, не едем.");
            } else {
                System.out.println(Car.countMoney());
            }
        }
    }

    public static class Driver {

    }
    public static class Human {

    }

    
}

// первые конструкторы после полей

//стринг билдер