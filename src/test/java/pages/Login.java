package pages;


import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Login extends Method {

    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[1]/input[1]")
    private WebElement name;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[2]/input[1]")
    private WebElement lastName;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[1]/label[2]/input[1]")
    private WebElement clickMarried;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[3]/div[1]/label[1]/input[1]")
    private WebElement clickHobby;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[4]/select[1]")
    private WebElement clickCountry;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[5]/div[1]/select[1]")
    private WebElement clickMonth;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[5]/div[2]/select[1]")
    private WebElement clickDay;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[5]/div[3]/select[1]")
    private WebElement clickYear;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[6]/input[1]")
    private WebElement clickNumber;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[7]/input[1]")
    private WebElement clickUsername;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[8]/input[1]")
    private WebElement clickEmail;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[9]/input[1]")
    private WebElement selectFile;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[10]/textarea[1]")
    private WebElement clickYourself;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[11]/input[1]")
    private WebElement clickPassword;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[12]/input[1]")
    private WebElement clickConfirmPassword;
    @FindBy(xpath = "//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[13]/input[1]")
    private WebElement clickSubmit;

    Select country = null;
    Select month = null;
    Select day = null;
    Select year =null;
    String file = "C:\\Users\\JONATHAN\\Documents\\Nivelics\\fondos nivelics\\QA2.jpg";

    public void register() {
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, name);
        SEN_KEYS_INTERFACE.sendKeys(name, "Jonathan");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, lastName);
        SEN_KEYS_INTERFACE.sendKeys(lastName, "Ballesteros");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickMarried);
        UTILS_INTERFACE.clickElement(clickMarried);
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickMarried);
        UTILS_INTERFACE.clickElement(clickHobby);
        //WAIT_INTERFACE.waitForElementToClickeable(10, 2,clickCountry);
        //UTILS_INTERFACE.clickElement(clickCountry);
        country = new Select(clickCountry);
        country.selectByIndex(1);
        month = new Select(clickMonth);
        month.selectByIndex(1);
        day = new Select(clickDay);
        day.selectByIndex(1);
        year = new Select(clickYear);
        year.selectByIndex(1);
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickNumber);
        SEN_KEYS_INTERFACE.sendKeys(clickNumber, "3134336288");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickUsername);
        SEN_KEYS_INTERFACE.sendKeys(clickUsername, "Johans88");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickEmail);
        SEN_KEYS_INTERFACE.sendKeys(clickEmail, "jhballesteros@gmail.com");
        SEN_KEYS_INTERFACE.sendKeys(selectFile, file);
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickYourself);
        SEN_KEYS_INTERFACE.sendKeys(clickYourself, "I am a student of systems engineering and I am studying the 5 semester");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickPassword);
        SEN_KEYS_INTERFACE.sendKeys(clickPassword, "880922johans.");
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickConfirmPassword);
        SEN_KEYS_INTERFACE.sendKeys(clickConfirmPassword, "880922johans.");
        UTILS_INTERFACE.clickElement(clickSubmit);
        WAIT_INTERFACE.pause(3);

    }

}