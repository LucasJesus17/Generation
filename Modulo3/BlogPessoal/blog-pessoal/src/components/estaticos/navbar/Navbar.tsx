import React from 'react';


import { AppBar, Box, Toolbar, IconButton, Typography, Button } from '@material-ui/core';
import {Link} from 'react-router-dom';
import './Navbar.css';

function Navbar() {
    return (
        <>
            <AppBar position="static">
                <Toolbar variant="dense">
                    <Box className='cursor'>
                        <Typography variant="h5" color="inherit">
                            BlogPessoal
                        </Typography>
                    </Box>

                    <Box display="flex" justifyContent="start">
                        <Box mx={1} className='cursor'>
                            <Typography variant="h6" color="inherit">
                                Postagens
                            </Typography>
                        </Box>
                    </Box>

                    <Box display="flex" justifyContent="start">
                        <Box mx={1} className='cursor'>
                            <Typography variant="h6" color="inherit">
                                Temas
                            </Typography>
                        </Box>
                    </Box>

                    <Box display="flex" justifyContent="start">
                        <Box mx={1} className='cursor'>
                            <Typography variant="h6" color="inherit">
                                Cadastrar Tema
                            </Typography>
                        </Box>
                    </Box>
                    <Link to='login' className='text-decorator-none'>
                        <Box display="flex" justifyContent="start" >
                            <Box mx={1} className='cursor'>
                                <Typography variant="h6" color="inherit" >
                                    Logout
                                </Typography>
                            </Box>
                        </Box>
                    </Link>


                </Toolbar>
            </AppBar>
        </>
    )
}

export default Navbar;