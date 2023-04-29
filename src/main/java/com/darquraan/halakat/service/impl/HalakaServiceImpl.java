package com.darquraan.halakat.service.impl;

import com.darquraan.halakat.controller.dto.HalakaDto;
import com.darquraan.halakat.controller.dto.TeacherDto;
import com.darquraan.halakat.dao.HalakaRepository;
import com.darquraan.halakat.entity.HalakaEntity;
import com.darquraan.halakat.entity.TeacherEntity;
import com.darquraan.halakat.service.HalakaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HalakaServiceImpl implements HalakaService {

    @Autowired
    private final HalakaRepository halakaRepository;

    public HalakaServiceImpl(HalakaRepository halakaRepository) {
        this.halakaRepository = halakaRepository;
    }


    public HalakaDto createHalaka(HalakaDto halakaDto) {
        HalakaEntity halakaEntity = mapHalakaDtoToEntity(halakaDto);

        HalakaEntity savedHalakaEntity = halakaRepository.save(halakaEntity);

        HalakaDto savedHalakaDto = mapHalakaEntityToDto(savedHalakaEntity);

        return savedHalakaDto;
    }

    @Override
    public HalakaDto getHalakaById(Long id) {
        HalakaEntity halakaEntity = halakaRepository.findById(id).orElse(null);
        return mapHalakaEntityToDto(halakaEntity);
    }

    private static HalakaDto mapHalakaEntityToDto(HalakaEntity savedHalakaEntity) {
        HalakaDto savedHalakaDto = new HalakaDto();
        savedHalakaDto.setId(savedHalakaEntity.getId());
        savedHalakaDto.setName(savedHalakaEntity.getName());
        savedHalakaDto.setDescription(savedHalakaEntity.getDescription());
        savedHalakaDto.setDurationInMinutes(savedHalakaEntity.getDurationInMinutes());
        savedHalakaDto.setStartHour(savedHalakaEntity.getStartHour());

        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(savedHalakaEntity.getTeacher().getId());
        savedHalakaDto.setTeacher(teacherDto);
        return savedHalakaDto;
    }

    private static HalakaEntity mapHalakaDtoToEntity(HalakaDto halakaDto) {
        HalakaEntity halakaEntity = new HalakaEntity();
        // Set the properties of the halakaEntity object from the halakaDto object
        halakaEntity.setName(halakaDto.getName());
        halakaEntity.setDescription(halakaDto.getDescription());
        halakaEntity.setDurationInMinutes(halakaDto.getDurationInMinutes());
        halakaEntity.setStartHour(halakaDto.getStartHour());

        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setId(halakaDto.getTeacher().getId());
        halakaEntity.setTeacher(teacherEntity);
        return halakaEntity;
    }


}