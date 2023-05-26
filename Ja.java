public class Ja{
    public static void main(String[] args) {
        System.out.println("I am a developer");
        int a=10;
        int b=20;
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        //command line in Java
         if(args.length>0){
            System.out.println("Arguments are");
            for(String x:args){
                System.out.println(x+"");
            }
         }else{
            System.out.println("No arguments");
        } 

        System.out.println("Welcome \" Rifat\"");
        System.out.println("Hi \" Shahriar\"");
        System.out.println("C:\\xyz\\abc.txt");
        int x1=3;
        int y1=6;
        System.out.println(x1 & y1);
        name("Abu Al Shahriar Rifat");
        //Types of varibale in Java

    }
    public static void name(String name) {
        System.out.println("My Name is"+name);
    }
}