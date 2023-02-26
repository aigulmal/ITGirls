package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;

@RestController
public class FirstController {
    public enum DayOfWeek {
        SUNDAY ("Воскресенье"),
        MONDAY ("Понедельник"),
        TUESDAY ("Вторник"),
        WEDNESDAY ("Среда"),
        THURSDAY ("Четверг"),
        FRIDAY ("Пятница"),
        SATURDAY ("Суббота");
        private String title;
        DayOfWeek(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
    }
    @GetMapping("/dayOfWeek")
    public String getDayOfWeekOnRus(@RequestParam(value = "name", required = false) DayOfWeek name){
        return "Сегодня " + name.getTitle();
    }

}

