package course.service.user;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import course.dto.UserRequestDto;
import course.dto.UserResponseDto;
import course.entity.Teacher;
import course.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherService implements UserService {
    private final ModelMapper modelMapper;
    private final TeacherRepository teacherRepository;

    @Override
    @Transactional
    public UserResponseDto saveUser(UserRequestDto userRequestDto) {
        Teacher teacher = new Teacher();
        modelMapper.map(userRequestDto.getTeacher(), teacher);
        modelMapper.map(userRequestDto, teacher);
        Teacher saveTeacher = teacherRepository.save(teacher);
        return modelMapper.map(saveTeacher, UserResponseDto.class);
    }

}
