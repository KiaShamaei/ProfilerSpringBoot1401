package com.room.linkdien.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {
    private final RoomRepository roomRepository;

    public RoomServices(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<RoomModel> getAllRoom(){
        List<RoomModel> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms :: add);
        return rooms;
    }
}
