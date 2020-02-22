const express=require('express');
const mysql=require('mysql')
const app=express();
const port=2222;
const con=mysql.createConnection({
    'host':'localhost',
    'userName':'root',
    'password':'welcome'

})
con.connect((err) => {
    if(err){
        console.log(err.message)
    }
    else{
        console.log("SuccessFully Completed With MySQL")
    }
    var createDatabase="Create Database Node Demo";
    con.query(createDatabase, (err,result) => {
        if(err) throw err;
        console.log(result);
    })
    })
    
    app.get("/",(req,res)=> {
        res.send("App Running");
    
    })
    app.listen(port,(req,res) => {
        console.log("The Port Has Been Started On Port" +port);
    })