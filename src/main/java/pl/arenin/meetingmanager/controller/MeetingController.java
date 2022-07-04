package pl.arenin.meetingmanager.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import pl.arenin.meetingmanager.pojo.Meeting;

@Controller
@Scope("prototype")
public class MeetingController {

    List<Meeting> meetings = new ArrayList<>();

    @GetMapping("list")
    
    public String listMeetings(Model model) {

        model.addAttribute("meetings", meetings);

        meetings.add(new Meeting("Spotkanie po wynikach 123", "sd", "Wirtualne", "http://onet.pl", "-",
                LocalDate.now(), LocalTime.now()));
        meetings.add(new Meeting("Spotkanie po wynikach 1Q2021", "Asbis", "Fizyczne", "Warszawa, Grzybowska 115", "-",
                LocalDate.now(), LocalTime.now()));
        

        return "meetingList";
    }

    @GetMapping("index")
    public String index(Model model){

        model.addAttribute("meetings", meetings);

        meetings.add(new Meeting("Spotkanie po wynikach 1Q2021", "LPP", "Fizyczne", "Warszawa, Grzybowska 115", "-",
        LocalDate.now(), LocalTime.now()));

        return "meetingList";
    }
}
