package Jeu;

public class Case
{
    private String typeCase;
    private String nomCase;
    private int numCase;
    public Case(String typeCase, String nomCase, int numCase)
    {
        this.typeCase = typeCase;
        this.nomCase = nomCase;
        this.numCase = numCase;
    }
    public String getTypeCase()
    {
        return typeCase;
    }
    public void setTypeCase(String typeCase)
    {
        this.typeCase = typeCase;
    }
    public String getNomCase()
    {
        return nomCase;
    }
    public void setNomCase(String nomCase)
    {
        this.nomCase = nomCase;
    }
    public int getNumCase()
    {
        return numCase;
    }
    public void setNumCase(int numCase)
    {
        this.numCase = numCase;
    }
}
