package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Method {

    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[1]")
    public WebElement name;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[2]/input[1]")
    public WebElement lastname;



}
