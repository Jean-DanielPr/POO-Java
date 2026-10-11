package br.com.daniel.maraonajava.classesutilitarias.datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,42);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println("Hora: "+time.getHour());
        System.out.println("Minutos: "+time.getMinute());
        System.out.println("Segundos: " +time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
