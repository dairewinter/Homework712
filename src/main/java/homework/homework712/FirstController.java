package homework.homework712;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import static homework.homework712.Homework712Application.*;

@RestController
public class FirstController {

    @GetMapping("/")
    public String appRunning(){
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String students(@RequestParam String studentName){
        return "Имя студента: " + studentName + "; \n"+
                "Название проекта: " + getProjectName() + "; \n" +
                "Дата создания проекта: " + getProjectDate() + "; \n" +
                "Описание проекта: " + getProjectDescription();
    }

}
