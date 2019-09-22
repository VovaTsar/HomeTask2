package com.task.entity;

/**
 * id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа.Scls
 */
public class Student extends Person {
    private String address;
    private String tel;
    private final String faculty;
    private final int course;
    private final String group;

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

   public Student(StudentBuilder studentBuilder, Person person) {
        super(person);
        this.address=studentBuilder.address;
        this.tel=studentBuilder.tel;
        this.faculty = studentBuilder.faculty;
        this.course = studentBuilder.course;
        this.group = studentBuilder.group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                super.toString()+
                '}';
    }

    public static class StudentBuilder {
        private String address;
        private String tel;
        private String faculty;
        private int course;
        private String group;

        public StudentBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder withTel(String tel) {
            this.tel = tel;
            return this;
        }

        public StudentBuilder withFaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }

        public StudentBuilder withCourse(int course) {
            if (course<0||course>7){
                throw new IllegalArgumentException("Course must be in range 1 to 6");
            }
            this.course = course;
            return this;
        }

        public StudentBuilder withGroup(String group) {
            this.group = group;
            return this;
        }

        public Student build(Person person) {
            return new Student(this, person);
        }
    }
}
