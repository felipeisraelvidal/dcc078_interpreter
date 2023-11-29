package interpreter;

public class Funcionario {
    private double salariofixo;
    private double bonus;

    public double getSalariofixo() {
        return salariofixo;
    }

    public void setSalariofixo(double salariofixo) {
        this.salariofixo = salariofixo;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return Empresa.calcularSalario(this.salariofixo, this.bonus);
    }
}
