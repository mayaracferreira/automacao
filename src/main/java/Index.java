import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Index  extends  BaseTest  implements  DefaultProperties{

    private  By btnProduto = By.xpath("//a[@data-id-product='1']");
    private  By btnAddCart =By.xpath("//a[@title='Proceed to checkout']");
    private  By btnProcedtoCheckout = By.xpath("//a[@title='Proceed to checkout'])).get(1");


    public void acessarAplicacao(){
        getNavegador().get(URL_BASE);

    }

    public  boolean isLoginPagePresent(){
        WebElement element = getWait().until((ExpectedConditions.elementToBeClickable(btnProduto)));
        return element.isEnabled();
    }

    public  void  selecionarProduto (){
        getNavegador().findElement(By.xpath("//a[@data-id-product='1']")).click();
        getNavegador().findElement(btnAddCart).click();
        getNavegador().findElement(btnProcedtoCheckout).click();
    }




}
