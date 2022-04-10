package src;

public class Encapsulation {
        private int value;//data hiding

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        static class A{

        }
        public static void main(String[] args) {

            src.Encapsulation r= new src.Encapsulation();
            r.value=50;
            System.out.println(r.value);
        }
    }



