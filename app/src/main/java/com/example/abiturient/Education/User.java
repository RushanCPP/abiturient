package com.example.abiturient.Education;

public class User {
    private String fullName;
    private Direction userDirection;
    private USE use;
    public User() {
        fullName = "Иванов Иван Иванович";
        userDirection = Direction.COMPUTER_SCIENCE;
        use = new USE();
    }

    public String getFullName() {
        return fullName;
    }

    public Direction getUserDirection() {
        return userDirection;
    }

    public void setUserDirection(Direction userDirection) {
        this.userDirection = userDirection;
    }

    public USE getUse() {
        return use;
    }
}
