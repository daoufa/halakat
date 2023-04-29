package com.darquraan.halakat.service;

import com.darquraan.halakat.controller.dto.HalakaDto;

public interface HalakaService {

    HalakaDto createHalaka(HalakaDto halakaDto);

    HalakaDto getHalakaById(Long id);
}
