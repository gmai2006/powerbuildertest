import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'delrec', header: 'delrec', defaultFlex: 1 },
  { name: 'kodgroup', header: 'kodgroup', defaultFlex: 1 },
  { name: 'descaction', header: 'descaction', defaultFlex: 1 },
  { name: 'addrec', header: 'addrec', defaultFlex: 1 },
  { name: 'descapp', header: 'descapp', defaultFlex: 1 },
  { name: 'kodaction', header: 'kodaction', defaultFlex: 1 },
  { name: 'openform', header: 'openform', defaultFlex: 1 },
  { name: 'editrec', header: 'editrec', defaultFlex: 1 },
  { name: 'openlist', header: 'openlist', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwUsrgrouppermList/rest/dwusrgrouppermlist/selectAll',{
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

const DwUsrgrouppermList = () => {
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

export default DwUsrgrouppermList;