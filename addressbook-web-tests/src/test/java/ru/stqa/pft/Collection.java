package ru.stqa.pft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Owner on 7/5/2016.
 */
public class Collection {


  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Java", "Pythin", "PHP"};
    List<String> languages = Arrays.asList("Java", "C#", "Java", "Pythin", "PHP");



    for (String l : languages)  {
      System.out.println("Я хочу выучить" + l);

    }
  }

}

