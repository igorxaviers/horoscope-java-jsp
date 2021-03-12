

const formsigno = document.getElementById('formSigno');
formsigno.addEventListener('submit', (e) => {
    e.preventDefault();
    // const formData = new FormData(formsigno);
    // fetch('./ServletGetHoroscope', {
    //     method: 'post',
    //     body: formData
    // }).then((response) => {
    //     response => response.text();
    // }).then((text) => {
    //     console.log(text);
    // });


    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","./ServletGetHoroscope");
    var formData = new FormData(formsigno); //para recuperar os parâmetros do form
    const data = new URLSearchParams();

    for (const pair of formData)   //inserindo os parâmetros individualmente
        data.append(pair[0], pair[1]);

    httpRequest.send(data); // enviando os parâmetros junto com a chamada do servlet
    httpRequest.onreadystatechange = function () 
    {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)
        {
           //document.getElementById("imagem").src = innerHTML=httpRequest.responseText;
//           console.log(httpRequest.responseText);
           var teste = httpRequest.responseText;
           console.log(teste);
        }
    };
});


// function mostraValor(myform)
// {
//     event.preventDefault(); //evitar a submissão/reload da página

//     var httpRequest = new XMLHttpRequest();
//     httpRequest.open("post","./ServletGeraPrevisao");
//     var formData = new FormData(myform); //para recuperar os parâmetros do form
//     const data = new URLSearchParams();

//     for (const pair of formData)   //inserindo os parâmetros individualmente
//         data.append(pair[0], pair[1]);

//     httpRequest.send(data); // enviando os parâmetros junto com a chamada do servlet
//     httpRequest.onreadystatechange = function () 
//     {
//         if (httpRequest.readyState === 4 && httpRequest.status === 200)
//            document.getElementById("previsao").innerHTML=httpRequest.responseText;

//     };

// }