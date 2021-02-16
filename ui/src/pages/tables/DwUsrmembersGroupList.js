import React, { useState } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'usrusers_username_t', header: 'usrusers_username_t', defaultFlex: 1 },
  { name: 'usrusers_isactive_t', header: 'usrusers_isactive_t', defaultFlex: 1 },
  { name: 'usrusers_fullname_t', header: 'usrusers_fullname_t', defaultFlex: 1 },
]

const dataSource = [];

const DwUsrmembersGroupList = () => {
  return (
      <ReactDataGrid
      idProperty="id"
        style={gridStyle}
        columns={columns}
        dataSource={dataSource}
        />
  )
}

export default DwUsrmembersGroupList;