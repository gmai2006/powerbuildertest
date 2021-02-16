import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'apoddate_t', header: 'apoddate_t', defaultFlex: 1 },
  { name: 'desckratapod_t', header: 'desckratapod_t', defaultFlex: 1 },
  { name: 't_1', header: 't_1', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthKratapodList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthKratapodList;