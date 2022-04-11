package src;

public class MultilevelInheritance {
    int a,b,c;
    void add(){
        a=50; b=200;
        c=a+b;
        System.out.println("Sum of two numbers: "+c);
    }
    void sub(){
        a=70; b=28;
        c=a-b;
        System.out.println("Sub of two numbers: "+c);
    }
}
public class B extends MultilevelInheritance{
    {
        void multi()
        {
            a=80; b=65;
            c=a*b;
            System.out.println("Multiplication of two numbers:"+c);
        }
        void division()
        {
            a=80; b=4;
            c=a/b;
            System.out.println("Division of two numbers:"+c);
        }
    }
   public class C extends B{
        void rem()
        {
            a=80; b=15;
            c=a%b;
            System.out.println("Reminder of two numbers:"+c);
        }

    }
    class Test{
        public static void main(String[] args){
            C r=new C();
            r.add(); r.sub(); r.multi(); r.division(); r.rem();

        }
    }
        }



