import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'ait', header: 'ait', defaultFlex: 1 },
  { name: 'gen', header: 'gen', defaultFlex: 1 },
  { name: 'onom', header: 'onom', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuilderreacttest2/rest/afxptoseis/selectAll',{
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

const Afxptoseis = () => {
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

export default Afxptoseis;