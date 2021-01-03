package br.com.example.sealed;

public class Main {

  public static void main(String[] args) {
    var circle = new Circle();
    var square = new Square();
    var rectangle = new Rectangle();

    System.out.println(circle.type());
    System.out.println(square.type());
    System.out.println(rectangle.type());
  }

}
