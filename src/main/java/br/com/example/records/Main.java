package br.com.example.records;

import br.com.example.records.MyRecord.Type;

public class Main {

  public static void main(String[] args) {
    var person = new MyRecord("Luram", "Archanjo", 26, Type.PRIVATE);
    System.out.println(person);
    System.out.println(person.fullName());

  }

}
