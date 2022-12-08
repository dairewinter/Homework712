package homework.homework712;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework712Application {

    static final String PROJECT_NAME = "Students";
    static final String PROJECT_DATE = "07.12.2022";
    static final String PROJECT_DESCRIPTION = "Название проекта: Студенты. \n Функции проекта: вывод имен студентов. \n Технологии проекта: Spring. \n Язык проекта: Java \n";
    public static void main(String[] args) {
        SpringApplication.run(Homework712Application.class, args);
    }

    public static final String getProjectName(){
        return PROJECT_NAME;
    }
    public static final String getProjectDate(){
        return PROJECT_DATE;
    }
    public static final String getProjectDescription(){
        return PROJECT_DESCRIPTION;
    }

}
