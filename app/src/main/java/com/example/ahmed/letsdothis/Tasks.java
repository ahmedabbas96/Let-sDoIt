package com.example.ahmed.letsdothis;

import java.util.Date;

class Tasks {
    int id;
    String TaskName;
    int TaskListID;
    boolean Status = false;
    Date date;

    // constructors
    public Tasks() {
    }

    public Tasks(String TaskName) {
        this.TaskName = TaskName;
    }

    public Tasks(int id, String TaskName) {
        this.id = id;
        this.TaskName = TaskName;
    }


    public Tasks(int id, String TaskName, boolean Status) {
        this.id = id;
        this.TaskName = TaskName;
        this.Status = Status;
    }

    public Tasks(int id, String TaskName, int TaskListID, boolean Status) {
        this.id = id;
        this.TaskName = TaskName;
        this.Status = Status;
        this.TaskListID = TaskListID;
    }

    public Tasks(int id, String TaskName, int TaskListID, boolean Status, Date date ) {
        this.id = id;
        this.TaskName = TaskName;
        this.Status = Status;
        this.TaskListID = TaskListID;
        this.date = date;
    }




    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }
    public void setStatus(boolean Status){this.Status=Status;}
    public void setTaskListID(int TaskListID){this.TaskListID=TaskListID;}
    public void setDate(Date date){this.date=date;}

    // getters
    public int getId() {
        return this.id;
    }
    public String getTaskName() {
        return this.TaskName;
    }
    public boolean getStatus(){return this.Status;}
    public int getTaskListID(){return TaskListID;}
    public Date getDate() { return date; }
}