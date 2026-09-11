const despesasEmpresa = [
  { id: 1, descricao: "Licença AWS", valor: 4500, departamento: "TI", tipo: "Saida", status: "Paga"},
  { id: 2, descricao: "Aporte de Capital", valor: 50000, departamento: "Investimentos", tipo: "Entrada", status: "Recebida"},
  { id: 3, descricao: "Consultoria", valor: 3200, departamento: "Financeiro", tipo: "Saida", status: "Paga"},
  { id: 4, descricao: "Aporte de Capital", valor: 120000, departamento: "Vendas", tipo: "Saida", status: "Recebido"},
  { id: 5, descricao: "Contratacao", valor: 12300, departamento: "RH", tipo: "Saida", status: "Paga"},
  { id: 6, descricao: "Licença AWS", valor: 500, departamento: "TI", tipo: "Saida", status: "Paga"},
  { id: 7, descricao: "Aporte de Capital", valor: 10000, departamento: "Investimentos", tipo: "Entrada", status: "Recebida"},
  { id: 8, descricao: "Consultoria", valor: 2000, departamento: "Financeiro", tipo: "Saida", status: "Paga"},
  { id: 9, descricao: "Aporte de Capital", valor: 3000, departamento: "Vendas", tipo: "Saida", status: "Paga"},
  { id: 10, descricao: "Contratacao", valor: 2300, departamento: "RH", tipo: "Saida", status: "Paga"}
];

function calcular(event) {
  event.preventDefault();
  const categoria = document.querySelector("#categoria").value;
  const entrada = document.querySelector("#total-entradas");
  const saldo = document.querySelector("#saldo-liquido");
  const saida = document.querySelector("#total-saidas");
  const pendente = document.querySelector("#total-pendente");
  let novaLista;
  if(categoria === "Todos") {
    novaLista = despesasEmpresa;
  } else {
    novaLista = despesasEmpresa.filter(item => item.departamento === categoria);
  }
  const listaHTML = listaTemp.map(item=>{
    return `<p> R$ ${item.valor.toFixed(2)}</p>`;
  })
  const valorTotal = listaTemp.reduce((total, item) => total + item.valor, 0);
  entrada.innerHTML = listaHTML.join('');
  divTotal.innerHTML = `<span>Total acumulado: R$ ${valorTotal.toFixed(2)}</span>`; 
}