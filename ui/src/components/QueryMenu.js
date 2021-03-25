import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import DwMisthYpalNewklimakio from '../pages/queries/DwMisthYpalNewklimakio';
import DwAfxfilterdList from '../pages/queries/DwAfxfilterdList';
import DwMisthZpyvarList from '../pages/queries/DwMisthZpyvarList';
import DwMisthReportList from '../pages/queries/DwMisthReportList';
import SprnFinalKratMisth from '../pages/queries/SprnFinalKratMisth';
import DwUsrappsList from '../pages/queries/DwUsrappsList';
import DwMisthZpoikogList from '../pages/queries/DwMisthZpoikogList';
import DwUsrgrouppermList from '../pages/queries/DwUsrgrouppermList';
import SprnYpalPeriodEpidom from '../pages/queries/SprnYpalPeriodEpidom';
import DwMisthYpalYvarList from '../pages/queries/DwMisthYpalYvarList';
import DwMisthReportColsList from '../pages/queries/DwMisthReportColsList';
import SprnYpalFinal from '../pages/queries/SprnYpalFinal';
import DwUsruserpermList from '../pages/queries/DwUsruserpermList';
import DwAfxfilterList from '../pages/queries/DwAfxfilterList';
import DwMisthFinalYpalList from '../pages/queries/DwMisthFinalYpalList';
import DwUsractionsList from '../pages/queries/DwUsractionsList';
import SprnFinalKratYpal from '../pages/queries/SprnFinalKratYpal';
import DwMisthKratapodList from '../pages/queries/DwMisthKratapodList';
import SprnFinalEpidomMisth from '../pages/queries/SprnFinalEpidomMisth';
import SprnFinalEpidomYpal from '../pages/queries/SprnFinalEpidomYpal';
import DwUsrgroupsList from '../pages/queries/DwUsrgroupsList';
import DwMisthFyloKratList from '../pages/queries/DwMisthFyloKratList';
import DwMisthZptamioList from '../pages/queries/DwMisthZptamioList';
import DwMisthZpstathList from '../pages/queries/DwMisthZpstathList';
import DwMisthFinalYpalEpidomList from '../pages/queries/DwMisthFinalYpalEpidomList';
import DwUsrusersList from '../pages/queries/DwUsrusersList';
import DwAfxptoseisList from '../pages/queries/DwAfxptoseisList';
import DwMisthFyloEpidomList from '../pages/queries/DwMisthFyloEpidomList';
import SprnYpalPeriodKrat from '../pages/queries/SprnYpalPeriodKrat';
import DwMisthYpalList from '../pages/queries/DwMisthYpalList';
import SprnReport from '../pages/queries/SprnReport';
import DwMisthZpperiodList from '../pages/queries/DwMisthZpperiodList';
import DwUsrmembersGroupList from '../pages/queries/DwUsrmembersGroupList';
import DwMisthZpthesiList from '../pages/queries/DwMisthZpthesiList';
import DwMisthFyloList from '../pages/queries/DwMisthFyloList';
import DwMisthFinalYpalKratList from '../pages/queries/DwMisthFinalYpalKratList';
import DwMisthZptmimaList from '../pages/queries/DwMisthZptmimaList';
import DwMisthFinalYpalPlirdateList from '../pages/queries/DwMisthFinalYpalPlirdateList';
import DwStepKratapodMisthselect from '../pages/queries/DwStepKratapodMisthselect';;

const QueryMenu = () => {
  return (
    <div>
      <Switch>
          <Route path='/powerbuilderreacttest2/queries/dwmisthypalnewklimakio' component={DwMisthYpalNewklimakio} />
          <Route path='/powerbuilderreacttest2/queries/dwafxfilterdlist' component={DwAfxfilterdList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzpyvarlist' component={DwMisthZpyvarList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthreportlist' component={DwMisthReportList} />
          <Route path='/powerbuilderreacttest2/queries/sprnfinalkratmisth' component={SprnFinalKratMisth} />
          <Route path='/powerbuilderreacttest2/queries/dwusrappslist' component={DwUsrappsList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzpoikoglist' component={DwMisthZpoikogList} />
          <Route path='/powerbuilderreacttest2/queries/dwusrgrouppermlist' component={DwUsrgrouppermList} />
          <Route path='/powerbuilderreacttest2/queries/sprnypalperiodepidom' component={SprnYpalPeriodEpidom} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthypalyvarlist' component={DwMisthYpalYvarList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthreportcolslist' component={DwMisthReportColsList} />
          <Route path='/powerbuilderreacttest2/queries/sprnypalfinal' component={SprnYpalFinal} />
          <Route path='/powerbuilderreacttest2/queries/dwusruserpermlist' component={DwUsruserpermList} />
          <Route path='/powerbuilderreacttest2/queries/dwafxfilterlist' component={DwAfxfilterList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfinalypallist' component={DwMisthFinalYpalList} />
          <Route path='/powerbuilderreacttest2/queries/dwusractionslist' component={DwUsractionsList} />
          <Route path='/powerbuilderreacttest2/queries/sprnfinalkratypal' component={SprnFinalKratYpal} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthkratapodlist' component={DwMisthKratapodList} />
          <Route path='/powerbuilderreacttest2/queries/sprnfinalepidommisth' component={SprnFinalEpidomMisth} />
          <Route path='/powerbuilderreacttest2/queries/sprnfinalepidomypal' component={SprnFinalEpidomYpal} />
          <Route path='/powerbuilderreacttest2/queries/dwusrgroupslist' component={DwUsrgroupsList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfylokratlist' component={DwMisthFyloKratList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzptamiolist' component={DwMisthZptamioList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzpstathlist' component={DwMisthZpstathList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfinalypalepidomlist' component={DwMisthFinalYpalEpidomList} />
          <Route path='/powerbuilderreacttest2/queries/dwusruserslist' component={DwUsrusersList} />
          <Route path='/powerbuilderreacttest2/queries/dwafxptoseislist' component={DwAfxptoseisList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfyloepidomlist' component={DwMisthFyloEpidomList} />
          <Route path='/powerbuilderreacttest2/queries/sprnypalperiodkrat' component={SprnYpalPeriodKrat} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthypallist' component={DwMisthYpalList} />
          <Route path='/powerbuilderreacttest2/queries/sprnreport' component={SprnReport} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzpperiodlist' component={DwMisthZpperiodList} />
          <Route path='/powerbuilderreacttest2/queries/dwusrmembersgrouplist' component={DwUsrmembersGroupList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzpthesilist' component={DwMisthZpthesiList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfylolist' component={DwMisthFyloList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfinalypalkratlist' component={DwMisthFinalYpalKratList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthzptmimalist' component={DwMisthZptmimaList} />
          <Route path='/powerbuilderreacttest2/queries/dwmisthfinalypalplirdatelist' component={DwMisthFinalYpalPlirdateList} />
          <Route path='/powerbuilderreacttest2/queries/dwstepkratapodmisthselect' component={DwStepKratapodMisthselect} />
      </Switch>
  </div>
)};

export default QueryMenu;