const reembolsos = [
  { id: 1, funcionario: "Carlos", valor: 350, status: "Aprovado" },
  { id: 2, funcionario: "Mariana", valor: 1200, status: "Pendente" },
  { id: 3, funcionario: "Fernanda", valor: 450, status: "Aprovado" },
  { id: 4, funcionario: "Roberto", valor: 800, status: "Rejeitado" },
  { id: 5, funcionario: "Aline", valor: 600, status: "Aprovado" }
];

function processar() {
  const aprovados = reembolsos.filter(item => item.status === "Aprovado");
  const listaHTML = aprovados.map(item => {
    return `<p>Funcionário: ${item.funcionario} - R$ ${item.valor.toFixed(2)}</p>`;
  });
  const totalSoma = aprovados.reduce((acumulador, item) => acumulador + item.valor, 0);
  document.querySelector("#lista-reembolsos").innerHTML = listaHTML.join('');
  
  document.querySelector("#total-reembolsos").innerHTML = 
    `<h3>Total Liberado: R$ ${totalSoma.toFixed(2)}</h3>`;
}