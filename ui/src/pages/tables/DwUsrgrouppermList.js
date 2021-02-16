import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'editrec_t', header: 'editrec_t', defaultFlex: 1 },
  { name: 'usrapps_descapp_t', header: 'usrapps_descapp_t', defaultFlex: 1 },
  { name: 'delrec_t', header: 'delrec_t', defaultFlex: 1 },
  { name: 'openlist_t', header: 'openlist_t', defaultFlex: 1 },
  { name: 'usractions_descaction_t', header: 'usractions_descaction_t', defaultFlex: 1 },
  { name: 'addrec_t', header: 'addrec_t', defaultFlex: 1 },
  { name: 'openform_t', header: 'openform_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsrgrouppermList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsrgrouppermList;