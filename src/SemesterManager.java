/**
 * This semester models SemesterManager objects. A SemesterManager has a list of current selected courses for the
 * semester. This class allows users to manage courses in each semester
 */
public class SemesterManager {
    protected MyCourseList myCourses; // list of my courses

    /**
     * Constructor: constructs a SemesterManager with myCourse and not selected courses
     */
    public SemesterManager(){
        myCourses = new MyCourseList();
    }

    /**
     * Appends a NEW course to the end of myCourse list; Don't add if there is already a same course exist
     * @param course - the course to be added to myCourse list
     */
    public void addCourse(Course course) {
        if (myCourses.contains(course) != true) {
            myCourses.add(course);
        }
    }

    public boolean removeCourse(int index){
        if (index < 0 || index >= myCourses.size()){
            return false;
        }
        myCourses.remove(index);
        return true;
    }
}
