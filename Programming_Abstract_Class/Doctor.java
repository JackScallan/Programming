public abstract class Doctor extends MedicalProfessional{
        private int wardNo;
        private char oncall;
        private int numOfYearsExp;
        
        
        
        public Doctor(String nameIn, String regNoIn, String specialisationIn, int wardNoIn, char oncallIn, int numOfYearsExpIn)
        {
            super(nameIn, regNoIn, specialisationIn);
            wardNo = wardNoIn;
            oncall = oncallIn;
            numOfYearsExp = numOfYearsExpIn;
        }
        
        
        //getters()
        public int getWardNo()
        {
            return wardNo;
        }
        
        public char getOncall()
        {
            return oncall;
        }
        
        public int getNumOfYearsExp()
        {
            return numOfYearsExp;
        }
        
        
        
        //setters()
        
        public void setWardNo(int wardNoIn)
        {
            wardNo = wardNoIn;
            
            
        }
        
        public void setOnCall(char oncallIn)
        {
            oncall = oncallIn;
        }
        
        
        public void setNumOfYearsExp(int numOfYearsExpIn)
        {
            numOfYearsExp = numOfYearsExpIn;
            
            
            
        }
        public String printAll()
        {
            String allDetails = " ";
            allDetails = allDetails+ super.printAll()+
            "\nWard No is: " + getWardNo()+
            "\nOn Call: " + getOncall()+
            "\nNumber of years experience: "+getNumOfYearsExp();
            return allDetails;
        }
        
        public abstract double calculatePay();
       
        }     
        