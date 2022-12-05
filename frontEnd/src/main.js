// const data = { username: "Victor Jordan" };

// var f = fetch("https://localhost:8080/", {
//   method: "POST",
//   headers: {
//     "Content-Type": "application/json",
//   },
//   body: JSON.stringify(data),
// })
//   .then((response) => response.json())
//   .then((data) => {
//     console.log("Success:", data);
//   })
//   .catch((error) => {
//     console.error("Error:", error);
//   });

window.addEventListener("load", getConsultas)

const getConsultas = async () =>
{
  try
  {
    const select    = document.querySelector("#consultas");
    const results   = await fetch("http://localhost:8080/consultas");
    const consultas = await results.json();

    consultas.array.forEach(element => {
      const option     = document.createElement("option")
      option.innerText = `ID: ${consultas.id} Procedimento: ${consultas.procedimento}`
      option.value     = consultas.id
      select.appendChild(option);
    });
  }
  catch (e)
  {
    console.log(e);
  }

  const getConsulta = async () =>
  {
    const select   = document.querySelector("#consultas")
    const results  = await fetch(`http://localhost:8080/consultas/${select.value}`);
    const consulta = await results.json();

    if (!!document.getElementById("temUmaDiv")) 
    {
      document.getElementById("temUmaDiv").remove();
    }

    const divGerada = document.createElement("div");
    divGerada.id = "temUmaDiv";
    document.body.append(divGerada);

    const ul = document.createElement("ul");
    divGerada.appendChild(ul);
    ul.id = "temUmUl";

    const liID           = document.createElement("li");
    const liProcedimento = document.createElement("li");
    const liOrcamento    = document.createElement("li");
    const liObservacao   = document.createElement("li");
    const liIdMedico     = document.createElement("li");
    const liIdUsuario    = document.createElement("li");
    const liData         = document.createElement("li");
    const liStatus       = document.createElement("li");
    
    liID.innerText           = `ID: ${consulta.id}`;
    liProcedimento.innerText = `Procedimentos: ${consulta.procedimento}`;
    liOrcamento.innerText    = `Orçamento: ${consulta.orcamento}`;
    liObservacao.innerText   = `Observação: ${consulta.observacao}`;
    liIdMedico.innerText     = `ID Médico: ${consulta.medico}`;
    liIdUsuario.innerText    = `ID Usuário: ${consulta.usuario}`;
    liData.innerText         = `Data: ${consulta.data}`;
    liStatus.innerText       = `Status: ${consulta.status}`;
    
    ul.appendChild(liID);
    ul.appendChild(liProcedimento);
    ul.appendChild(liObservacao);
    ul.appendChild(liIdMedico);
    ul.appendChild(liIdUsuario);
    ul.appendChild(liData);
    ul.appendChild(liStatus);

  }
}