package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// HelloController for API endpoints
@CrossOrigin(origins = "*") // Allow cross-origin requests
@RestController
@RequestMapping("/parul")
public class HelloController {

    @GetMapping("/user")
    public String user(@RequestParam String studentId) {
        System.out.println("inside the /parul/user is called");
        if ("200303124326".equalsIgnoreCase(studentId)) {
            return "this is SaiRam Machavarpu";
        } else if ("1234".equalsIgnoreCase(studentId)) {
            return "this is VemaReddy";
        }
        System.out.println("end of the /parul/user is called");
        return "Student Not found";
    }

    @GetMapping("/userdetails")
    public String userDetails() {
        System.out.println("inside the /parul/userdetails is called");
        return "Btech. CSC. KPHB. Phone:343254252542, Address: Dronadala. INkollu. ZIP: 523190";
    }

    @GetMapping("/contact")
    public String contactOurCompany() {
        System.out.println("inside the /parul/contact is called");
        return "Contact our college at: Parul University. Vadodara, GJ. Phone:99323242224";
    }
}

// IndexController for serving index.html (React frontend)
@Controller
class IndexController {

    // Serves index.html when accessing root
    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    // Handles SPA routes like /dashboard, /profile, etc.
    @GetMapping("/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }
}
