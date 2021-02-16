import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'misth_zpperiod_descperiod_t', header: 'misth_zpperiod_descperiod_t', defaultFlex: 1 },
  { name: 't_2', header: 't_2', defaultFlex: 1 },
  { name: 'misth_final_descfinal_t', header: 'misth_final_descfinal_t', defaultFlex: 1 },
  { name: 't_1', header: 't_1', defaultFlex: 1 },
  { name: 'misth_final_aa_t', header: 'misth_final_aa_t', defaultFlex: 1 },
  { name: 't_3', header: 't_3', defaultFlex: 1 },
  { name: 'misth_final_datefinal_t', header: 'misth_final_datefinal_t', defaultFlex: 1 },
  { name: 'misth_final_ypal_plirdate_t', header: 'misth_final_ypal_plirdate_t', defaultFlex: 1 },
]

const dataSource = [];

const SprnYpalFinal = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default SprnYpalFinal;