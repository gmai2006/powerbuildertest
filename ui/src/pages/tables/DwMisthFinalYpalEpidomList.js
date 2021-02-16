import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'poso_t', header: 'poso_t', defaultFlex: 1 },
  { name: 'kodepidom_t', header: 'kodepidom_t', defaultFlex: 1 },
  { name: 'aa_t', header: 'aa_t', defaultFlex: 1 },
  { name: 'notes_t', header: 'notes_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthFinalYpalEpidomList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthFinalYpalEpidomList;