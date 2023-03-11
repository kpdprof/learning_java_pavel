package practice;

public class Practice1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 2, "Gav");
        Dog dog2 = new Dog(3,"Gav2");
        Cat cat1 = new Cat("Barsik", 1, "Maw");
        Cat cat2 = new Cat(3, "Maw2");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}

class Dog {
    String name;
    int age;
    String say;

    public Dog(String name, int age, String say) {
        System.out.println(1);

        this.name = name;
        this.age = age;
        this.say = say;
    }
    public Dog(int age, String say) {
        System.out.println(2);

        this.age = age;
        this.say = say;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", say='" + say + '\'' +
                '}';
    }
    public void printInfo() {
        System.out.println(name + " " + age);
    }
}

class Cat {
    String name;
    int age;
    String say;

    public Cat(String name, int age, String say) {
        System.out.println(3);

        this.name = name;
        this.age = age;
        this.say = say;
    }

    public Cat(int age, String say) {
        System.out.println(4);

        this.age = age;
        this.say = say;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", say='" + say + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(name + " " + age);
    }
    
}
