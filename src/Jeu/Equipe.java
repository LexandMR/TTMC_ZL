package Jeu;
import java.util.*;
public class Equipe {
//Attributs
    private List<String> joueurs;
    private String nomEquipe;
    private int numEquipe;
    for (aquals('joueur_'+i))
//Constructeur
    public Equipe(String nomEquipe, int numEquipe) {
        this.nomEquipe = nomEquipe;
        this.numEquipe = numEquipe;
    }

//Geteurs/Seteurs
    public Equipe(String nomEquipe)
    {
        this.nomEquipe = nomEquipe;
    }
    public String getNomEquipe ()
    {
        return nomEquipe;
    }
    public int getNumEquipe ()
    {
        return numEquipe;
    }
    public void setJoueurs(List<String> joueurs) {
        this.joueurs = joueurs;
    }
    public void setNomEquipe (String nomEquipe)
    {
        this.nomEquipe = nomEquipe;
    }
    public void setNumEquipe ( int numEquipe)
    {
    this.numEquipe = numEquipe;
    }

    public void ajouterJoueur(String joueur)
    {
        joueurs.add(joueur);
    }
    public void supprimerJoueur(String joueur)
    {
        joueurs.remove(joueur);
    }
}