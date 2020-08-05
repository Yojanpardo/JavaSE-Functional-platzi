package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x ->{
            System.out.println("Multiplicando x: " + x + " por 3");
            return x * 3;
        };

        Function<Integer, Integer> add1MultiplyBy3 = multiplyBy3.compose(y->{
            System.out.println("le agregaré 1 a: " + y);
            return y + 1;
        });

        Function<Integer, Integer> addSquare =
                add1MultiplyBy3.andThen(z -> {
                    System.out.println("elevando " + z + " al cuadrado");
                    return z * z;
                });
        System.out.println(addSquare.apply(5 ));
    }
}
