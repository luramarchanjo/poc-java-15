package br.com.example.sealed;

// Should be final or sealed class
final class Square extends Shape {

  @Override
  public String type() {
    return this.getClass().getSimpleName();
  }

}
