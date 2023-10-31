package testes_pesquisa_google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecao_teste {
    private WebDriver driver;

    @Before
    public void setup() {
        // Configura o caminho do driver do Chrome
        System.setProperty("web-driver.chrome.driver", "");

        // Inicializa o driver do Chrome
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Abre o Google
        driver.get("https://www.google.com");

        // Localiza o campo de pesquisa
        WebElement campoPesquisa = driver.findElement(By.name("q"));

        // Insere um termo de pesquisa
        campoPesquisa.sendKeys("seleção brasileira");

        // Submete o formulário de pesquisa
        campoPesquisa.submit();

        // Aguarda um momento para os resultados carregarem (você pode usar explicit waits para melhorar isso)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void teardown() {
        // Fecha o navegador
        driver.quit();
    }
}
