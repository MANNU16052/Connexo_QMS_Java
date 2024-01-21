package com.QMS.Java.Service;

import com.QMS.Java.Entity.Division;
import com.QMS.Java.Repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DivisionService {
@Autowired
private DivisionRepository divisionRepository;
    public Division SaveDivision(Division division) {
        return divisionRepository.save(division); // Use the inherited save method.
    }
    public List<Division> getAllEntities() {
        return divisionRepository.findAll();
    }
}
