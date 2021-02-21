import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'datefinal', header: 'datefinal', defaultFlex: 1 },
  { name: 'aa', header: 'aa', defaultFlex: 1 },
  { name: 'descfinal', header: 'descfinal', defaultFlex: 1 },
  { name: 'kodperiod', header: 'kodperiod', defaultFlex: 1 },
  { name: 'kodfinal', header: 'kodfinal', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'kodkat', header: 'kodkat', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuildertest2/rest/misthfinal/selectAll',{
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

const MisthFinal = () => {
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

export default MisthFinal;