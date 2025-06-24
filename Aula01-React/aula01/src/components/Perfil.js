import React from 'react';
import './Perfil.css';

function Perfil({nome,cargo,email }) {
    return(
        <div className='perfil'>
            <h1>Perfil</h1>
            <p>Nome: {nome}</p>
            <p>Cargo: {cargo}</p>
            <p>Email: {email}</p>

        </div>
        
    );

}
export default Perfil;