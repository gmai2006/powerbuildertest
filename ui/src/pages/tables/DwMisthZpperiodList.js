import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'orderno_t', header: 'orderno_t', defaultFlex: 1 },
  { name: 'kodperiod_t', header: 'kodperiod_t', defaultFlex: 1 },
  { name: 'descperiod_t', header: 'descperiod_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthZpperiodList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthZpperiodList;