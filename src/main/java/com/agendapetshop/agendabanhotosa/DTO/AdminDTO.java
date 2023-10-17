package com.agendapetshop.agendabanhotosa.DTO;

import com.agendapetshop.agendabanhotosa.entity.AdminEntity;
import org.springframework.beans.BeanUtils;

public class AdminDTO {
    private Long idDto;
    private String nomeDto;
    private String sobrenomeDto;
    private String usuarioDto;
    private String senhaDto;
    private String emailDto;
    public AdminDTO(AdminEntity adminEntity) {
        BeanUtils.copyProperties(adminEntity, this);
    }
    public AdminDTO() {

    }

    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }

    public String getNomeDto() {
        return nomeDto;
    }

    public void setNomeDto(String nomeDto) {
        this.nomeDto = nomeDto;
    }

    public String getSobrenomeDto() {
        return sobrenomeDto;
    }

    public void setSobrenomeDto(String sobrenomeDto) {
        this.sobrenomeDto = sobrenomeDto;
    }

    public String getUsuarioDto() {
        return usuarioDto;
    }

    public void setUsuarioDto(String usuarioDto) {
        this.usuarioDto = usuarioDto;
    }

    public String getSenhaDto() {
        return senhaDto;
    }

    public void setSenhaDto(String senhaDto) {
        this.senhaDto = senhaDto;
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }
}
