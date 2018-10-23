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
    public Lecturer(String name, Integer id) 
    {
        this.name = name;
        this.id = id;
    }
 
    @Override
    public void setCoursework(String coursework)
    {
     coursework = "assignment";
    }
    @Override
    public void teach()
    {
        System.out.println(name + " is teaching " + course + " in room " + room);
    }
}
            
    

