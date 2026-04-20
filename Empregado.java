package Empregado;

public class Empregado {
    private String nome;
    private int horas;
    private int horasextra;
    private cargoEmpregado cargo;

    // Xenera automaticamente un Constructor

    // Xenera automaticamente os métodos get e set para cada atributo da clase

    // Despois de que funcione, refactoriza movendo o método calculoHoras() para que
    // sexa a clase CargoEmpregado quen calcule as horas, e non a clase Empregado
    public double calculoHoras() {
        if (cargo.getCargo().equals("Supervisor")) {
            return horas + horasextra * 2;
        }
        if (cargo.getCargo().equals("Dependente")) {
            return horas + horasextra * 1.5;
        }
        return horas + horasextra * 1.1;
    }

    public double getSoldo() {
        return cargo.geteurosPorHora() * calculoHoras();
    }

}
