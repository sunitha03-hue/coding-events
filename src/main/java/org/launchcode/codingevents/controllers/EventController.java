package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {
    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model){
        Map<String, String> eventsCode = new HashMap<>();
        eventsCode.put("Code With Pride", "LGBT FriendlyCoding Meetup");
        eventsCode.put("Strange Loop", "Loops that are strange");
        eventsCode.put("Apple WWDC", "Event for people who like overpriced computers");
        model.addAttribute("events", eventsCode);
        return "events/index";
    }
//        model.addAttribute("events", events);
//        return "events/index";
//    }
//    @GetMapping("create")
//    public String renderCreateEventForm(){
//        return "events/create";
//    }
//    @PostMapping("create")
//
//    public String createEvent(@RequestParam String eventName){
//        events.add(eventName);
//        return "redirect:";
//       // return "redirect:/events";
//    }
//
//
//   /* @GetMapping
//    public String displayAllEvents(Model model) {
//        model.addAttribute("title", "All Events");
//        model.addAttribute("events", events);
//        return "events/index";
//    }
//
//    @GetMapping("create")
//    public String displayCreateEventForm(Model model) {
//        model.addAttribute("title", "Create Event");
//        return "events/create";
//    }
//
//    @PostMapping("create")
//    public String processCreateEventForm(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }
//@GetMapping("edit/{eventId}")
//    public String displayEditForm(Model)*/
}
