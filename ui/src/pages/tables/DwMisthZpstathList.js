import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'poso_t', header: 'poso_t', defaultFlex: 1 },
  { name: 'descstath_t', header: 'descstath_t', defaultFlex: 1 },
  { name: 'kodstath_t', header: 'kodstath_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZpstathList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZpstathList;