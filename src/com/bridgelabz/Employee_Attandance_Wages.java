package com.bridgelabz;

public class Employee_Attandance_Wages {
    static final int WAGES_PER_HOUR = 20;
    static final int FULL_DAY_PER_HOUR = 8;
    static final int PART_TIME_HOUR=4;

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) % 3;
        int dailyWages = 0;
        switch (num) {
            case 2:
                dailyWages = WAGES_PER_HOUR * FULL_DAY_PER_HOUR;
                System.out.println("Employee is Present...");
                break;
            case 1:
                dailyWages = WAGES_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee is Part Time...");
                break;
            default:
                System.out.println("Employee is Absent...");
        }
            System.out.println("Employees Dayily Wages : " + dailyWages);
        }
    }
