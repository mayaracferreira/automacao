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
    public  void testComprar (){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.get("http://automationpractice.com/index.php");

        navegador.findElement(By.xpath("//a[@data-id-product='1']")).click();
        navegador.findElement(By.id("add_to_cart")).click();
        navegador.findElement(By.id("layer_cart")).findElement(By.linkText("Proceed to checkout")).click();


        WebDriverWait wait = new WebDriverWait(navegador, 10);

        navegador.findElement(By.name("processCarrier")).click();


        String Produto = navegador.findElement(By.cssSelector("#order-detail-content .product-name a")).getText();
        assertEquals("Faded Short Sleeve T-shirts",Produto);

        navegador.findElement(By.className("standard-checkout")).click();



        navegador.findElement(By.name("email_create")).sendKeys("mayara.c.ferreira@hotmail.com");
        navegador.findElement(By.id("SubmitCreate")).click();
        navegador.findElement(By.id("id_gender1")).click();
        navegador.findElement(By.id("customer_firstname")).sendKeys("Mayara");
        navegador.findElement(By.id("customer_lastname")).sendKeys("Ferreira");
        navegador.findElement(By.id("passwd")).sendKeys("lucilene16");
        navegador.findElement(By.id("address1")).sendKeys("Rua Luisa Regonato 2");
        navegador.findElement(By.id("address2")).sendKeys("Rua Luisa Regonato 3");
        navegador.findElement(By.id("city")).sendKeys("Jandira");
        navegador.findElement(By.id("id_state")).sendKeys("Alaska");
        navegador.findElement(By.id("postcode")).sendKeys("00000");
        navegador.findElement(By.id("id_country")).sendKeys("United States");
        navegador.findElement(By.id("phone_mobile")).sendKeys("5555555555");
        navegador.findElement(By.id("alias")).clear();
        navegador.findElement(By.id("alias")).sendKeys("Rua Luisa Regonato");

        navegador.findElement(By.id("submitAccount")).click();

        String Endereco = navegador.findElement(By.cssSelector("#uniform-id_address_delivery.selector span")).getText().toLowerCase();
        assertEquals("Rua Luisa Regonato",Endereco);


        navegador.findElement(By.name("processAddress")).click();
        navegador.findElement(By.id("cgv")).click();
        navegador.findElement(By.name("processCarrier")).click();

        String valorTotal = navegador.findElement(By.cssSelector("#total_price")).getText();
        assertEquals("$18.51", valorTotal);

        navegador.findElement(By.className("cheque")).click();
        navegador.findElement(By.xpath("//span[text()='I confirm my order']")).click();

        String finalizar = navegador.findElement(By.className("page-heading")).getText();
        assertEquals("ORDER CONFIRMATION", finalizar);

        navegador.close();



    }
}
