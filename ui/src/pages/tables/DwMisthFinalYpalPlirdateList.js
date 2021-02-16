import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 't_2', header: 't_2', defaultFlex: 1 },
  { name: 't_1', header: 't_1', defaultFlex: 1 },
  { name: 'misth_ypal_fathername_t', header: 'misth_ypal_fathername_t', defaultFlex: 1 },
  { name: 't_3', header: 't_3', defaultFlex: 1 },
  { name: 'misth_ypal_surname_t', header: 'misth_ypal_surname_t', defaultFlex: 1 },
  { name: 'misth_ypal_name_t', header: 'misth_ypal_name_t', defaultFlex: 1 },
  { name: 'misth_final_ypal_plirdate_t', header: 'misth_final_ypal_plirdate_t', defaultFlex: 1 },
]

const dataSource = [];

const DwMisthFinalYpalPlirdateList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwMisthFinalYpalPlirdateList;