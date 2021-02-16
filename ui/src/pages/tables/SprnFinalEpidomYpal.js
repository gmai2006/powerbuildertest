import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 't_2', header: 't_2', defaultFlex: 1 },
  { name: 'misth_final_ypal_epidom_notes_t', header: 'misth_final_ypal_epidom_notes_t', defaultFlex: 1 },
  { name: 't_3', header: 't_3', defaultFlex: 1 },
]

const dataSource = [];

const SprnFinalEpidomYpal = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default SprnFinalEpidomYpal;