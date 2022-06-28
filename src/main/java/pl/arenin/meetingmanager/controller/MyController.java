package pl.arenin.meetingmanager.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.arenin.meetingmanager.pojo.Meeting;

@Controller
@RequestMapping("/")
public class MyController {

    @GetMapping("")
    public String indexPage() {
        return "index";
    }

    @GetMapping("list")
    public String listMeetings(Model model) {

        List<Meeting> meetings = new ArrayList<>();

        meetings.add(new Meeting("Spotkanie po wynikach 1Q2021", "Monnari", "Wirtualne", "http://onet.pl", "-", LocalDate.now(), LocalTime.now()));
        meetings.add(new Meeting("Spotkanie po wynikach 1Q2021", "Asbis", "Fizyczne", "Warszawa, Grzybowska 115", "-", LocalDate.now(), LocalTime.now()));

        model.addAttribute("meetings", meetings);

        return "meetingList";
    }

    @GetMapping("create")
    public Model model(Model model, Meeting meeting) {

        return model;
    }

    @GetMapping("/modelMap")
    public String modelMap(ModelMap modelMap) {
        return "modelmap";
    }

    @GetMapping("/modelAndView")
    public ModelAndView modeAndView(Meeting person) {

        ModelAndView modelAndView = new ModelAndView("modelmap");


        return modelAndView;
    }

}
