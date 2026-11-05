import java.io.*;

public class Main {
    private static final char[] SIMBOLO = {
            'T','G','C','F','D','R','H'
    };
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String linea;

        while((linea = reader.readLine()) != null){
            linea = linea.trim();
            if(linea.isEmpty()) continue;
            if(linea.equals("0")) break;

            String respuesta = convJeroglifico(linea);
            writer.write(respuesta);
            writer.newLine();
        }
        writer.flush();
    }
    private static String convJeroglifico(String numero){
        StringBuilder out = new StringBuilder();
        int n = numero.length();

        for (int i = 0; i < n ; i++) {
            char ch = numero.charAt(i);
            int veces = Integer.parseInt(String.valueOf(ch));

            if(veces == 0) continue;

            int potencia = n - 1 - i;
            char simbolo = SIMBOLO[potencia];
            for (int k = 0; k < veces; k++) {
                out.append(simbolo);
            }
        }
        return out.toString();
    }
}