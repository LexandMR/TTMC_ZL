package Jeu;

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
        //Il faut attribuer le numero de la carte pour avoir une carte
        return carte;
    }
}
