package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]\"), \"Register");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationText =By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButtonText = By.xpath("//a[contains(text(),'Continue')]");
    By continueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");






    public String  verifyRegisterText(){
        return getTextFromElement(registerText);
    }
    public void enterFirstName(String text){
        sendTextToElement(firstName,text + getAlphaNumericString(5));
    }
    public void enterLastName(String text){
        sendTextToElement(lastName,text + getAlphaNumericString(5));
    }
    public void enterEmail(String text){
        sendTextToElement(emailId,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
        sendTextToElement(confirmPassword, text);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String  verifyRegistrationText(){
        return getTextFromElement(registrationText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButtonText);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }


}
