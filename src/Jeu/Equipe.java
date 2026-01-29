package Jeu;
import java.util.*;
public class Equipe {
    private String joueur_1;
    private String joueur_2;
    private String joueur_3;
    private String joueur_4;
    private String nomEquipe;
    private int numEquipe;


    public Equipe(String nomEquipe, int numEquipe) {
        this.nomEquipe = nomEquipe;
        this.numEquipe = numEquipe;
    }

//Geteur/Seteur
    public String getJoueur_1 ()
    {
        return joueur_1;
    }
    public String getJoueur_2 ()
    {
        return joueur_2;
    }
    public String getJoueur_3 ()
    {
        return joueur_3;
    }
    public String getJoueur_4 ()
    {
        return joueur_4;
    }
    public String getNomEquipe ()
    {
        return nomEquipe;
    }
    public int getNumEquipe ()
    {
        return numEquipe;
    }
    public void setJoueur_1 (String joueur_1)
    {
        this.joueur_1 = joueur_1;
    }
    public void setJoueur_2 (String joueur_2)
    {
        this.joueur_2 = joueur_2;
    }
    public void setJoueur_3 (String joueur_3)
    {
        this.joueur_3 = joueur_3;
    }
    public void setJoueur_4 (String joueur_4)
    {
    this.joueur_4 = joueur_4;
    }
    public void setNomEquipe (String nomEquipe)
    {
        this.nomEquipe = nomEquipe;
    }
    public void setNumEquipe ( int numEquipe)
    {
    this.numEquipe = numEquipe;
    }
}