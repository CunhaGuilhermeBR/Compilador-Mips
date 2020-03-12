public class Main {


    public static void main(String[] args){
        int a = 10;
        a = Compiler.neg(a);
        System.out.println(a);
        Compiler.setT0(10);
        Compiler.setT1(11);
        System.out.println(Compiler.slt("t0","t1"));
    }
}
