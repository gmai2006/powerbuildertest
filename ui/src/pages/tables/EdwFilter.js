import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'operatortr', header: 'operatortr', defaultFlex: 1 },
  { name: 'valuetr', header: 'valuetr', defaultFlex: 1 },
  { name: 'fldtr', header: 'fldtr', defaultFlex: 1 },
  { name: 'jointr', header: 'jointr', defaultFlex: 1 },
]

const dataSource = [];

const EdwFilter = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default EdwFilter;