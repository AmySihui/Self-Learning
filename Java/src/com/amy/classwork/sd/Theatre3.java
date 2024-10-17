package com.amy.classwork.sd;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Theatre3 {
    private String day, message;

    public Theatre3() {
    }

    public void compute() {
        switch (day) {
            case "Monday", "Tuesday": {
                message = "... ticket costs E5";
                break;
            }
            case "Wednesday", "Thursday": {
                message = "... ticket costs E10";
                break;
            }
            case "Friday": {
                message = "... ticket costs E20";
                break;
            }
            case "Saturday", "Sunday": {
                message = "... ticket costs E30";
                break;
            }

            default: {
                message = "... invalid day entered";
            }
        }
    }


    public Theatre3(String day, String message) {
        this.day = day;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
