package com.howto.demouser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Auto-generates getters, setters, toString, etc.
@NoArgsConstructor // Auto-generates a no-argument constructor
@AllArgsConstructor // Auto-generates a constructor with all arguments
@Entity // Marks this class as a JPA entity
@Table(name = "books") // Maps this entity to the "books" table in the DB
public class Book {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures auto-increment for the ID
    private long id;

    private String title;
    
    private String author;
}