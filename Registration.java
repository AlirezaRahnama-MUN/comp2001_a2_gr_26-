package assgn_2_group_26;
import java.util.ArrayList;
import javax.swing.Spring;
import java.util.*;

/**
 * Write a description of class Enrollment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Registration
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private int section;
    private int timeSlot;
    private String student;
    private String professor;
    private ArrayList<String> List1;
    private boolean A;

    /**
     * Constructor for objects of class Registration
     */
    public Registration(String courseNumber, int section, int slot, 
                      String student,String professor)
    {
        // initialise instance variables
        courseNumber=courseNumber;
        section=section;
        timeSlot=slot;
        student=student;
        professor=professor;
    }
    
    
    public String getCourseNumber(){
        return courseNumber;
    }
    
    public int getSection(){
        return section;
    }
    
    public int getSlot(){
        return timeSlot;
    }
    
    public boolean verifyCourseNumber(String courseNumber)
    {
        List<String> List1 = new ArrayList<String>();
        Collections.addAll(List1,"COMP 1501", "ENGL 2201", "CHEM 3060", "PHYS 2344", "ENGL 2005", "COMP 2704", "PHYS 2377", "CHEM 4927", "COMP 3444");
        int index=0;
        while(index<List1.size()){
            if(courseNumber.equals(List1.get(index)))
            { 
                A= true;
            
            }else{
                A= false;
            }}
            index++;   
            return A;
        
    }
    
      public boolean verifySection(int section)
    {
        if(section>=0 && section<=2){
        return true;
    }else{
        return false;
    } 
}
    
    public boolean verifySlot (int slot)
    {
        if(slot>=12 && slot<=25){
        A = true;
    }else{
        A=false;
    } 
    return A;
    }

   public void printInfo()
   {
       // print all the information about the enrollment record
       // each field on a new line
   }
    
}
