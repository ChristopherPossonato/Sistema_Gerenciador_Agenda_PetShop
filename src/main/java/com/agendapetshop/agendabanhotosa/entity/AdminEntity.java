package com.agendapetshop.agendabanhotosa.entity;

import com.agendapetshop.agendabanhotosa.DTO.AdminDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
@Entity
@Table(name = "admin")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;
    @Column(nullable = false)
    private String adminNome;
    @Column(nullable = false)
    private String adminSobrenome;
    @Column(nullable = false, unique = true)
    private String adminUsuario;
    @Column(nullable = false)
    private String adminSenha;
    @Column(nullable = false)
    private String adminEmail;
    public AdminEntity(AdminDTO adminDTO) {
        BeanUtils.copyProperties(adminDTO, this);
    }
    public AdminEntity() {
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminNome() {
        return adminNome;
    }

    public void setAdminNome(String adminNome) {
        this.adminNome = adminNome;
    }

    public String getAdminSobrenome() {
        return adminSobrenome;
    }

    public void setAdminSobrenome(String adminSobrenome) {
        this.adminSobrenome = adminSobrenome;
    }

    public String getAdminUsuario() {
        return adminUsuario;
    }

    public void setAdminUsuario(String adminUsuario) {
        this.adminUsuario = adminUsuario;
    }

    public String getAdminSenha() {
        return adminSenha;
    }

    public void setAdminSenha(String adminSenha) {
        this.adminSenha = adminSenha;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "AdminEntity{" +
                "adminId=" + adminId +
                ", adminNome='" + adminNome + '\'' +
                ", adminSobrenome='" + adminSobrenome + '\'' +
                ", adminUsuario='" + adminUsuario + '\'' +
                ", adminSenha='" + adminSenha + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
