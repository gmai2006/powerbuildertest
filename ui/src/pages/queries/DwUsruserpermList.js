import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodapp', header: 'kodapp', defaultFlex: 1 },
  { name: 'enable', header: 'enable', defaultFlex: 1 },
  { name: 'koduser', header: 'koduser', defaultFlex: 1 },
  { name: 'descapp', header: 'descapp', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwUsruserpermList/rest/dwusruserpermlist/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const DwUsruserpermList = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default DwUsruserpermList;