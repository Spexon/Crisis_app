package com.example.crisis_app;
import java.util.* ;
public class Faculty extends User
{
    private String facultyId ;
    private String[] facultyList = { "00053B", "00373A", "00342W", "77ABN0"} ;

    public Faculty(String username, String password, String emailAddress, int phoneNumber,
                   String facultyId)
    {
        super(username, password, emailAddress, phoneNumber);
        this.facultyId = facultyId ;
    }




}
