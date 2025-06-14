package crud.sansboospring.joueur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class JoueurController {
@Autowired
    private JoueurService service;

@GetMapping("/joueur")
    public List<Joueur>getJoueur(){return service.getJoueur();}

    @PostMapping("/joueur/add")
    public void addJoueur(@RequestBody Joueur joueur){ service.addJoueur(joueur);}

    @PutMapping("/joueur/edit/{id}")
    public void updateJoueur(@PathVariable("id") Integer id,@RequestBody Joueur joueur){
    service.updateJoueur(joueur);}

    @DeleteMapping("/joueur/delete/{id}")
    public void deleteJoueur(@PathVariable("id")Integer id){
    service.deleteJoueur(id);}
}
