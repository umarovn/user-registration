
public class Student extends User {

        private String studentName;
        private String studentLastname;
        private String course;
        private Long studentId;
        private Integer age;
        private Integer studentYear;

        public Student(String studentName, String studentLastname, String course, Long studentId, Integer age, Integer studentYear, String email, String password) {
            super(email, password);
            this.studentName = studentName;
            this.studentLastname = studentLastname;
            this.course = course;
            this.studentId = studentId;
            this.age = age;
            this.studentYear = studentYear;
        }


        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getStudentLastname() {
            return studentLastname;
        }

        public void setStudentLastname(String studentLastname) {
            this.studentLastname = studentLastname;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getStudentYear() {
            return studentYear;
        }

        public void setStudentYear(Integer studentYear) {
            this.studentYear = studentYear;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "student Name='" + studentName + '\'' +
                    ", student Lastname='" + studentLastname + '\'' +
                    ", course ='" + course + '\'' +
                    ", student id =" + studentId +
                    ", age =" + age +
                    ", student year =" + studentYear +
                    '}';
        }
    }

