const carteira = [
  { id: 1, nome: "Tesouro Selic 2029", valor: 15000, tipo: "Renda Fixa" },
  { id: 2, nome: "Ações VALE3", valor: 8500, tipo: "Renda Variável" },
  { id: 3, nome: "CDB 110% CDI", valor: 12000, tipo: "Renda Fixa" },
  { id: 4, nome: "FII HGLG11", valor: 6000, tipo: "Renda Variável" }
];

function calcular(event) {
  event.preventDefault();
  const escolha = document.querySelector("#tipoAtivo").value;
  const divLista = document.querySelector("#lista-ativos");
  const divTotal = document.querySelector("#total-investido");

  let novaLista;
  if(escolha === "Todos") {
    novaLista = carteira;
  } else {
    novaLista = carteira.filter(item => item.tipo === escolha);
  }

  

}