import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'desctmima_t', header: 'desctmima_t', defaultFlex: 1 },
  { name: 'kodtmima_t', header: 'kodtmima_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZptmimaList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZptmimaList;