package org.example;

import org.openqa.selenium.By;

public class Desktops extends Utils

{
    By buildComputerButton=By.xpath("//a[@title='Show details for Build your own computer']");

    public void clickOnBuildYourOwnButton()
    {
        clickOnElement(buildComputerButton);//click on build computer
    }

}
