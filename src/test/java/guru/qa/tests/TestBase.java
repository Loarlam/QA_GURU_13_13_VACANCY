package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.attachments.AttachmentsForReport;
import guru.qa.config.CredentialsConfig;
import guru.qa.pages.Tele2VacancySteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    Tele2VacancySteps tele2VacancySteps = new Tele2VacancySteps();
    DataForTheTest dataForTheTest = new DataForTheTest();
    static CredentialsConfig credentialsConfig = ConfigFactory.create(CredentialsConfig.class);

    @BeforeAll
    static void beforeAllTests() {
        SelenideLogger.addListener("Allure", new AllureSelenide());

        Configuration.remote = String.format("https://%s:%s@%s", credentialsConfig.login(), credentialsConfig.password(), System.getProperty("remoteLink", "selenoid.autotests.cloud/wd/hub"));
        Configuration.baseUrl = "https://msk.tele2.ru";
        Configuration.browserPosition = "0x0";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("version", "100");
        Configuration.browserSize = System.getProperty("resolution", "1920x1080");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterAll
    static void afterAllTests() {
        AttachmentsForReport.attachScreenshot();
        AttachmentsForReport.pageSource();
        AttachmentsForReport.browserConsoleLogs();
        AttachmentsForReport.addVideo();
    }
}