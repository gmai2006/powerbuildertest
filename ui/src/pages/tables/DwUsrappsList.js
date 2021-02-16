import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodapp_t', header: 'kodapp_t', defaultFlex: 1 },
  { name: 'descapp_t', header: 'descapp_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsrappsList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsrappsList;