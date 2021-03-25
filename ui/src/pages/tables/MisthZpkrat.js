import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodkrat', header: 'kodkrat', defaultFlex: 1 },
  { name: 'isautoforos', header: 'isautoforos', defaultFlex: 1 },
  { name: 'desckrat', header: 'desckrat', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'isasf', header: 'isasf', defaultFlex: 1 },
  { name: 'isforos', header: 'isforos', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuilderreacttest2/rest/misthzpkrat/selectAll',{
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

const MisthZpkrat = () => {
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

export default MisthZpkrat;