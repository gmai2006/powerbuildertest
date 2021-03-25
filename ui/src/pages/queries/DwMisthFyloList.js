import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodfylo', header: 'kodfylo', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'descfylo', header: 'descfylo', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwMisthFyloList/rest/dwmisthfylolist/selectAll',{
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

const DwMisthFyloList = () => {
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

export default DwMisthFyloList;