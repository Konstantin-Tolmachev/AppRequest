package com.practikum.naumen.repo;

import com.practikum.naumen.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Collection;

public interface RoleRepository extends JpaRepository<Role, Long> {

//    @Modifying
//    @Query(value = "insert into Role (id,name,rusName) VALUES (3,'eee','eee')", nativeQuery = true)
//    @Transactional
//    void logURI(@Param("insertLink") String insertLink, @Param("id") Long id);

//    @Query("SELECT u FROM Request u WHERE u.toWhom = 'Электромонтер' AND u.status = 'Не выполнено' OR u.toWhom = 'Электромонтер' AND u.status = 'На выполнении'  ORDER BY u.id DESC")
//    Collection<Request> findElectroByOrderByIdDesc();

//    @Query("INSERT  INTO t_role (id, name, rusName) VALUES (3,d,d)")
//    Collection<Role> findElectroByOrderByIdDesc();



}


