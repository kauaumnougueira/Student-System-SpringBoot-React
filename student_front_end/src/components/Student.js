import  React, { useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@mui/material/TextField';
import { Container ,Paper , Button } from '@material-ui/core';
import { TableBody } from '@mui/material';

const useStyles = makeStyles((theme) => ({
    root: {
      '& > *': {
        margin: theme.spacing(1),
        
      },
    },
  }));

export default function Student() {
    //paper style 
    const paperStyle={padding: '50px 20px', width:600, margin:'20px auto'}

    //style function
    const classes = useStyles();

    //textfield functions
    const[name, setName] = useState('');
    const[address, setAddress] = useState('');
    
    //button function
    const handleClick=(e)=>{
        e.preventDefault()
        //saving in a json
        const student={name,address}
        console.log(student)
        //saving in database
        fetch("https://localhost:8080/students/add", {
            method: "POST",
            headers: {"Content-Type" : "application/json"},
            body:  JSON.stringify(student)
        })
    }
    return (

        <Container>
            <Paper elevation={3} style={paperStyle}>
                <h1>Add Student</h1>

                <form className={classes.root} noValidate autoComplete="off">
                    <TextField id="outlined-basic" label="Student Name" variant="outlined" fullWidth
                        value={name}
                        onChange={(e)=>setName(e.target.value)}
                        style={{margin: '6px'}}
                    />
                    <TextField id="outlined-basic" label="Student Address" variant="outlined" fullWidth
                        value={address}
                        onChange={(e)=>setAddress(e.target.value)}
                        style={{margin: '6px'}}
                    />
                    <Button variant="contained" color="primary" onClick={handleClick}>
                        Submit
                    </Button>
                </form>
                {name}
                {address}
            </Paper>
        </Container>
    );
}
