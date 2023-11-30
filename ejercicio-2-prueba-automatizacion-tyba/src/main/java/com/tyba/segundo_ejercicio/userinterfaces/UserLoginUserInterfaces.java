package com.tyba.segundo_ejercicio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserLoginUserInterfaces {

    private UserLoginUserInterfaces(){}

    public static final Target INCOME_USERNAME = Target.the("El usuario ingresa el nombre de usuario").
            located(By.id("user-name"));

    public static final Target INCOME_PASSWORD = Target.the("El usuario ingresa la contraseña").
            located(By.id("password"));

    public static final Target SELECT_BUTTON_LOGIN = Target.the("El usuario hace click en Login").
            located(By.id("login-button"));

    public static final Target VALIDATE_SUCCESSFUL_LOGIN = Target.the("El usuario valida el inicio de sesion exitoso").
            located(By.id("react-burger-menu-btn"));

    public static final Target VALIDATE_FAILED_LOGIN = Target.the("El usuario valida un error al iniciar sesion").
            located(By.xpath("//*[@class= 'error-message-container error']"));

}
