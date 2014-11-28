    package slyde.automation.cucumber;

    import cucumber.api.Scenario;
    import cucumber.api.java.After;
    import cucumber.api.java.en.And;
    import cucumber.api.java.en.Given;
    import cucumber.api.java.en.Then;
    import cucumber.api.java.en.When;
    import org.junit.Assert;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.PageFactory;
    import slyde.automation.pagefactory.HomePage;
    import slyde.automation.pagefactory.LandingPage;
    import slyde.automation.utils.RestHelper;

    import java.io.IOException;
    import java.util.concurrent.TimeUnit;

    /**
     * Created by srikanthvejendla on 9/12/14.
     */
    public class WebConsumerStepDefs {

        private WebDriver driver=RunnerTest.driver;
        private LandingPage landingpage;
        private HomePage homepage;
        private String autousername;
        private String autopassword;

        @After
        public void tearTestCase(Scenario scenario){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            if(driver.findElements(By.id("consumer-name")).size()>0){
                driver.findElement(By.cssSelector("#consumer-name")).click();
                driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
                driver.findElement(By.xpath("//*[@id='login']/div[3]/div[1]/button")).click();
            }
            RestHelper.setTestCaseStatus(scenario.getName().split(" ")[0], scenario.getStatus());
            driver.manage().deleteAllCookies();
        }

        @Given("^I am on Slyde Consumer Website$")
        public void i_am_on_Slyde_Consumer_Website() {
            landingpage= PageFactory.initElements(RunnerTest.driver, LandingPage.class);
        }

        @When("^I enter valid \"(.*?)\" and \"(.*?)\"$")
        public void i_enter_valid_and(String arg1, String arg2) throws IOException {
            arg1=new RestHelper().ConsumerRegisterRequest().email.getEmail();
            arg2=new RestHelper().ConsumerRegisterRequest().getPassword();
            autousername=arg1;
            autopassword=arg2;
            homepage=landingpage.login(arg1,arg2);
        }

        @Then("^I should be logged in successfully$")
        public void i_should_be_logged_in_successfully() {
            Assert.assertTrue(homepage.verifyUserAvatar());
        }

        @Then("^Greeted with welcome message$")
        public void greeted_with_welcome_message() {
            Assert.assertTrue(homepage.verifyWelcomeMessage());
        }

        @Then("^I should see \"(.*?)\" link$")
        public void i_should_see_link(String arg1) {
            Assert.assertTrue(landingpage.verifyForgotPasswordLink());
        }

        @When("^I enter blank \"(.*?)\" and \"(.*?)\"$")
        public void i_enter_blank_and(String arg1, String arg2) {
            arg1="";
            arg2="";
            landingpage.setEmailEdit(arg1);
            landingpage.setPasswordEdit(arg2);
            landingpage.clickSignInButton();
        }

        @Then("^I should be displayed with error message$")
        public void i_should_be_displayed_with_error_message() {
            Assert.assertTrue(landingpage.verifyErrorMessageText());
        }

        @And("^I should be able to change my existing password to \"(.*?)\"$")
        public void i_should_change_my_password(String arg1){
            homepage.clickMenuDropDown();
            homepage.clickChangeMyPasswordLink();
            homepage.setCurrentPasswordEdit(autopassword);
            homepage.setNewPasswordEdit(arg1);
            homepage.setConfirmPasswordEdit(arg1);
            homepage.clickSetNewPasswordButton();
        }

        @And("^I should be displayed with password confirmation message \"(.*?)\"$")
        public void i_should_get_success_confirmation(String arg1){
            Assert.assertTrue(homepage.verifyPasswordChangeText());
        }

        @When("^I enter wrong current password$")
        public void i_enter_wrong_current_password(){
            homepage.clickMenuDropDown();
            homepage.clickChangeMyPasswordLink();
            homepage.setCurrentPasswordEdit("hfhfjfvfh");
            homepage.setNewPasswordEdit("skplanet");
            homepage.setConfirmPasswordEdit("skplanet");
            homepage.clickSetNewPasswordButton();
        }

        @When("^I click on Sign Out of all Devices from Menu$")
        public void i_click_on_signout_ofall_devices(){
            homepage.clickMenuDropDown();
            homepage.clickSignOutOfAllDevicesLink();
        }

        @Then("^I should be Signed out Successfully$")
        public void i_should_be_signed_out(){
            homepage.clickConfirmButton();
            Assert.assertTrue(landingpage.verifyForgotPasswordLink());
        }

        @And("^I click on Cancel button$")
        public void i_click_on_cancel(){
            homepage.clickCancelButton();
        }

        @Then("^I should not be signed out$")
        public void i_should_not_be_signed_out(){
            Assert.assertTrue(homepage.verifyWelcomeMessage());
        }

        @When("^I click on Deactivate Account from Menu$")
        public void i_click_deactivate(){
            homepage.clickMenuDropDown();
            homepage.clickDeactivateAccountLink();
        }

        @And("^I confirm Deactivation$")
        public void i_confirm_deactivation(){
            homepage.clickConfirmButton();
            RestHelper.sleep(1);
        }

        @Then("^I should be navigated to Landing Page$")
        public void i_should_be_navigated_landing_page() throws InterruptedException {
            RestHelper.sleep(1);
            driver.navigate().refresh();
            RestHelper.sleep(2);
            landingpage.verifyForgotPasswordLink();
        }

        @When("^I attempt to login with deactivated credentials$")
        public void i_attempt_login_deactivated_credentials(){
            landingpage.setEmailEdit(autousername);
            landingpage.setPasswordEdit(autopassword);
            landingpage.clickSignInButton();
        }

        @Then("^I should be presented with confirmation ui to Deactivate Account$")
        public void i_should_be_presented_with_deactivate_confirmation(){
            Assert.assertTrue(homepage.verifyDeactivateAccountText());
        }

        @Then("^I should be presented with confirmation ui to Sign Out of All Devices$")
        public void i_should_be_presented_with_Signout_confirmation(){
            Assert.assertTrue(homepage.verifySignOutOfAllDevicesText());
        }

        @When("^I attempt to signin with previous password then i should be blocked$")
        public void i_attempt_signin_previous_password(){
            homepage.signout();
            landingpage.verifyForgotPasswordLink();
            RestHelper.sleep(3);
            landingpage.setEmailEdit(autousername);
            landingpage.setPasswordEdit(autopassword);
            landingpage.clickSignInButton();
            Assert.assertTrue(landingpage.verifyErrorMessageText());
        }

        @When("^I enter empty \"(.*?)\" and \"(.*?)\"$")
        public void i_enter_empty_password(String arg1, String arg2){
            homepage.clickMenuDropDown();
            homepage.clickChangeMyPasswordLink();
            homepage.setCurrentPasswordEdit(autopassword);
            homepage.setNewPasswordEdit("");
            homepage.setConfirmPasswordEdit("");
            homepage.clickSetNewPasswordButton();
        }

        @When("^I enter non matching \"(.*?)\" and \"(.*?)\"$")
        public void i_enter_notmaching_password(String arg1, String arg2){
            homepage.clickMenuDropDown();
            homepage.clickChangeMyPasswordLink();
            homepage.setCurrentPasswordEdit(autopassword);
            homepage.setNewPasswordEdit(arg1);
            homepage.setConfirmPasswordEdit(arg2);
            homepage.clickSetNewPasswordButton();
        }

        @When("^I click on username$")
        public void i_click_username(){
            homepage.clickMenuDropDown();
        }

        @Then("^I should be displayed with menu drop down$")
        public void i_should_be_displayed_menu_dropdown(){
            homepage.verifySignOutLink();
            homepage.verifySignOutOfAllDevicesLink();
            driver.navigate().refresh();
        }

        @And("^I should be greeted with my first and last name$")
        public void i_should_be_greeted_firstlastname(){
            Assert.assertTrue(homepage.verifyWelcomeMessage());
        }

        @And("^I should be displayed with my user avatar$")
        public void i_displayed_user_avatar(){
            Assert.assertTrue(homepage.verifyUserAvatar());
        }

        @And("^I should be displayed with Slyde logo$")
        public void i_displayed_slyde_logo(){
            Assert.assertTrue(homepage.verifySlydeLogo());
        }

        @When("^I click on Sign Out from Menu$")
        public void i_click_signout(){
            homepage.clickMenuDropDown();
            homepage.clickSignOutLink();
            homepage.clickConfirmButton();
        }

        @Then("^I cannot register for new account$")
        public void i_cannot_register_new_account(){
            RestHelper.isTextNotPresent("Register");
        }

        @Then("^I enter invalid \"(.*?)\" and \"(.*?)\"$")
        public void i_enter_invalid_email(String arg1,String arg2){
            landingpage.setEmailEdit("test@ya");
            landingpage.setPasswordEdit(arg2);
            landingpage.clickSignInButton();
        }

        @Then("^I should be displayed with Facebook Login option$")
        public void i_should_be_displayed_facebook_login(){
            Assert.assertTrue(landingpage.verifyFacebookLoginButton());
        }

        @Then("^I should be displayed message \"(.*?)\"$")
        public void i_should_displayed_facebook_message(String arg1){
            Assert.assertTrue(landingpage.verifyFacebookLoginText());
        }


    }
