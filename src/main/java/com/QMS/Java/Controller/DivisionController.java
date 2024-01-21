package com.QMS.Java.Controller;


import com.QMS.Java.Dtos.DivisionRequest;
import com.QMS.Java.Entity.Division;
import com.QMS.Java.Repository.DivisionRepository;
import com.QMS.Java.Service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Division/api")
public class DivisionController {
    @Autowired
    private DivisionService service;
    @Autowired
    private DivisionRepository divisionRepository;

    @PostMapping("/create")
    public Division createDivision(@RequestBody DivisionRequest request){
        return divisionRepository.save(request.getDivision());
    }
    @GetMapping("/findAllDivision")
    public List<Division> findAllDivision(){
        return divisionRepository.findAll();
    }
}
