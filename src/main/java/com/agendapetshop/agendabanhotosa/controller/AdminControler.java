package com.agendapetshop.agendabanhotosa.controller;


import com.agendapetshop.agendabanhotosa.DTO.AdminDTO;
import com.agendapetshop.agendabanhotosa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminControler {
    @Autowired
    private AdminService adminService;
    @GetMapping
    public List<AdminDTO> listarTodos() {
        return adminService.listarTodos();
    }
    @PostMapping
    public void inserir(@RequestBody AdminDTO adminDTO) {
        adminService.inserir(adminDTO);
    }
    @PutMapping
    public AdminDTO alterar(@RequestBody AdminDTO adminDTO) {
        return adminService.alterar(adminDTO);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        adminService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
