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
                powerbuildertest2
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
                  itemId: '/powerbuildertest2/',
                  elemBefore: () => <FontAwesomeIcon icon={faFileAlt} />,
                },
                {
                  title: 'Tables',
                  itemId: '/powerbuildertest2/table',
                  elemBefore: () => <FontAwesomeIcon icon={faTable} />,
                  subNav: [
                    {
                      title: 'MisthKratapod',
                      itemId: '/powerbuildertest2/tables/misthkratapod',
                    },
                    {
                      title: 'MisthZpstath',
                      itemId: '/powerbuildertest2/tables/misthzpstath',
                    },
                    {
                      title: 'MisthYpalYvar',
                      itemId: '/powerbuildertest2/tables/misthypalyvar',
                    },
                    {
                      title: 'MisthZptmima',
                      itemId: '/powerbuildertest2/tables/misthzptmima',
                    },
                    {
                      title: 'MisthYpal',
                      itemId: '/powerbuildertest2/tables/misthypal',
                    },
                    {
                      title: 'MisthFyloYpal',
                      itemId: '/powerbuildertest2/tables/misthfyloypal',
                    },
                    {
                      title: 'MisthReportCols',
                      itemId: '/powerbuildertest2/tables/misthreportcols',
                    },
                    {
                      title: 'MisthReport',
                      itemId: '/powerbuildertest2/tables/misthreport',
                    },
                    {
                      title: 'Usrgroupperm',
                      itemId: '/powerbuildertest2/tables/usrgroupperm',
                    },
                    {
                      title: 'MisthZpoikog',
                      itemId: '/powerbuildertest2/tables/misthzpoikog',
                    },
                    {
                      title: 'MisthZpyvar',
                      itemId: '/powerbuildertest2/tables/misthzpyvar',
                    },
                    {
                      title: 'MisthReportYpal',
                      itemId: '/powerbuildertest2/tables/misthreportypal',
                    },
                    {
                      title: 'Usrgroups',
                      itemId: '/powerbuildertest2/tables/usrgroups',
                    },
                    {
                      title: 'MisthZpepidom',
                      itemId: '/powerbuildertest2/tables/misthzpepidom',
                    },
                    {
                      title: 'MisthZpkat',
                      itemId: '/powerbuildertest2/tables/misthzpkat',
                    },
                    {
                      title: 'MisthZpkrat',
                      itemId: '/powerbuildertest2/tables/misthzpkrat',
                    },
                    {
                      title: 'MisthFyloEpidom',
                      itemId: '/powerbuildertest2/tables/misthfyloepidom',
                    },
                    {
                      title: 'Usrmembers',
                      itemId: '/powerbuildertest2/tables/usrmembers',
                    },
                    {
                      title: 'Usruserperm',
                      itemId: '/powerbuildertest2/tables/usruserperm',
                    },
                    {
                      title: 'MisthZpperiod',
                      itemId: '/powerbuildertest2/tables/misthzpperiod',
                    },
                    {
                      title: 'MisthFinalYpal',
                      itemId: '/powerbuildertest2/tables/misthfinalypal',
                    },
                    {
                      title: 'Usrapps',
                      itemId: '/powerbuildertest2/tables/usrapps',
                    },
                    {
                      title: 'MisthZpthesi',
                      itemId: '/powerbuildertest2/tables/misthzpthesi',
                    },
                    {
                      title: 'Afxfilterd',
                      itemId: '/powerbuildertest2/tables/afxfilterd',
                    },
                    {
                      title: 'MisthFinalYpalKrat',
                      itemId: '/powerbuildertest2/tables/misthfinalypalkrat',
                    },
                    {
                      title: 'Afxfilter',
                      itemId: '/powerbuildertest2/tables/afxfilter',
                    },
                    {
                      title: 'Usrusers',
                      itemId: '/powerbuildertest2/tables/usrusers',
                    },
                    {
                      title: 'MisthZptamio',
                      itemId: '/powerbuildertest2/tables/misthzptamio',
                    },
                    {
                      title: 'MisthZpidikot',
                      itemId: '/powerbuildertest2/tables/misthzpidikot',
                    },
                    {
                      title: 'MisthZptitlos',
                      itemId: '/powerbuildertest2/tables/misthzptitlos',
                    },
                    {
                      title: 'MisthFinalYpalEpidom',
                      itemId: '/powerbuildertest2/tables/misthfinalypalepidom',
                    },
                    {
                      title: 'MisthZpxrisi',
                      itemId: '/powerbuildertest2/tables/misthzpxrisi',
                    },
                    {
                      title: 'Afxptoseis',
                      itemId: '/powerbuildertest2/tables/afxptoseis',
                    },
                    {
                      title: 'MisthFylo',
                      itemId: '/powerbuildertest2/tables/misthfylo',
                    },
                    {
                      title: 'MisthFinal',
                      itemId: '/powerbuildertest2/tables/misthfinal',
                    },
                    {
                      title: 'Usractions',
                      itemId: '/powerbuildertest2/tables/usractions',
                    },
                    {
                      title: 'MisthFyloKrat',
                      itemId: '/powerbuildertest2/tables/misthfylokrat',
                    },
                  ]
                },
              ]}
            />
          </div>
        </SlidingPane>
      </React.Fragment>
    )
}

export default Sidebar;