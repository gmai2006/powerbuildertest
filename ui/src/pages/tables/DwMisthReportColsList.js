import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'width_t', header: 'width_t', defaultFlex: 1 },
  { name: 'expr_t', header: 'expr_t', defaultFlex: 1 },
  { name: 'aa_t', header: 'aa_t', defaultFlex: 1 },
  { name: 'header_text_t', header: 'header_text_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthReportColsList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthReportColsList;