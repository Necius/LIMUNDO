package Pages;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private String korisnickoImeField = "//div[@id = 'txtUsername']";
    public WebElement getKorisnickoImeField(){
        return findElement (korisnickoImeField);
    }

    private String lozinkaField = "//div[@id = 'txtPassword']";
    public WebElement getLozinkaField(){
        return findElement (lozinkaField);
    }

    private String ulazPrijavaButton = "//div[@id = 'btnPrijava']";
    public WebElement UlazPrijavaButton(){
        return findElement (ulazPrijavaButton);
    }

}


