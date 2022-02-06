package pl.kocan.factory;

public class Main {

    public static void main(String[] args) {
        final Unit tank = new Tank(200, 0, 20);
        final Unit infantryman = new Rifleman(100, 0, 10);

        System.out.println(tank);
        System.out.println(infantryman);
    }

}
