import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'printMarginBottom', header: 'printMarginBottom', defaultFlex: 1 },
  { name: 'descreport', header: 'descreport', defaultFlex: 1 },
  { name: 'printPaperSize', header: 'printPaperSize', defaultFlex: 1 },
  { name: 'printOrientation', header: 'printOrientation', defaultFlex: 1 },
  { name: 'subtitle', header: 'subtitle', defaultFlex: 1 },
  { name: 'prnNotes1', header: 'prnNotes1', defaultFlex: 1 },
  { name: 'prnNotes2', header: 'prnNotes2', defaultFlex: 1 },
  { name: 'printMarginRight', header: 'printMarginRight', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'printMarginTop', header: 'printMarginTop', defaultFlex: 1 },
  { name: 'printScale', header: 'printScale', defaultFlex: 1 },
  { name: 'kodreport', header: 'kodreport', defaultFlex: 1 },
  { name: 'printMarginLeft', header: 'printMarginLeft', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuilderreacttest2/rest/misthreport/selectAll',{
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

const MisthReport = () => {
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

export default MisthReport;