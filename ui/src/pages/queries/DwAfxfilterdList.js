import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'joint', header: 'joint', defaultFlex: 1 },
  { name: 'timi', header: 'timi', defaultFlex: 1 },
  { name: 'kodfilterd', header: 'kodfilterd', defaultFlex: 1 },
  { name: 'telestis', header: 'telestis', defaultFlex: 1 },
  { name: 'kodfilter', header: 'kodfilter', defaultFlex: 1 },
  { name: 'pedio', header: 'pedio', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwAfxfilterdList/rest/dwafxfilterdlist/selectAll',{
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

const DwAfxfilterdList = () => {
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

export default DwAfxfilterdList;