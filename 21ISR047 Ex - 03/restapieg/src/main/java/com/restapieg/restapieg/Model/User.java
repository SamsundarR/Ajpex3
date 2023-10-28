package com.restapieg.restapieg.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Blog")
public class User {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String carname;
    private String model;
    private int price;
    private String year; 
}