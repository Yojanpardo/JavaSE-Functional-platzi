package com.platzi.functional._12_currying;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String> names = getNames();
        if(names != null){
            // operar con nombres.
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()){
            // aqui va esa lógica pero no es diferente a lo de arriba entonces que bobada
        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
//        optionalNames.flatMap();
//        optionalNames.map();
        Optional<String> valuablePlayer = optionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(()->"No Player");
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        // return "";
        return null;
    }

    static int mostExpensivePlayer() {
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        // se obtiene la data con nuestros métodos chidos
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlayer(){
        //
        //return Optional.ofNullable();
        try{
            //access
            return Optional.of("Yo");
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return Optional.empty();
    }


}
