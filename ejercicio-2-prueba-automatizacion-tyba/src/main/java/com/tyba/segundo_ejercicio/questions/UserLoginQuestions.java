package com.tyba.segundo_ejercicio.questions;

import com.tyba.segundo_ejercicio.userinterfaces.UserLoginUserInterfaces;
import net.serenitybdd.screenplay.Question;

public class UserLoginQuestions {

    private UserLoginQuestions(){}

    public static Question<Boolean> successfulLogin(){
        return actor -> UserLoginUserInterfaces.VALIDATE_SUCCESSFUL_LOGIN.resolveFor(actor).isEnabled();
    }

    public static Question<Boolean> failedLogin(){
        return actor -> UserLoginUserInterfaces.VALIDATE_FAILED_LOGIN.resolveFor(actor).isEnabled();
    }

}
