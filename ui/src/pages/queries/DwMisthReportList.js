import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'print_margin_bottom', header: 'print_margin_bottom', defaultFlex: 1 },
  { name: 'descreport', header: 'descreport', defaultFlex: 1 },
  { name: 'print_margin_right', header: 'print_margin_right', defaultFlex: 1 },
  { name: 'kodreport', header: 'kodreport', defaultFlex: 1 },
  { name: 'print_paper_size', header: 'print_paper_size', defaultFlex: 1 },
  { name: 'prn_notes1', header: 'prn_notes1', defaultFlex: 1 },
  { name: 'print_orientation', header: 'print_orientation', defaultFlex: 1 },
  { name: 'print_margin_left', header: 'print_margin_left', defaultFlex: 1 },
  { name: 'subtitle', header: 'subtitle', defaultFlex: 1 },
  { name: 'prn_notes2', header: 'prn_notes2', defaultFlex: 1 },
  { name: 'print_margin_top', header: 'print_margin_top', defaultFlex: 1 },
  { name: 'print_scale', header: 'print_scale', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/DwMisthReportList/rest/dwmisthreportlist/selectAll',{
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

const DwMisthReportList = () => {
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

export default DwMisthReportList;