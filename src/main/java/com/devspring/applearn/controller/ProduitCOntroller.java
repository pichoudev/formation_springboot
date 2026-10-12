package com.devspring.applearn.controller;

import com.devspring.applearn.model.Produit;
import com.devspring.applearn.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produit")
@RequiredArgsConstructor
public class ProduitCOntroller {

    private final ProduitService produitService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

//    recuperer tous les produits de la bd
    @GetMapping("/ll")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

//    creer un nouveau produits
    @PostMapping
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }

}
