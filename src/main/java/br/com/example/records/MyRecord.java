package br.com.example.records;

record MyRecord(String name, String surname, Integer age, Type type) {

  // Implicitly declared fields
  // private final String name;
  // private final String surname;
  // private final Integer age;

  // Implicitly constructor
  // public MyRecord(String name, String surname, Integer age) {
  //    this.name = name;
  //    this.surname = surname;
  //    this.age = age;
  //  }

  /**
   * The canonical constructor may be declared explicitly with a list of formal parameters which
   * match the record header, as shown above, or it may be declared in a more compact form that
   * helps the developer focus on validating and normalizing parameters without the tedious work of
   * assigning parameters to fields.
   */
  MyRecord {
    if (name == null) {
      throw new IllegalArgumentException("Name field can not be null");
    }

    if (surname == null) {
      throw new IllegalArgumentException("Surname field can not be null");
    }

    if (age <= 0) {
      throw new IllegalArgumentException("Age field must be positive");
    }
  }

  public String fullName() {
    return String.format("%s %s", name(), age());
  }

  /**
   * Local enum
   */
  public enum Type {
    PUBLIC,
    PRIVATE
  }

}