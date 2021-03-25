import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'datefinal', header: 'datefinal', defaultFlex: 1 },
  { name: 'aa', header: 'aa', defaultFlex: 1 },
  { name: 'descperiod', header: 'descperiod', defaultFlex: 1 },
  { name: 'kodfinal', header: 'kodfinal', defaultFlex: 1 },
  { name: 'plirdate', header: 'plirdate', defaultFlex: 1 },
  { name: 'descfinal', header: 'descfinal', defaultFlex: 1 },
  { name: 'kodypal', header: 'kodypal', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/SprnYpalFinal/rest/sprnypalfinal/selectAll',{
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

const SprnYpalFinal = () => {
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

export default SprnYpalFinal;