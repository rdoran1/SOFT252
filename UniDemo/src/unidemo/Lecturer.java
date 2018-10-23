/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author rdoran1
 */
public class Lecturer extends UniPeople implements ITeach 
{
    public Lecturer() 
    {
        
    }
    
    @Override
    public void teach(){
        
    }
    
//@Override
    //public void setCoursework(Course course){

    @Override
    public void setCourse(Course course) {
        super.setCourse(course); //To change body of generated methods, choose Tools | Templates.
    }
        
}
            
    

