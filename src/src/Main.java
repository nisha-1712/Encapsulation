package src;

public class Main {
    int roll,marks;
    String name;
    public static void main(String[] args) {

        public void m1() {
            System.out.println("Enter roll,name,Marks");
        }
        class Inheritance extends Main{
            void m2()
            {
                roll=1; name="Jenny"; marks=58;
                System.out.println(roll+" "+name+" "+marks);
            }
            public static void main(String[]args){
                Inheritance obj=new Inheritance();
            }
        }

    }
}
