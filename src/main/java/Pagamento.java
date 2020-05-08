import org.openqa.selenium.By;

public class Pagamento extends  BaseTest {




    private By btnProsseguir = By.name("processCarrier");
    private By slcPagamento = By.xpath("//a[@title='Pay by bank wire']");
    private By btnConfirmar = By.xpath("//span[text()='I confirm my order']");

    public void ConfirmarPagamento () throws InterruptedException {

        getNavegador().findElement(btnProsseguir).click();
        getNavegador().findElement(slcPagamento).click();
        getNavegador().findElement(btnConfirmar).click();
        Thread.sleep( 3000);
    }

}
