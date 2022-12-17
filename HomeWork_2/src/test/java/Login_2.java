import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Login_2 {
WebDriver wd;
@BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();

    }
@Test
    public void registrSaccess(){
        wd.get("https://telranedu.web.app/");
        WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
        itemLogin.click();
        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("rehovot12@mail.ru");
        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Remember123@");
        WebElement registration = wd.findElement(By.name("registration"));
        registration.click();
        


    }
}

