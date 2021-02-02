public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription(){
        return this.description;
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); //return tick or X symbols
    }

    public void setDone(){
        this.isDone = true;
    }

    public String toString(){
        return getStatusIcon() + " " + getDescription();
    }
}