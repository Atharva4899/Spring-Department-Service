package com.atk.department.service;

import com.atk.department.entity.Department;
import com.atk.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        log.info("Inside getDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(id);
    }
}
