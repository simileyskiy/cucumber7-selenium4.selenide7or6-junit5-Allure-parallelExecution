# cucumber7-selenium4.selenide6-junit5-Allure-parallelExecution

Build project with the ability to run in parallel with the desired number of Threads. Regulated in MavenCustomParallelStrategy.java

To run tests locally:

- Run CucumberTestRunner.java
- With command:
```
mvn install
```
There are 5 features in the src/test/resources folder, one of which is Login4Fails.feature with two unsuccessful tests, as a result of which a screenshot is taken after an unsuccessful step and added to the Allure report using Hook from src/main/hooks/Hook .java

## Peculiarities
Cucumber 7 + Selenium 4/Selenide 6 when running scripts/features in parallel, the number of Threads is not controlled by specifying in:
- junit-platform.properties
- pom
- Cucumber annotations

This project is a solution to problem, thanks to a custom profile of the parallelization strategy and the selection of fresh compatible versions: MavenCustomParallelStrategy.java

### Building a report locally
To start the allure server and view the report:

```
mvn allure:serve
```

Run in 4 Threads Example

![image](https://user-images.githubusercontent.com/43063004/204404483-af07f6c1-f2b6-41e7-8c11-e8c2db9ba620.png)



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







