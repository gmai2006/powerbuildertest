import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'descfylo_t', header: 'descfylo_t', defaultFlex: 1 },
  { name: 'kodfylo_t', header: 'kodfylo_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthFyloList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthFyloList;