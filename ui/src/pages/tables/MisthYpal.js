import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'bathmos', header: 'bathmos', defaultFlex: 1 },
  { name: 'birthdate', header: 'birthdate', defaultFlex: 1 },
  { name: 'kodoikog', header: 'kodoikog', defaultFlex: 1 },
  { name: 'klimakio', header: 'klimakio', defaultFlex: 1 },
  { name: 'childs', header: 'childs', defaultFlex: 1 },
  { name: 'spouse', header: 'spouse', defaultFlex: 1 },
  { name: 'kodtmima', header: 'kodtmima', defaultFlex: 1 },
  { name: 'bank', header: 'bank', defaultFlex: 1 },
  { name: 'mobilphone', header: 'mobilphone', defaultFlex: 1 },
  { name: 'hireddate', header: 'hireddate', defaultFlex: 1 },
  { name: 'kodthesi', header: 'kodthesi', defaultFlex: 1 },
  { name: 'bankno', header: 'bankno', defaultFlex: 1 },
  { name: 'prostmeli', header: 'prostmeli', defaultFlex: 1 },
  { name: 'rehireddate', header: 'rehireddate', defaultFlex: 1 },
  { name: 'city', header: 'city', defaultFlex: 1 },
  { name: 'intphone', header: 'intphone', defaultFlex: 1 },
  { name: 'doy', header: 'doy', defaultFlex: 1 },
  { name: 'surname', header: 'surname', defaultFlex: 1 },
  { name: 'kodypal', header: 'kodypal', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'kodtamio', header: 'kodtamio', defaultFlex: 1 },
  { name: 'address', header: 'address', defaultFlex: 1 },
  { name: 'jobtitle', header: 'jobtitle', defaultFlex: 1 },
  { name: 'sex', header: 'sex', defaultFlex: 1 },
  { name: 'termreason', header: 'termreason', defaultFlex: 1 },
  { name: 'fathername', header: 'fathername', defaultFlex: 1 },
  { name: 'exeldate', header: 'exeldate', defaultFlex: 1 },
  { name: 'tk', header: 'tk', defaultFlex: 1 },
  { name: 'jobphone', header: 'jobphone', defaultFlex: 1 },
  { name: 'mitroo', header: 'mitroo', defaultFlex: 1 },
  { name: 'termdate', header: 'termdate', defaultFlex: 1 },
  { name: 'mothername', header: 'mothername', defaultFlex: 1 },
  { name: 'klados', header: 'klados', defaultFlex: 1 },
  { name: 'area', header: 'area', defaultFlex: 1 },
  { name: 'newexeldate', header: 'newexeldate', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'kodidikot', header: 'kodidikot', defaultFlex: 1 },
  { name: 'adt', header: 'adt', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'homephone', header: 'homephone', defaultFlex: 1 },
  { name: 'afm', header: 'afm', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/powerbuilderreacttest2/rest/misthypal/selectAll',{
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

const MisthYpal = () => {
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

export default MisthYpal;