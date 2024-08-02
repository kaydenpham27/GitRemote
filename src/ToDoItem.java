public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    ToDoItem (String _description) {
        description = _description;
        isDone = false;
    }

    public String getDescription() {
        return description;
    }
    public boolean isDone() {
        return isDone;
    }
    public void setDescription(String _description) {
        description = _description;
    }
    public void setIsDone(boolean status) {
        isDone = status;
    }
}