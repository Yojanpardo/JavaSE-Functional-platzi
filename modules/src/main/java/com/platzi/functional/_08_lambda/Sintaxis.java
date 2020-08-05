package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("python", "java", "go");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);
        usarPredicado(text -> text.isEmpty());
        usarBifunction((x, y) -> x * y);
        usarBifunction((x,y) -> {
            System.out.println("X: " + x + ", Y: " + y);
            return y-x;
        });

        usarNada(()->{
            System.out.println("cualquier operacion");
        });

        // Las function solo trabajan sobre objetos y no sobre tipos de datos primitivos
        usarBifunction((Integer x, Integer y) -> x * y);
    }

    static void usarNada(OperarNada operarNada){

    }

    static void usarZero(ZeroArguments zeroArguments){

    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarBifunction(BiFunction<Integer, Integer, Integer> operacion){

    }

    @FunctionalInterface
    interface  ZeroArguments {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}
