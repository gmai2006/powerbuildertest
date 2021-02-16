import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'poso_t', header: 'poso_t', defaultFlex: 1 },
  { name: 'kodvar_t', header: 'kodvar_t', defaultFlex: 1 },
]

const dataSource = [];

const DwVar = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwVar;