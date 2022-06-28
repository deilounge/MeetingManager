package pl.arenin.meetingmanager.pojo;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meeting {
    private String title;
    private String company;
    private String type;
    private String address;
    private String description;
    private LocalDate date;
    private LocalTime time;
}