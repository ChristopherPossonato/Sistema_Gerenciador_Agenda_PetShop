package com.agendapetshop.agendabanhotosa.repository;

import com.agendapetshop.agendabanhotosa.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

}
