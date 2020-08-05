package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;

public class Inferencia {
    public static void main(String[] args) {

        List<String> alumnos = NombresUtils.getList("hugo", "Paco", "Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println);

    }
}
