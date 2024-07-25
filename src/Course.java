/**
 * Instantiable class for Course objects.
 */
public class Course {
    private int courseNumber;
    private String courseTitle;
    private String courseLevel;
    private String courseDescription;
    private int creditHours;
    private boolean isCompleted;
    private int finalGrade;

    // Constructor
    public Course(int courseNumber, String courseTitle, String courseDescription, int creditHours, boolean isCompleted,
                  int finalGrade){
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.courseLevel = courseLevel;
        this.courseDescription = courseDescription;
        this.creditHours = creditHours;
        this.isCompleted = isCompleted;
        this.finalGrade = finalGrade;
    }

    // Getter methods
    public int getCourseNumber(){
        return this.courseNumber;
    }
    public String getCourseTitle(){
        return this.courseTitle;
    }
    public String getCourseLevel(){
        return this.courseLevel;
    }
    public String getCourseDescription(){
        return this.getCourseDescription();
    }
    public int getCreditHours(){
        return this.creditHours;
    }
    public boolean isCompleted(){
        return this.isCompleted;
    }
    public int getFinalGrade() {
        return this.finalGrade;
    }
    // Other methods

    /**
     * Mark this course as completed
     */
    public void markCompleted(){
        this.isCompleted = true;
    }

    /**
     * Returns the String representation of the Course Object
     * @return the Course as a String
     */
    public String toString(){
        return courseNumber + " " + courseTitle + "(" + creditHours + ") \n    " + courseLevel + "\n    "+
                courseDescription ;
    }
}
