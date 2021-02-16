import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'descfiltertr', header: 'descfiltertr', defaultFlex: 1 },
]

const dataSource = [
  {
    descfiltertr: 'test',
  },
  {
    descfiltertr: 'test1',
  },
];

const DwAfxfilterList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwAfxfilterList;