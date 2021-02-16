import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'descaction_t', header: 'descaction_t', defaultFlex: 1 },
  { name: 'usrapps_descapp_t', header: 'usrapps_descapp_t', defaultFlex: 1 },
  { name: 'kodapp_t', header: 'kodapp_t', defaultFlex: 1 },
  { name: 'kodaction_t', header: 'kodaction_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsractionsList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsractionsList;