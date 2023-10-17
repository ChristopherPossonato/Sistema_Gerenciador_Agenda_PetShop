package com.agendapetshop.agendabanhotosa.service;

import com.agendapetshop.agendabanhotosa.DTO.AdminDTO;
import com.agendapetshop.agendabanhotosa.entity.AdminEntity;
import com.agendapetshop.agendabanhotosa.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<AdminDTO> listarTodos() {
        List<AdminEntity> adminEntities = adminRepository.findAll();
        return adminEntities.stream().map(AdminDTO::new).toList();
    }

    public void inserir(AdminDTO adminDTO) {
        AdminEntity adminEntity = new AdminEntity(adminDTO);
        adminRepository.save(adminEntity);
    }

    public AdminDTO alterar(AdminDTO adminDTO) {
        AdminEntity adminEntity = new AdminEntity(adminDTO);
        return new AdminDTO(adminRepository.save(adminEntity));
    }

    public void excluir(Long id) {
        AdminEntity adminEntity = adminRepository.findById(id).get();
        adminRepository.delete(adminEntity);
    }

    public AdminDTO buscarId(Long id) {
        return new AdminDTO(adminRepository.findById(id).get());
    }
}
