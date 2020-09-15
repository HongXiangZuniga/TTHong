const express = require('express');
const istar = require('/home/hong/Documentos/TrabajoTitulo/Prueba-de-Concepto-Arqitectural/Components/IValidatorServices/tool/app/istarcore/istarFunctions.js')
const app = express();


app.get('/',(req,res)=>{
    res.send('Hello world')
    istar.fileManager

});



app.listen(3000,()=>{
    console.log('Server on port 3000');
});