package com.darquraan.halakat.controller.dto;

public class StudentAdvancementDto {
    private Long id;
    private StudentDto student;
    private HalakaDto halaka;
    private Integer completedLessons;
    private Integer totalLessons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public HalakaDto getHalaka() {
        return halaka;
    }

    public void setHalaka(HalakaDto halaka) {
        this.halaka = halaka;
    }

    public Integer getCompletedLessons() {
        return completedLessons;
    }

    public void setCompletedLessons(Integer completedLessons) {
        this.completedLessons = completedLessons;
    }

    public Integer getTotalLessons() {
        return totalLessons;
    }

    public void setTotalLessons(Integer totalLessons) {
        this.totalLessons = totalLessons;
    }
}

