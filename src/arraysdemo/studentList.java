/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author Hansol
 */
public class studentList {
    public static void main(String []arg){
        Student s1 = new Student("s1", "HAnsol");
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student("s2", "Hola");
        studentList[2] = new Student("s3", "POP");
        for (Student i:studentList){
            System.out.println(i.getsName());
        }
    }
}
