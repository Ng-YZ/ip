public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void printTask() {
        String status = getStatusIcon();
        System.out.println("[" + status + "] " + description);
    }

    public void markAsDone() {
        this.isDone = true;
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("  [" + getStatusIcon() + "] " + description);
    }
    public void unmark() {
        this.isDone = false;
        System.out.println("Ok, I've marked this task as not done yet:");
        System.out.println("  [" + getStatusIcon() + "] " + description);
    }
}
