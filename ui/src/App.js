import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { Container } from 'react-bootstrap';
import Sidebar from './components/Sidebar';
import Overview from './pages/Overview';
import Query from './pages/Query';
import MisthKratapod from './pages/tables/MisthKratapod';
import MisthZpstath from './pages/tables/MisthZpstath';
import MisthYpalYvar from './pages/tables/MisthYpalYvar';
import MisthZptmima from './pages/tables/MisthZptmima';
import MisthYpal from './pages/tables/MisthYpal';
import MisthFyloYpal from './pages/tables/MisthFyloYpal';
import MisthReportCols from './pages/tables/MisthReportCols';
import MisthReport from './pages/tables/MisthReport';
import Usrgroupperm from './pages/tables/Usrgroupperm';
import MisthZpoikog from './pages/tables/MisthZpoikog';
import MisthZpyvar from './pages/tables/MisthZpyvar';
import MisthReportYpal from './pages/tables/MisthReportYpal';
import Usrgroups from './pages/tables/Usrgroups';
import MisthZpepidom from './pages/tables/MisthZpepidom';
import MisthZpkat from './pages/tables/MisthZpkat';
import MisthZpkrat from './pages/tables/MisthZpkrat';
import MisthFyloEpidom from './pages/tables/MisthFyloEpidom';
import Usrmembers from './pages/tables/Usrmembers';
import Usruserperm from './pages/tables/Usruserperm';
import MisthZpperiod from './pages/tables/MisthZpperiod';
import MisthFinalYpal from './pages/tables/MisthFinalYpal';
import Usrapps from './pages/tables/Usrapps';
import MisthZpthesi from './pages/tables/MisthZpthesi';
import Afxfilterd from './pages/tables/Afxfilterd';
import MisthFinalYpalKrat from './pages/tables/MisthFinalYpalKrat';
import Afxfilter from './pages/tables/Afxfilter';
import Usrusers from './pages/tables/Usrusers';
import MisthZptamio from './pages/tables/MisthZptamio';
import MisthZpidikot from './pages/tables/MisthZpidikot';
import MisthZptitlos from './pages/tables/MisthZptitlos';
import MisthFinalYpalEpidom from './pages/tables/MisthFinalYpalEpidom';
import MisthZpxrisi from './pages/tables/MisthZpxrisi';
import Afxptoseis from './pages/tables/Afxptoseis';
import MisthFylo from './pages/tables/MisthFylo';
import MisthFinal from './pages/tables/MisthFinal';
import Usractions from './pages/tables/Usractions';
import MisthFyloKrat from './pages/tables/MisthFyloKrat';;

const App = () => {
  return (
    <div className='App'>
      <Router>
        <Sidebar />
        <Container fluid>
          <Switch>
            <Route path='/powerbuildertest2' exact component={Overview} />
            <Route path='/powerbuildertest2/query' component={Query} />
            <Route path='/powerbuildertest2/tables/misthkratapod' component={MisthKratapod} />
            <Route path='/powerbuildertest2/tables/misthzpstath' component={MisthZpstath} />
            <Route path='/powerbuildertest2/tables/misthypalyvar' component={MisthYpalYvar} />
            <Route path='/powerbuildertest2/tables/misthzptmima' component={MisthZptmima} />
            <Route path='/powerbuildertest2/tables/misthypal' component={MisthYpal} />
            <Route path='/powerbuildertest2/tables/misthfyloypal' component={MisthFyloYpal} />
            <Route path='/powerbuildertest2/tables/misthreportcols' component={MisthReportCols} />
            <Route path='/powerbuildertest2/tables/misthreport' component={MisthReport} />
            <Route path='/powerbuildertest2/tables/usrgroupperm' component={Usrgroupperm} />
            <Route path='/powerbuildertest2/tables/misthzpoikog' component={MisthZpoikog} />
            <Route path='/powerbuildertest2/tables/misthzpyvar' component={MisthZpyvar} />
            <Route path='/powerbuildertest2/tables/misthreportypal' component={MisthReportYpal} />
            <Route path='/powerbuildertest2/tables/usrgroups' component={Usrgroups} />
            <Route path='/powerbuildertest2/tables/misthzpepidom' component={MisthZpepidom} />
            <Route path='/powerbuildertest2/tables/misthzpkat' component={MisthZpkat} />
            <Route path='/powerbuildertest2/tables/misthzpkrat' component={MisthZpkrat} />
            <Route path='/powerbuildertest2/tables/misthfyloepidom' component={MisthFyloEpidom} />
            <Route path='/powerbuildertest2/tables/usrmembers' component={Usrmembers} />
            <Route path='/powerbuildertest2/tables/usruserperm' component={Usruserperm} />
            <Route path='/powerbuildertest2/tables/misthzpperiod' component={MisthZpperiod} />
            <Route path='/powerbuildertest2/tables/misthfinalypal' component={MisthFinalYpal} />
            <Route path='/powerbuildertest2/tables/usrapps' component={Usrapps} />
            <Route path='/powerbuildertest2/tables/misthzpthesi' component={MisthZpthesi} />
            <Route path='/powerbuildertest2/tables/afxfilterd' component={Afxfilterd} />
            <Route path='/powerbuildertest2/tables/misthfinalypalkrat' component={MisthFinalYpalKrat} />
            <Route path='/powerbuildertest2/tables/afxfilter' component={Afxfilter} />
            <Route path='/powerbuildertest2/tables/usrusers' component={Usrusers} />
            <Route path='/powerbuildertest2/tables/misthzptamio' component={MisthZptamio} />
            <Route path='/powerbuildertest2/tables/misthzpidikot' component={MisthZpidikot} />
            <Route path='/powerbuildertest2/tables/misthzptitlos' component={MisthZptitlos} />
            <Route path='/powerbuildertest2/tables/misthfinalypalepidom' component={MisthFinalYpalEpidom} />
            <Route path='/powerbuildertest2/tables/misthzpxrisi' component={MisthZpxrisi} />
            <Route path='/powerbuildertest2/tables/afxptoseis' component={Afxptoseis} />
            <Route path='/powerbuildertest2/tables/misthfylo' component={MisthFylo} />
            <Route path='/powerbuildertest2/tables/misthfinal' component={MisthFinal} />
            <Route path='/powerbuildertest2/tables/usractions' component={Usractions} />
            <Route path='/powerbuildertest2/tables/misthfylokrat' component={MisthFyloKrat} />
          </Switch>
      </Container>
    </Router>
    </div>
  );
}

export default App;