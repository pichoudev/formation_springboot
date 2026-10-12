package  com.devspring.applearn.service;

import com.devspring.applearn.model.Produit;
import org.springframework.stereotype.Service;
import com.devspring.applearn.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }
}