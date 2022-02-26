package com.room.linkdien.demo;


import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class RoomModel {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue
    private Long id ;
    @Column(name= "NAME")
    private String name ;
    @Column(name = "ROOM_NUMBER")
    private String room_number;
    @Column(name = "BED_INFO")
    private String bed_info;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getBed_info() {
        return bed_info;
    }

    public void setBed_info(String bed_info) {
        this.bed_info = bed_info;
    }

    public RoomModel() {
    }
}
