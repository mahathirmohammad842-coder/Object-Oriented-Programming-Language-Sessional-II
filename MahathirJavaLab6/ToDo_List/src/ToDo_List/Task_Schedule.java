package ToDo_List;

public class Task_Schedule {
    String description;
    boolean isDone;

    Task_Schedule(String description) {
        this.description = description;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return (isDone ? "[Done] ":"[Undone] ")+description;
    }
}
