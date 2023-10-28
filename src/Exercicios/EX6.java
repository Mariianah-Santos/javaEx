package Exercicios;

public class EX6 {
    
    /* 6. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas 
    (4% do valor das vendas efetuadas pelo funcionário). 
    Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas, 
    calcule e mostre a comissão e seu salário final. (Utilize do salario para fazer o calcula das vendas) */

    public static void main (String[] args) {
        double salario, salario_comissao;
        salario = 1380;
        salario_comissao = salario * 4 / 100;
        System.out.println("Salario normal R$" + salario);
        System.out.println("COMISSÃO R$" + salario_comissao);
        System.out.println("Salario final R$" + (salario + salario_comissao));
    }
}
