let pets = []

document.getElementById('form').addEventListener('submit', function(event) {
const nome = document.getElementById('nome').value;
const especie = document.getElementById('especie').value;
const raca = document.getElementById('raca').value;
const idade = document.getElementById('idade').value;

const historicoPet = document.getElementById('historico-saude').value;
    event.preventDefault();
    const input = document.getElementById('form-group')
    let pet = {nome:nome, especie:especie, raca:raca, idade:idade, historicoPet:historicoPet}
    pets.push(pet)
    console.log("ARRAY PETS: ",pets)
}) 
