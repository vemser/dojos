const nome = document.getElementById('nome').value;
const especie = document.getElementById('especie').value;
const raca = document.getElementById('raca').value;
const idade = document.getElementById('idade').value;
const historicoPet = document.getElementById('historico-saude').value;
const pets = []

document.getElementById('form').addEventListener('submit', function(event) {
    event.preventDefault();
    const input = document.getElementById('form-group')
    addPet(input.value)
}) // aaa