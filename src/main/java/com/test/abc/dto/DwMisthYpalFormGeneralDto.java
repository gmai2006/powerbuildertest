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

package com.test.abc.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

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

public class DwMisthYpalFormGeneralDto implements Serializable {
  private static final long serialVersionUID = 161096104226660809L;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: adt. */
  private java.lang.String adt;

  /** Description: mitroo. */
  private java.lang.String mitroo;

  /** Description: afm. */
  private java.lang.String afm;

  /** Description: doy. */
  private java.lang.String doy;

  /** Description: birthdate. */
  private java.util.Date birthdate;

  /** Description: homephone. */
  private java.lang.String homephone;

  /** Description: mobilphone. */
  private java.lang.String mobilphone;

  /** Description: sex. */
  private java.lang.String sex;

  /** Description: spouse. */
  private java.lang.String spouse;

  /** Description: childs. */
  private java.lang.Integer childs;

  /** Description: prostmeli. */
  private java.lang.Integer prostmeli;

  /** Description: city. */
  private java.lang.String city;

  /** Description: area. */
  private java.lang.String area;

  /** Description: address. */
  private java.lang.String address;

  /** Description: tk. */
  private java.lang.String tk;

  /** Description: email. */
  private java.lang.String email;

  /** Description: kodtmima. */
  private java.lang.String kodtmima;

  /** Description: kodidikot. */
  private java.lang.String kodidikot;

  /** Description: jobtitle. */
  private java.lang.String jobtitle;

  /** Description: hireddate. */
  private java.util.Date hireddate;

  /** Description: rehireddate. */
  private java.util.Date rehireddate;

  /** Description: termdate. */
  private java.util.Date termdate;

  /** Description: termreason. */
  private java.lang.String termreason;

  /** Description: jobphone. */
  private java.lang.String jobphone;

  /** Description: intphone. */
  private java.lang.String intphone;

  /** Description: klimakio. */
  private java.lang.Integer klimakio;

  /** Description: bathmos. */
  private java.lang.String bathmos;

  /** Description: klados. */
  private java.lang.String klados;

  /** Description: bank. */
  private java.lang.String bank;

  /** Description: bankno. */
  private java.lang.String bankno;

  /** Description: exeldate. */
  private java.util.Date exeldate;

  /** Description: kodthesi. */
  private java.lang.String kodthesi;

  /** Description: kodoikog. */
  private java.lang.String kodoikog;

  /** Description: kodtamio. */
  private java.lang.String kodtamio;

  /** Description: mothername. */
  private java.lang.String mothername;

  /** Description: newexeldate. */
  private java.util.Date newexeldate;

  public DwMisthYpalFormGeneralDto() {}

  public DwMisthYpalFormGeneralDto(
      java.lang.Integer kodypal,
      java.lang.String kodxrisi,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.String adt,
      java.lang.String mitroo,
      java.lang.String afm,
      java.lang.String doy,
      java.util.Date birthdate,
      java.lang.String homephone,
      java.lang.String mobilphone,
      java.lang.String sex,
      java.lang.String spouse,
      java.lang.Integer childs,
      java.lang.Integer prostmeli,
      java.lang.String city,
      java.lang.String area,
      java.lang.String address,
      java.lang.String tk,
      java.lang.String email,
      java.lang.String kodtmima,
      java.lang.String kodidikot,
      java.lang.String jobtitle,
      java.util.Date hireddate,
      java.util.Date rehireddate,
      java.util.Date termdate,
      java.lang.String termreason,
      java.lang.String jobphone,
      java.lang.String intphone,
      java.lang.Integer klimakio,
      java.lang.String bathmos,
      java.lang.String klados,
      java.lang.String bank,
      java.lang.String bankno,
      java.util.Date exeldate,
      java.lang.String kodthesi,
      java.lang.String kodoikog,
      java.lang.String kodtamio,
      java.lang.String mothername,
      java.util.Date newexeldate) {
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.adt = adt;
    this.mitroo = mitroo;
    this.afm = afm;
    this.doy = doy;
    this.birthdate = birthdate;
    this.homephone = homephone;
    this.mobilphone = mobilphone;
    this.sex = sex;
    this.spouse = spouse;
    this.childs = childs;
    this.prostmeli = prostmeli;
    this.city = city;
    this.area = area;
    this.address = address;
    this.tk = tk;
    this.email = email;
    this.kodtmima = kodtmima;
    this.kodidikot = kodidikot;
    this.jobtitle = jobtitle;
    this.hireddate = hireddate;
    this.rehireddate = rehireddate;
    this.termdate = termdate;
    this.termreason = termreason;
    this.jobphone = jobphone;
    this.intphone = intphone;
    this.klimakio = klimakio;
    this.bathmos = bathmos;
    this.klados = klados;
    this.bank = bank;
    this.bankno = bankno;
    this.exeldate = exeldate;
    this.kodthesi = kodthesi;
    this.kodoikog = kodoikog;
    this.kodtamio = kodtamio;
    this.mothername = mothername;
    this.newexeldate = newexeldate;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getSurname() {
    return this.surname;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getFathername() {
    return this.fathername;
  }

  public java.lang.String getAdt() {
    return this.adt;
  }

  public java.lang.String getMitroo() {
    return this.mitroo;
  }

  public java.lang.String getAfm() {
    return this.afm;
  }

  public java.lang.String getDoy() {
    return this.doy;
  }

  public java.util.Date getBirthdate() {
    return this.birthdate;
  }

  public java.lang.String getHomephone() {
    return this.homephone;
  }

  public java.lang.String getMobilphone() {
    return this.mobilphone;
  }

  public java.lang.String getSex() {
    return this.sex;
  }

  public java.lang.String getSpouse() {
    return this.spouse;
  }

  public java.lang.Integer getChilds() {
    return this.childs;
  }

  public java.lang.Integer getProstmeli() {
    return this.prostmeli;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getArea() {
    return this.area;
  }

  public java.lang.String getAddress() {
    return this.address;
  }

  public java.lang.String getTk() {
    return this.tk;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getKodtmima() {
    return this.kodtmima;
  }

  public java.lang.String getKodidikot() {
    return this.kodidikot;
  }

  public java.lang.String getJobtitle() {
    return this.jobtitle;
  }

  public java.util.Date getHireddate() {
    return this.hireddate;
  }

  public java.util.Date getRehireddate() {
    return this.rehireddate;
  }

  public java.util.Date getTermdate() {
    return this.termdate;
  }

  public java.lang.String getTermreason() {
    return this.termreason;
  }

  public java.lang.String getJobphone() {
    return this.jobphone;
  }

  public java.lang.String getIntphone() {
    return this.intphone;
  }

  public java.lang.Integer getKlimakio() {
    return this.klimakio;
  }

  public java.lang.String getBathmos() {
    return this.bathmos;
  }

  public java.lang.String getKlados() {
    return this.klados;
  }

  public java.lang.String getBank() {
    return this.bank;
  }

  public java.lang.String getBankno() {
    return this.bankno;
  }

  public java.util.Date getExeldate() {
    return this.exeldate;
  }

  public java.lang.String getKodthesi() {
    return this.kodthesi;
  }

  public java.lang.String getKodoikog() {
    return this.kodoikog;
  }

  public java.lang.String getKodtamio() {
    return this.kodtamio;
  }

  public java.lang.String getMothername() {
    return this.mothername;
  }

  public java.util.Date getNewexeldate() {
    return this.newexeldate;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setSurname(java.lang.String surname) {
    this.surname = surname;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setFathername(java.lang.String fathername) {
    this.fathername = fathername;
  }

  public void setAdt(java.lang.String adt) {
    this.adt = adt;
  }

  public void setMitroo(java.lang.String mitroo) {
    this.mitroo = mitroo;
  }

  public void setAfm(java.lang.String afm) {
    this.afm = afm;
  }

  public void setDoy(java.lang.String doy) {
    this.doy = doy;
  }

  public void setBirthdate(java.util.Date birthdate) {
    this.birthdate = birthdate;
  }

  public void setHomephone(java.lang.String homephone) {
    this.homephone = homephone;
  }

  public void setMobilphone(java.lang.String mobilphone) {
    this.mobilphone = mobilphone;
  }

  public void setSex(java.lang.String sex) {
    this.sex = sex;
  }

  public void setSpouse(java.lang.String spouse) {
    this.spouse = spouse;
  }

  public void setChilds(java.lang.Integer childs) {
    this.childs = childs;
  }

  public void setProstmeli(java.lang.Integer prostmeli) {
    this.prostmeli = prostmeli;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setArea(java.lang.String area) {
    this.area = area;
  }

  public void setAddress(java.lang.String address) {
    this.address = address;
  }

  public void setTk(java.lang.String tk) {
    this.tk = tk;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setKodtmima(java.lang.String kodtmima) {
    this.kodtmima = kodtmima;
  }

  public void setKodidikot(java.lang.String kodidikot) {
    this.kodidikot = kodidikot;
  }

  public void setJobtitle(java.lang.String jobtitle) {
    this.jobtitle = jobtitle;
  }

  public void setHireddate(java.util.Date hireddate) {
    this.hireddate = hireddate;
  }

  public void setRehireddate(java.util.Date rehireddate) {
    this.rehireddate = rehireddate;
  }

  public void setTermdate(java.util.Date termdate) {
    this.termdate = termdate;
  }

  public void setTermreason(java.lang.String termreason) {
    this.termreason = termreason;
  }

  public void setJobphone(java.lang.String jobphone) {
    this.jobphone = jobphone;
  }

  public void setIntphone(java.lang.String intphone) {
    this.intphone = intphone;
  }

  public void setKlimakio(java.lang.Integer klimakio) {
    this.klimakio = klimakio;
  }

  public void setBathmos(java.lang.String bathmos) {
    this.bathmos = bathmos;
  }

  public void setKlados(java.lang.String klados) {
    this.klados = klados;
  }

  public void setBank(java.lang.String bank) {
    this.bank = bank;
  }

  public void setBankno(java.lang.String bankno) {
    this.bankno = bankno;
  }

  public void setExeldate(java.util.Date exeldate) {
    this.exeldate = exeldate;
  }

  public void setKodthesi(java.lang.String kodthesi) {
    this.kodthesi = kodthesi;
  }

  public void setKodoikog(java.lang.String kodoikog) {
    this.kodoikog = kodoikog;
  }

  public void setKodtamio(java.lang.String kodtamio) {
    this.kodtamio = kodtamio;
  }

  public void setMothername(java.lang.String mothername) {
    this.mothername = mothername;
  }

  public void setNewexeldate(java.util.Date newexeldate) {
    this.newexeldate = newexeldate;
  }
}
