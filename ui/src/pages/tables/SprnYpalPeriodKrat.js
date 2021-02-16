import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'sum_poso_t', header: 'sum_poso_t', defaultFlex: 1 },
  { name: 't_2', header: 't_2', defaultFlex: 1 },
]

const dataSource = [];

const SprnYpalPeriodKrat = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default SprnYpalPeriodKrat;