package com.test.abc.dto;

public class TestDto {
  private String descfilter;
  private String tablename;

  public TestDto() {}

  public TestDto(String desc, String tablename) {
    this.descfilter = desc;
    this.tablename = tablename;
  }

  public String getDescfilter() {
    return descfilter;
  }

  public void setDescfilter(String descfilter) {
    this.descfilter = descfilter;
  }

  public String getTablename() {
    return tablename;
  }

  public void setTablename(String tablename) {
    this.tablename = tablename;
  }
}
