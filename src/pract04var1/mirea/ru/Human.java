package pract04var1.mirea.ru;

public class Human {
    class Head {
        private double size = 11.0;
        private String color = "русые";
        public Head () {}
        public Head (double size, String color) {
            this.size = size;
            this.color = color;
        }
        public void setHead (double size, String color) {
            this.size = size;
            this.color = color;
        }
        public String getHead (){
            return size + color;
        }
        public void setSize (double size) {
            this.size = size;
        }
        public double getSize () {
            return size;
        }
        public void setColor (String color){
            this.color = color;
        }
        public String getColor () {
            return color;
        }
        public String toString () {
            return "Голова: размер - " + size + ", цвет волос - " + color;
        }
    }

    class Leg {
        private double length;
        private double size;
        public Leg () {
            this.length = 0;
            this.size = 36.5;
        }
        public Leg (double length, double size) {
            this.length = length;
            this.size = size;
        }
        public void setLength (double length) {
            this.length = length;
        }
        public double getLength () {
            return length;
        }
        public void setSize (double size) {
            this.size = size;
        }
        public double getSize () {
            return size;
        }
        public String toString () {
            return "Ноги: длинна - " + length + ", размер - " + size;
        }
    }
    class Hand {
        private double length;
        private double size;
        public Hand () {
            this.length = 0;
            this.size = 36.5;
        }
        public Hand (double length, double size) {
            this.length = length;
            this.size = size;
        }
        public void setLength (double length) {
            this.length = length;
        }
        public double getLength () {
            return length;
        }
        public void setSize (double size) {
            this.size = size;
        }
        public double getSize () {
            return size;
        }
        public String toString () {
            return "Руки: длинна - " + length + ", размер - " + size;
        }
    }
    Head head = new Head();
    Leg legs = new Leg();
    Hand hands = new Hand();
    public Human () {}
    public Human (Head head, Leg legs, Hand hands) {
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=[" + head.getSize() + " ," + head.getColor() + "]" +
                ", legs=[" + legs.getLength() + " ," + legs.getSize() + "]" +
                ", hands=[" + hands.getLength() + " ," + hands.getSize() + "]" +
                '}';
    }
}
