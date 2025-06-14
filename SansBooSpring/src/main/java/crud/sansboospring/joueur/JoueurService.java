package crud.sansboospring.joueur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurService {
@Autowired
    private JoueurRepository repository;

public List<Joueur> getJoueur(){return repository.findAll();}

    public void addJoueur(Joueur joueur){repository.save(joueur);}

    public void updateJoueur(Joueur joueur){repository.save(joueur);}

    public void deleteJoueur(Integer id){repository.deleteById(id);}
}

