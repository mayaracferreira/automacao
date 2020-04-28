package compra;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class TestCompra {


    @Test
    public  void testComprar () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.get("http://automationpractice.com/index.php");

        navegador.findElement(By.xpath("//a[@data-id-product='1']")).click();
        navegador.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        navegador.findElements(By.xpath("//a[@title='Proceed to checkout']")).get(1).click();



        WebDriverWait wait = new WebDriverWait(navegador, 10);

        navegador.findElement(By.name("email_create")).sendKeys("xcccg@test.com");
        navegador.findElement(By.id("SubmitCreate")).click();
        navegador.findElement(By.id("uniform-id_gender2")).click();
        navegador.findElement(By.id("customer_firstname")).sendKeys("Mayara");
        navegador.findElement(By.id("customer_lastname")).sendKeys("Ferreira");
        navegador.findElement(By.id("passwd")).sendKeys("12345");
        navegador.findElement(By.id("address1")).sendKeys("Rua Luisa Regonato ");
        navegador.findElement(By.id("address2")).sendKeys("Rua Luisa Regonato 3");
        navegador.findElement(By.id("city")).sendKeys("Jandira");
        navegador.findElement(By.id("id_state")).sendKeys("Alaska");
        navegador.findElement(By.id("postcode")).sendKeys("00000");
        navegador.findElement(By.id("id_country")).sendKeys("United States");
        navegador.findElement(By.id("phone_mobile")).sendKeys("5555555555");
        navegador.findElement(By.id("alias")).clear();
        navegador.findElement(By.id("alias")).sendKeys("Rua Luisa Regonato");
        navegador.findElement(By.id("submitAccount")).click();
        Thread.sleep(1000);
        navegador.findElement(By.name("processAddress")).click();
        navegador.findElement(By.name("cgv")).click();
        Thread.sleep(1000);

        navegador.findElement(By.name("processCarrier")).click();
        Thread.sleep(1000);
        navegador.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
        Thread.sleep(1000);
        navegador.findElement(By.xpath("//span[text()='I confirm my order']")).click();

        Thread.sleep(1000);


        navegador.close();



    }
}
