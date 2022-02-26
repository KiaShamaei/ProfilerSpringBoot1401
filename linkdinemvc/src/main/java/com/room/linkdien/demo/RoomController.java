package com.room.linkdien.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
//
//    private static List<RoomModel> rooms = new ArrayList<>();
//    static {
//        for (int i =1 ; i <= 10 ; i ++ ){
//            rooms.add(new RoomModel(i , "room" + i ,"R" + i, "Q"+i));
//        }
//    }
    private final RoomServices roomServices;

    public RoomController(RoomServices roomServices) {
        this.roomServices = roomServices;
    }

    @GetMapping("/")
    public String  getAll(Model model){
        List<RoomModel> rooms = roomServices.getAllRoom();
        model.addAttribute("rooms",rooms);
        return "rooms";

    }
}
