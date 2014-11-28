package slyde.automation.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import slyde.automation.utils.RestHelper;

/**
 * Created by srikanthvejendla on 9/12/14.
 */
public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    @FindBy(xpath="//*[@id='login']/div/div/div/h1")
    private WebElement textWelcomeMessage;

    @FindBy(id="consumer-name")
    private WebElement dropdownMenu;

    @FindBy(xpath="//a[contains(text(),'Sign Out')]")
    private WebElement linkSignOut;

    @FindBy(xpath="//a[contains(text(),'Change My Password')]")
    private WebElement linkChangeMyPassword;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement editCurrentPassword;

    @FindBy(xpath = "//input[@placeholder='New Password']")
    private WebElement editNewPassword;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    private WebElement editConfirmPassword;

    @FindBy(xpath="//button[contains(text(),'Set new password')]")
    private WebElement buttonSetNewPassword;

    @FindBy(xpath="//a[contains(text(),'Sign Out of Devices')]")
    private WebElement linkSignOutofAllDevices;

    @FindBy(xpath="//*[@id='login']/div[3]/div[2]/button")
    private WebElement buttonCancel;

    @FindBy(xpath="//*[@id='login']/div[3]/div[1]/button")
    private WebElement buttonConfirm;

    @FindBy(xpath = "//a[contains(text(),'Deactivate Account')]")
    private WebElement linkDeactivateAccount;

    @FindBy(id = "message_success")
    private WebElement textSuccessConfirmation;

    @FindBy(xpath = "//*[@id='consumer-name']/img")
    private WebElement imgUserAvatar;

    @FindBy(xpath = "//*[@id='consumer-nav-top']/div/div[1]/div/h2/a/img")
    private WebElement imgSlydeLogo;

    @FindBy(xpath = "//p[contains(text(),'Are you sure you want to deactivate your Slyde account? This action cannot be undone.')]")
    private WebElement textDeactivateAccount;

    @FindBy(xpath = "//p[contains(text(),'Are you sure you want to sign out of Slyde on all of your devices? This action cannot be undone.')]")
    private WebElement textSignOutOfAllDevices;

    @FindBy(xpath = "//*[@id='message_success']/h6")
    private WebElement textPasswordChangeSuccess;

    public void clickMenuDropDown(){
        dropdownMenu.click();
    }

    public void clickChangeMyPasswordLink(){
        linkChangeMyPassword.click();
    }

    public void clickSignOutOfAllDevicesLink(){
        linkSignOutofAllDevices.click();
    }

    public void clickDeactivateAccountLink(){
        linkDeactivateAccount.click();
    }


    public void clickSignOutLink(){
        linkSignOut.click();
    }

    public void clickConfirmButton(){
        buttonConfirm.click();
    }

    public void clickCancelButton(){
        buttonCancel.click();
    }

    public void setCurrentPasswordEdit(String currentpassword){
        editCurrentPassword.sendKeys(currentpassword);
    }

    public void setNewPasswordEdit(String newpassword){
        editNewPassword.sendKeys(newpassword);
    }

    public void setConfirmPasswordEdit(String confirmpassword){
        editConfirmPassword.sendKeys(confirmpassword);
    }

    public void clickSetNewPasswordButton(){
        buttonSetNewPassword.click();
        RestHelper.sleep(1);
    }

    public Boolean verifyWelcomeMessage(){
        return textWelcomeMessage.isDisplayed();
    }

    public Boolean verifySlydeLogo(){
        return imgSlydeLogo.isDisplayed();
    }

    public Boolean verifySignOutOfAllDevicesText(){
        return textSignOutOfAllDevices.isDisplayed();
    }

    public Boolean verifyUserAvatar(){
        return imgUserAvatar.isDisplayed();
    }

    public Boolean verifyDeactivateAccountText(){
        return textDeactivateAccount.isDisplayed();
    }

    public Boolean verifySignOutLink(){
        return linkSignOut.isDisplayed();
    }

    public Boolean verifySignOutOfAllDevicesLink(){
        return linkSignOutofAllDevices.isDisplayed();
    }

    public Boolean verifyPasswordChangeText(){
        return textPasswordChangeSuccess.isDisplayed();
    }

    public void clickSlydeLogo(){
        imgSlydeLogo.click();
    }

    public LandingPage deactivateAccount(){
        dropdownMenu.click();
        linkDeactivateAccount.click();
        buttonConfirm.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }

    public LandingPage signOutOfAllDevices(){
        dropdownMenu.click();
        linkSignOutofAllDevices.click();
        buttonConfirm.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }

    public HomePage changePassword(String currentpassword,String newpassword){
        dropdownMenu.click();
        linkChangeMyPassword.click();
        editCurrentPassword.sendKeys(currentpassword);
        editNewPassword.sendKeys(newpassword);
        editConfirmPassword.sendKeys(newpassword);
        buttonSetNewPassword.click();
        return this;
    }

    public LandingPage signout(){
        dropdownMenu.click();
        linkSignOut.click();
        buttonConfirm.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }


}
