var name = "Fluidone";
var today = 28;

// Wrong way
//console.log("Ciao mi chiamo " + name + " e oggi e' il " + today + " di marzo 2021");

// Se la funzione format non è implementata nella versione di js che stiamo
// utilizzando è possibile implementarla, ma bisogna sapere che cosa si sta
// facendo.
if (!String.prototype.format) {
    console.log("Format function not implemented");
    String.prototype.format = function() {
        var args = arguments;
        return this.replace(/{(\d+)}/g, function(match, number) {
            return typeof args[number] != 'undefined'
                ? args[number]
                : match
            ;
        });
    };
}

var template = "Ciao mi chiamo {0} e oggi e' il {1} di marzo 2021";
console.log(template.format(name, today));

// Formattazione con replace dei placeholder (soluzione via di mezzo)
var formatted_string = template.replace("{0}", name);
formatted_string = formatted_string.replace("{1}", today);
console.log(formatted_string);

// Best Way
// Formattazione con interpolazione di stringhe
formatted_string = `Ciao mi chiamo ${name} e oggi e' il ${today} di marzo `;
formatted_string += `2021`;
console.log(formatted_string);
