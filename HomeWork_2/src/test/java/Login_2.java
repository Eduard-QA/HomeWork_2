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
        email.sendKeys("rehovot13@mail.ru");
        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Remember123@");
        WebElement registration = wd.findElement(By.name("registration"));
        registration.click();
        wd.quit();

    }
    @Test
    public void loginSuccess () throws InterruptedException {
    wd.get("https://telranedu.web.app/home");
    WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
    itemLogin.click();
    WebElement email = wd.findElement(By.name("email"));
    email.click();
    email.clear();
    email.sendKeys("rehovot@mail.ru");
    WebElement password = wd.findElement(By.name("password"));
    password.click();
    password.clear();
    password.sendKeys("Remember123@");
    WebElement button = wd.findElement(By.name("login"));
    button.click();
        Thread.sleep(2000);
        WebElement bar1 = wd.findElement(By.cssSelector(".navbar-logged_nav__2Hx7M"));
        wd.findElement(By.cssSelector("body button")).click();

   // wd.quit();
    }
    @Test
    public void registrIlcaro (){
    wd.get("https://ilcarro.web.app/search");
    WebElement singup = wd.findElement(By.partialLinkText("Sign"));
    singup.click();
    WebElement name = wd.findElement(By.id("name"));
    name.click();
    name.clear();
    name.sendKeys("Dov1");
    WebElement lastname = wd.findElement(By.id("lastName"));
    lastname.click();
    lastname.clear();
    lastname.sendKeys("Pooh1");
    WebElement email = wd.findElement(By.id("email"));
    email.click();
    email.clear();
    email.sendKeys("rehovot2@mail.ru");
    WebElement password = wd.findElement(By.id("password"));
    password.click();
    password.clear();
    password.sendKeys("Remember1234@");
   // wd.manage().window().maximize()
    WebElement chek = wd.findElement(By.className("checkbox-container"));
    chek.click();
    wd.findElement(By.cssSelector("button[type = 'submit']")).click();
       // wd.quit();


    }
}

