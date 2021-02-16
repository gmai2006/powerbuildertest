import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'misth_zpkrat_desckrat_t', header: 'misth_zpkrat_desckrat_t', defaultFlex: 1 },
  { name: 'cm_sel_t', header: 'cm_sel_t', defaultFlex: 1 },
  { name: 'misth_final_descfinal_t', header: 'misth_final_descfinal_t', defaultFlex: 1 },
  { name: 't_1', header: 't_1', defaultFlex: 1 },
  { name: 'misth_final_ypal_krat_poso_t', header: 'misth_final_ypal_krat_poso_t', defaultFlex: 1 },
  { name: 'misth_final_ypal_plirdate_t', header: 'misth_final_ypal_plirdate_t', defaultFlex: 1 },
]

const dataSource = [];

const DwStepKratapodMisthselect = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwStepKratapodMisthselect;