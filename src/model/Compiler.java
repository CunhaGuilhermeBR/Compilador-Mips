package model;

import data.FileSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Compiler {

    private static int t0,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private static int s0,s1,s2,s3,s4,s5,s6,s7;
    private static final int zero = 0;
    private static int v0,v1;
    private static int a0,a1,a2,a3;
    private static ArrayList<String> resultados = new ArrayList<String>();

    public static ArrayList<String> getResultados() { return resultados; }

    public static void setResultados(ArrayList<String> resultados) { Compiler.resultados = resultados; }

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
    public static void esvaziar(){
        Collection<String> objects = Collections.singleton("");
        resultados.retainAll(objects);
        setT0(0);
        setT1(0);
        setT2(0);
        setT3(0);
        setT4(0);
        setT5(0);
        setT6(0);
        setT7(0);
        setT8(0);
        setT9(0);
        setS0(0);
        setS2(0);
        setS3(0);
        setS4(0);
        setS5(0);
        setS6(0);
        setS7(0);
        setA0(0);
        setA1(0);
        setA2(0);
        setA3(0);
        setV0(0);
        setV1(0);
    }

    public static int neg(int num){
    	if ( num > 0) {
    		return num - (num*2);
    	}
    	else {
    		String str = String.valueOf(num);
    		return Integer.parseInt(str.substring(1));
    	}
        
    }

    public static int slt(String regs1, String regs2){
        return (findValue(regs1) < findValue(regs2))? 1 : 0;
        // Se o valor salvo no registrador 1 for menor do que o registrador 2 ele retorna 1
    }

    public static int slti(String regs, int cons){
        return (findValue(regs) < cons)? 1 : 0;
        // Se o valor salvo no registrador 1 for menor do que a constante ele retorna 1
    }

    public static int xor(String regs1, String regs2){
        return (findValue(regs1) != findValue(regs2))? 1 : 0;
        // Simula a porta lógica xor, onde retorna 1 se os valores forem diferentes
    }

    public static int and(String regs1, String regs2){
        return  (findValue(regs1) == 1 && findValue(regs2) == 1) ? 1 : 0;
        // Simula a porta and, onde se os dois valores forem 1 retorna 1.
    }

    public static int andi(String regs1, int cons){
        return (findValue(regs1) == 1 && cons == 1)? 1 : 0 ;
        // Simula a porta and, onde se os dois valores forem 1 retorna 1.É imediato por possuir um registrador e uma constante
    }

    public static int or(String regs1, String regs2){
        return  (findValue(regs1)  == 1  || findValue(regs2) ==1) ? 1 : 0 ;
        // Simula a porta or, onde se algum dos valores for 1 retorna 1.

    }

    public static int ori(String regs1, int cons){
        return  (findValue(regs1)  == 1  || cons ==1) ? 1 : 0;
        // Simula a porta or, onde se algum dos valores for 1 retorna 1. É imediato por possuir um registrador e uma constante
    }

    public static int nor (String regs1, String regs2){
        return ((findValue(regs1) ==  findValue(regs2)))? 1 : 0;
    }

    public static int add(String regs1, String regs2) {
        return findValue(regs1) + findValue(regs2); // Retorna a soma dos valores carregados nos registradores
    }

    public static int addi(String regs, int cons) {
        return findValue(regs) + cons; // Retorna a soma dos valores carregado no registrador e a constante
    }

    public static int sub(String regs1, String regs2) {
        return findValue(regs1) - findValue(regs2); // Retorna a subtração dos valores carregados nos registradores
    }

    public static int div(String regs1, String regs2) {
        return findValue(regs1) / findValue(regs2); // Retorna a divisão dos valores carregados nos registradores
    }

    public static int mul(String regs1, String regs2) {
        return findValue(regs1) * findValue(regs2); // Retorna a multiplicação dos valores carregados nos registradores
    }

    public static void nop(){}

    public static int lw(String pos) throws IOException {
       return Integer.parseInt(FileSystem.acess("valores.txt", splitString(pos))); // Pega o valor na posição
    }

    public static void sw(String regs, String pos) throws IOException{
          FileSystem.writeWord("valores.txt", splitString(pos), findValue(regs)); // Salva o valor na posição
    }

    private static int splitString(String pos){
        int posicao =0;
        String[] posQuebrada = pos.split(""); // Separa a String char por char
        for(int i =0; i < posQuebrada.length; i++){
            if (posQuebrada[i].equals("(")) // Verifica em que posição tem o char = "("
                posicao = i;                // Salva essa posição
        }
        int cons = Integer.parseInt(pos.substring(0,posicao)); // Pega a parte inicial, baseado na posição da (
        String inside = pos.substring(posicao +1, pos.length() -1); // Pega o que tem dentro das aspas
        if (inside.equalsIgnoreCase("zero"))      // Verifica se é o registrador base
            return cons;
        else
            return cons + findValue(inside);    // Retorna a soma dos valores
    }

    public static String findOperation() throws IOException {
        String resolucao = "";
        String line = "";

        FileReader fi = new FileReader("codigo.txt");
        BufferedReader reader = new BufferedReader(fi);
        line = reader.readLine();  // Lê a primeira linha
        while (line != null) {  // Lê e faz enquanto linha não for nula
            String[] posQuebrada = line.split(" " );
            String oper = posQuebrada[0]; // Pega a primeira posição, que representa a operação

            switch (oper){  // Faz um switch e baseado na operação ele faz alguma coisa
                case "lw": String regs = posQuebrada[1].substring(1,3);
                int tam = posQuebrada[1].length();
                String pos = posQuebrada[1].substring(4,tam) + posQuebrada[2];
                register(regs, lw(pos));
                resolucao += posQuebrada[0] +  " " + posQuebrada [1] + " " + posQuebrada[2] + "   ";
                 break;

                case "sw":  regs = posQuebrada[1].substring(1,3);
                     tam = posQuebrada[1].length();
                     pos = posQuebrada[1].substring(4,tam) + posQuebrada[2];
                    resolucao += posQuebrada[0] +  " " + posQuebrada [1] + " " + posQuebrada[2] + "   ";
                    sw(regs,pos);
                    break;

                case "neg":
                    int resultado = neg(findValue(posQuebrada[2]));
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] + " " +posQuebrada[1] +  " " + posQuebrada[2] + "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "add":
                    register(posQuebrada[0], add(posQuebrada[2],posQuebrada[3]));
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3] + "   \n";
                    resultados.add(String.valueOf(add(posQuebrada[2],posQuebrada[3])));
                    break;

                case "addi":
                    resultado = addi(posQuebrada[2], Integer.parseInt(posQuebrada[3]));
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "sub":
                    resultado = sub(posQuebrada[2], posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "mul":
                    resultado = mul(posQuebrada[2], posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "div":
                    resultado = div(posQuebrada[2], posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "and":
                    resultado = and(posQuebrada[2],posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "andi":
                    resultado =  andi(posQuebrada[2],Integer.parseInt(posQuebrada[3]));
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "or":
                    resultado = or(posQuebrada[2],posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "ori":
                    resultado =  ori(posQuebrada[2],Integer.parseInt(posQuebrada[3]));
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "xor":
                    resultado = xor(posQuebrada[2],posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "nor":
                    resultado = nor(posQuebrada[2],posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "slt":
                    resultado = slt(posQuebrada[2],posQuebrada[3]);
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "slti":
                    resultado =  slti(posQuebrada[2],Integer.parseInt(posQuebrada[3]));
                    register(posQuebrada[1], resultado);
                    resolucao += posQuebrada[0] +" " + posQuebrada[1] +" " +posQuebrada[2] + " " +posQuebrada[3]+ "   \n";
                    resultados.add(String.valueOf(resultado));
                    break;

                case "nop":
                    nop();
                    resolucao+= "nop";
                    break;
            }
            line = reader.readLine();
        }
    return resolucao;
    }

    private static int findValue(String name){    // Função para pegar os valores salvos nos registradores
        if( name.startsWith("[")){                // Retira o [ na String
            name = name.substring(1,name.length());
        }
        if (name.endsWith("]")){                  // Retira a ] na String
            name = name.substring(0, name.length()-1);
        }
        if( name.startsWith("$")){                // Retira o $ na String
            name = name.substring(1,name.length());
        }
        if (name.endsWith(",")){                  // Retira a , na String
            name = name.substring(0, name.length()-1);
        }
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
        System.err.println("Entrada inválida na recuperação de valor" );
        return -1;
    }


    private static void register(String name, int value){  // Salva os valores nos registradores
        if( name.startsWith("[")){                // Retira o [ na String
            name = name.substring(1,name.length());
        }
        if (name.endsWith("]")){                  // Retira a ] na String
            name = name.substring(0, name.length()-1);
        }
        if( name.startsWith("$")){                         // Retira o $ da String
            name = name.substring(1,name.length());
        }
        if (name.endsWith(",")){                          // Retira a , na String
            name = name.substring(0, name.length()-1);
        }
        switch (name){
            case "t0": setT0(value);
            break;

            case "t1":  setT1(value);
            break;

            case "t2":  setT2(value);
            break;

            case "t3":  setT3(value);
            break;

            case "t4":  setT4(value);
            break;

            case "t5":  setT5(value);
                break;

            case "t6":  setT6(value);
                break;

            case "t7":  setT7(value);
                break;

            case "t8":  setT8(value);
                break;

            case "t9":  setT9(value);
                break;

            case "s0":  setS0(value);
                break;

            case "s1":  setS1(value);
                break;

            case "s2":  setS2(value);
                break;

            case "s3":  setS3(value);
                break;

            case "s4":  setS4(value);
                break;

            case "s5":  setS5(value);
                break;

            case "s6":  setS6(value);
                break;

            case "s7":  setS7(value);
                break;

            case "v0":  setV0(value);
                break;

            case "v1":  setV1(value);
                break;

            case "a0":  setA0(value);
                break;

            case "a1":  setA1(value);
                break;

            case "a2":  setA2(value);
                break;

            case "a3":  setA3(value);
                break;

                default: System.err.println("Entrada inválida no registro");
                break;
        }
    }
}
