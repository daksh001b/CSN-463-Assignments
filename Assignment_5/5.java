
class Myclass {
    final static int x; 
    static {
        x=10;
    }
}
class q5 {
    public static void main(String[] args)
    {
        System.out.println(Myclass.x);// Prints 10
    }
}

