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
    @DisplayName("Клик по ссылке \"Вакансии\" переводит на страницу вакансий")
    void checkingAboutPage() {
        tele2VacancySteps.openingAbout("/about")
                .checkingResultsOnPage("Вакансии")
                .clickingOnLinkVacancies()
                .checkingResultsOnPage("Вакансии Tele2")
                .checkingUrlOnPage("https://msk.tele2.ru/about/career/vacancies");
    }

//    @Test
//    @Tag("tele2")
//    @Owner("Loarlam")
//    @Severity(SeverityLevel.TRIVIAL)
//    @DisplayName("Поиск вакансии на странице \"Вакансии Tele2\"")
//    void successfulTest() {
//        tele2VacancySteps.openingAbout("/about/career/vacancies")
//                .checkingResultsOnPage("Вакансии Tele2")
//                .settingValueInVacancySelection("Руководитель")
//                .findingVacancy("Руководитель");
//    }
//
//
//    @Test
//    @Tag("tele2")
//    @Owner("Loarlam")
//    @Severity(SeverityLevel.TRIVIAL)
//    @DisplayName("Поиск вакансии на странице \"Вакансии Tele2\"")
//    void successfulTest1() {
//        tele2VacancySteps.openingAbout("/about/career/vacancies")
//                .checkingResultsOnPage("Вакансии Tele2")
//                .choosingFilterOfSubdivision()
//                .findingVacancy();
//    }
}