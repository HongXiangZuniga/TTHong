//Exportar
const express = require('express');
const bodyParser = require('body-parser');
const app = express();
//Config
port = 8024

//Midleware

app.use(bodyParser.json())


//Routes
app.get('/', (req, res) => {
    console.dir(req.body);
    res.send("test");
});


//Server Start

app.listen(port, () => {
    console.log("Server run in:", port)
})