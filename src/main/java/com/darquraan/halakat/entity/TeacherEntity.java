package com.darquraan.halakat.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "whatsapp")
    private String whatsapp;

    @Column(name = "sex")
    private String sex;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<HalakaEntity> halakats;

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

    public List<HalakaEntity> getHalakats() {
        return halakats;
    }

    public void setHalakats(List<HalakaEntity> halakats) {
        this.halakats = halakats;
    }
}

