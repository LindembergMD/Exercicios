package locadora;



import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int op = 0;



        ArrayList<Cliente> listCliente = new ArrayList<Cliente>();
        ArrayList<Veiculo> listVeiculo = new ArrayList<Veiculo>();
        ArrayList<Locacao> listAlugado = new ArrayList<Locacao>();



        while(true) {

            new Clear().clearConsole();
            System.out.print("\n  Locadora de Veiculos\n\n  1 - Cadastrar ve�culo\n  2 - Cadastrar cliente\n  3 - Loca��o de ve�culo\n  4 - Listagem de ve�culos cadastrados\n  5 - Listagem de ve�culos dispon�veis\n  6 - Listagem de cliente\n  7 - Sair\n"); //5 - Listagem das loca��es\n
            if(op == -666){

                System.out.print("\n  Op��o invalida!");

            }

            System.out.print("\n  Escolha uma opc�o: ");
            try {

                op = leitor.nextInt();
            } catch (InputMismatchException a) {

                op = -666;

                leitor.nextLine();

            }



            switch (op) {

                case 1:

                    Veiculo veiculo = new Veiculo();

                    veiculo.Cadastrar();

                    while(true) {

                        new Clear().clearConsole();

                        System.out.print("\n  Cadastro veiculo\n\n  Deseja adicionar veiculo\n\n  1 - Sim\n  2 - N�o\n");

                        if(op == -666){

    						System.out.print("\n  Tente novamente, Op��o invalida");

    					}

                        System.out.print("\n  Escolha uma opc�o: ");

                        try {

                            op = leitor.nextInt();

                        } catch (InputMismatchException a) {

                            op = -666;

                            leitor.nextLine();

                        }

                        if(op == 1) {

                            listVeiculo.add(veiculo);

    						break;

    					} else if(op == 2) {

    						break;

    					}

    					op = -666;

                    }

                    break;

                case 2:

                    Cliente cliente = new Cliente();

                    cliente.Cadastrar();

                    while(true) {

                        new Clear().clearConsole();

                        System.out.printf("\n  Cadastro cliente\n\n  Deseja adicionar cadastro: %s\n\n  1 - Sim\n  2 - N�o\n", cliente.getNome());

                        if(op == -666){

    						System.out.print("\n  Tente novamente, Op��o invalida");

    					}

                        System.out.print("\n  Escolha uma opc�o: ");

                        try {

                            op = leitor.nextInt();

                        } catch (InputMismatchException a) {

                            op = -666;

                            leitor.nextLine();

                        }

                        if(op == 1) {

                            listCliente.add(cliente);

    						break;

    					} else if(op == 2) {

    						break;

    					}

    					op = -666;

                    }

                    break;

                case 3:

                    if (listCliente.size() == 0){

                        leitor.nextLine();

                        System.out.println("  Nem um cliente cadastrado!!!");

                        leitor.nextLine();

                    }

                    else {

                      int clienteAL=0;

                      int carroAL=0;

                      System.out.println("  Clientes dispon�veis: ");

                      for(int x = 0; x < listCliente.size(); x++){

                          cliente = listCliente.get(x);

                          System.out.println("  "+x+1 + " " + cliente.getNome());

                      }

                      while(true) {

                        try {

                          System.out.print("\n  Escolha um locat�rio: ");

                          clienteAL = leitor.nextInt();

                        } catch(InputMismatchException a) {

                          System.out.print("\n  Tente novamente, digite apenas n�meros");

                          leitor.nextLine();

                        }

                        if (clienteAL < listCliente.size() || clienteAL > listCliente.size()) {

                          System.out.println("Favor informar cliente que foram listados!");

                        }

                        else break;

                      }





                      new Clear().clearConsole();

                      System.out.print("    Tipo   Descri��o                       Placa\n" + listVeiculo.size());

                      for(int x = 0; x < listVeiculo.size(); x++){

                          if(listVeiculo.get(x).isDisponivel()){

                              System.out.printf("\n%2d  ", x+1);

                              if (listVeiculo.get(x).isTipoVeiculo()){

                                  System.out.printf("Carro  %30s  %8s  ", listVeiculo.get(x).getDescricaoVeiculo(), listVeiculo.get(x).getPlacaVeiculo());

                              } else {

                                  System.out.printf("Moto   %30s  %8s  ", listVeiculo.get(x).getDescricaoVeiculo(), listVeiculo.get(x).getPlacaVeiculo());

                              }

                          }

                      }

                      while(true) {

                        try {

                          System.out.print("\n  Escolha um carro: ");

                          carroAL = leitor.nextInt();

                        } catch(InputMismatchException a) {

                          System.out.print("\n  Tente novamente, digite apenas n�meros");

                          leitor.nextLine();

                        }

                        if (clienteAL < listCliente.size() || clienteAL > listCliente.size()) {

                          System.out.println("Favor informar carro que foram listados!");

                        }

                        else break;

                      }



                      Locacao alugado = new Locacao();

                      alugado.aluga(clienteAL-1,listVeiculo.get(carroAL-1));



                      while(true) {

                          new Clear().clearConsole();

                          System.out.printf("\n  Loca��o de Ve�culos\n\n  Deseja adicionar aluguel: \n\n  1 - Sim\n  2 - N�o\n");

                          if(op == -666){

                              System.out.print("\n  Tente novamente, Op��o invalida");

      					}

                          System.out.print("\n  Escolha uma opc�o: ");

                          try {

                              op = leitor.nextInt();

                          } catch (InputMismatchException a) {

                              op = -666;

                              leitor.nextLine();

                          }

                          if(op == 1) {

                              double desconto = leitor.nextDouble();

                              while(true) {

                                try {

                                    System.out.printf("  Valor total do aluguel: %.2f\n  Digite o valor de desconto desejado(Desconto m�ximo 12 porcento): ",alugado.getValor());

                                } catch(InputMismatchException a) {

                                  System.out.print("\n  Tente novamente, digite apenas n�meros");

                                  leitor.nextLine();

                                }

                                if (desconto < 0 || desconto > 12) {

                                  System.out.println("  Valor inv�lido!");

                                }

                                else break;

                              }

                              if (desconto != 0)alugado.setValor(alugado.getValor()-(alugado.getValor()*(desconto/100)));

                              listVeiculo.get(carroAL-1).setDisponivel(false);

                              listAlugado.add(alugado);

      						break;

      					} else if(op == 2) {

      						break;

      					}

      					op = -666;

                      }

                    }



                    break;

                case 4: // Esta listando todos os cadastros de veiculo para teste

                    new Clear().clearConsole();

                    System.out.print("\n  Listagem de ve�culos cadastrados\n\n      Tipo   Descri��o                       Placa     Partida  Num. passageiros");

                    for(int x = 0; x < listVeiculo.size(); x++){

                        System.out.printf("\n  %2d  ", x+1);

                        if (listVeiculo.get(x).isTipoVeiculo()){

                            System.out.printf("Carro  %-30s  %-8s           %2d", listVeiculo.get(x).getDescricaoVeiculo(), listVeiculo.get(x).getPlacaVeiculo(), listVeiculo.get(x).getCarroNumeroPassageiros());

                        } else {

                            System.out.printf("Moto   %-30s  %-8s  ", listVeiculo.get(x).getDescricaoVeiculo(), listVeiculo.get(x).getPlacaVeiculo());

                            if (listVeiculo.get(x).isMotoPartidaEletrica()) {

                                System.out.printf("Com");

                            } else {

                                System.out.printf("Sem");

                            }

                        }

                    }

                    System.out.print("\n\n  Pressione enter para continuar ");

                    leitor.nextLine();

                    leitor.nextLine();

                    break;

              /**  case 5:

                    break;*/ //fun��o nao implementada 

                case 5:

                    new Clear().clearConsole();

                    System.out.print("\n  Listagem de ve�culos cadastrados\n\n      Tipo   Descri��o                       Placa     Partida  Num. passageiros");

                    for(int x = 0; x < listVeiculo.size(); x++){

                        if(listVeiculo.get(x).isDisponivel()){

                            System.out.printf("\n  %2d  ", x+1);

                            if (listVeiculo.get(x).isTipoVeiculo()){

                                System.out.printf("Carro  %-30s  %-8s           %2d", listVeiculo.get(x).getDescricaoVeiculo(), listVeiculo.get(x).getPlacaVeiculo(), listVeiculo.get(x).getCarroNumeroPassageiros());

                            } else {

                                System.out.printf("Moto   %-30s  %-8s  ", listVeiculo.get(x).getDescricaoVeiculo(), listVeiculo.get(x).getPlacaVeiculo());

                                if (listVeiculo.get(x).isMotoPartidaEletrica()) {

                                    System.out.printf("Com");

                                } else {

                                    System.out.printf("Sem");

                                }

                            }

                        }

                    }

                    System.out.print("\n\n  Pressione enter para continuar ");

                    leitor.nextLine();

                    leitor.nextLine();

                    break;

                case 6:// Esta listando todos os cadastros de clientes para teste

                    new Clear().clearConsole();

                    System.out.print("\n  Listagem de cliente\n\n      Nome                            Cpf           Idade  Contato");

                    for(int x = 0; x < listCliente.size(); x++){

                        System.out.printf("\n  %2d  ", x+1);

                        System.out.printf("%-30s  %-11d   %-5d  %-30s", listCliente.get(x).getNome(), listCliente.get(x).getCpf(), listCliente.get(x).getIdade(), listCliente.get(x).getContato());

                    }

                    System.out.print("\n\n  Pressione enter para continuar ");

                    leitor.nextLine();



                    leitor.nextLine();

                    break;

                case 7:

                    System.exit(0);

                default:

                    op = -666; //op��o invalida

            }

        }

    }

}