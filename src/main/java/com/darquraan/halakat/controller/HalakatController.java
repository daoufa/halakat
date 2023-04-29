package com.darquraan.halakat.controller;

import com.darquraan.halakat.controller.dto.HalakaDto;
import com.darquraan.halakat.service.HalakaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/halakat")
public class HalakatController {

    private HalakaService halakaService;
    @GetMapping("/{halakaId}")
    public HalakaDto getHalakaById(@PathVariable("halakaId") Long halakaId) {
        return halakaService.getHalakaById(halakaId);
    }
}
