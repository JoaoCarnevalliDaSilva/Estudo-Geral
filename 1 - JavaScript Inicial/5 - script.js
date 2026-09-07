const despesasEmpresa = [
  { id: 1, descricao: "Licença de Software", valor: 2500, departamento: "TI" },
  { id: 2, descricao: "Treinamento de Equipe", valor: 1200, departamento: "RH" },
  { id: 3, descricao: "Servidores Cloud", valor: 4800, departamento: "TI" },
  { id: 4, descricao: "Anúncios Digitais", valor: 3500, departamento: "Marketing" },
  { id: 5, descricao: "Recrutamento Externo", valor: 2000, departamento: "RH" }
];

function calcular(event) {
  event.preventDefault();
  const escolha = document.querySelector("#item-selecionado").value;
  const divLista = document.querySelector("#lista-despesas");
  const divTotal = document.querySelector("#total-departamento");
  let listaTemp;
  if(escolha === "Todos") {
    listaTemp = despesasEmpresa;
  } else {
    listaTemp = despesasEmpresa.filter(item => item.departamento === escolha);
  }
  const listaHTML = listaTemp.map(item=>{
    return `<p>${item.departamento} - R$ ${item.valor.toFixed(2)}</p>`;
  })
  const valorTotal = listaTemp.reduce((total, item) => total + item.valor, 0);
  divLista.innerHTML = listaHTML.join('');
  divTotal.innerHTML = `<span>Total acumulado: R$ ${valorTotal.toFixed(2)}</span>`;  
}