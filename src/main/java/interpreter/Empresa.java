package interpreter;

public class Empresa {

    public static String formula = "bonus / 100 + salariofixo ";

    public static double calcularSalario(double salariofixo, double bonus) {
        String expressao;
        expressao = formula.replace("salariofixo", Double.toString(salariofixo));
        expressao = expressao.replace("bonus", Double.toString(bonus));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
