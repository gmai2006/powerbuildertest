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
                Company Name
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
                  itemId: '/',
                  elemBefore: () => <FontAwesomeIcon icon={faFileAlt} />,
                },
                {
                  title: 'Tables',
                  itemId: '/table',
                  elemBefore: () => <FontAwesomeIcon icon={faTable} />,
                  subNav: [
                    {
                      title: 'DwMisthYpalNewklimakio',
                      itemId: '/table/dw_misth_ypal_newklimakio',
                    },
                    {
                      title: 'EdwFilter',
                      itemId: '/table/edw_filter',
                    },
                    {
                      title: 'DwAfxfilterdList',
                      itemId: '/table/dw_afxfilterd_list',
                    },
                    {
                      title: 'DwMisthZpyvarList',
                      itemId: '/table/dw_misth_zpyvar_list',
                    },
                    {
                      title: 'DwMisthReportList',
                      itemId: '/table/dw_misth_report_list',
                    },
                    {
                      title: 'SprnFinalKratMisth',
                      itemId: '/table/sprn_final_krat_misth',
                    },
                    {
                      title: 'DwUsrappsList',
                      itemId: '/table/dw_usrapps_list',
                    },
                    {
                      title: 'DwMisthZpoikogList',
                      itemId: '/table/dw_misth_zpoikog_list',
                    },
                    {
                      title: 'DwUsrgrouppermList',
                      itemId: '/table/dw_usrgroupperm_list',
                    },
                    {
                      title: 'SprnYpalPeriodEpidom',
                      itemId: '/table/sprn_ypal_period_epidom',
                    },
                    {
                      title: 'DwMisthYpalYvarList',
                      itemId: '/table/dw_misth_ypal_yvar_list',
                    },
                    {
                      title: 'DwMisthReportColsList',
                      itemId: '/table/dw_misth_report_cols_list',
                    },
                    {
                      title: 'SprnYpalFinal',
                      itemId: '/table/sprn_ypal_final',
                    },
                    {
                      title: 'DwUsruserpermList',
                      itemId: '/table/dw_usruserperm_list',
                    },
                    {
                      title: 'DwAfxfilterList',
                      itemId: '/table/dw_afxfilter_list',
                    },
                    {
                      title: 'DwMisthFinalYpalList',
                      itemId: '/table/dw_misth_final_ypal_list',
                    },
                    {
                      title: 'DwVar',
                      itemId: '/table/dw_var',
                    },
                    {
                      title: 'DwUsractionsList',
                      itemId: '/table/dw_usractions_list',
                    },
                    {
                      title: 'SprnFinalKratYpal',
                      itemId: '/table/sprn_final_krat_ypal',
                    },
                    {
                      title: 'DwMisthKratapodList',
                      itemId: '/table/dw_misth_kratapod_list',
                    },
                    {
                      title: 'SprnFinalEpidomMisth',
                      itemId: '/table/sprn_final_epidom_misth',
                    },
                    {
                      title: 'SprnFinalEpidomYpal',
                      itemId: '/table/sprn_final_epidom_ypal',
                    },
                    {
                      title: 'DwUsrgroupsList',
                      itemId: '/table/dw_usrgroups_list',
                    },
                    {
                      title: 'DwMisthFyloKratList',
                      itemId: '/table/dw_misth_fylo_krat_list',
                    },
                    {
                      title: 'DwMisthZptamioList',
                      itemId: '/table/dw_misth_zptamio_list',
                    },
                    {
                      title: 'DwMisthZpstathList',
                      itemId: '/table/dw_misth_zpstath_list',
                    },
                    {
                      title: 'DwMisthFinalYpalEpidomList',
                      itemId: '/table/dw_misth_final_ypal_epidom_list',
                    },
                    {
                      title: 'DwUsrusersList',
                      itemId: '/table/dw_usrusers_list',
                    },
                    {
                      title: 'DwAfxptoseisList',
                      itemId: '/table/dw_afxptoseis_list',
                    },
                    {
                      title: 'DwMisthFyloEpidomList',
                      itemId: '/table/dw_misth_fylo_epidom_list',
                    },
                    {
                      title: 'SprnYpalPeriodKrat',
                      itemId: '/table/sprn_ypal_period_krat',
                    },
                    {
                      title: 'DwMisthYpalList',
                      itemId: '/table/dw_misth_ypal_list',
                    },
                    {
                      title: 'SprnReport',
                      itemId: '/table/sprn_report',
                    },
                    {
                      title: 'DwMisthZpperiodList',
                      itemId: '/table/dw_misth_zpperiod_list',
                    },
                    {
                      title: 'DwUsrmembersGroupList',
                      itemId: '/table/dw_usrmembers_group_list',
                    },
                    {
                      title: 'DwMisthZpthesiList',
                      itemId: '/table/dw_misth_zpthesi_list',
                    },
                    {
                      title: 'DwMisthFyloList',
                      itemId: '/table/dw_misth_fylo_list',
                    },
                    {
                      title: 'DwMisthFinalYpalKratList',
                      itemId: '/table/dw_misth_final_ypal_krat_list',
                    },
                    {
                      title: 'DwMisthZptmimaList',
                      itemId: '/table/dw_misth_zptmima_list',
                    },
                    {
                      title: 'DwMisthFinalYpalPlirdateList',
                      itemId: '/table/dw_misth_final_ypal_plirdate_list',
                    },
                    {
                      title: 'DwStepKratapodMisthselect',
                      itemId: '/table/dw_step_kratapod_misthselect',
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