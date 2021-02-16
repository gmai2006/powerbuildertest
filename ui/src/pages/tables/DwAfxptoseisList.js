import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'ait_t', header: 'ait_t', defaultFlex: 1 },
  { name: 'onom_t', header: 'onom_t', defaultFlex: 1 },
  { name: 'gen_t', header: 'gen_t', defaultFlex: 1 },
]

const dataSource = [];

const DwAfxptoseisList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwAfxptoseisList;