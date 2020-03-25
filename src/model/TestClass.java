package model;

import model.Compiler;

import java.io.IOException;

public class TestClass {

 //Essa é uma classe de teste para ver se as saídas das funções estão corretas.
    public static void main(String[] args) throws IOException {
//        int a = 10;
//        a = model.Compiler.neg(a);
//        System.out.println(a); // Testando o neg
//        model.Compiler.setT0(1);
//        model.Compiler.setT1(0);
//        System.out.println(model.Compiler.and("t0","t1")); // Testando o and
//        model.Compiler.setT1(1);
//        System.out.println(model.Compiler.and("t0","t1")); // Testando o or

//        model.Compiler.setT1(4);
//        model.Compiler.setT0(23);
//        System.out.println("O compilador t0 tinha o valor de " + model.Compiler.getT0());
//        model.Compiler.setT0(model.Compiler.lw("4(s0)"));
//        System.out.println("O compilador t0 agora tem o valor de " + model.Compiler.getT0());

        Compiler.setT0(0);
        Compiler.setT1(1);
        Compiler.findOperation();
        System.out.println("O valor é de " + Compiler.getT0());
    }
}
