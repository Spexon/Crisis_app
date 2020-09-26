package com.example.crisis_app;

public class Student extends User
{
    private String studentId ;

    public Student(String username, String password, String emailAddress, int phoneNumber,
                   String studentId)
    {
        super(username, password, emailAddress, phoneNumber);
        this.studentId = studentId ;
    }


}
