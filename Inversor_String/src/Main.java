public class Main {
    public static void main(String[] args) {
        Inverte_String_Meu inverteString = new Inverte_String_Meu();
        String entrada1 = "UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE\n";
        String entrada2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC  E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG\n" +
                "\n";

        String res1 = inverteString.inversor_String(entrada1);
        String res2 = inverteString.inversor_String(entrada2);

        System.out.println(res1);
        System.out.println(res2);
    }
}