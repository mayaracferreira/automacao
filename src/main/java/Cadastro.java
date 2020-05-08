import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cadastro extends  BaseTest {


    private By txtEmail = By.id("email_create");
    private By btnNovaConta = By.id("SubmitCreate");

    private By txtGenero = By.id("uniform-id_gender2");
    private By txtPrimeiroNome = By.id("customer_firstname");
    private By txtUltimoNome = By.id("customer_lastname");
    private By txtSenha = By.id("passwd");
    private By txtEndereco1 = By.id("address1");
    private By txtEndereco2 = By.id("address2");
    private By txtCidade = By.id("city");
    private By txtEstado = By.id("id_state");
    private By txtCep = By.id("postcode");
    private By txtPais = By.id("id_country");
    private By txtCelular = By.id("phone_mobile");
    private By txtComplemento = By.id("alias");
    private By txtEnderecoSegundario = By.id("alias");
    private By btnRegistrar = By.id("submitAccount");


    public void cadastrarUsuario(String email) {
        getNavegador().findElement(txtEmail).sendKeys(email);
        getNavegador().findElement(btnNovaConta).click();

    }

    public  void  dadosUsuario (){
        getWait().until(ExpectedConditions.elementToBeClickable(txtGenero)).click();
        getNavegador().findElement(txtPrimeiroNome).sendKeys("Mayara");
        getNavegador().findElement(txtUltimoNome).sendKeys("Ferreira");
        getNavegador().findElement(txtSenha).sendKeys("12345");
        getNavegador().findElement(txtEndereco1).sendKeys("Rua Luisa Regonato ");
        getNavegador().findElement(txtEndereco2).sendKeys("Rua Luisa Regonato 3");
        getNavegador().findElement(txtCidade).sendKeys("Jandira");
        getNavegador().findElement(txtEstado).sendKeys("Alaska");
        getNavegador().findElement(txtCep).sendKeys("00000");
        getNavegador().findElement(txtEstado).sendKeys("United States");
        getNavegador().findElement(txtCelular).sendKeys("5555555555");
        getNavegador().findElement(txtComplemento).clear();
        getNavegador().findElement(txtEnderecoSegundario).sendKeys("Rua Luisa Regonato");


    }
    public  void confirmarCadastro () throws InterruptedException {
        getNavegador().findElement(btnRegistrar).click();
        Thread.sleep( 3000);
    }

}
