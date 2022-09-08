package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Tele2VacancySteps {
    private SelenideElement vacancy = $(".text-field-holder.search-field"),
            state = $("#react-select-3-input"),
            city = $("#react-select-4-input"),
            linkToVacancies = $("[href=\"/about/career/vacancies\"]"),
            resultForm = $(".modal-title"),
            page = $(".page"),
            blockWithVacancy = $("vacancy-card__item-name"),
            filter = $("#selectOfVacancyDivisions_listbox_active_option");

    @Step("Открываем страницу \"{linkValue}\"")
    public Tele2VacancySteps openingAbout(String linkValue) {
        open(linkValue);
        return this;
    }

    @Step("Выбираем \"{userHobbies}\" близ \"Hobbies\"")
    public Tele2VacancySteps settingHobbies(int userHobbies) {
        $(String.format("#hobbies-checkbox-%s", userHobbies)).sendKeys(" ");
        return this;
    }

    @Step("Загружаем \"{userPicture}\" через \"Выберите файл\"")
    public Tele2VacancySteps uploadingPicture(String userPicture) {
        $("#uploadPicture").uploadFile(new File(userPicture));
        return this;
    }

    @Step("Клик по ссылке \"Вакансии\"")
    public Tele2VacancySteps clickingOnLinkVacancies() {
        linkToVacancies.click();
        return this;
    }

    @Step("Установили значение \"{searchedVacancy}\" в поле поиска")
    public Tele2VacancySteps settingValueInVacancySelection(String searchedVacancy) {
        vacancy.setValue(searchedVacancy);
        return this;
    }

    @Step("Установили значение \"{searchedVacancy}\" в поле поиска")
    public Tele2VacancySteps choosingFilterOfSubdivision() {
        filter.click();
        return this;
    }

    @Step("Проверяем наличие вакансий \"{vacancyOnPage}\" на странице")
    public Tele2VacancySteps findingVacancy(String vacancyOnPage) {
        blockWithVacancy.shouldHave(text(vacancyOnPage)).shouldBe(visible);
        return this;
    }

    @Step("Проверяем наличие вакансий \"{vacancyOnPage}\" на странице")
    public Tele2VacancySteps findingVacancy() {
        blockWithVacancy.shouldBe(visible);
        return this;
    }


    @Step("Проверяем наличие \"{validateFieldValue}\" на странице")
    public Tele2VacancySteps checkingResultsOnPage(String validateFieldValue) {
        page.shouldHave(text(validateFieldValue));
        return this;
    }

    @Step("Url открытой страницы должен быть \"{validateFieldValue}\"")
    public Tele2VacancySteps checkingUrlOnPage(String validateUrl) {
        webdriver().shouldHave(url(validateUrl));
        return this;
    }
}