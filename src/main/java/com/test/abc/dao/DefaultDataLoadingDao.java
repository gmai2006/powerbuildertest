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
import com.test.abc.entity.Usrgroups;
import com.test.abc.entity.MisthZpepidom;
import com.test.abc.entity.MisthZpkat;
import com.test.abc.entity.MisthZpkrat;
import com.test.abc.entity.MisthFyloEpidom;
import com.test.abc.entity.Usrmembers;
import com.test.abc.entity.Usruserperm;
import com.test.abc.entity.MisthZpperiod;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.Usrapps;
import com.test.abc.entity.MisthZpthesi;
import com.test.abc.entity.Afxfilterd;
import com.test.abc.entity.MisthFinalYpalKrat;
import com.test.abc.entity.Afxfilter;
import com.test.abc.entity.Usrusers;
import com.test.abc.entity.MisthZptamio;
import com.test.abc.entity.MisthZpidikot;
import com.test.abc.entity.MisthZptitlos;
import com.test.abc.entity.MisthFinalYpalEpidom;
import com.test.abc.entity.MisthZpxrisi;
import com.test.abc.entity.Afxptoseis;
import com.test.abc.entity.MisthFylo;
import com.test.abc.entity.MisthFinal;
import com.test.abc.entity.Usractions;
import com.test.abc.entity.MisthFyloKrat;
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
    dao.deleteAll(MisthKratapod.class);
    dao.deleteAll(MisthZpstath.class);
    dao.deleteAll(MisthYpalYvar.class);
    dao.deleteAll(MisthZptmima.class);
    dao.deleteAll(MisthYpal.class);
    dao.deleteAll(MisthFyloYpal.class);
    dao.deleteAll(MisthReportCols.class);
    dao.deleteAll(MisthReport.class);
    dao.deleteAll(Usrgroupperm.class);
    dao.deleteAll(MisthZpoikog.class);
    dao.deleteAll(MisthZpyvar.class);
    dao.deleteAll(MisthReportYpal.class);
    dao.deleteAll(Usrgroups.class);
    dao.deleteAll(MisthZpepidom.class);
    dao.deleteAll(MisthZpkat.class);
    dao.deleteAll(MisthZpkrat.class);
    dao.deleteAll(MisthFyloEpidom.class);
    dao.deleteAll(Usrmembers.class);
    dao.deleteAll(Usruserperm.class);
    dao.deleteAll(MisthZpperiod.class);
    dao.deleteAll(MisthFinalYpal.class);
    dao.deleteAll(Usrapps.class);
    dao.deleteAll(MisthZpthesi.class);
    dao.deleteAll(Afxfilterd.class);
    dao.deleteAll(MisthFinalYpalKrat.class);
    dao.deleteAll(Afxfilter.class);
    dao.deleteAll(Usrusers.class);
    dao.deleteAll(MisthZptamio.class);
    dao.deleteAll(MisthZpidikot.class);
    dao.deleteAll(MisthZptitlos.class);
    dao.deleteAll(MisthFinalYpalEpidom.class);
    dao.deleteAll(MisthZpxrisi.class);
    dao.deleteAll(Afxptoseis.class);
    dao.deleteAll(MisthFylo.class);
    dao.deleteAll(MisthFinal.class);
    dao.deleteAll(Usractions.class);
    dao.deleteAll(MisthFyloKrat.class);
  }
}
