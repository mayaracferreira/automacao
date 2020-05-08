import lombok.Getter;
import lombok.Setter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest implements  DefaultProperties{

    @Getter @Setter
    private static ChromeDriver navegador;
    @Getter @Setter
    private  static WebDriverWait wait;

    @Before
    public  void Int (){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.get("http://automationpractice.com/index.php");
        wait = new WebDriverWait(getNavegador(), TIME_OUT);


    }

    @After
    public void TearDown() {
        navegador.close();
    }
}
