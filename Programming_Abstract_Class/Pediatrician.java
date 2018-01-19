
public class Pediatrician extends Doctor{

    private String hospital;
    
    
    public Pediatrician(String nameIn, String regNoIn, String specialisationIn, int wardNoIn, char oncallIn, int numOfYearsExpIn, String hospitalIn)
{
   super(nameIn, regNoIn, specialisationIn, wardNoIn, oncallIn, numOfYearsExpIn);
   hospital = hospitalIn;
}

//getter()
public String getHospital()
{
    return hospital;

}
//setter()
public void setHospital(String hospitalIn)
{
    hospital = hospitalIn;
}

 //abstract method implemented
        public double calculatePay()
        {
          return 90000;  
            
        }

  public String printAll()
        {
            String allDetails = " ";
            allDetails = allDetails+ super.printAll()+
            "\nHospital: " + getHospital()+ "\nWages: "+calculatePay();
            return allDetails;
        }
}