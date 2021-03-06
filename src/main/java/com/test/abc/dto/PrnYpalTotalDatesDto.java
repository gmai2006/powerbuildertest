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
package com.test.abc.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class PrnYpalTotalDatesDto implements Serializable {
  private static final long serialVersionUID = 161647059592731953L;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: mitroo. */
  private java.lang.String mitroo;

  /** Description: adt. */
  private java.lang.String adt;

  /** Description: afm. */
  private java.lang.String afm;

  /** Description: doy. */
  private java.lang.String doy;

  /** Description: bankno. */
  private java.lang.String bankno;

  /** Description: bank. */
  private java.lang.String bank;

  /** Description: childs. */
  private java.lang.Integer childs;

  /** Description: prostmeli. */
  private java.lang.Integer prostmeli;

  /** Description: klimakio. */
  private java.lang.Integer klimakio;

  /** Description: bathmos. */
  private java.lang.String bathmos;

  /** Description: klados. */
  private java.lang.String klados;

  /** Description: birthdate. */
  private java.util.Date birthdate;

  /** Description: hireddate. */
  private java.util.Date hireddate;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descidikot. */
  private java.lang.String descidikot;

  /** Description: descoikog. */
  private java.lang.String descoikog;

  /** Description: desctmima. */
  private java.lang.String desctmima;

  /** Description: descthesi. */
  private java.lang.String descthesi;

  /** Description: desctamio. */
  private java.lang.String desctamio;

  public PrnYpalTotalDatesDto() {}

  public PrnYpalTotalDatesDto(
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.String mitroo,
      java.lang.String adt,
      java.lang.String afm,
      java.lang.String doy,
      java.lang.String bankno,
      java.lang.String bank,
      java.lang.Integer childs,
      java.lang.Integer prostmeli,
      java.lang.Integer klimakio,
      java.lang.String bathmos,
      java.lang.String klados,
      java.util.Date birthdate,
      java.util.Date hireddate,
      java.lang.Integer kodypal,
      java.lang.String kodxrisi,
      java.lang.String descidikot,
      java.lang.String descoikog,
      java.lang.String desctmima,
      java.lang.String descthesi,
      java.lang.String desctamio) {
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.mitroo = mitroo;
    this.adt = adt;
    this.afm = afm;
    this.doy = doy;
    this.bankno = bankno;
    this.bank = bank;
    this.childs = childs;
    this.prostmeli = prostmeli;
    this.klimakio = klimakio;
    this.bathmos = bathmos;
    this.klados = klados;
    this.birthdate = birthdate;
    this.hireddate = hireddate;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.descidikot = descidikot;
    this.descoikog = descoikog;
    this.desctmima = desctmima;
    this.descthesi = descthesi;
    this.desctamio = desctamio;
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

  public java.lang.String getMitroo() {
    return this.mitroo;
  }

  public java.lang.String getAdt() {
    return this.adt;
  }

  public java.lang.String getAfm() {
    return this.afm;
  }

  public java.lang.String getDoy() {
    return this.doy;
  }

  public java.lang.String getBankno() {
    return this.bankno;
  }

  public java.lang.String getBank() {
    return this.bank;
  }

  public java.lang.Integer getChilds() {
    return this.childs;
  }

  public java.lang.Integer getProstmeli() {
    return this.prostmeli;
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

  public java.util.Date getBirthdate() {
    return this.birthdate;
  }

  public java.util.Date getHireddate() {
    return this.hireddate;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescidikot() {
    return this.descidikot;
  }

  public java.lang.String getDescoikog() {
    return this.descoikog;
  }

  public java.lang.String getDesctmima() {
    return this.desctmima;
  }

  public java.lang.String getDescthesi() {
    return this.descthesi;
  }

  public java.lang.String getDesctamio() {
    return this.desctamio;
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

  public void setMitroo(java.lang.String mitroo) {
    this.mitroo = mitroo;
  }

  public void setAdt(java.lang.String adt) {
    this.adt = adt;
  }

  public void setAfm(java.lang.String afm) {
    this.afm = afm;
  }

  public void setDoy(java.lang.String doy) {
    this.doy = doy;
  }

  public void setBankno(java.lang.String bankno) {
    this.bankno = bankno;
  }

  public void setBank(java.lang.String bank) {
    this.bank = bank;
  }

  public void setChilds(java.lang.Integer childs) {
    this.childs = childs;
  }

  public void setProstmeli(java.lang.Integer prostmeli) {
    this.prostmeli = prostmeli;
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

  public void setBirthdate(java.util.Date birthdate) {
    this.birthdate = birthdate;
  }

  public void setHireddate(java.util.Date hireddate) {
    this.hireddate = hireddate;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescidikot(java.lang.String descidikot) {
    this.descidikot = descidikot;
  }

  public void setDescoikog(java.lang.String descoikog) {
    this.descoikog = descoikog;
  }

  public void setDesctmima(java.lang.String desctmima) {
    this.desctmima = desctmima;
  }

  public void setDescthesi(java.lang.String descthesi) {
    this.descthesi = descthesi;
  }

  public void setDesctamio(java.lang.String desctamio) {
    this.desctamio = desctamio;
  }
}
