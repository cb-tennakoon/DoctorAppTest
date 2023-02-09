package com.example.doctorAppTest.repository;

import com.example.doctorAppTest.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientInfoRepository extends JpaRepository<Patient,Long> {
    //Optional<Patient> findByName(String username);
//    @Query("SELECT p FROM Patient p WHERE CONCAT(p.name,' ', p.city, ' ',p.email, ' ',p.age) LIKE %?1%")
//    public List<Patient> search(String keyword);

    @Query("select s from Patient s where s.name like %:keyword%")
    List<Patient> search(@Param("keyword") String keyword);

//    @Query("SELECT p FROM Patient p WHERE CONCAT(p.name,' ',p.email) LIKE %?1%")
//    public List<Patient> search(String keyword);
//    public List<Patient> search(String keyword);
//    Patient findById(long id);
}
