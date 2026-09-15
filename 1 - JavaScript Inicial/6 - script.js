const despesasEmpresa = [
  { id: 1, descricao: "Licença AWS", valor: 4500, departamento: "TI", tipo: "Saida", status: "Paga" },
  { id: 2, descricao: "Aporte de Capital", valor: 50000, departamento: "Investimentos", tipo: "Entrada", status: "Recebida" },
  { id: 3, descricao: "Consultoria", valor: 3200, departamento: "Financeiro", tipo: "Saida", status: "Pendente" },
  { id: 4, descricao: "Aporte de Capital", valor: 120000, departamento: "Vendas", tipo: "Entrada", status: "Recebida" },
  { id: 5, descricao: "Contratacao", valor: 12300, departamento: "RH", tipo: "Saida", status: "Paga" },
  { id: 6, descricao: "Licença AWS", valor: 500, departamento: "TI", tipo: "Saida", status: "Paga" },
  { id: 7, descricao: "Aporte de Capital", valor: 10000, departamento: "Investimentos", tipo: "Entrada", status: "Recebida" },
  { id: 8, descricao: "Consultoria", valor: 2000, departamento: "Financeiro", tipo: "Saida", status: "Pendente" },
  { id: 9, descricao: "Aporte de Capital", valor: 3000, departamento: "Vendas", tipo: "Saida", status: "Paga" },
  { id: 10, descricao: "Contratacao", valor: 2300, departamento: "RH", tipo: "Saida", status: "Paga" }
];

function calcular(event) {
  // Se a função for chamada pelo evento do form, cancela o refresh
  if (event) event.preventDefault();

  const categoriaSel = document.querySelector("#categoria").value;
  const statusSel = document.querySelector("#status").value;

  // 1. FILTRAGEM DUPLA (Categoria e Status)
  const listaFiltrada = despesasEmpresa.filter(item => {
    const bateCategoria = (categoriaSel === "Todos" || item.descricao === categoriaSel);
    const bateStatus = (statusSel === "Todos" || item.status === statusSel);
    return bateCategoria && bateStatus;
  });

  // 2. CÁLCULO DOS KPIS COM .REDUCE
  const totalEntradas = listaFiltrada
    .filter(item => item.tipo === "Entrada")
    .reduce((acc, item) => acc + item.valor, 0);

  const totalSaidas = listaFiltrada
    .filter(item => item.tipo === "Saida")
    .reduce((acc, item) => acc + item.valor, 0);

  const saldoLiquido = totalEntradas - totalSaidas;

  const totalPendente = listaFiltrada
    .filter(item => item.status === "Pendente")
    .reduce((acc, item) => acc + item.valor, 0);

  // 3. EXIBINDO OS KPIS NA TELA
  document.querySelector("#total-entradas").innerText = `R$ ${totalEntradas.toFixed(2)}`;
  document.querySelector("#total-saidas").innerText = `R$ ${totalSaidas.toFixed(2)}`;
  document.querySelector("#saldo-liquido").innerText = `R$ ${saldoLiquido.toFixed(2)}`;
  document.querySelector("#total-pendente").innerText = `R$ ${totalPendente.toFixed(2)}`;

  // 4. RENDERIZANDO A TABELA (.map)
  const linhasHTML = listaFiltrada.map(item => {
    return `
      <tr>
        <td>${item.descricao}</td>
        <td>R$ ${item.valor.toFixed(2)}</td>
        <td>${item.departamento}</td>
        <td>${item.tipo}</td>
        <td>${item.status}</td>
      </tr>
    `;
  });

  document.querySelector("#tabela-corpo").innerHTML = linhasHTML.join('');
}

// Executa a função uma vez ao carregar a página para já exibir os dados iniciais
calcular();