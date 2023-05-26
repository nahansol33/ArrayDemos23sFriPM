/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author Hansol
 */
public class Student {
    //commnet added at 1:21pm
    //friday
    //comment added for fetch and merge
    private String sID;
    private String sName;
    private String address;

    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
}
