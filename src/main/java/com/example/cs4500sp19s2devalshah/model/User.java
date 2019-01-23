package com.example.cs4500sp19s2devalshah.model;

public class User {
  private Integer id;
  private String username;
  private String password;
  private String firstName;
  private String lastName;

  // constructor to create User objects
  public User(int i, String alice, String alice1, String alice2, String wonderland) {
  }

  // provide a public set and get method for each of the class variables above
  // make sure to use proper naming conventions for Java methods, e.g.,
  // methods should be camelcase. Here's an example using the firstName variable:
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}

