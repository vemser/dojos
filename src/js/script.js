const form = document.getElementById("form");

let pets = []

form.addEventListener('submit', function (event) {
    event.preventDefault();

    const nome = document.getElementById('nome').value.trim();
    const especie = document.getElementById('especie').value.trim();
    const raca = document.getElementById('raca').value.trim();
    const idade = document.getElementById('idade').value.trim();
    const historicoPet = document.getElementById('historico-saude').value.trim();

    if(!nome || !especie || !raca || !idade || !historicoPet) {
        alert("Por favor! preencha todos os campos antes de enviar!");
        return;
    }
    
    let pet = { nome: nome, especie: especie, raca: raca, idade: idade, historicoPet: historicoPet }
    pets.push(pet)
    console.log("ARRAY PETS: ", pets)

    form.reset();
}) 
