public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String text = "We are so called \"Vikings\" from the north";
        System.out.println(text);
        System.out.println(text);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.random());
        if(20>21) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("no");
        }
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        myMethod();
        int q = plusMethod(3, 4);
        System.out.println(q);
    }
    static void myMethod(){
        System.out.println("Fake");

    }
    static int plusMethod(int a,int b) {
        return a+b;
    }
}

    
