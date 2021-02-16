import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'bathmos_t', header: 'bathmos_t', defaultFlex: 1 },
  { name: 'misth_zpidikot_descidikot_t', header: 'misth_zpidikot_descidikot_t', defaultFlex: 1 },
  { name: 'mitroo_t', header: 'mitroo_t', defaultFlex: 1 },
  { name: 'klimakio_t', header: 'klimakio_t', defaultFlex: 1 },
  { name: 'klados_t', header: 'klados_t', defaultFlex: 1 },
  { name: 'surname_t', header: 'surname_t', defaultFlex: 1 },
  { name: 'name_t', header: 'name_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthYpalList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthYpalList;