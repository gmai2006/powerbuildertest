import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'password', header: 'password', defaultFlex: 1 },
  { name: 'koduser', header: 'koduser', defaultFlex: 1 },
  { name: 'isactive', header: 'isactive', defaultFlex: 1 },
  { name: 'idiotita', header: 'idiotita', defaultFlex: 1 },
  { name: 'tomeas', header: 'tomeas', defaultFlex: 1 },
  { name: 'fullname', header: 'fullname', defaultFlex: 1 },
  { name: 'username', header: 'username', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuilderreacttest2/rest/usrusers/selectAll',{
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

const Usrusers = () => {
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

export default Usrusers;