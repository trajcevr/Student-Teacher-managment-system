package net.javaguides.sms.service.impl;

import net.javaguides.sms.model.Teacher;
import net.javaguides.sms.repository.TeacherRepository;
import net.javaguides.sms.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void deleteTeacherById(Long id) {

    }
}
