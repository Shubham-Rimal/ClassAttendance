package org.example.models;

public class Attendance {
    int id;
    int classId;
    int userId;

    String status;

    public Attendance(int id, int classId, int userId, String status) {
        this.classId = classId;
        this.userId = userId;
        this.id = id;
        this.status = status;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
