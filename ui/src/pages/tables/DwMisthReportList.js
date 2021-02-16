import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'descreport_t', header: 'descreport_t', defaultFlex: 1 },
  { name: 'kodreport_t', header: 'kodreport_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthReportList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthReportList;