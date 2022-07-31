public class school {

    private  List<Teacher> teachers;
    private  List<Student> students;
    private int totalManyEarned; // it should be keep adding moeny
    private int totalManySpant;

    // we will add All gets and sets becaseu we are going to add and update all of them one by one


    public school(List<Teacher> teachers, List<Student> students,int totalManyEarned, int totalManySpant) {
        this.teachers = teachers;
        this.students = students;
        this.totalManyEarned = totalManyEarned;
        this.totalManySpant = totalManySpant;

    }



    public List<Teacher> getTeachers() {
        return teachers;
    }

      /*
     to add a new teacher
    */
    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
    }

//    public void setTeachers(List<Teacher> teachers) {
//        this.teachers = teachers;
//    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student students) { // and you can name it as add student
        students = add.(student);
    }
    // set is the same update as a word almust


    public int getTotalManyEarned() {
        return totalManyEarned;
    }

    public void setTotalManyEarned(int totalManyEarned) {  // set almust the same update
        this.totalManyEarned += ManyEarned; // you can delete also this its not neccerty very much
    }

    public int getTotalManySpant() {
        return totalManySpant;
    }

    public void setTotalManySpant(int ManySpant) {
        this.totalManyEarned -= totalManySpant;
        // totalManyEarned = totalManyEarned- totalManySpant its the same
    }
}
