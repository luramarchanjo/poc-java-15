package br.com.example.sealed;

/**
 * Could be abstract class or interface
 */
sealed abstract class Shape permits Circle, Rectangle, Square {

  public abstract String type();

}
