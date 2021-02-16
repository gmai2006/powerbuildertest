import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'descthesi_t', header: 'descthesi_t', defaultFlex: 1 },
  { name: 'kodthesi_t', header: 'kodthesi_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZpthesiList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZpthesiList;