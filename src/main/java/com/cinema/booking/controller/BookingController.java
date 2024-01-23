package com.cinema.booking.controller;

import com.cinema.booking.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/cinema")
public class BookingController {
    List<Ticket> ticketList=new ArrayList<>();
   // @RequestMapping(path="/tickets", method= RequestMethod.POST)
    @PostMapping(path="/tickets")
    public Ticket addTicket(@RequestBody Ticket ticket){
        System.out.println("controller called");
        ticketList.add(ticket);
        return ticket;
    }
    @GetMapping(path="/tickets")
    public List<Ticket> getTicket(){
        return ticketList;
    }

    @DeleteMapping(path="/tickets/{ticketid}")
    public String deleteTicket(@PathVariable String ticketid){

        return ticketid + "removed successfully";
    }
}
