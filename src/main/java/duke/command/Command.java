package duke.command;

import duke.TaskList;

/**
 * Represents a command.
 */
public abstract class Command {
    protected TaskList tasks;
    protected boolean isExit;
    protected String commandWord;
    protected String description;

    /**
     * Executes the command in the child class and return the result.
     * @return the result of user command.
     */
    public abstract CommandResult execute();

    /**
     * Supply the data that the command will operate on.
     * @param tasks the TaskList to operate on.
     */
    public void setTasks(TaskList tasks) {
        this.tasks = tasks;
    }

    /**
     * Check if the user command entered is to exit the application.
     * @return true if exit command is entered.
     */
    public boolean isExit () {
        return isExit;
    }
}
