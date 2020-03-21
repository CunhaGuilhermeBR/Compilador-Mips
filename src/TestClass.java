import data.FileSystem;

import java.io.IOException;

public class TestClass {

 //Essa é uma classe de teste para ver se as saídas das funções estão corretas.
    public static void main(String[] args) throws IOException {
//        int a = 10;
//        a = Compiler.neg(a);
//        System.out.println(a); // Testando o neg
//        Compiler.setT0(1);
//        Compiler.setT1(0);
//        System.out.println(Compiler.and("t0","t1")); // Testando o and
//        Compiler.setT1(1);
//        System.out.println(Compiler.and("t0","t1")); // Testando o or


//        Compiler.setT1(4);
//        Compiler.setT0(23);
//        System.out.println("O compilador t0 tinha o valor de " + Compiler.getT0());
//        Compiler.setT0(Compiler.lw("4(s0)"));
//        System.out.println("O compilador t0 agora tem o valor de " + Compiler.getT0());

        Compiler.setT1(0);
        Compiler.setT0(12);
        Compiler.findOperation();
        System.out.println("O valor é de " + Compiler.getT1());
    }
}
