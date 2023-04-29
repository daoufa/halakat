package com.darquraan.halakat.controller.dto;

import java.util.List;

public class TeacherDto {
    private Long id;
    private String name;
    private String email;
    private String phone;

    private String address;

    private String whatsapp;

    private String sex;

    private List<HalakaDto> halakats;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<HalakaDto> getHalakats() {
        return halakats;
    }

    public void setHalakats(List<HalakaDto> halakats) {
        this.halakats = halakats;
    }
}

