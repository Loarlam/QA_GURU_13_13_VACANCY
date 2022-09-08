# Автоматизация тестирования страницы вакансий Tele2

[![](images/results/Tele2Vacancies.jpg)](https://msk.tele2.ru/about/career/vacancies)

## Содержание:
+ [Стек технологий](#СтекТехнологий)
+ [Тестовые сценарии](#ТестовыеСценарии)
+ [Сборка в Jenkins](#СборкаВJenkins)
+ [Команды запуска тестов в терминале](#КомандыЗапускаТестовВТерминале)
+ [Интеграция с Allure report](#ИнтеграцияСAllureReport)
+ [Интеграция с Allure TestOps](#ИнтеграцияСAllureTestOps)
+ [Видео прохождения тестов](#ВидеоПрохожденияТестов)
+ [Интеграция с Jira](#ИнтеграцияСJira)
+ [NИнформирование в Telegram](#ИнформированиеВTelegram)

## :computer: Стек технологий
<p align="center">
<a href="https://www.java.com/"><img src="images/logo/java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://gradle.org/"><img src="images/logo/gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/allureReport.svg" width="50" height="50"  alt="Allure Reports"/></a>
<a href="https://qameta.io/"><img src="images/logo/allureTestOps.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/software/jira"><img src="images/logo/jira.svg" width="50" height="50"  alt="Jira"/></a>
<a href="https://telegram.org/"><img src="images/logo/telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## :clipboard: Тестовые сценарии
+ :white_check_mark: Поиск вакансии через ввод на странице "Вакансии Tele2"
+ :white_check_mark: Поиск вакансии по подразделениям на странице "Вакансии Tele2"
+ :white_check_mark: Проверка ввода некорректного значения для поика вакансии
+ :white_check_mark: Проверка некорректного ввода номера телефона для входа в аккаунт

## <img width="5%" src="images/logo/jenkins.svg"> Сборка в Jenkins
[![](images/results/JenkinsResult.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_13_VACANCY/)

#### Параметры сборки:
| Параметры          | Значение                            |
|:-------------------|:------------------------------------|
| REMOTE_LINK        | Удаленный сервер для запуска тестов |
| BROWSER            | Браузер для запуска тестов          |
| BROWSER_VERSION    | Версия браузера                     |
| BROWSER_RESOLUTION | Размер окна браузера                |

[![](images/results/JenkinsStart.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_13_VACANCY/build)

## :desktop_computer: Команды запуска тестов в терминале
#### Команды для локального запуска:
```bash
gradle clean test
```

#### Команды для удаленного запуска:
```bash
clean
test
-DremoteLink=${REMOTE_LINK}
-Dbrowser=${BROWSER}
-Dversion=${BROWSER_VERSION}
-Dresolution=${BROWSER_RESOLUTION}
```

## <img width="5%" title="Allure" src="images/logo/allureReport.svg"> Интеграция с Allure report
#### Диаграммы прохождения тестов:
[![](images/results/AllureReportScheme.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_13_VACANCY/allure/)

#### Развернутый результат прохождения тестов:
| Левая часть       | Правая часть                      |
|:------------------|:----------------------------------|
| Тестовые сценарии | Подробное описание шагов          |
|                   | Финальный скриншот каждого теста  |
|                   | Исходники страницы теста          |
|                   | Исходники консоли браузера        |
|                   | Финальный ролик с процессом теста |
[![](images/results/AllureReportTestCases.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_13_VACANCY/allure/#suites/1d00f9eba85bfdc8b26ce142056449f8/9f38bfb766a189a5/)

## <img width="5%" title="Allure" src="images/logo/allureTestOps.svg"> Интеграция с Allure TestOps
#### Диаграммы прохождения тестов:
![](images/results/AllureTestopsScheme.jpg)

#### Развернутый результат прохождения тестов:
| Левая часть       | Правая часть                      |
|:------------------|:----------------------------------|
| Тестовые сценарии | Подробное описание шагов          |
|                   | Финальный скриншот каждого теста  |
|                   | Исходники страницы теста          |
|                   | Исходники консоли браузера        |
|                   | Финальный ролик с процессом теста |
![](images/results/AllureTestOpsTestCases.jpg)

## :cinema: Видео прохождения тестов
https://user-images.githubusercontent.com/68316516/178743616-3d6e2e4a-ca29-48a2-b9aa-f54956871810.mp4

## <img width="5%" title="Jira" src="images/logo/jira.svg"> Интеграция с Jira
![](images/results/JiraResult.jpg)

## <img width="5%" title="Telegram" src="images/logo/telegram.svg"> Информирование в Telegram
#### Оповещение ведется при помощи Telegram bot API:
![](images/results/TelegramResult.jpg)