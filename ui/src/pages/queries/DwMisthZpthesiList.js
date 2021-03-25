import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'descthesi', header: 'descthesi', defaultFlex: 1 },
  { name: 'kodthesi', header: 'kodthesi', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwMisthZpthesiList/rest/dwmisthzpthesilist/selectAll',{
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

const DwMisthZpthesiList = () => {
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

export default DwMisthZpthesiList;