import React, { useState } from 'react';
import SlidingPane from "react-sliding-pane";
import "react-sliding-pane/dist/react-sliding-pane.css";
import {Button, Navbar} from 'react-bootstrap';
import './style.css';

import {Navigation} from 'react-minimal-side-navigation';
import { useHistory, useLocation } from "react-router-dom";
import 'react-minimal-side-navigation/lib/ReactMinimalSideNavigation.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {faFileAlt, faTable, faDatabase, faBars, faTimes} from '@fortawesome/free-solid-svg-icons';

import { Queries } from './queries';
import { Tables } from './tables';

const Sidebar = () => {
    const history = useHistory();
    const location = useLocation();
    const [openPanel, setOpenPanel] = useState(false);

    return (
      <React.Fragment>
        <Navbar bg="light">
          <Navbar.Brand>
          <Button className='shadow-none' variant="link" type="submit" onClick={() => setOpenPanel(true)}>
            <FontAwesomeIcon icon={faBars} style={{color: '#2d3748'}}/>
          </Button>
          </Navbar.Brand>
            <Navbar.Collapse className="justify-content-end">
              <Navbar.Text>
                powerbuilderreacttest2
              </Navbar.Text>
            </Navbar.Collapse>
        </Navbar>
        <SlidingPane
          closeIcon={<FontAwesomeIcon icon={faTimes} />}
          isOpen={openPanel}
          from="left"
          width="350px"
          onRequestClose={() => setOpenPanel(false)}
        >
          <div className="panel-container">
            <Navigation
              activeItemId={location.pathname}
              onSelect={({itemId}) => {
                  history.push(itemId);
                  setOpenPanel(false);
              }}
              items={[
                {
                  title: 'Overview',
                  itemId: '/powerbuilderreacttest2/',
                  elemBefore: () => <FontAwesomeIcon icon={faFileAlt} />,
                },
                {
                  title: 'Tables',
                  itemId: '/powerbuilderreacttest2/tables',
                  elemBefore: () => <FontAwesomeIcon icon={faTable} />,
                  subNav: Tables
                },
                {
                  title: 'Queries',
                  itemId: '/powerbuilderreacttest2/queries',
                  elemBefore: () => <FontAwesomeIcon icon={faTable} />,
                  subNav: Queries
                },
              ]}
            />
          </div>
        </SlidingPane>
      </React.Fragment>
    )
}

export default Sidebar;