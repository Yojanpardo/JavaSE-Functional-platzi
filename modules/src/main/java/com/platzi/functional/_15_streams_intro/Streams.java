package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    // Los Streams solo se pueden consumir una vez, que gonorrea, una vez usado ya no se puede volver a usar.
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "python", "backend");

        Stream<String> coursesStream = Stream.of("Java", "python", "backend");

        Stream<Integer> coursesLengthStream = coursesStream.map(course -> course.length());

        Optional<Integer > longest = coursesLengthStream.max((x, y) -> y-x);

        Stream<String> emphasisCourse = coursesStream.map((course -> course + "!"));

        Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("java"));

        emphasisCourse.forEach(System.out::println);

        Stream<String> coursesStream2 = cursos.stream();

        coursesStream2.map(course -> course + "!")
                .filter(course -> course.contains("java"))
                .forEach(System.out::println);
    }
}
