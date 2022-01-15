package org.example;

import org.openqa.selenium.By;


public class RegistrationPage extends Utils //create class and inherit utils
{

    LoadProp loadProp=new LoadProp();
     By firstName=By.xpath("//input[@id='FirstName']");

     By lastName=By.xpath("//input[@name='LastName']");

     By day=By.name("DateOfBirthDay");
     By month=By.name("DateOfBirthMonth");
     By year=By.name("DateOfBirthYear");
    // String emailText="krishnasanghani0+" +currentTimeStamp()+ "@gmail.com";
    By email1=By.name("Email");


     By newsLetter=By.id("Newsletter");

     By passWord=By.id("Password");

     By registerButton=By.name("register-button");
     By confirmPassword=By.id("ConfirmPassword");



   public void registrationDetails() // create method for register a details
   {

     typeText(firstName,loadProp.getProperty("firstName"));
     typeText(lastName,loadProp.getProperty("LastName"));

     selectByText(day,loadProp.getProperty("Dob"));
     selectByValue(month,loadProp.getProperty("MonthOfBirth"));
     selectByIndex(year,loadProp.getProperty("YearOfBirth"));

       typeText(email1,loadProp.getProperty("email1")+currentTimeStamp()+loadProp.getProperty("email2"));

       clickOnElement(newsLetter);
     typeText(passWord,loadProp.getProperty("Password"));
     typeText(confirmPassword,loadProp.getProperty("ConfirmPassword"));
     waitForClickabInSEle(registerButton,20);
     clickOnElement(registerButton);



   }

}
