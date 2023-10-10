package testcases;

import com.github.javafaker.Faker;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import utilities.utlity;

public class TC01_RegistrationTest extends TestBase{

    static Faker faker = new Faker();

    static final String FIRSTNAME = faker.name().firstName();
    static final String LASTNAME = faker.name().lastName();
    static String EMAIL = faker.internet().emailAddress();
    static String PHONE = faker.phoneNumber().phoneNumber();
    private static String PASSWORD = utlity.getData(System.getProperty("user.dir")+"/src/test/resources/testdata/loginData.json","password");
   // static String PASSWORD = faker.internet().password();




    @Test(priority = 1 , description = "User Rgistration")
    @Description("Register With Valid Data")
    @Severity(SeverityLevel.CRITICAL)
    public void RegisterTest_P() {
        new P01_RegistrationPage(driver).UserClickOnMyAccount().UserSelectRegistration().
                UserAddFirstName(FIRSTNAME).UserAddLasttName(LASTNAME).UserAddEmail(EMAIL).UserAddTelephone(PHONE).
                UserAddPassword(PASSWORD).UserAddConfPass(PASSWORD).
                UserClickOnCheckBox().UserClickOnContinueButton();
      //TODO : take screenshot
        utlity.captureScreenshot(driver, "register");
        //TODO:Assert result
        Assert.assertFalse(new P01_RegistrationPage(driver).RefistrationConfirm());

    }
    }

