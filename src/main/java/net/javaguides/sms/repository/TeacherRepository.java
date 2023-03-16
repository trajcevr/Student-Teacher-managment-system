package net.javaguides.sms.repository;

import net.javaguides.sms.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher , Long> {
}
