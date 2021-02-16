import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodtamio_t', header: 'kodtamio_t', defaultFlex: 1 },
  { name: 'desctamio_t', header: 'desctamio_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZptamioList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZptamioList;