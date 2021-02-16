import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 't_1', header: 't_1', defaultFlex: 1 },
  { name: 'descgroup_t', header: 'descgroup_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsrgroupsList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsrgroupsList;