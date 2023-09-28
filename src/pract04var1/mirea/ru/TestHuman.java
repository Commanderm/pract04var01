package pract04var1.mirea.ru;

public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        human1.head.setHead(7.5, "блондин");
        human1.legs.setLength(42.58);
        human1.legs.setSize(39.0);
        human1.hands.setLength(45.37);
        human1.hands.setSize(11);
        human2.head.setSize(7.0);
        human2.head.setColor("брюнет");
        human2.legs.setLength(44.62);
        human2.legs.setSize(42.5);
        human2.hands.setLength(47.81);
        human2.hands.setSize(12);

        System.out.println(human1.head);
        System.out.println(human1.legs);
        System.out.println(human1.hands);
        System.out.println(human2.head.getColor());
        System.out.println(human2.legs.getLength());
        System.out.println(human2.hands.getSize());
        System.out.println(human1);
        System.out.println(human2);
    }
}
