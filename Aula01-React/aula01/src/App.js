import Perfil from "./components/Perfil";
import './App.css';

const Pefeis = [
  {
    nome: "João Silva",
    cargo: "Desenvolvedor Frontend",
    email: "dsadsa",
  },
  {
    nome: "Maria Oliveira",
    cargo: "Desenvolvedora Backend",
    email: "dsadsa",
  },
  {
    nome: "Carlos Souza",
    cargo: "DevOps",
    email: "dsadsa",
  },
]


function App() {
  return (
    <div className="app">
      <h1>Equipe de Desenvolvimento</h1>
      <div className ="perfis">
        { Pefeis.map((perfil, index) => (
          <Perfil 
            key={index}
            nome={perfil.nome} 
            cargo={perfil.cargo} 
            email={perfil.email} 
          />
        ))}
      </div>
    </div>
  );
}
export default App;
