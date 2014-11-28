package slyde.automation.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by srikanthvejendla on 9/12/14.
 */
public class LandingPage {

    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver= driver;
    }

    @FindBy(xpath="//input[@id='email' and @type='text']")
    private WebElement editEmail;

    @FindBy(xpath="//input[@id='password' and @type='password']")
    private WebElement editPassword;

    @FindBy(xpath="//button[contains(text(),'Sign In')]")
    private WebElement buttonSignIn;

    @FindBy(xpath="//a[contains(text(),'Forgot password?')]")
    private WebElement linkForgotpassword;

    @FindBy(css = ".social-btns>button")
    private WebElement buttonFacebookLogin;

    @FindBy(xpath = "//*[@id='message_error']/ul/li")
    private WebElement textErrorMessage;

    @FindBy(xpath = "//p[contains(text(),'Facebook login is not available for merchants to sign in.')]")
    private WebElement textFacebookLogin;

    public void setEmailEdit(String username){
        editEmail.sendKeys(username);
    }

    public void setPasswordEdit(String password){
        editPassword.sendKeys(password);
    }

    public void clickSignInButton(){
        buttonSignIn.click();
    }

    public Boolean verifyFacebookLoginButton(){
        return buttonFacebookLogin.isDisplayed();
    }

    public Boolean verifyFacebookLoginText(){
        return textFacebookLogin.isDisplayed();
    }

    public Boolean verifyForgotPasswordLink(){
        return linkForgotpassword.isDisplayed();
    }

    public Boolean verifyErrorMessageText(){
        return textErrorMessage.isDisplayed();
    }

    public HomePage login(String email,String password){
        setEmailEdit(email);
        setPasswordEdit(password);
        clickSignInButton();
        return PageFactory.initElements(driver, HomePage.class);
    }



}
