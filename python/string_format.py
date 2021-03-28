name = "Fluidone"
today = 28

## Wrong way
# print("Ciao mi chiamo " + name + " e oggi e' il " + today + " di marzo 2021")

## Formattazione con tutti i placeholder posizionali
template = "Ciao mi chiamo {} e oggi e' il {} di marzo 2021"
formatted_string = template.format(name, today)
print(formatted_string)

## formattazione con i placeholder ai quali e' assegnato un nome
template = """
    Ciao mi chiamo {name} e oggi e' il {today} di marzo 2021.
    Oggi siamo in live sul canale di {name}
"""
formatted_string = template.format(name="Fluidone", today=28)
print(formatted_string)

## formattazione con i placeholder posizionali, ma numerici
template = """
    Ciao mi chiamo {0} e oggi e' il {1} di marzo 2021.
    Oggi siamo in live sul canale di {0}
"""
formatted_string = template.format("Fluidone", 28)
print(formatted_string)
