package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ManejoDeFechas {

  /**Metodo principal.*/
  public static void main(String[] args) {
    // usandoDate();
    //usandoCalendar();
    usandoCalendarioGregoriano();
  }

  private static void usandoCalendarioGregoriano() {
    Calendar calendarGregoriano = new GregorianCalendar();
    int anio = calendarGregoriano.get(Calendar.YEAR);

    System.out.println(anio);
  }

  private static void usandoCalendar() {

    Calendar calendar = Calendar.getInstance();
    int anio = calendar.get(Calendar.YEAR);

    System.out.println(anio);

  }

  private static void usandoDate() {
    Date fecha = new Date();
    int anio = fecha.getYear();
    System.out.println(anio);
  }
}
