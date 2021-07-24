public class Student extends User{
        private String studentName;
        private String studentLastname;
        private String course;
        private Long studentId;
        private Integer age;
        private Integer studentyear;

        public Student(String studentName,String studentLastname,String course,Long studentId,Integer age,Integer studentyear,String email,String password){
            super(email,password);
            this.studentName = studentName;
            this.studentLastname = studentLastname;
            this.course = course;
            this.studentId = studentId;
            this.age = age;
            this.studentyear = studentyear;
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

        public Long getStudentid() {
            return studentId;
        }

        public void setStudentid(Long studentid) {
            this.studentId = studentid;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getStudentyear() {
            return studentyear;
        }

        public void setStudentyear(Integer studentyear) {
            this.studentyear = studentyear;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentName='" + studentName + '\'' +
                    ", studentLastname='" + studentLastname + '\'' +
                    ", course='" + course + '\'' +
                    ", studentid=" + studentId +
                    ", age=" + age +
                    ", studentyear=" + studentyear +
                    '}';
        }
    }

