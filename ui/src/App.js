import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { Container } from 'react-bootstrap';
import Sidebar from './components/Sidebar';
import Overview from './pages/Overview';
import Query from './pages/Query';
import DwMisthYpalNewklimakio from './pages/tables/DwMisthYpalNewklimakio';
import EdwFilter from './pages/tables/EdwFilter';
import DwAfxfilterdList from './pages/tables/DwAfxfilterdList';
import DwMisthZpyvarList from './pages/tables/DwMisthZpyvarList';
import DwMisthReportList from './pages/tables/DwMisthReportList';
import SprnFinalKratMisth from './pages/tables/SprnFinalKratMisth';
import DwUsrappsList from './pages/tables/DwUsrappsList';
import DwMisthZpoikogList from './pages/tables/DwMisthZpoikogList';
import DwUsrgrouppermList from './pages/tables/DwUsrgrouppermList';
import SprnYpalPeriodEpidom from './pages/tables/SprnYpalPeriodEpidom';
import DwMisthYpalYvarList from './pages/tables/DwMisthYpalYvarList';
import DwMisthReportColsList from './pages/tables/DwMisthReportColsList';
import SprnYpalFinal from './pages/tables/SprnYpalFinal';
import DwUsruserpermList from './pages/tables/DwUsruserpermList';
import DwAfxfilterList from './pages/tables/DwAfxfilterList';
import DwMisthFinalYpalList from './pages/tables/DwMisthFinalYpalList';
import DwVar from './pages/tables/DwVar';
import DwUsractionsList from './pages/tables/DwUsractionsList';
import SprnFinalKratYpal from './pages/tables/SprnFinalKratYpal';
import DwMisthKratapodList from './pages/tables/DwMisthKratapodList';
import SprnFinalEpidomMisth from './pages/tables/SprnFinalEpidomMisth';
import SprnFinalEpidomYpal from './pages/tables/SprnFinalEpidomYpal';
import DwUsrgroupsList from './pages/tables/DwUsrgroupsList';
import DwMisthFyloKratList from './pages/tables/DwMisthFyloKratList';
import DwMisthZptamioList from './pages/tables/DwMisthZptamioList';
import DwMisthZpstathList from './pages/tables/DwMisthZpstathList';
import DwMisthFinalYpalEpidomList from './pages/tables/DwMisthFinalYpalEpidomList';
import DwUsrusersList from './pages/tables/DwUsrusersList';
import DwAfxptoseisList from './pages/tables/DwAfxptoseisList';
import DwMisthFyloEpidomList from './pages/tables/DwMisthFyloEpidomList';
import SprnYpalPeriodKrat from './pages/tables/SprnYpalPeriodKrat';
import DwMisthYpalList from './pages/tables/DwMisthYpalList';
import SprnReport from './pages/tables/SprnReport';
import DwMisthZpperiodList from './pages/tables/DwMisthZpperiodList';
import DwUsrmembersGroupList from './pages/tables/DwUsrmembersGroupList';
import DwMisthZpthesiList from './pages/tables/DwMisthZpthesiList';
import DwMisthFyloList from './pages/tables/DwMisthFyloList';
import DwMisthFinalYpalKratList from './pages/tables/DwMisthFinalYpalKratList';
import DwMisthZptmimaList from './pages/tables/DwMisthZptmimaList';
import DwMisthFinalYpalPlirdateList from './pages/tables/DwMisthFinalYpalPlirdateList';
import DwStepKratapodMisthselect from './pages/tables/DwStepKratapodMisthselect';;

const App = () => {
  return (
    <div className='App'>
      <Router>
        <Sidebar />
        <Container fluid>
          <Switch>
            <Route path='/' exact component={Overview} />
            <Route path='/query' component={Query} />
            <Route path='/tables/dw_misth_ypal_newklimakio' component={DwMisthYpalNewklimakio} />
            <Route path='/tables/edw_filter' component={EdwFilter} />
            <Route path='/tables/dw_afxfilterd_list' component={DwAfxfilterdList} />
            <Route path='/tables/dw_misth_zpyvar_list' component={DwMisthZpyvarList} />
            <Route path='/tables/dw_misth_report_list' component={DwMisthReportList} />
            <Route path='/tables/sprn_final_krat_misth' component={SprnFinalKratMisth} />
            <Route path='/tables/dw_usrapps_list' component={DwUsrappsList} />
            <Route path='/tables/dw_misth_zpoikog_list' component={DwMisthZpoikogList} />
            <Route path='/tables/dw_usrgroupperm_list' component={DwUsrgrouppermList} />
            <Route path='/tables/sprn_ypal_period_epidom' component={SprnYpalPeriodEpidom} />
            <Route path='/tables/dw_misth_ypal_yvar_list' component={DwMisthYpalYvarList} />
            <Route path='/tables/dw_misth_report_cols_list' component={DwMisthReportColsList} />
            <Route path='/tables/sprn_ypal_final' component={SprnYpalFinal} />
            <Route path='/tables/dw_usruserperm_list' component={DwUsruserpermList} />
            <Route path='/tables/dw_afxfilter_list' component={DwAfxfilterList} />
            <Route path='/tables/dw_misth_final_ypal_list' component={DwMisthFinalYpalList} />
            <Route path='/tables/dw_var' component={DwVar} />
            <Route path='/tables/dw_usractions_list' component={DwUsractionsList} />
            <Route path='/tables/sprn_final_krat_ypal' component={SprnFinalKratYpal} />
            <Route path='/tables/dw_misth_kratapod_list' component={DwMisthKratapodList} />
            <Route path='/tables/sprn_final_epidom_misth' component={SprnFinalEpidomMisth} />
            <Route path='/tables/sprn_final_epidom_ypal' component={SprnFinalEpidomYpal} />
            <Route path='/tables/dw_usrgroups_list' component={DwUsrgroupsList} />
            <Route path='/tables/dw_misth_fylo_krat_list' component={DwMisthFyloKratList} />
            <Route path='/tables/dw_misth_zptamio_list' component={DwMisthZptamioList} />
            <Route path='/tables/dw_misth_zpstath_list' component={DwMisthZpstathList} />
            <Route path='/tables/dw_misth_final_ypal_epidom_list' component={DwMisthFinalYpalEpidomList} />
            <Route path='/tables/dw_usrusers_list' component={DwUsrusersList} />
            <Route path='/tables/dw_afxptoseis_list' component={DwAfxptoseisList} />
            <Route path='/tables/dw_misth_fylo_epidom_list' component={DwMisthFyloEpidomList} />
            <Route path='/tables/sprn_ypal_period_krat' component={SprnYpalPeriodKrat} />
            <Route path='/tables/dw_misth_ypal_list' component={DwMisthYpalList} />
            <Route path='/tables/sprn_report' component={SprnReport} />
            <Route path='/tables/dw_misth_zpperiod_list' component={DwMisthZpperiodList} />
            <Route path='/tables/dw_usrmembers_group_list' component={DwUsrmembersGroupList} />
            <Route path='/tables/dw_misth_zpthesi_list' component={DwMisthZpthesiList} />
            <Route path='/tables/dw_misth_fylo_list' component={DwMisthFyloList} />
            <Route path='/tables/dw_misth_final_ypal_krat_list' component={DwMisthFinalYpalKratList} />
            <Route path='/tables/dw_misth_zptmima_list' component={DwMisthZptmimaList} />
            <Route path='/tables/dw_misth_final_ypal_plirdate_list' component={DwMisthFinalYpalPlirdateList} />
            <Route path='/tables/dw_step_kratapod_misthselect' component={DwStepKratapodMisthselect} />
          </Switch>
      </Container>
    </Router>
    </div>
  );
}

export default App;