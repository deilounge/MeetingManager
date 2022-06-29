package pl.arenin.meetingmanager.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.arenin.meetingmanager.pojo.Meeting;

@Controller
public class MeetingController {

    @GetMapping("list")
    public String listMeetings(Model model) {

        List<Meeting> meetings = new ArrayList<>();




        meetings.add(new Meeting("Spotkanie po wynikach 1Q2021", "Monnari", "Wirtualne", "http://onet.pl", "-",
                LocalDate.now(), LocalTime.now()));
        meetings.add(new Meeting("Spotkanie po wynikach 1Q2021", "Asbis", "Fizyczne", "Warszawa, Grzybowska 115", "-",
                LocalDate.now(), LocalTime.now()));
        model.addAttribute("meetings", meetings);

        return "meetingList";
    }
}
