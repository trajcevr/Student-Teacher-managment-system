package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
