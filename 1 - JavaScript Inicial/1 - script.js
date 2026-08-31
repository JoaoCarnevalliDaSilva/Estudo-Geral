function calcular(event) {
  event.preventDefault();
  const distancia = parseFloat(document.querySelector("#distancia").value);
  const alcool = parseFloat(document.querySelector("#alcool").value);
  const gasolina = parseFloat(document.querySelector("#gasolina").value);
  const resultado = document.querySelector("#resultado");
  // Consumo alcool: 8km/l
  // Consumo gasolina: 12km/l
  // Valor estipulado sera sobre 50km
  const totalAlcool = (distancia/8) * alcool;
  const totalGasolina = (distancia/12) * gasolina;

  if(totalAlcool < totalGasolina) {
    resultado.innerHTML = `A melhor opção para o seu percurso é utilizar álcool`;
  } else {
    resultado.innerHTML = `A melhor opção para o seu percurso é utilizar gasolina`
  }

  document.querySelector("#distancia").value = '';
  document.querySelector("#alcool").value = '';
  document.querySelector("#gasolina").value = '';
}