import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'fathername', header: 'fathername', defaultFlex: 1 },
  { name: 'exeldate', header: 'exeldate', defaultFlex: 1 },
  { name: 'surname', header: 'surname', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'kodypal', header: 'kodypal', defaultFlex: 1 },
  { name: 'klimakio', header: 'klimakio', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwMisthYpalNewklimakio/rest/dwmisthypalnewklimakio/selectAll',{
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

const DwMisthYpalNewklimakio = () => {
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

export default DwMisthYpalNewklimakio;