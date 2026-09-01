const despesas = [
  { id: 1, descricao: "Passagem Aérea", valor: 1200, categoria: "Viagem" },
  { id: 2, descricao: "Almoço Cliente", valor: 150, categoria: "Alimentação" },
  { id: 3, descricao: "Hotel Paris", valor: 2800, categoria: "Viagem" },
  { id: 4, descricao: "Uber", valor: 45, categoria: "Transporte" }
];

function calcular(event) {
  event.preventDefault();
  const opcao = document.querySelector("#opcoes").value;
  const divLista = document.querySelector("#lista");
  const divTotal = document.querySelector("#total");

  let despesasFiltradas;
  if (opcao === "Todos") {
    despesasFiltradas = despesas;
  } else {
    despesasFiltradas = despesas.filter(item => item.categoria === opcao);
  }

  const listaHTML = despesasFiltradas.map(item=> {
    return `<p>${item.descricao} - R$ ${item.valor.toFixed(2)}</p>`;
  })

  const valorTotal = despesasFiltradas.reduce((total, item) => total + item.valor, 0);

  divLista.innerHTML = listaHTML.join('');

  divTotal.innerHTML = `<span style="color: green; font-weight: bold;">Total Acumulado: R$ ${valorTotal.toFixed(2)}</span>`;
}