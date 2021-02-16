import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodoikog_t', header: 'kodoikog_t', defaultFlex: 1 },
  { name: 'descoikog_t', header: 'descoikog_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZpoikogList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZpoikogList;