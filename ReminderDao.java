/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author pc
 */
public class ReminderDao {
    private int RemId;
    private String RemName;
    private String RemDate;
    private String RemTime;

    public int getRemId() {
        return RemId;
    }

    public void setRemId(int RemId) {
        this.RemId = RemId;
    }

    public String getRemName() {
        return RemName;
    }

    public void setRemName(String RemName) {
        this.RemName = RemName;
    }

    public String getRemDate() {
        return RemDate;
    }

    public void setRemDate(String RemDate) {
        this.RemDate = RemDate;
    }

    public String getRemTime() {
        return RemTime;
    }

    public void setRemTime(String RemTime) {
        this.RemTime = RemTime;
    }

    
}
