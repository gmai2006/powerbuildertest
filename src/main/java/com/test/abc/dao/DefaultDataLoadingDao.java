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

package com.test.abc.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.test.abc.entity.MisthKratapod;
import com.test.abc.entity.MisthZpstath;
import com.test.abc.entity.MisthYpalYvar;
import com.test.abc.entity.MisthZptmima;
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthFyloYpal;
import com.test.abc.entity.MisthReportCols;
import com.test.abc.entity.MisthReport;
import com.test.abc.entity.Usrgroupperm;
import com.test.abc.entity.MisthZpoikog;
import com.test.abc.entity.MisthZpyvar;
import com.test.abc.entity.MisthReportYpal;
import com.test.abc.entity.MisthZpepidom;
import com.test.abc.entity.Usrgroups;
import com.test.abc.entity.MisthZpkat;
import com.test.abc.entity.MisthZpkrat;
import com.test.abc.entity.MisthFyloEpidom;
import com.test.abc.entity.Usrmembers;
import com.test.abc.entity.Usruserperm;
import com.test.abc.entity.MisthZpperiod;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.Afxfilterd;
import com.test.abc.entity.Usrapps;
import com.test.abc.entity.MisthZpthesi;
import com.test.abc.entity.MisthFinalYpalKrat;
import com.test.abc.entity.Afxfilter;
import com.test.abc.entity.Usrusers;
import com.test.abc.entity.MisthZpidikot;
import com.test.abc.entity.MisthZptamio;
import com.test.abc.entity.MisthZptitlos;
import com.test.abc.entity.MisthFinalYpalEpidom;
import com.test.abc.entity.MisthZpxrisi;
import com.test.abc.entity.Afxptoseis;
import com.test.abc.entity.MisthFylo;
import com.test.abc.entity.MisthFinal;
import com.test.abc.entity.MisthFyloKrat;
import com.test.abc.entity.Usractions;
import com.test.abc.entity.DataLoadingStatus;
import com.test.abc.entity.Loadingstatus;

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

@Stateless
@Named("DefaultDataLoadingDao")
public class DefaultDataLoadingDao implements DataLoadingDao {

  private static final Logger logger = Logger.getLogger(DefaultDataLoadingDao.class.getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultDataLoadingDao(JpaDao dao) {
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DataLoadingStatus update(DataLoadingStatus e) {
    return dao.update(e);
  }

  /** {@inheritDoc} */
  @Override
  public DataLoadingStatus getLoadingStatus(String type) {
    DataLoadingStatus loadingStatus = dao.find(DataLoadingStatus.class, type);
    if (null == loadingStatus) {
      loadingStatus = new DataLoadingStatus(type, Loadingstatus.NEW);
      dao.create(loadingStatus);
    }
    return loadingStatus;
  }

  /** {@inheritDoc} */
  @Override
  public <E> E create(E e) {
    return dao.create(e);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    dao.delete(DataLoadingStatus.class, id);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteAll() {
    List<MisthKratapod> misthkratapods =
        dao.selectAll("select a from MisthKratapod a ", MisthKratapod.class);
    misthkratapods.stream().forEach(a -> dao.delete(MisthKratapod.class, a.getId()));
    List<MisthZpstath> misthzpstaths =
        dao.selectAll("select a from MisthZpstath a ", MisthZpstath.class);
    misthzpstaths.stream().forEach(a -> dao.delete(MisthZpstath.class, a.getId()));
    List<MisthYpalYvar> misthypalyvars =
        dao.selectAll("select a from MisthYpalYvar a ", MisthYpalYvar.class);
    misthypalyvars.stream().forEach(a -> dao.delete(MisthYpalYvar.class, a.getId()));
    List<MisthZptmima> misthzptmimas =
        dao.selectAll("select a from MisthZptmima a ", MisthZptmima.class);
    misthzptmimas.stream().forEach(a -> dao.delete(MisthZptmima.class, a.getId()));
    List<MisthYpal> misthypals = dao.selectAll("select a from MisthYpal a ", MisthYpal.class);
    misthypals.stream().forEach(a -> dao.delete(MisthYpal.class, a.getId()));
    List<MisthFyloYpal> misthfyloypals =
        dao.selectAll("select a from MisthFyloYpal a ", MisthFyloYpal.class);
    misthfyloypals.stream().forEach(a -> dao.delete(MisthFyloYpal.class, a.getId()));
    List<MisthReportCols> misthreportcolss =
        dao.selectAll("select a from MisthReportCols a ", MisthReportCols.class);
    misthreportcolss.stream().forEach(a -> dao.delete(MisthReportCols.class, a.getId()));
    List<MisthReport> misthreports =
        dao.selectAll("select a from MisthReport a ", MisthReport.class);
    misthreports.stream().forEach(a -> dao.delete(MisthReport.class, a.getId()));
    List<Usrgroupperm> usrgroupperms =
        dao.selectAll("select a from Usrgroupperm a ", Usrgroupperm.class);
    usrgroupperms.stream().forEach(a -> dao.delete(Usrgroupperm.class, a.getId()));
    List<MisthZpoikog> misthzpoikogs =
        dao.selectAll("select a from MisthZpoikog a ", MisthZpoikog.class);
    misthzpoikogs.stream().forEach(a -> dao.delete(MisthZpoikog.class, a.getId()));
    List<MisthZpyvar> misthzpyvars =
        dao.selectAll("select a from MisthZpyvar a ", MisthZpyvar.class);
    misthzpyvars.stream().forEach(a -> dao.delete(MisthZpyvar.class, a.getId()));
    List<MisthReportYpal> misthreportypals =
        dao.selectAll("select a from MisthReportYpal a ", MisthReportYpal.class);
    misthreportypals.stream().forEach(a -> dao.delete(MisthReportYpal.class, a.getId()));
    List<MisthZpepidom> misthzpepidoms =
        dao.selectAll("select a from MisthZpepidom a ", MisthZpepidom.class);
    misthzpepidoms.stream().forEach(a -> dao.delete(MisthZpepidom.class, a.getId()));
    List<Usrgroups> usrgroupss = dao.selectAll("select a from Usrgroups a ", Usrgroups.class);
    usrgroupss.stream().forEach(a -> dao.delete(Usrgroups.class, a.getId()));
    List<MisthZpkat> misthzpkats = dao.selectAll("select a from MisthZpkat a ", MisthZpkat.class);
    misthzpkats.stream().forEach(a -> dao.delete(MisthZpkat.class, a.getId()));
    List<MisthZpkrat> misthzpkrats =
        dao.selectAll("select a from MisthZpkrat a ", MisthZpkrat.class);
    misthzpkrats.stream().forEach(a -> dao.delete(MisthZpkrat.class, a.getId()));
    List<MisthFyloEpidom> misthfyloepidoms =
        dao.selectAll("select a from MisthFyloEpidom a ", MisthFyloEpidom.class);
    misthfyloepidoms.stream().forEach(a -> dao.delete(MisthFyloEpidom.class, a.getId()));
    List<Usrmembers> usrmemberss = dao.selectAll("select a from Usrmembers a ", Usrmembers.class);
    usrmemberss.stream().forEach(a -> dao.delete(Usrmembers.class, a.getId()));
    List<Usruserperm> usruserperms =
        dao.selectAll("select a from Usruserperm a ", Usruserperm.class);
    usruserperms.stream().forEach(a -> dao.delete(Usruserperm.class, a.getId()));
    List<MisthZpperiod> misthzpperiods =
        dao.selectAll("select a from MisthZpperiod a ", MisthZpperiod.class);
    misthzpperiods.stream().forEach(a -> dao.delete(MisthZpperiod.class, a.getId()));
    List<MisthFinalYpal> misthfinalypals =
        dao.selectAll("select a from MisthFinalYpal a ", MisthFinalYpal.class);
    misthfinalypals.stream().forEach(a -> dao.delete(MisthFinalYpal.class, a.getId()));
    List<Afxfilterd> afxfilterds = dao.selectAll("select a from Afxfilterd a ", Afxfilterd.class);
    afxfilterds.stream().forEach(a -> dao.delete(Afxfilterd.class, a.getId()));
    List<Usrapps> usrappss = dao.selectAll("select a from Usrapps a ", Usrapps.class);
    usrappss.stream().forEach(a -> dao.delete(Usrapps.class, a.getId()));
    List<MisthZpthesi> misthzpthesis =
        dao.selectAll("select a from MisthZpthesi a ", MisthZpthesi.class);
    misthzpthesis.stream().forEach(a -> dao.delete(MisthZpthesi.class, a.getId()));
    List<MisthFinalYpalKrat> misthfinalypalkrats =
        dao.selectAll("select a from MisthFinalYpalKrat a ", MisthFinalYpalKrat.class);
    misthfinalypalkrats.stream().forEach(a -> dao.delete(MisthFinalYpalKrat.class, a.getId()));
    List<Afxfilter> afxfilters = dao.selectAll("select a from Afxfilter a ", Afxfilter.class);
    afxfilters.stream().forEach(a -> dao.delete(Afxfilter.class, a.getId()));
    List<Usrusers> usruserss = dao.selectAll("select a from Usrusers a ", Usrusers.class);
    usruserss.stream().forEach(a -> dao.delete(Usrusers.class, a.getId()));
    List<MisthZpidikot> misthzpidikots =
        dao.selectAll("select a from MisthZpidikot a ", MisthZpidikot.class);
    misthzpidikots.stream().forEach(a -> dao.delete(MisthZpidikot.class, a.getId()));
    List<MisthZptamio> misthzptamios =
        dao.selectAll("select a from MisthZptamio a ", MisthZptamio.class);
    misthzptamios.stream().forEach(a -> dao.delete(MisthZptamio.class, a.getId()));
    List<MisthZptitlos> misthzptitloss =
        dao.selectAll("select a from MisthZptitlos a ", MisthZptitlos.class);
    misthzptitloss.stream().forEach(a -> dao.delete(MisthZptitlos.class, a.getId()));
    List<MisthFinalYpalEpidom> misthfinalypalepidoms =
        dao.selectAll("select a from MisthFinalYpalEpidom a ", MisthFinalYpalEpidom.class);
    misthfinalypalepidoms.stream().forEach(a -> dao.delete(MisthFinalYpalEpidom.class, a.getId()));
    List<MisthZpxrisi> misthzpxrisis =
        dao.selectAll("select a from MisthZpxrisi a ", MisthZpxrisi.class);
    misthzpxrisis.stream().forEach(a -> dao.delete(MisthZpxrisi.class, a.getId()));
    List<Afxptoseis> afxptoseiss = dao.selectAll("select a from Afxptoseis a ", Afxptoseis.class);
    afxptoseiss.stream().forEach(a -> dao.delete(Afxptoseis.class, a.getId()));
    List<MisthFylo> misthfylos = dao.selectAll("select a from MisthFylo a ", MisthFylo.class);
    misthfylos.stream().forEach(a -> dao.delete(MisthFylo.class, a.getId()));
    List<MisthFinal> misthfinals = dao.selectAll("select a from MisthFinal a ", MisthFinal.class);
    misthfinals.stream().forEach(a -> dao.delete(MisthFinal.class, a.getId()));
    List<MisthFyloKrat> misthfylokrats =
        dao.selectAll("select a from MisthFyloKrat a ", MisthFyloKrat.class);
    misthfylokrats.stream().forEach(a -> dao.delete(MisthFyloKrat.class, a.getId()));
    List<Usractions> usractionss = dao.selectAll("select a from Usractions a ", Usractions.class);
    usractionss.stream().forEach(a -> dao.delete(Usractions.class, a.getId()));
  }
}
