package Jeu;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Plateau
{
    private List<Case> listeCase;
    private List<Equipe> listeEquipe;
    private int nbrCases;
    private int nbrJoueurs;
    private int nbrTour;
    private Carte carteTiree;

    public Plateau()
    {
        listeCase = new ArrayList<Case>();
        listeEquipe = new ArrayList<>();
    }
    public List<Case> getListeCase()
    {
        return listeCase;
    }
    public void setListeCase(List<Case> listeCase)
    {
        this.listeCase = listeCase;
    }
    public List<Equipe> getListeEquipe()
    {
        return listeEquipe;
    }
    public void setListeEquipe(List<Equipe> listeEquipe)
    {
        this.listeEquipe = listeEquipe;
    }
    public int getNbrCases()
    {
        return nbrCases;
    }
    public void setNbrCases(int nbrCases)
    {
        this.nbrCases = nbrCases;
    }
    public int getNbrJoueurs()
    {
        return nbrJoueurs;
    }
    public void setNbrJoueurs(int nbrJoueurs)
    {
        this.nbrJoueurs = nbrJoueurs;
    }
    public Carte getCarteTiree()
    {
        return carteTiree;
    }
    public void setCarteTiree(Carte carteTiree)
    {
        this.carteTiree = carteTiree;
    }
    public int getNbrTour()
    {
        return nbrTour;
    }
    public void setNbrTour(int nbrTour)
    {
        this.nbrTour = nbrTour;
    }
    public void ajouterCase(Case c)
    {
        listeCase.add(c);
    }
    public void ajouterEquipe(Equipe e)
    {
        listeEquipe.add(e);
    }
    public int tirageCarte(int num)
    {
        Random rand = new Random();
        int nbrAlea = rand.nextInt(20);
        return nbrAlea;
        // Retourner une carte et pas un numero de carte plus tard
    }
}
