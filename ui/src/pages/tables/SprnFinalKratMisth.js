import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'sum_poso_t', header: 'sum_poso_t', defaultFlex: 1 },
  { name: 'misth_zpkrat_desckrat_t', header: 'misth_zpkrat_desckrat_t', defaultFlex: 1 },
]

const dataSource = [];

const SprnFinalKratMisth = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default SprnFinalKratMisth;