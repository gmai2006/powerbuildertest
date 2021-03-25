import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { Container } from 'react-bootstrap';
import Sidebar from './components/Sidebar';
import Overview from './pages/Overview';
import Query from './pages/Query';
import TableMenu  from './components/TableMenu';
import QueryMenu from './components/QueryMenu';

const App = () => {
  return (
    <div className='App'>
      <Router>
        <Sidebar />
        <Container fluid>
          <Switch>
            <Route path='/powerbuilderreacttest2' exact component={Overview} />
            <Route path='/powerbuilderreacttest2/query' component={Query} />
            <Route path="/powerbuilderreacttest2/tables" component={TableMenu} />
            <Route path="/powerbuilderreacttest2/queries" component={QueryMenu} />
          </Switch>
      </Container>
    </Router>
    </div>
  );
}

export default App;