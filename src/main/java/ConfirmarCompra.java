import org.openqa.selenium.By;

public class ConfirmarCompra extends  BaseTest{

        private By btnProsseguir = By.name("processAddress");
        private By btnAceitar = By.name("cgv");



    public void ConfirmarDadosdeCompra () throws InterruptedException {
        getNavegador().findElement(btnProsseguir).click();
        getNavegador().findElement(btnAceitar).click();
        Thread.sleep( 3000);

    }

}