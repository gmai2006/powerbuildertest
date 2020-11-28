/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.test.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

@Entity
@Table(name = "misth_ypal")
public class MisthYpal implements Serializable {
  private static final long serialVersionUID = 160532722779641579L;
  /** Description: kodypal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodypal\"")
  private Float id;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private String kodxrisi;
  /** Description: kodtmima. */
  @Basic
  @Column(name = "kodtmima")
  private String kodtmima;
  /** Description: kodidikot. */
  @Basic
  @Column(name = "kodidikot")
  private String kodidikot;
  /** Description: kodthesi. */
  @Basic
  @Column(name = "kodthesi")
  private String kodthesi;
  /** Description: kodoikog. */
  @Basic
  @Column(name = "kodoikog")
  private String kodoikog;
  /** Description: kodtamio. */
  @Basic
  @Column(name = "kodtamio")
  private String kodtamio;
  /** Description: surname. */
  @Basic
  @Column(name = "surname")
  private String surname;
  /** Description: name. */
  @Basic
  @Column(name = "name")
  private String name;
  /** Description: fathername. */
  @Basic
  @Column(name = "fathername")
  private String fathername;
  /** Description: mitroo. */
  @Basic
  @Column(name = "mitroo")
  private String mitroo;
  /** Description: adt. */
  @Basic
  @Column(name = "adt")
  private String adt;
  /** Description: afm. */
  @Basic
  @Column(name = "afm")
  private String afm;
  /** Description: doy. */
  @Basic
  @Column(name = "doy")
  private String doy;
  /** Description: bankno. */
  @Basic
  @Column(name = "bankno")
  private String bankno;
  /** Description: bank. */
  @Basic
  @Column(name = "bank")
  private String bank;
  /** Description: childs. */
  @Basic
  @Column(name = "childs")
  private Integer childs;
  /** Description: prostmeli. */
  @Basic
  @Column(name = "prostmeli")
  private Integer prostmeli;
  /** Description: klimakio. */
  @Basic
  @Column(name = "klimakio")
  private Integer klimakio;
  /** Description: bathmos. */
  @Basic
  @Column(name = "bathmos")
  private String bathmos;
  /** Description: klados. */
  @Basic
  @Column(name = "klados")
  private String klados;
  /** Description: birthdate. */
  @Basic
  @Column(name = "birthdate")
  private java.util.Date birthdate;
  /** Description: hireddate. */
  @Basic
  @Column(name = "hireddate")
  private java.util.Date hireddate;
  /** Description: homephone. */
  @Basic
  @Column(name = "homephone")
  private String homephone;
  /** Description: mobilphone. */
  @Basic
  @Column(name = "mobilphone")
  private String mobilphone;
  /** Description: sex. */
  @Basic
  @Column(name = "sex")
  private String sex;
  /** Description: spouse. */
  @Basic
  @Column(name = "spouse")
  private String spouse;
  /** Description: city. */
  @Basic
  @Column(name = "city")
  private String city;
  /** Description: area. */
  @Basic
  @Column(name = "area")
  private String area;
  /** Description: address. */
  @Basic
  @Column(name = "address")
  private String address;
  /** Description: tk. */
  @Basic
  @Column(name = "tk")
  private String tk;
  /** Description: email. */
  @Basic
  @Column(name = "email")
  private String email;
  /** Description: jobtitle. */
  @Basic
  @Column(name = "jobtitle")
  private String jobtitle;
  /** Description: rehireddate. */
  @Basic
  @Column(name = "rehireddate")
  private java.util.Date rehireddate;
  /** Description: termdate. */
  @Basic
  @Column(name = "termdate")
  private java.util.Date termdate;
  /** Description: termreason. */
  @Basic
  @Column(name = "termreason")
  private String termreason;
  /** Description: jobphone. */
  @Basic
  @Column(name = "jobphone")
  private String jobphone;
  /** Description: intphone. */
  @Basic
  @Column(name = "intphone")
  private String intphone;
  /** Description: exeldate. */
  @Basic
  @Column(name = "exeldate")
  private java.util.Date exeldate;
  /** Description: mothername. */
  @Basic
  @Column(name = "mothername")
  private String mothername;
  /** Description: newexeldate. */
  @Basic
  @Column(name = "newexeldate")
  private java.util.Date newexeldate;

  public MisthYpal() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public String getKodxrisi() {
    return this.kodxrisi;
  }

  public String getKodtmima() {
    return this.kodtmima;
  }

  public String getKodidikot() {
    return this.kodidikot;
  }

  public String getKodthesi() {
    return this.kodthesi;
  }

  public String getKodoikog() {
    return this.kodoikog;
  }

  public String getKodtamio() {
    return this.kodtamio;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getName() {
    return this.name;
  }

  public String getFathername() {
    return this.fathername;
  }

  public String getMitroo() {
    return this.mitroo;
  }

  public String getAdt() {
    return this.adt;
  }

  public String getAfm() {
    return this.afm;
  }

  public String getDoy() {
    return this.doy;
  }

  public String getBankno() {
    return this.bankno;
  }

  public String getBank() {
    return this.bank;
  }

  public Integer getChilds() {
    return this.childs;
  }

  public Integer getProstmeli() {
    return this.prostmeli;
  }

  public Integer getKlimakio() {
    return this.klimakio;
  }

  public String getBathmos() {
    return this.bathmos;
  }

  public String getKlados() {
    return this.klados;
  }

  public java.util.Date getBirthdate() {
    return this.birthdate;
  }

  public java.util.Date getHireddate() {
    return this.hireddate;
  }

  public String getHomephone() {
    return this.homephone;
  }

  public String getMobilphone() {
    return this.mobilphone;
  }

  public String getSex() {
    return this.sex;
  }

  public String getSpouse() {
    return this.spouse;
  }

  public String getCity() {
    return this.city;
  }

  public String getArea() {
    return this.area;
  }

  public String getAddress() {
    return this.address;
  }

  public String getTk() {
    return this.tk;
  }

  public String getEmail() {
    return this.email;
  }

  public String getJobtitle() {
    return this.jobtitle;
  }

  public java.util.Date getRehireddate() {
    return this.rehireddate;
  }

  public java.util.Date getTermdate() {
    return this.termdate;
  }

  public String getTermreason() {
    return this.termreason;
  }

  public String getJobphone() {
    return this.jobphone;
  }

  public String getIntphone() {
    return this.intphone;
  }

  public java.util.Date getExeldate() {
    return this.exeldate;
  }

  public String getMothername() {
    return this.mothername;
  }

  public java.util.Date getNewexeldate() {
    return this.newexeldate;
  }

  public void setKodxrisi(String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodtmima(String kodtmima) {
    this.kodtmima = kodtmima;
  }

  public void setKodidikot(String kodidikot) {
    this.kodidikot = kodidikot;
  }

  public void setKodthesi(String kodthesi) {
    this.kodthesi = kodthesi;
  }

  public void setKodoikog(String kodoikog) {
    this.kodoikog = kodoikog;
  }

  public void setKodtamio(String kodtamio) {
    this.kodtamio = kodtamio;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFathername(String fathername) {
    this.fathername = fathername;
  }

  public void setMitroo(String mitroo) {
    this.mitroo = mitroo;
  }

  public void setAdt(String adt) {
    this.adt = adt;
  }

  public void setAfm(String afm) {
    this.afm = afm;
  }

  public void setDoy(String doy) {
    this.doy = doy;
  }

  public void setBankno(String bankno) {
    this.bankno = bankno;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public void setChilds(Integer childs) {
    this.childs = childs;
  }

  public void setProstmeli(Integer prostmeli) {
    this.prostmeli = prostmeli;
  }

  public void setKlimakio(Integer klimakio) {
    this.klimakio = klimakio;
  }

  public void setBathmos(String bathmos) {
    this.bathmos = bathmos;
  }

  public void setKlados(String klados) {
    this.klados = klados;
  }

  public void setBirthdate(java.util.Date birthdate) {
    this.birthdate = birthdate;
  }

  public void setHireddate(java.util.Date hireddate) {
    this.hireddate = hireddate;
  }

  public void setHomephone(String homephone) {
    this.homephone = homephone;
  }

  public void setMobilphone(String mobilphone) {
    this.mobilphone = mobilphone;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setSpouse(String spouse) {
    this.spouse = spouse;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setTk(String tk) {
    this.tk = tk;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setJobtitle(String jobtitle) {
    this.jobtitle = jobtitle;
  }

  public void setRehireddate(java.util.Date rehireddate) {
    this.rehireddate = rehireddate;
  }

  public void setTermdate(java.util.Date termdate) {
    this.termdate = termdate;
  }

  public void setTermreason(String termreason) {
    this.termreason = termreason;
  }

  public void setJobphone(String jobphone) {
    this.jobphone = jobphone;
  }

  public void setIntphone(String intphone) {
    this.intphone = intphone;
  }

  public void setExeldate(java.util.Date exeldate) {
    this.exeldate = exeldate;
  }

  public void setMothername(String mothername) {
    this.mothername = mothername;
  }

  public void setNewexeldate(java.util.Date newexeldate) {
    this.newexeldate = newexeldate;
  }
}
