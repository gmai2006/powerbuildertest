import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'sum_poso_t', header: 'sum_poso_t', defaultFlex: 1 },
  { name: 'misth_zpepidom_descepidom_t', header: 'misth_zpepidom_descepidom_t', defaultFlex: 1 },
]

const dataSource = [];

const SprnFinalEpidomMisth = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default SprnFinalEpidomMisth;