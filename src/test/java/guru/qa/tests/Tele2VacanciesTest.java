package guru.qa.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Tele2VacanciesTest extends TestBase {
    @Test
    @Tag("tele2")
    @Owner("Loarlam")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка некорректного ввода номера телефона для входа в аккаунт")
    void checkingAboutPage() {
        tele2VacancySteps.openingPage("/about/career/vacancies")
                .checkingResultsOnPage("Вакансии Tele2")
                .checkingUrlOnPage("https://msk.tele2.ru/about/career/vacancies")
                .clickingOnLoginButton()
                .clickingInNumberFiled()
                .clickingOnSubmit()
                .checkingErrorText();
    }

    @Test
    @Tag("tele2")
    @Owner("Loarlam")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Поиск вакансии через ввод на странице \"Вакансии Tele2\"")
    void successfulTest() {
        tele2VacancySteps.openingPage("/about/career/vacancies")
                .checkingResultsOnPage("Вакансии Tele2")
                .settingValueInVacancySelection("Руководитель")
                .findingVacancy("Руководитель");
    }


    @Test
    @Tag("tele2")
    @Owner("Loarlam")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Поиск вакансии по подразделениям на странице \"Вакансии Tele2\"")
    void successfulTest1() {
        tele2VacancySteps.openingPage("/about/career/vacancies")
                .checkingResultsOnPage("Вакансии Tele2")
                .clickingOnSubdivision()
                .choosingFilterOfSubdivision()
                .findingVacancy();
    }
}