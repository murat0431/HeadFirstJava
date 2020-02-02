package DotComBust;


import java.util.ArrayList;
import java.util.List;

public class Cell {
    public static void main(String[] args) {
        List<Car> myList = new ArrayList<>();
        Ferrari f = new Ferrari(100, "blue");
        Car c = new Car();
        Car a = f;
        myList.add(f);
        myList.add(c);
        myList.add(a);
        Car m = myList.get(0);
        Ferrari n = (Ferrari) myList.get(0);

        List<Ferrari> myList2 = new ArrayList<>();
        myList2.add(f);
        myList2.add(n);
        Car na = myList2.get(0);
        Car nb = myList2.get(1);

        List<Runn> myList3 = new ArrayList<>();
        myList3.add(f);
        myList3.add(n);

        Math.abs(3);
    }
}

class Car {
    int speed;
    int dimension;
    void speedMe() {
        System.out.println(this.getClass() + " speed: " + speed);
    }
}

class Ferrari extends Car implements Runn{
    int maxSpeed;
    String color;

    public Ferrari(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    void colorMe() {
        System.out.println(this.getClass() + " color: " + color);
    }
}

interface Runn{

}