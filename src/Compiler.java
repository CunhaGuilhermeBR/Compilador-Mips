import data.FileSystem;

public class Compiler {

    private static int t0,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private static int s0,s1,s2,s3,s4,s5,s6,s7;
    private static final int zero = 0;
    private static int v0,v1;
    private static int a0,a1,a2,a3;

    public static int getT0() { return t0; }

    public static void setT0(int t0) { Compiler.t0 = t0; }

    public static int getT1() { return t1; }

    public static void setT1(int t1) { Compiler.t1 = t1; }

    public static int getT2() { return t2; }

    public static void setT2(int t2) { Compiler.t2 = t2; }

    public static int getT3() { return t3; }

    public static void setT3(int t3) { Compiler.t3 = t3; }

    public static int getT4() { return t4; }

    public static void setT4(int t4) { Compiler.t4 = t4; }

    public static int getT5() { return t5; }

    public static void setT5(int t5) { Compiler.t5 = t5; }

    public static int getT6() { return t6; }

    public static void setT6(int t6) { Compiler.t6 = t6; }

    public static int getT7() { return t7; }

    public static void setT7(int t7) { Compiler.t7 = t7; }

    public static int getT8() { return t8; }

    public static void setT8(int t8) { Compiler.t8 = t8; }

    public static int getT9() { return t9; }

    public static void setT9(int t9) { Compiler.t9 = t9; }

    public static int getS0() { return s0; }

    public static void setS0(int s0) { Compiler.s0 = s0; }

    public static int getS1() { return s1; }

    public static void setS1(int s1) { Compiler.s1 = s1; }

    public static int getS2() { return s2; }

    public static void setS2(int s2) { Compiler.s2 = s2; }

    public static int getS3() { return s3; }

    public static void setS3(int s3) { Compiler.s3 = s3; }

    public static int getS4() { return s4; }

    public static void setS4(int s4) { Compiler.s4 = s4; }

    public static int getS5() { return s5; }

    public static void setS5(int s5) { Compiler.s5 = s5; }

    public static int getS6() { return s6; }

    public static void setS6(int s6) { Compiler.s6 = s6; }

    public static int getS7() { return s7; }

    public static void setS7(int s7) { Compiler.s7 = s7; }

    public static int getZero() { return zero; }

    public static int getV0() { return v0; }

    public static void setV0(int v0) { Compiler.v0 = v0; }

    public static int getV1() { return v1; }

    public static void setV1(int v1) { Compiler.v1 = v1; }

    public static int getA0() { return a0; }

    public static void setA0(int a0) { Compiler.a0 = a0; }

    public static int getA1() { return a1; }

    public static void setA1(int a1) { Compiler.a1 = a1; }

    public static int getA2() { return a2; }

    public static void setA2(int a2) { Compiler.a2 = a2; }

    public static int getA3() { return a3; }

    public static void setA3(int a3) { Compiler.a3 = a3; }

    public static int neg(int num){
        return num - (num*2);
    }

    public static int slt(String regs1, String regs2){
        return (findValue(regs1) < findValue(regs2))? 1 : 0;
    }

    public static int slti(String regs, int cons){
        return (findValue(regs) < cons)? 1 : 0;
    }

    public static int xor(String regs1, String regs2){
        return (findValue(regs1) != findValue(regs2))? 1 : 0;
    }

    public static int and(String regs1, String regs2){
        if (findValue(regs1) == 1 && findValue(regs2) == 1)
            return 1;
        else
            return 0;
    }

    public static int andi(String regs1, int cons){
        if (findValue(regs1) == 1 && cons == 1)
            return 1;
        else
            return 0;
    }

    public static int or(String regs1, String regs2){
        if (findValue(regs1)  == 1  || findValue(regs2) ==1)
            return 1;
        else
            return 0;
    }

    public static int ori(String regs1, int cons){
        if (findValue(regs1)  == 1  || cons ==1)
            return 1;
        else
            return 0;
    }

//    public static int nor (String regs1, String regs2){
//        return (- (findValue(regs1) ==  findValue(regs2)))? 1 : 0;
//    }

    private static int findValue(String name){
            switch (name){
                case "t0": return getT0();

                case "t1": return getT1();

                case "t2": return getT2();

                case "t3": return getT3();

                case "t4": return getT4();

                case "t5": return getT5();

                case "t6": return getT6();

                case "t7": return getT7();

                case "t8": return getT8();

                case "t9": return getT9();

                case "s0": return getS0();

                case "s1": return getS1();

                case "s2": return getS2();

                case "s3": return getS3();

                case "s4": return getS4();

                case "s5": return getS5();

                case "s6": return getS6();

                case "s7": return getS7();

                case "zero": return getZero();

                case "v0": return getV0();

                case "v1": return getV1();

                case "a0": return getA0();

                case "a1": return getA1();

                case "a2": return getA2();

                case "a3": return getA3();
            }
        System.err.println("Entrada inválida");
        return 0;
    }
}
