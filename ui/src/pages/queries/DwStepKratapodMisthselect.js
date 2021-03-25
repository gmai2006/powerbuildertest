import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'aa', header: 'aa', defaultFlex: 1 },
  { name: 'datefinal', header: 'datefinal', defaultFlex: 1 },
  { name: 'kodkrat', header: 'kodkrat', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'notes', header: 'notes', defaultFlex: 1 },
  { name: 'desckrat', header: 'desckrat', defaultFlex: 1 },
  { name: 'kodfinal', header: 'kodfinal', defaultFlex: 1 },
  { name: 'fathername', header: 'fathername', defaultFlex: 1 },
  { name: 'plirdate', header: 'plirdate', defaultFlex: 1 },
  { name: 'surname', header: 'surname', defaultFlex: 1 },
  { name: 'descfinal', header: 'descfinal', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'cm_sel', header: 'cm_sel', defaultFlex: 1 },
  { name: 'kodkratapod', header: 'kodkratapod', defaultFlex: 1 },
  { name: 'kodypal', header: 'kodypal', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwStepKratapodMisthselect/rest/dwstepkratapodmisthselect/selectAll',{
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

const DwStepKratapodMisthselect = () => {
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

export default DwStepKratapodMisthselect;