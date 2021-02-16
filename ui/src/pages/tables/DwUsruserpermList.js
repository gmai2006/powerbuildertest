import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodapp_t', header: 'kodapp_t', defaultFlex: 1 },
  { name: 'enable_t', header: 'enable_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsruserpermList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsruserpermList;