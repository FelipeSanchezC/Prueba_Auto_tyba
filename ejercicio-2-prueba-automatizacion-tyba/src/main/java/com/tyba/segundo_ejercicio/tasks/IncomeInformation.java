package com.tyba.segundo_ejercicio.tasks;

import com.tyba.segundo_ejercicio.interactions.WaitFor;
import com.tyba.segundo_ejercicio.userinterfaces.UserLoginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IncomeInformation implements Task {

    private final String username;
    private final String password;

    public IncomeInformation(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable incomeInformation(String username, String password) {
        return instrumented(IncomeInformation.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitFor.seconds(1),
                WaitUntil.the(UserLoginUserInterfaces.INCOME_USERNAME, isEnabled()).forNoMoreThan(Duration.ofSeconds(4)),
                Enter.keyValues(username).into(UserLoginUserInterfaces.INCOME_USERNAME),
                Enter.keyValues(password).into(UserLoginUserInterfaces.INCOME_PASSWORD),
                Click.on(UserLoginUserInterfaces.SELECT_BUTTON_LOGIN)
        );
    }

}
