import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'jointtr', header: 'jointtr', defaultFlex: 1 },
  { name: 'timitr', header: 'timitr', defaultFlex: 1 },
  { name: 'pediotr', header: 'pediotr', defaultFlex: 1 },
  { name: 'telestistr', header: 'telestistr', defaultFlex: 1 },
]

const dataSource = [];

const DwAfxfilterdList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwAfxfilterdList;