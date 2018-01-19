
public abstract class MedicalProfessional{
    private String name;
        private String regNo;
        private String specialisation;
        
        
        public MedicalProfessional(String nameIn, String regNoIn, String specialisationIn)
        {
            name = nameIn;
            regNo = regNoIn;
            specialisation = specialisationIn;
        }
        
        
        
        //getters()
        
        public String getName()
        {
            
            return name;
            
        }

        public String getRegNo()
        {
            return regNo;
        }
        
        
        public String getSpecialisation()
        {
            return specialisation;
        }
        
        
        
        
        
        
        //setters()
        
        public void setName(String nameIn)
        {
            name = nameIn;
        }
        
        public void setRegNo(String regNoIn)
        {
            regNo = regNoIn;
        }
        
        
        public void setSpecialisation(String specialisationIn)
        {
            specialisation = specialisationIn;
        }
        
        public String printAll()
        {
            String allDetails = " ";
            allDetails = allDetails+ "\nName is: " + getName()+
            "\nRegistration Number is: " + getRegNo()+
            "\nSpecialisation is: " + getSpecialisation();
            return allDetails;
            
            
        }
        //Declaration of abstract method
        public abstract double calculatePay();
        
    }