package com.example.crisis_app;
import java.util.* ;

public class User
{
    private String username ;
    private String password ;
    private String emailAddress ;
    private int phoneNumber ;
    private String securityQuestion ;


    public User(String username, String password, String emailAddress, int phoneNumber)
    {
        this.username = username ;
        this.password = password ;
        this.emailAddress = emailAddress ;
        this.phoneNumber = phoneNumber ;
    }

    //Ask user for answer to security question OR email address
    public void forgotUsernameQuestion(String securityQuestion)
    {
        //If answer is correct, return username.
    }

    public void forgotUsernameEmail(String emailAddress)
    {
        //If address is correct, return username or send email.
    }

    public void forgotPassword(String userName)
    {
        //If username is correct, return password.
    }

    public void userSignup(String input)
    {
        //Could be User constructor.
    }

    public void userLogin(String user, String password)
    {
        //If user and password match, user has access.
        //User and pass could be stored via Stacks, Lists, etc.
    }

    public boolean userQuestion(String answer)
    {
        // If the answer matches for the user, return true ;
        return true ;
    }

}