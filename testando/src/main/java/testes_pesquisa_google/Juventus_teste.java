package testes_pesquisa_google;

import testes_pesquisa_google.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Juventus_teste extends Hooks{

    @Test
    @DisplayName("Pesquisando na Web")
    public void testando() throws InterruptedException    {
        driver.get("https://google.com.br");
        By pathInputPesquisa = By.id("APjFqb");
        driver.findElement(pathInputPesquisa).sendKeys("Juventus");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);

    }
}
