/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examing;

/**
 *
 * @author Faiza Satt
 */
public class StudentController {
    Student[] studentArray;
    int count,size;
    
    public StudentController(int size){
        studentArray=new Student[size];
        count=0;
        this.size=size;
    }
    
    public void addStudent(String name, int id, String post){
        if(count==size){
            System.out.println("the array is empty.");
        }
        else{
            Student e=new Student(name,post,id);
            studentArray[count]=e;
            count++;
            System.out.println("added");
        }
    }
    
    public void deleteStudent(int id){
        for(int i=0;i<count;i++){
            if(studentArray[i].getID()==id){
                //deleting by shifting the spaces
                
                for(int index=i;index<count;index++){
                    studentArray[index]=studentArray[index+1];
                }
                System.out.println("The Employee with id : "+id+" is removed");
                count--;
            }
        }
    }
    
    public Object[] printStudent(int i){
        Object[] array=new Object[]{studentArray[i].getID(),studentArray[i].getName(),studentArray[i].getDepartment()};
        return array;
    }
    
    public void updateStudent(int id,String newName, String newPost){
        int flag=0;
        for(int i=0;i<count;i++){
            if(studentArray[i].getID()==id){
                studentArray[i].setName(newName);
                studentArray[i].setDepartment(newPost);
                System.out.println("Values are updated");
                System.out.println("the id "+id+" has updated name "+studentArray[i].getName()+" and updated department as "+studentArray[i].getDepartment() );
                flag=1;
            }
            else{
                 flag=0;
            }
        }
        
        if(flag==0){
            System.out.println("The Id You Provided isn't Availble in our Database. Sorry");
        }
        
    }
}
