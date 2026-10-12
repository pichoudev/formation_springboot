package com.devspring.applearn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name="produit")
public class Produit {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double price;
}