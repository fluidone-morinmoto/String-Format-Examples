import java.lang.StringBuilder;
public class StringFormat {
    public static void main(String args[]) {
        String name = "Fluidone";
        int today = 28;

        // Wrong way
        //System.out.println("Ciao mi chiamo " + name + " e oggi e' il " + today + " di marzo 2021");

        // Best Way
        // Formattazione con placeholder posizionali e tipizzati
        String template = "Ciao mi chiamo %s e oggi e' il %d di marzo 2021 ";
        template += "con String.format";
        String formattedString = String.format(template, name, today);
        System.out.println(formattedString);

        // Concatenazione con StringBuilder (not a best practice)
        StringBuilder sb = new StringBuilder("Ciao mi chiamo ");
        sb.append(name)
            .append(" e oggi e' il ")
            .append(today)
            .append(" di marzo 2021 con StringBuilder");
        System.out.println(sb);

        // Formattazione con replace
        template = "Ciao mi chiamo name e oggi e' il today di ";
        template += "marzo 2021 con String.replace. Siamo sul canale di name";
        formattedString = template.replaceAll("name", name);
        formattedString = formattedString.replaceAll("today", today + "");
        System.out.println(formattedString);

        // Esempio di utilizzo di StringBuilder
        sb = new StringBuilder("<table>");
        String rowTemplate = "<tr><td>%d</td><td>%s</td></tr>";
        String values[] = {"Primo", "Secondo", "Terzo"};
        int cnt = 0;
        for (String v : values) {
            cnt++;
            sb.append(String.format(rowTemplate, cnt, v));
        }
        System.out.println(sb);
        // Output
        // <table>
        //     <tr>
        //         <td>1</td>
        //         <td>Primo</td>
        //     </tr>
        //     <tr>
        //         <td>2</td>
        //         <td>Secondo</td>
        //     </tr>
        //     <tr>
        //         <td>3</td>
        //         <td>Terzo</td>
        //     </tr>
        // </table>
    }
}
