const faturas = [
  { id: 101, cliente: "Empresa Alpha", valor: 1500, status: "Atrasada" },
  { id: 102, cliente: "Beta Tech", valor: 3200, status: "Paga" },
  { id: 103, cliente: "Gama Serviços", valor: 850, status: "Atrasada" },
  { id: 104, cliente: "Delta Corp", valor: 4100, status: "Pendente" },
  { id: 105, cliente: "Omega LTDA", valor: 2300, status: "Atrasada" }
];

function gerarRelatorios() {
  const atrasados = faturas.filter(item => item.status === "Atrasada");
  const listaHTML = atrasados.map(item => {
    return `<p>Cliente: ${item.cliente} - R$ ${item.valor.toFixed(2)}</p>`;
  })
  const totalSoma = atrasados.reduce((acumulador, item) => acumulador + item.valor, 0);
  document.querySelector("#lista-faturas").innerHTML = listaHTML.join('');
  
  document.querySelector("#total-atrasado").innerHTML = 
    `<h4>Total Atrasado: R$ ${totalSoma.toFixed(2)}</h4>`;
}