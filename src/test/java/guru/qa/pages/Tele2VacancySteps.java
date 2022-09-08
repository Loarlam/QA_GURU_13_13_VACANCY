package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Tele2VacancySteps {
    private SelenideElement vacancy = $("#fieldOfVacancyName"),
            state = $("#react-select-3-input"),
            city = $("#react-select-4-input"),
            linkToAboutPage = $(byAttribute("href", "/about")),
            linkToVacancies = $(byAttribute("href", "/about/career/vacancies")),
            resultForm = $(".modal-title"),
            page = $(".page"),
            blockWithVacancy = $(".vacancy-card__item-name"),
            filter = $("#selectOfVacancyDivisions_listbox_active_option"),
            loginButton = $(".actions-container"),
            number = $(".text-field-holder.phone-field"),
            submitButton = $("button[type=submit]"),
            errorText = $("span[class=error-text]"),
            subdivisionDropDown = $(".rw-multiselect-wrap");

    @Step("Открываем страницу \"https://msk.tele2.ru{linkValue}\"")
    public Tele2VacancySteps openingPage(String linkValue) {
        open(linkValue);
        return this;
    }

    @Step("Клик по кнопке входа в личный кабинет")
    public Tele2VacancySteps clickingOnLoginButton() {
        loginButton.click();
        return this;
    }

    @Step("Клик в поле ввода номера")
    public Tele2VacancySteps clickingInNumberFiled() {
        number.click();
        return this;
    }

    @Step("Клик на кнопку \"Далее\"")
    public Tele2VacancySteps clickingOnSubmit() {
        submitButton.click();
        return this;
    }

    @Step("Проверка текста ошибки")
    public Tele2VacancySteps checkingErrorText() {
        errorText.should(exist);
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

    @Step("Клик по ссылке \"О Tele2\"")
    public Tele2VacancySteps clickingOnLinkAbout() {
        linkToAboutPage.click();
        return this;
    }

    @Step("Клик по ссылке \"Вакансии\"")
    public Tele2VacancySteps clickingOnLinkVacancies() {
        linkToVacancies.click();
        return this;
    }

    @Step("Клик по ссылке \"Вакансии\"")
    public Tele2VacancySteps clickingOnSubdivision() {
        subdivisionDropDown.click();
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