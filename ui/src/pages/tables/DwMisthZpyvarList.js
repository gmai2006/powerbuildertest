import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodyvar_t', header: 'kodyvar_t', defaultFlex: 1 },
  { name: 'descyvar_t', header: 'descyvar_t', defaultFlex: 1 },
  { name: 'expr_t', header: 'expr_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZpyvarList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZpyvarList;