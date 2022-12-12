function switchDiv(bool)
{
  const divR    = document.querySelector(".div-conteudo");
  const section = document.querySelector(".conteudo");

  if (!!divR) 
  {
    divR.remove();
  }

  if (bool) 
  {
    const div    = document.createElement("div");
    const table  = document.createElement("table");
    const p      = document.createElement("p");

    div.className = "div-conteudo";

    table.className = "conteudo-table";

    p.className = "conteudo-p";

    section.appendChild(div);
    div.appendChild(p);
    div.appendChild(table);
  }
}

function renderHome(){switchDiv(false);}

const getQuantidadeConsultas = async () =>
{
  try
  {
    const p         = document.querySelector(".conteudo-p");
    const results   = await fetch("http://localhost:8080/consultas/quantidade/total");
    const consultas = await results.json();
    
    p.innerHTML = `Total de Consultas ${consultas}`;

  }
  catch (e)
  {
    console.log(e);
  }
}

const renderConsultas = async () =>
{
  switchDiv(true);
  getQuantidadeConsultas();
  try
  {
    const table     = document.querySelector(".conteudo-table");
    const results   = await fetch("http://localhost:8080/consultas");
    const consultas = await results.json();
    console.log(consultas);
    
    const trh = document.createElement("tr");
    table.appendChild(trh);

    const thID          = document.createElement("th");
    const thOrcamento   = document.createElement("th");
    const thCargo       = document.createElement("th");
    const thCrm         = document.createElement("th");
    const thDataMarcada = document.createElement("th");
    const thStatus      = document.createElement("th");
    
    thID.innerHTML          = "ID";
    thOrcamento.innerHTML   = "Orçamento";
    thCargo.innerHTML       = "Observação";
    thDataMarcada.innerHTML = "Data Marcada";
    thCrm.innerHTML         = "Data Criada";
    thStatus.innerHTML      = "Status";

    trh.appendChild(thID);
    trh.appendChild(thOrcamento);
    trh.appendChild(thCargo);
    trh.appendChild(thDataMarcada);
    trh.appendChild(thCrm);
    trh.appendChild(thStatus);
    
    consultas.forEach(element => {
      const tr = document.createElement("tr");
      table.appendChild(tr);

      const elementID          = document.createElement("th");
      const elementOrcamento   = document.createElement("th");
      const elementCargo       = document.createElement("th");
      const elementCrm         = document.createElement("th");
      const elementDataMarcada = document.createElement("th");
      const elementStatus      = document.createElement("th");
      
      elementID.innerHTML          = element.id;
      elementCargo.innerHTML       = element.observacao;
      elementOrcamento.innerHTML   = element.idOrcamento;
      elementCrm.innerHTML         = element.dataCriada;
      elementDataMarcada.innerHTML = element.dataMarcada;
      elementStatus.innerHTML      = element.status;

      tr.appendChild(elementID);
      tr.appendChild(elementOrcamento);
      tr.appendChild(elementCargo);
      tr.appendChild(elementCrm);
      tr.appendChild(elementDataMarcada);
      tr.appendChild(elementStatus);
    });
  }
  catch (e)
  {
    console.log(e);
  }
}

const renderMedicos = async () =>
{
  switchDiv(true);
  try
  {
    const table     = document.querySelector(".conteudo-table");
    const results   = await fetch("http://localhost:8080/gestor/medicos");
    const consultas = await results.json();
    console.log(consultas);
    
    const trh = document.createElement("tr");
    table.appendChild(trh);

    const thID    = document.createElement("th");
    const thNome  = document.createElement("th");
    const thCargo = document.createElement("th");
    const thCrm   = document.createElement("th");
    
    thID.innerHTML    = "ID";
    thNome.innerHTML  = "Nome";
    thCargo.innerHTML = "Cargo";
    thCrm.innerHTML   = "Crm";

    trh.appendChild(thID);
    trh.appendChild(thNome);
    trh.appendChild(thCargo);
    trh.appendChild(thCrm);
    
    consultas.forEach(element => {
      const tr = document.createElement("tr");
      table.appendChild(tr);

      const elementID           = document.createElement("th");
      const elementNome         = document.createElement("th");
      const elementCargo        = document.createElement("th");
      const elementCrm          = document.createElement("th");
      
      elementID.innerHTML    = element.id;
      elementNome.innerHTML  = element.nome;
      elementCargo.innerHTML = element.cargo;
      elementCrm.innerHTML   = element.crm;

      tr.appendChild(elementID);
      tr.appendChild(elementNome);
      tr.appendChild(elementCargo);
      tr.appendChild(elementCrm);
    });
  }
  catch (e)
  {
    console.log(e);
  }
}

const renderOrcamentos = async () =>
{
  switchDiv(true);
  try
  {
    const table     = document.querySelector(".conteudo-table");
    const results   = await fetch("http://localhost:8080/gestor/orcamentos");
    const consultas = await results.json();
    console.log(consultas);
    
    const trh = document.createElement("tr");
    table.appendChild(trh);

    const thID         = document.createElement("th");
    const thValorTotal = document.createElement("th");
    const thData       = document.createElement("th");
    const thPagamento  = document.createElement("th");
    const thIdUsuario  = document.createElement("th");
    const thIdMedico   = document.createElement("th");
  
    thID.innerHTML         = "ID";
    thValorTotal.innerHTML = "Valor Total";
    thData.innerHTML       = "Data";
    thPagamento.innerHTML  = "Pagamento";
    thIdUsuario.innerHTML  = "idUsuário";
    thIdMedico.innerHTML   = "idMédico";

    trh.appendChild(thID);
    trh.appendChild(thValorTotal);
    trh.appendChild(thData);
    trh.appendChild(thPagamento);
    trh.appendChild(thIdUsuario);
    trh.appendChild(thIdMedico);
    
    consultas.forEach(element => {
      const tr = document.createElement("tr");
      table.appendChild(tr);

      const elementID         = document.createElement("th");
      const elementValorTotal = document.createElement("th");
      const elementData       = document.createElement("th");
      const elementPagamento  = document.createElement("th");
      const elementIdUsuario  = document.createElement("th");
      const elementIdMedico   = document.createElement("th");
      
      elementID.innerHTML         = element.id;
      elementValorTotal.innerHTML = element.valotTotal;
      elementData.innerHTML       = element.data;
      elementPagamento.innerHTML  = element.pagamento;
      elementIdUsuario.innerHTML  = element.idUsuario;
      elementIdMedico.innerHTML   = element.idMedico;

      tr.appendChild(elementID);
      tr.appendChild(elementValorTotal);
      tr.appendChild(elementData);
      tr.appendChild(elementPagamento);
      tr.appendChild(elementIdUsuario);
      tr.appendChild(elementIdMedico);
    });
  }
  catch (e)
  {
    console.log(e);
  }
}

const renderProcedimentos = async () =>
{
  switchDiv(true);
  try
  {
    const table     = document.querySelector(".conteudo-table");
    const results   = await fetch("http://localhost:8080/gestor/procedimentos");
    const consultas = await results.json();
    console.log(consultas);
    
    const trh = document.createElement("tr");
    table.appendChild(trh);

    const thID         = document.createElement("th");
    const thNome       = document.createElement("th");
    const thTipo       = document.createElement("th");
    const thDescricao  = document.createElement("th");
    const thValor      = document.createElement("th");
  
    thID.innerHTML        = "ID";
    thNome.innerHTML      = "Nome";
    thTipo.innerHTML      = "Tipo";
    thDescricao.innerHTML = "Descrição";
    thValor.innerHTML     = "Valor";

    trh.appendChild(thID);
    trh.appendChild(thNome);
    trh.appendChild(thTipo);
    trh.appendChild(thDescricao);
    trh.appendChild(thValor);
    
    consultas.forEach(element => {
      const tr = document.createElement("tr");
      table.appendChild(tr);

      const elementID         = document.createElement("th");
      const elementNome = document.createElement("th");
      const elementTipo       = document.createElement("th");
      const elementDescricao  = document.createElement("th");
      const elementValor  = document.createElement("th");
      
      elementID.innerHTML         = element.id;
      elementNome.innerHTML       = element.nome;
      elementTipo.innerHTML       = element.tipo;
      elementDescricao.innerHTML  = element.descricao;
      elementValor.innerHTML  = element.valor;

      tr.appendChild(elementID);
      tr.appendChild(elementNome);
      tr.appendChild(elementTipo);
      tr.appendChild(elementDescricao);
      tr.appendChild(elementValor);
    });
  }
  catch (e)
  {
    console.log(e);
  }
}

const renderUsuarios = async () =>
{
  switchDiv(true);
  try
  {
    const table     = document.querySelector(".conteudo-table");
    const results   = await fetch("http://localhost:8080/usuarios");
    const consultas = await results.json();
    console.log(consultas);
    
    const trh = document.createElement("tr");
    table.appendChild(trh);

    const thID         = document.createElement("th");
    const thNome       = document.createElement("th");
    const thEmail      = document.createElement("th");
    const thDataCriada = document.createElement("th");
    const thCpf        = document.createElement("th");
    const thTelefone   = document.createElement("th");
  
    thID.innerHTML         = "ID";
    thNome.innerHTML       = "Nome";
    thEmail.innerHTML      = "Email";
    thDataCriada.innerHTML = "Criação";
    thCpf.innerHTML        = "CPF";
    thTelefone.innerHTML   = "Telefone";

    trh.appendChild(thID);
    trh.appendChild(thNome);
    trh.appendChild(thEmail);
    trh.appendChild(thDataCriada);
    trh.appendChild(thCpf);
    trh.appendChild(thTelefone);
    
    consultas.forEach(element => {
      const tr = document.createElement("tr");
      table.appendChild(tr);

      const elementID         = document.createElement("th");
      const elementNome       = document.createElement("th");
      const elementEmail      = document.createElement("th");
      const elementDataCriada = document.createElement("th");
      const elementCpf        = document.createElement("th");
      const elementTelefone   = document.createElement("th");
      
      elementID.innerHTML         = element.id;
      elementNome.innerHTML       = element.name;
      elementEmail.innerHTML      = element.email;
      elementDataCriada.innerHTML = element.dataCriada;
      elementCpf.innerHTML        = element.cpf;
      elementTelefone.innerHTML   = element.telefone;

      tr.appendChild(elementID);
      tr.appendChild(elementNome);
      tr.appendChild(elementEmail);
      tr.appendChild(elementDataCriada);
      tr.appendChild(elementCpf);
      tr.appendChild(elementTelefone);
    });
  }
  catch (e)
  {
    console.log(e);
  }
}