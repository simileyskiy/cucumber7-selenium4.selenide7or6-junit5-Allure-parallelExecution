# cucumber7-selenium4.selenide6-junit5-Allure-parallelExecution
Проект сборки с возможностью паралельного запуска с желаемым количеством Threads.
Регулируется в MavenCustomParallelStrategy.java

Для локального запуска тестов необходимо:

- Запустить ранер CucumberTestRunner.java
- С помощью команды: 
```
mvn install
```
В папке src/test/resources находятся 5 фич, одна из которых Login4Fails.feature с двумя неуспешными тестами, по итогу которых, делается скриншот после неудачного шага и добавляется в отчет Allure, с помощью Hook'а из src/main/hooks/Hook.java
## Особенности
Cucumber 7 + Selenium 4/Selenide 6 при параллельном запуске сценариев\фич количество Threads не управляется с помощью указания в:
- junit-platform.properties
- pom
- аннотации Cucumber

Данный проект является решением этой проблемы, благодаря кастомному профилю стратегии параллелизации и подбору свежих совместимых версий:
MavenCustomParallelStrategy.java


### Сборка отчета локально
Для запуска allure сервера и просмотра отчета:
```
mvn allure:serve
```

Прогон в 4 Threads

![image](https://user-images.githubusercontent.com/43063004/204404483-af07f6c1-f2b6-41e7-8c11-e8c2db9ba620.png)

