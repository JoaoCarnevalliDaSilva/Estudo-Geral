const notasFiscais = [
  { id: 1, descricao: "Passagem Aérea", valor: 1200, status: "Paga" },
  { id: 2, descricao: "Almoço Cliente", valor: 150, status: "Pendente" },
  { id: 3, descricao: "Hotel Paris", valor: 2800, status: "Paga" },
  { id: 4, descricao: "Uber", valor: 45, status: "Pendente" }
];

function conciliar(event){
  event.preventDefault();
  const opcao = document.querySelector("#status").value;
  const divLista = document.querySelector("#lista-notas");
  const divTotal = document.querySelector("#total-notas");

  //criar uma lista temporaria, para preservar a original
  let novaLista;
  if(opcao === "Todos") {
    novaLista = notasFiscais;
  } else {
    novaLista = notasFiscais.filter(item => item.status === opcao);
  }

  //pega cada item filtrado e transforma em uma linha no HTML
  const listaHTML = novaLista.map(item => {
    return `<p>${item.descricao} - R$ ${item.valor.toFixed(2)}</p>`
  })

  // somar todos os itens da lista
  const valorTotal = novaLista.reduce((total, item) => total + item.valor, 0);

  divLista.innerHTML = listaHTML.join('');

  divTotal.innerHTML = `<span>Total acumulado: R$ ${valorTotal.toFixed(2)}</span>`;
}