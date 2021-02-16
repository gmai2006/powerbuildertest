import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'username_t', header: 'username_t', defaultFlex: 1 },
  { name: 'fullname_t', header: 'fullname_t', defaultFlex: 1 },
  { name: 'isactive_t', header: 'isactive_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsrusersList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsrusersList;