import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodepidom', header: 'kodepidom', defaultFlex: 1 },
  { name: 'autoforos', header: 'autoforos', defaultFlex: 1 },
  { name: 'descepidom', header: 'descepidom', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'hasforo', header: 'hasforo', defaultFlex: 1 },
  { name: 'isasf', header: 'isasf', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuildertest2/rest/misthzpepidom/selectAll',{
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

const MisthZpepidom = () => {
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

export default MisthZpepidom;