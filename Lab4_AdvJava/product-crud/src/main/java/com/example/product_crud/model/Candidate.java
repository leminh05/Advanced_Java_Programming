package com.example.product_crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Candidate {

  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank(message = "Name is mandatory")
  @Column(name = "name")
  private String name;

  @NotBlank(message = "Email is mandatory")
  @Column(name = "email")
  private String email;

  @Column(name = "age")
  private Integer age;

  public Candidate() {}
  public Candidate(String name, String email) { this.name = name; this.email = email; }

  public long getId() { return id; }
  public void setId(long id) { this.id = id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public Integer getAge() { return age; }
  public void setAge(Integer age) { this.age = age; }
}
