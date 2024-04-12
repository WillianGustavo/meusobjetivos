const botoes = document.querySelectorAll(".botao");
const textos = document.querySelectorAll(".aba-conteudo");

for(let i=0;1 < botoes.length; i++){
    botoes[i].onclick = function(){ 

        for(let j=0;j<botoes.length;j++){ 
            botoes[j].ClassList.remove("ativo");
            textos[j].ClassList.remove("ativo");
}
botoes[i].ClassList.add("ativo");
textos[i].ClassList.add("ativo");
   }

 }

const contadores = document.querySelectorAll(".contador");
const tempoObjetivo1 = new Date("2023-10-05T00:00:00");
const tempoObjetivo2 = new Date("2023-12-05T00:00:00");
const tempoObjetivo3 = new Date("2023-12-30T00:00:00");
const tempoObjetivo4 = new Date("2023-02-01T00:00:00");

     const tempos = [tempoObjetivo1, tempoObjetivo2, tempoObjetivo3, tempoObjetivo4];

     function calculaTempo(tempoObjetivo) {
        let tempoAtual = new Date();
        let tempoFinal = tempoObjetivo - tempoAtual;
        let segundos = Math.floor(tempoFinal / 1000);
        let minutos = Math.floor(segundos / 60);
        let horas = Math.floor(minutos / 60);
        let dias = Math.floor(horas / 24);

        segundos %= 60;
        minutos %= 60;
        horas %= 24;
        if (tempoFinal > 0){
            return [dias,horas,minutos.segundos];
        } else {
            return [0,0,0,0];
          }
     }

     function atualizarCronometro(){
       for (let i=0; i<contadores.lenght; i++){
        document.getElementById("dias+1").textContent = calculaTempo(tempos[1])[0];
       }
       
       
        atualizarCronometro();
        setInterval(atualizarCronometro,1000);
        }
        for (let i=o; l<contadores.lenght;i++){
            document.getElementById("dias" +1).textContent = calculaTempo()
        }
     }

