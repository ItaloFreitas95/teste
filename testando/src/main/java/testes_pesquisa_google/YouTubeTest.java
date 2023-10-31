package testes_pesquisa_google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTest {
    public static void main(String[] args) {
        // o metodo setProperty define o caminho do driver antes de começar o teste
        System.setProperty("web-driver.chrome.driver", "/caminho/para/o/chromedriver");
        WebDriver driver = new ChromeDriver();

        //
        driver.get("https://www.youtube.com");

        // Encontre o campo de pesquisa
        WebElement campoPesquisa = driver.findElement(By.name("search_query"));

        // Insira a pesquisa desejada (por exemplo, "Copa do Mundo 2022")
        campoPesquisa.sendKeys("Copa do Mundo 2022");
        campoPesquisa.submit();

        // Aguarde um momento para os resultados carregarem
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Encontre o primeiro vídeo da pesquisa
        WebElement primeiroVideo = driver.findElement(By.id("video-title"));

        // Clique no vídeo para reproduzi-lo
        primeiroVideo.click();

        // Aguarde 1 minuto (60000 milissegundos)
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Feche o navegador
        driver.quit();
    }
}
