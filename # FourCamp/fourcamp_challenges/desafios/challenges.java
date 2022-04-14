package desafios;

import java.util.Scanner;

import desafios.Desafio_1.area_retangulo;
import desafios.Desafio_2.cavalo_e_ferradura;
import desafios.Desafio_3.soma;
import desafios.Desafio_4.media;
import desafios.Desafio_5.desconto_venda;
import desafios.Desafio_6.imc;
import desafios.Desafio_7.pedrinho_e_cofrinho;
import desafios.Desafio_8.quantidade_de_refrigerante;
import desafios.Desafio_9.tabuada;
import desafios.Desafio_10.area_retangulo_ou_quadrado;
import desafios.Desafio_11.cavalo_e_ferraduras_condicoes;
import desafios.Desafio_12.max_value;
import desafios.Desafio_13.a_e_b_maior_que_c;
import desafios.Desafio_14.valor_compra_e_desconto;
import desafios.Desafio_15.peso_ideal_por_sexo;
import desafios.Desafio_16.peso_ideal_imc;
import desafios.Desafio_17.validate_data;
import desafios.Desafio_18.valida_cpf;
import desafios.Desafio_19.mes_extenso;
import desafios.Desafio_20.dia_semana_extenso;
import desafios.Desafio_21.animal_em_ingles;
import desafios.Desafio_22.forma_de_pagamento_com_desconto;
import desafios.Desafio_23.show_names_7_times;
import desafios.Desafio_24.count_1_to_20;
import desafios.Desafio_25.read_name_and_print_15_times;
import desafios.Desafio_26.tabuada2;
import desafios.Desafio_27.somar_a_e_b_repeticao;
import desafios.Desafio_28.name_null;
import desafios.Desafio_29.calcular_fatorial;

public class challenges { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        boolean validacao = true;
        String continuar;

        // Desafio 1
        area_retangulo area_retangulo = new area_retangulo();

        // Desafio 2
        cavalo_e_ferradura cavalo_e_ferradura = new cavalo_e_ferradura();

        // Desafio 3
        soma soma = new soma();

        // Desafio 4
        media media = new media();

        // Desafio 5
        desconto_venda desconto_venda = new desconto_venda();

        // Desafio 6
        imc imc = new imc();

        // Desafio 7
        pedrinho_e_cofrinho pedrinho_e_cofrinho = new pedrinho_e_cofrinho();

        // Desafio 8
        quantidade_de_refrigerante quantidade_de_refrigerante = new quantidade_de_refrigerante();

        // Desafio 9
        tabuada tabuada = new tabuada();

        // Desafio 10
        area_retangulo_ou_quadrado area_retangulo_ou_quadrado = new area_retangulo_ou_quadrado();

        // Desafio 11
        cavalo_e_ferraduras_condicoes cavalo_e_ferraduras_condicoes = new cavalo_e_ferraduras_condicoes();

        // Desafio 12
        max_value max_value = new max_value();

        // Desafio 13
        a_e_b_maior_que_c a_e_b_maior_que_c = new a_e_b_maior_que_c();

        // Desafio 14
        valor_compra_e_desconto valor_compra_e_desconto = new valor_compra_e_desconto();

        // Desafio 15
        peso_ideal_por_sexo peso_ideal_por_sexo = new peso_ideal_por_sexo();

        // Desafio 16
        peso_ideal_imc peso_ideal_imc = new peso_ideal_imc();

        // Desafio 17
        validate_data validate_data = new validate_data();

        // Desafio 18
        valida_cpf valida_cpf = new valida_cpf();

        // Desafio 19
        mes_extenso mes_extenso = new mes_extenso();

        // Desafio 20
        dia_semana_extenso dia_semana_extenso = new dia_semana_extenso();

        // Desafio 21
        animal_em_ingles animal_em_ingles = new animal_em_ingles();

        // Desafio 22
        forma_de_pagamento_com_desconto forma_de_pagamento_com_desconto = new forma_de_pagamento_com_desconto();

        // Desafio 23
        show_names_7_times show_names_7_times = new show_names_7_times();

        // Desafio 24
        count_1_to_20 count_1_to_20 = new count_1_to_20();

        // Desafio 25
        read_name_and_print_15_times read_name_and_print_15_times = new read_name_and_print_15_times();

        // Desafio 26
        tabuada2 tabuada2 = new tabuada2();

        // Desafio 27
        somar_a_e_b_repeticao somar_a_e_b_repeticao = new somar_a_e_b_repeticao();

        // Desafio 28
        name_null name_null = new name_null();

        // Desafio 29
        calcular_fatorial calcular_fatorial = new calcular_fatorial();  

        do {
            System.out.println("Digite o exercício desejado (1 - 29): ");
            opcao = input.nextInt();  

            switch(opcao){
            case 1:
                area_retangulo.calcularArea(args);
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            } 

            System.out.println("Deseja continuar? (S/N)");
            continuar = input.nextLine();
            System.out.println("\n");
    
            if (continuar.equalsIgnoreCase("n")) {
                validacao = false;
                System.out.println("\n****** Fim do programa ******");
            }
        } while(validacao);

        input.close();
    }   
}
