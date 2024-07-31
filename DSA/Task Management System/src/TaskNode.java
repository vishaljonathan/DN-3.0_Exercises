class TaskNode {
    Task task;
    TaskNode next;

    TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}
class TaskLinkedList
{
    private TaskNode head;

    // Add task to the end of the list
    public void addTask(Task task)
    {
        TaskNode newNode = new TaskNode(task);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            TaskNode current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search task by taskId
    public Task searchTask(int taskId)
    {
        TaskNode current = head;
        while (current != null)
        {
            if (current.task.taskId == taskId)
            {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Delete task by taskId
    public boolean deleteTask(int taskId)
    {
        if (head == null)
        {
            return false; // List is empty
        }

        if (head.task.taskId == taskId)
        {
            head = head.next; // Delete head
            return true;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != taskId)
        {
            current = current.next;
        }

        if (current.next == null)
        {
            return false; // Task not found
        }

        current.next = current.next.next; // Delete node
        return true;
    }

    // Traverse and print all tasks
    public void traverseTasks()
    {
        TaskNode current = head;
        while (current != null)
        {
            System.out.println(current.task);
            current = current.next;
        }
    }
}