public class MixedLists
{

    public static void main(String args[])
    {
        //Declaration of object list to hold 2 MedicalProfessional objects
        MedicalProfessional [] MedList = new MedicalProfessional[2];
    
       //Variable declarations
        String name;        
        String regNo;
        String specialisation;
        String rank;
        int lengthQualified, wardNo, numYearsExp;
        char oncall;
        
        ////////////////////////////////////////////////////////////////////
        //Taking in values for a Paedriticain
        /////////////////////////////////////
        
        //Medical Professional data
        System.out.print("\nEnter name: ");
        name = EasyScanner.nextString();
        
        System.out.print("\nEnter registration number: " );
        regNo = EasyScanner.nextString();
        
        System.out.print("\nEnter specialisation: ");
        specialisation = EasyScanner.nextString();
        
        //Doctor data
        System.out.print("\nEnter the doctors ward No: ");
        wardNo = EasyScanner.nextInt();
        
        System.out.print("\nEnter whether doctor on call y/n: ");
        oncall =EasyScanner.nextChar();
       
        System.out.print("\nEnter number of years experience: ");
        numYearsExp = EasyScanner.nextInt();
        //Paedriticain data
        System.out.print("\nEnter hospital name: ");
        String hospital = EasyScanner. nextString();
        //Creating a Doctor instance from the MedicalProfessional class
        MedList[0] = new Pediatrician(name,regNo,specialisation, wardNo, oncall,numYearsExp, hospital);
        //Printing out details for the item pointed to at position 0 in the MedList array. 
        System.out.println(MedList[0].printAll());
        
        System.out.println("\n");
        
     /////////////////////////////////////////////////////////////////   
        //Taking in values for a Nurse
        ////////////////////////////////
        
         //Medical Professional data
        System.out.print("\nEnter name: ");
        name = EasyScanner.nextString();
        
        System.out.print("\nEnter registration number: " );
        regNo = EasyScanner.nextString();
        
        System.out.print("\nEnter specialisation: ");
        specialisation = EasyScanner.nextString();
        //Nurse Data
        System.out.print("\nEnter nurses rank: ");
        rank = EasyScanner.nextString();
        
        System.out.print("\nEnter length Nurse qualified: ");
        lengthQualified = EasyScanner.nextInt();
        
         //Creating a Nurse instance
        MedList[1] = new Nurse(name, regNo,specialisation, rank, lengthQualified);
         //Printing out details for the item pointed to at position 1 in the MedList array. 
        System.out.println(MedList[1].printAll());
        
        
      ////////////////////////////Printing out all details in MedList array/////////////////////
        
        
      int i;
        
       System.out.println("\n\nDetails for all Medical Professionals in the System\n"); 
       for(i = 0; i<MedList.length;i++)
       {
           System.out.println(MedList[i].printAll());
       }
       
    }
}
    

