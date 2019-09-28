package com.task.homework4.repository;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {

//
//    @Mock
//    private StudentRepository studentRepository;
//
//    @InjectMocks
//    private StudentServiceImpl studentService;
//
//    @After
//    public void resetMock() {
//        reset(studentRepository);
//    }
//
//    @Test
//    public void shouldSaveStudent() {
//        Student student = Student.builder().withId(1L).build();
//        when(studentRepository.save(any(Student.class))).thenReturn(student);
//
//        Student student1 = studentService.register(student);
//        assertNotNull(student1);
//
//    }
//
//    @Test
//    public void shouldFindStudentById() {
//        Student expected = Student.builder().withId(1L).withName("Vova").build();
//        when(studentRepository.findById(1L)).thenReturn(expected);
//
//        Student actual = studentService.findById(1L);
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void shouldReturnDeleteStudent() {
//        Student expected = Student.builder().withId(1L).build();
//        when(studentRepository.deleteById(1L)).thenReturn(expected);
//
//        Student actual = studentService.deleteById(1L);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldFindStudentByDepartment() {
//        Student students = Student.builder().withId(1L).withDepartment(new Department(1L, "kpi")).build();
//        ArrayList<Student> expected = new ArrayList<>();
//        expected.add(students);
//        when(studentRepository.findByDepartment(1L)).thenReturn(expected);
//
//        ArrayList<Student> actual = studentService.findByDepartment(1L);
//        assertArrayEquals(expected.toArray(), actual.toArray());
//
//    }
//
//    @Test
//    public void shouldFindStudentByYear() {
//        Student students = Student.builder().withId(1L).withBirthday(LocalDate.of(1999, 6, 11)).build();
//        ArrayList<Student> expected = new ArrayList<>();
//        expected.add(students);
//        when(studentRepository.findByYear(1920)).thenReturn(expected);
//
//        ArrayList<Student> actual = studentService.findByYear(1920);
//        assertArrayEquals(expected.toArray(), actual.toArray());
//
//
//    }
//
//    @Test
//    public void findByGroup() {
//        Student students = Student.builder().withId(1L).withGroup("IP-64").build();
//        ArrayList<Student> expected = new ArrayList<>();
//        expected.add(students);
//        when(studentRepository.findByGroup("IP-64")).thenReturn(expected);
//
//        ArrayList<Student> actual = studentService.findByGroup("IP-64");
//        assertArrayEquals(expected.toArray(), actual.toArray());
//
//
//    }
//
//    @Test
//    public void shouldFindStudentByDepartmentAndCourse() {
//        Student students = Student.builder().withId(1L).withDepartment(new Department(1L, "kpi")).withCourse(4).build();
//        ArrayList<Student> expected = new ArrayList<>();
//        expected.add(students);
//        when(studentRepository.findByDepartmentAndCourse(1L, 4)).thenReturn(expected);
//
//        ArrayList<Student> actual = studentService.findByDepartmentAndCourse(1L, 4);
//        assertArrayEquals(expected.toArray(), actual.toArray());
//    }

}