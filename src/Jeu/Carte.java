package Jeu;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Carte
{
    private int numeroCarte;
    private int numeroQuestion;
    private String nomCategorie;
    private String nomSujet;
    private String Question;
    private String Reponse;

    public int getNumeroCarte()
    {
        return numeroCarte;
    }
    public void setNumeroCarte(int numeroCarte)
    {
        this.numeroCarte = numeroCarte;
    }
    public int getNumeroQuestion()
    {
        return numeroQuestion;
    }
    public void setNumeroQuestion(int numeroQuestion)
    {
        this.numeroQuestion = numeroQuestion;
    }
    public String getNomCategorie()
    {
        return nomCategorie;
    }
    public void setNomCategorie(String nomCategorie)
    {
        this.nomCategorie = nomCategorie;
    }
    public String getNomSujet()
    {
        return nomSujet;
    }
    public void setNomSujet(String nomSujet)
    {
        this.nomSujet = nomSujet;
    }
    public String getQuestion()
    {
        return Question;
    }
    public void setQuestion(String question)
    {
        Question = question;
    }
    public String getReponse()
    {
        return Reponse;
    }
    public void setReponse(String reponse)
    {
        Reponse = reponse;
    }

    public Carte creationCarte()
    {
        Carte carte = new Carte();
        numeroCarte = carte.getNumeroCarte();
        // ça permet de lire un fichier et une ligne particulière (br.readline)
        // try/catch c'est la gestion d'erreur
        try (BufferedReader br = new BufferedReader(new FileReader("filename.txt")))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file.");
        }
        return carte;
    }
}
