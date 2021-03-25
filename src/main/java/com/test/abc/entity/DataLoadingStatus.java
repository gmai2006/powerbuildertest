/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.test.abc.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "data_loading_status")
public class DataLoadingStatus {

  @Basic
  @Column(name = "update_Date", length = 10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date updateDate;

  @Basic private String status;

  @Basic private Long records;

  @Basic @NotNull @Id private String id;

  public DataLoadingStatus() {}

  /**
   * A parametered Constructor.
   *
   * @param type loadind status type (profiles, equipments).
   * @param status The status of the loading.
   */
  public DataLoadingStatus(String type, Enum<Loadingstatus> status) {
    this.id = type;
    this.status = status.name();
    this.updateDate = new java.util.Date(System.currentTimeMillis());
  }

  public String getId() {
    return id;
  }

  public void setId(String type) {
    this.id = type;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(id + " LOADING [\n");
    builder.append("updateDate=" + String.valueOf(this.updateDate) + ", ");
    builder.append("status=" + String.valueOf(this.status) + ", ");
    return builder.toString();
  }

  public java.util.Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.util.Date updateDate) {
    this.updateDate = updateDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getRecords() {
    return records;
  }

  public void setRecords(Long records) {
    this.records = records;
  }
}
