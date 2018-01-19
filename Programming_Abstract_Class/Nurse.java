
public class Nurse extends MedicalProfessional{

private String rank;
private int lengthQualified;

public Nurse(String nameIn, String regNoIn, String specialisationIn, String rankIn, int lengthQualifiedIn)
{

    super(nameIn, regNoIn,specialisationIn);
    rank = rankIn;
    lengthQualified = lengthQualifiedIn;
    
}

    //getters()
    public String getRank()
    {
        return rank;
    }
    
    
    public int getLengthQualified()
    {
        return lengthQualified;
    }
    
    //setters()
    
    public void setRank(String rankIn)
    {
        rank = rankIn;
        
    }
    
    public void setLengthQualified(int lengthQualifiedIn)
    {
        lengthQualified = lengthQualifiedIn;
        
        
    }
    public String printAll()
    {
        String allDetails = " ";
        allDetails = allDetails +super.printAll()+
        "\nRank is: " + getRank()+
        "\nLength Qualified: " + getLengthQualified()
        +"\nWages are: "+calculatePay();
        return allDetails;
    }
    //abstract method implemented
    public double calculatePay()
    {
        return 40000;
    }
    
    
}