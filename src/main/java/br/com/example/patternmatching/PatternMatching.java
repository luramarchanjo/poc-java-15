package br.com.example.patternmatching;

public class PatternMatching {

  public static void main(String[] args) {
    var name = "Luram Archanjo";
    String nullRefence = null;

    if (name instanceof String castedReference && castedReference.equals("Luram Archanjo")) {
      System.out.println(castedReference);
    }

    /**
     * There are no changes to how instanceof works when the target is null.
     * That is, the pattern will only match, and castedRerence will only be assigned, if obj is not null.
     */
    if (nullRefence instanceof String castedRerence) {
      System.out.println(castedRerence);
    } else {
      System.out.println("It is null reference");
    }
  }

}
