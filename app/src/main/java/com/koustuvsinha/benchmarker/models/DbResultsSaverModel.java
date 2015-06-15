package com.koustuvsinha.benchmarker.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by koustuv on 13/6/15.
 */
public class DbResultsSaverModel {

    private long id;
    private int dbType;
    private String testDate;
    private String testTime;
    private int readTime;
    private int insertTime;
    private int updateTime;
    private int deleteTime;
    private int numRows;

    public DbResultsSaverModel() {
        Date date = Calendar.getInstance().getTime();
        this.id = 0;
        this.testDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(date);
        this.testTime = new SimpleDateFormat("hh:mm",Locale.ENGLISH).format(date);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDbType() {
        return dbType;
    }

    public void setDbType(int dbType) {
        this.dbType = dbType;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public int getReadTime() {
        return readTime;
    }

    public void setReadTime(int readTime) {
        this.readTime = readTime;
    }

    public int getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(int insertTime) {
        this.insertTime = insertTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    public int getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(int deleteTime) {
        this.deleteTime = deleteTime;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public long getInsertOps() {
        return (long)(((double)numRows/insertTime)*1000);
    }

    public long getReadOps() {
        return (long)(((double)numRows/readTime)*1000);
    }

    public long getUpdateOps() {
        return (long)(((double)numRows/updateTime)*1000);
    }

    public long getDeleteOps() {
        return (long)(((double)numRows/deleteTime)*1000);
    }


    @Override
    public String toString() {
        return "DbResultsSaverModel{" +
                "id=" + id +
                ", dbType=" + dbType +
                ", testDate='" + testDate + '\'' +
                ", testTime='" + testTime + '\'' +
                ", readTime=" + readTime +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", deleteTime=" + deleteTime +
                ", numRows=" + numRows +
                '}';
    }
}