import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'klimakio_t', header: 'klimakio_t', defaultFlex: 1 },
  { name: 'exeldate_t', header: 'exeldate_t', defaultFlex: 1 },
  { name: 'surname_t', header: 'surname_t', defaultFlex: 1 },
  { name: 'fathername_t', header: 'fathername_t', defaultFlex: 1 },
  { name: 'name_t', header: 'name_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthYpalNewklimakio = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthYpalNewklimakio;