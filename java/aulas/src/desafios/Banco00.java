package desafios;

import java.util.Scanner;

public class Banco00 {

	static boolean key = true;
	static String tipo = "";
	static int mes = 0, BDPoupanca=0;
	static double valorBDPoupanca[] = new double[404];		//COMO FAZER UM VETOR COM TAMANHO INDEFINIDO???
	static double saldoBDPoupanca[] = new double[404];		//COMO FAZER UM VETOR COM TAMANHO INDEFINIDO???
	static String descricaoBDPoupanca[] = new String[404];	//COMO FAZER UM VETOR COM TAMANHO INDEFINIDO???
	
	public static void main(String[] args) {
		int conta=0;
		double saldoAtualPoupanca = 0.0;
		
		do {
			conta = menu1();
	
			if (conta == 1) {
				tipo = "CONTA POUPANÇA";
				saldoAtualPoupanca = poupanca(saldoAtualPoupanca);
			} else if (conta == 2) {
				tipo = "CONTA CORRENTE";
				contaCorrente();
			} else if (conta == 3) {
				tipo = "CONTA ESPECIAL";
				contaEspecial();
			} else if (conta == 4) {
				tipo = "CONTA EMPRESA";
				contaEmpresa();
			} else if (conta == 5) {
				tipo = "CONTA ESTUDANTIL";
				contaEstudantil();
			}else {
				System.out.println("Obrigado, Volte sempre!");
			}
		}while(conta!=6);
	}

//////////
//MENU////
//////////
	
	public static int menu1() {
		Scanner ler = new Scanner(System.in);
		int conta = 1;

		
			System.out.println("\n### BANCO BYTE GENERATION ###\n --  Um banco para todos  -- \n");
			System.out.println("1 - CONTA POUPANÇA\r\n" 
							+ "2 - CONTA CORRENTE\r\n" 
							+ "3 - CONTA ESPECIAL \r\n"
							+ "4 - CONTA EMPRESA\r\n" 
							+ "5 - CONTA ESTUDANTIL\r\n" 
							+ "6 - SAIR\r\n\n"
							+ "SELECIONE O TIPO DE CONTA:_\r\n");
			conta = ler.nextInt();

			while (conta < 1 || conta > 6) {
				System.out.println("\nPor favor, escolha uma das opções disponiveis.\n");
				conta = ler.nextInt();
			}

		return conta;
	}

////////////////////
//CONTA POUPANÇA////
////////////////////
	
	public static double poupanca(double saldoAtualPoupanca) {
	
	Scanner ler = new Scanner(System.in);;
	
	int opcao;
	
	do {
		System.out.printf("\n-------------------------------------------\n" 
						+ "Seja bem-vinto a sua conta Poupança!"
						+ "\n------------------------------------------\n" 
						+ "Saldo anterior\t- mês: %d -\t  %.2f\n"
						+ "Juros: \t\t\t\t+ %.2f\n" 
						+ "Saldo atual\t- mês: %d -\t  %.2f\n"
						+ "\n------------------------------------------\n"
						+ "você deseja fazer uma transferencia:\n" 
						+ "1  - Sim\n" 
						+ "2  - Não\n"
						+ "3  - Ver extrato de movimentações\n"
						+ "4* - correção monetária (+1 Mês)\n",
						mes, saldoAtualPoupanca, (saldoAtualPoupanca * 0.0005), (mes + 1), (saldoAtualPoupanca * 1.0005));
		opcao = ler.nextInt();
		
		while (opcao < 1 || opcao > 4) {
			System.out.println("\nPor favor, escolha uma das opções disponiveis.\n");
			opcao = ler.nextInt();
		}
		
		if(opcao == 1) {
			saldoAtualPoupanca = transacao(saldoAtualPoupanca);
			key=true;
		} else if (opcao == 2) {
			return saldoAtualPoupanca;
		} else if(opcao==3) {
			key = false;
			saldoAtualPoupanca = transacao(saldoAtualPoupanca);
			key=true;
		} else if (opcao == 4) {
			if(saldoAtualPoupanca!=0) {
				descricaoBDPoupanca[BDPoupanca] = "Juros";
				valorBDPoupanca[BDPoupanca] = saldoAtualPoupanca * 0.0005;
				saldoAtualPoupanca += saldoAtualPoupanca * 0.0005;
				saldoBDPoupanca[BDPoupanca+1] = saldoAtualPoupanca;
				BDPoupanca++;
			}
			mes++;
		}
	}while(true);
	
}
////////////////////
	public static double transacao(double saldoAtualConta){
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		String movimento = "",time = "";
		
		while(key==true) {
			// opção de movimento
			System.out.println("\n-----------------------\n" 
							+ "Opção de transferencia!" 
							+ "\n----------------------\n"
							+ "Selecione o movimento:\n" 
							+ "1 - Debito\n" 
							+ "2 - Credito\n"
							+ "3 - voltar para o menu da sua conta");
			opcao = ler.nextInt();
		
			while (opcao < 1 || opcao > 3) {
				System.out.print("\nPor favor, escolha uma das opções disponiveis.\n");
				opcao = ler.nextInt();
			}
			
			if(opcao==1 && saldoAtualConta==0) {
				System.out.println("Você esta sem saldo no momento!");
				try {
					   Thread.sleep(2000);
					} catch (Exception e) {
					   e.printStackTrace();
					}
				return saldoAtualConta;
			}
			if(opcao==3) {
				return saldoAtualConta;
			}
			if (opcao == 1) {
				movimento = "DEBITO";
			} else {
				movimento = "CREDITO";
			}
			
			// Valor de transferencia
			
			System.out.println("\nDigite o valor a ser transferido: ");
			valorBDPoupanca[BDPoupanca] = ler.nextDouble();
			
			while(valorBDPoupanca[BDPoupanca]<=0) {
				System.out.print("\nPor favor, insira um valor positivo.\n");
				valorBDPoupanca[BDPoupanca] = ler.nextDouble();
			}
	
			if (opcao == 1) {
				if (saldoAtualConta < valorBDPoupanca[BDPoupanca]) {
					System.out.print("Saldo indisponivel para essa transação\n");
					try {
						   Thread.sleep(3000);
						} catch (Exception e) {
						   e.printStackTrace();
						}
					return saldoAtualConta;
				} else {
					saldoAtualConta -= valorBDPoupanca[BDPoupanca];
				}
			} else {
				saldoAtualConta += valorBDPoupanca[BDPoupanca];
			}
			
			System.out.println("\nEscreva a descrição da transferência: ");
			descricaoBDPoupanca[BDPoupanca] = ler.next();
	
			System.out.printf("\n--------------------------------\n" 
							+ "Transação realisada com sucesso!"
							+ "\n-------------------------------\n" 
							+ "%s\n"
							+ "MOVIMENTO RESALIZADO: %s\n" 
							+ "VALOR: %.2f\n" 
							+ "DESCRIÇÃO: %s\n"
							+ "SALDO ATUAL: %.2f\n\n" 
							+ "Deseja fazer uma nova transferência:\n" 
							+ "1 - Sim\n" 
							+ "2 - Não\n",
							tipo,movimento, valorBDPoupanca[BDPoupanca], descricaoBDPoupanca[BDPoupanca], saldoAtualConta);
			opcao = ler.nextInt();
			
			saldoBDPoupanca[BDPoupanca+1]=saldoAtualConta;
			BDPoupanca++;
			
			while (opcao < 1 || opcao > 2) {
				System.out.println("Por favor, escolha uma das opções disponiveis.\n");
				opcao = ler.nextInt();
			}		
			if(opcao==2) {
				key = false;
			}
		};
		
		System.out.println("Voce deseja ver o extrato de movimentações:\n"
						+ "1 - Sim\n" 
						+ "2 - Não\n");
		opcao = ler.nextInt();

		while (opcao < 1 || opcao > 2) {
			System.out.print("\nPor favor, escolha uma das opções disponiveis.\n");
			opcao = ler.nextInt();
		}
		if(opcao==1) {
			//exibir extratos de movimentações
			System.out.println("#EXTRATOS#");
			if (BDPoupanca==0) {
				System.out.println("Você ainda não tem extratos de movimentações!\n");
				try {
					   Thread.sleep(5000);
					} catch (Exception e) {
					   e.printStackTrace();
					}
			}
			for (int i=0;i<BDPoupanca;i++) {
				System.out.printf("\n--------------------------------\n"
								+ "%dª Movimentação Realizada"
								+ "\n--------------------------------\n"
								+ "Valor da transferencia:  %.2f\n"
								+ "Descricao:               %s\n"
								+ "Saldo resultante:        %.2f\n"
								+ "\n________________________________\n",
								(i+1),valorBDPoupanca[i],descricaoBDPoupanca[i],saldoBDPoupanca[i+1]);
				System.out.println("\nPara voltar para o menu da sua conta insira algum caracter e aperte enter!");
				time=ler.next();
			}
		}
		return saldoAtualConta;
	}

////////////////////
//CONTA CORRENTE////
////////////////////
	
	public static void contaCorrente() {
		double saldo= 0.00, valor=0.00;
        String  descricao ="";
        int opcao2=0 , opcao = 0, talao = 3;
        Scanner ler = new Scanner(System.in);
        
       do {
            System.out.println("\nBem vindo a sua Conta Corrente");
            
            if (talao>0) {
                
                System.out.printf("\nVocê tem %d taloês disponiveis, deseja solicitar?:",talao);
                System.out.println("\nDigite 1 - Sim");
                System.out.println("Digite 2 - Não");
                opcao = ler.nextInt();
                
            }
            
            if(opcao == 1){
                talao = talao -1;


            }

            if (talao <=0) {

                System.out.println("---------------------------------------");
                System.out.println("Você não possui mais talôes disponiveis");
                System.out.println("---------------------------------------");
            }

            System.out.println("Deseja fazer uma transação");
            System.out.println("Digite 1 - Sim");
            System.out.println("Digite 2 - Não");
            opcao2 = ler.nextInt();
         
            if (opcao2 == 1) {
            System.out.println("Você deseja creditar ou debitar?");
            System.out.println("Digite 1 - Creditar");
            System.out.println("Digite 2 - Debitar");
            opcao = ler.nextInt();
             
                if (opcao == 1) {
                    System.out.println("Digite o valor");
                    valor = ler.nextInt();
                    System.out.println("Digite a descrição");
                    descricao = ler.next();
                    saldo = saldo + valor;
                    System.out.print("\nTransação realizada com sucesso");
                    System.out.print("\n---------------------------------------");
                    System.out.printf("\nO saldo atual da sua conta é R$%.2f",saldo);
                    System.out.print("\n---------------------------------------");
  

    
                }
                else{

                    if (saldo <= 0) {
                        System.out.println("---------------------------------------");
                        System.out.println("\nVocê não tem saldo para essa transação");
                        System.out.println("---------------------------------------");
                        
                    }
                    else{

                        System.out.println("Digite o valor");
                        valor = ler.nextInt();
                        System.out.println("Digite a descrição");
                        descricao = ler.next();
                        

                        if ((saldo - valor) < 0 ) {
                            System.out.println("---------------------------------------");
                            System.out.println("Você não tem saldo para essa transação");
                            System.out.println("---------------------------------------");
                        }
                        else{
                            saldo = saldo - valor;
                            System.out.print("\nTransação realizada com sucesso");
                            System.out.println("---------------------------------------");                           
                            System.out.printf("O saldo atual da sua conta é R$%.2f",saldo);
                            System.out.println("---------------------------------------");
                        }  
                    }
                    
                }    
           }
           else{
            System.out.printf("O saldo atual da sua conta é R$%.2f",saldo);
  
           }          

        } while (opcao2 != 2);
	      return;
	    }
	
////////////////////
//CONTA ESPECIAL////
////////////////////
	
	public static void contaEspecial() {
		Scanner leia = new Scanner(System.in);
		
		int limite = 1000, movimento, continua;
		double valorDeb, valorCred, saldoAtualdeb, saldoAtualcred;
		String descricao;
		
		System.out.println("[3]Bem-Vindo à sua Conta Especial");	
		System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
		movimento = leia.nextInt();
		
		
		if(movimento == 1) {
			System.out.print("\nDESEJA USAR O SEU LIMITE DE 1000R$? SE SIM, QUANTO?: ");
			limite = leia.nextInt();
		if(limite >1000) {
			System.out.print("O seu limite é de 1000,00R$. Por favor, digite outro valor!: ");
			limite = leia.nextInt();
		}
			System.out.print("\nDigite o valor que deseja debitar: ");
			valorDeb = leia.nextDouble();
			System.out.print("\nDescreva o que gostaria de fazer: ");
			descricao = leia.next();
			saldoAtualdeb = limite - valorDeb;
			System.out.printf("\nSeu saldo é de: "+saldoAtualdeb);
			System.out.print("\nContinua: [3]sim ou [4]não?: ");
			continua = leia.nextInt();
		if(continua == 3) {
			System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
			movimento = leia.nextInt();
		}
		}
		
		
		if(movimento == 2) {
			System.out.print("\nDigite o valor que deseja creditar: ");
			valorCred = leia.nextDouble();
			saldoAtualcred = valorCred;
			System.out.printf("\nSeu saldo é de: "+saldoAtualcred);
			System.out.print("\nContinua: [3]sim ou [4]não?: ");
			continua = leia.nextInt();
		if(continua == 4) {
			System.out.print("\nObrigadx pela transição! ");
			return;
		}
		if(continua == 3) {
			System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
			movimento = leia.nextInt();
		}
		}
	}

////////////////////
//CONTA EMPRESA/////
////////////////////
	
	public static void contaEmpresa() {
		/*[1 / 2 ] - CONTA XXXXX
			SELECIONE O MOVIMENTO - D/C:
			VALOR: _
			DESCRIÇÃO:  
			SALDO ATUAL:_
			CONTINUA S/N:
			A CONTA NÃO PODE FICA NEGATIVA
			C EMPRESA - DESEJA FAZER UM EMPRESTIMO S/N: 
			SE SIM O LIMITE É  10.000 - SALDO
			*/

		Scanner ler= new Scanner (System.in); 
		double saldo=0, valor=0,valorEmprestimo=0, valorEmprestimoI=10000;
		int movimento,continua=0, opEmprestimolDecidir;
		String descricao;
		
		
		
		do
			{
			System.out.println("\t\t\t\t\tBEM VINDO A CONTA EMPRESARIAL\n");
			System.out.println("SELECIONE UM MOVIMENTO 1- debito/ 2-credito:");
			movimento=ler.nextInt();
				if(movimento==1) 
				{
					System.out.println("SALDO ATUAL: "+saldo);
					System.out.println("VALOR DA OPERAÇÃO: ");
					valor = ler.nextDouble();
					System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
					descricao = ler.next();
					
					saldo=saldo-valor;
					if(saldo<0) 
					{
						System.out.println("Prezado cliente, seu saldo não é suficiente para essa operação");
						System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
						opEmprestimolDecidir = ler.nextInt();
						
						if(opEmprestimolDecidir==1)
						{
							System.out.println("Digite valor do emprestimo: ");
							valorEmprestimo= ler.nextDouble();
							saldo=+valorEmprestimo;
							valorEmprestimoI=valorEmprestimoI-valorEmprestimo;
							System.out.println("NOVO SALDO: "+saldo);
							System.out.println("VALOR DISPONIVEL PARA EMPRESTIMO: "+valorEmprestimoI);
							System.out.println("Fazer nova transação? 1- sim/ 2- não");
							continua = ler.nextInt();
						}
						else if(opEmprestimolDecidir==2)
						{
							System.out.println("Fazer nova transação? 1- sim/ 2- não");
							continua = ler.nextInt();
						}
						else
						{
							System.out.println("Decisão não identificada.");
							System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
							opEmprestimolDecidir = ler.nextInt();
							if(opEmprestimolDecidir==2)
							{
								System.out.println("Fazer nova transação? 1- sim/ 2- não");
								continua = ler.nextInt();
							}
						}
					}
					else
					{
						System.out.println("NOVO SALDO: "+saldo);
					}
					
					
				}
				else if (movimento==2)
				{
					System.out.println("SALDO ATUAL: "+saldo);
					System.out.println("VALOR DA OPERAÇÃO: ");
					valor = ler.nextDouble();
					System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
					descricao = ler.next();
					
					saldo=saldo+valor;
					
					System.out.println("NOVO SALDO: "+saldo);
					System.out.println("Fazer nova transação? 1- sim/ 2- não");
					continua = ler.nextInt();
				}
				else 
				{
					System.out.println("Operação não identificada.");
				}
			}
		while(continua==1);
		return;
	}

////////////////////
//CONTA ESTUDANTIL//
////////////////////	
	
	public static void contaEstudantil() {

		Scanner leia = new Scanner (System.in); 
		double saldo=0, valor=0,valorLimite=0, valorLimite1=5000;
		int movimento,continua=0, limiteDecidir;
		String descricao;
		
		do {
			System.out.println("\t\t\t\t\tBem vindo à sua Conta Especial!"+"\n");
			System.out.println("Selecione o movimento [1/2]: \n 1 - Debito \n 2 - Crédito");
			movimento=leia.nextInt();
				if(movimento==1) 
				{
					System.out.println("Saldo atual em conta: "+saldo);
					System.out.println("Valor para saque: ");
					valor = leia.nextDouble();
					System.out.println("Descrição (Finalidade): "+"\n");
					descricao = leia.next();

					saldo=saldo-valor;
				if(saldo<0) 
					{
						System.out.println("Verificado em conta que saldo encontra-se negativo!");
						System.out.println("Deseja solicitar limite estudantil? \n 1 - Sim \n 2 - Não");
						limiteDecidir = leia.nextInt();

						if(limiteDecidir==1)
						{
							System.out.println("Digite um valor para o limite estudantil: ");
							valorLimite= leia.nextDouble();
							saldo=+valorLimite;
							valorLimite1=valorLimite1-valorLimite;
							System.out.println("Saldo atual em conta: "+saldo);
							System.out.println("Valor restante do limite estudantil para uso: "+valorLimite1);
						
						}
						else if(limiteDecidir==2)
						{
							System.out.println("Sessão encerrada\n"
											+ "Deseja continuar:\n"
											+ "1 - Sim\n"
											+ "2 - Não\n");
							continua = leia.nextInt();
						}

				}
					
			} else if (movimento == 2) {
				System.out.println("Saldo atual em conta: "+saldo);
				System.out.println("Valor para saque: ");
				valor = leia.nextDouble();
				System.out.println("Descrição (Finalidade): "+"\n");
				descricao = leia.next();

				saldo=saldo-valor;
			} if(saldo<0)
			{
				System.out.println("Verificado em conta que saldo encontra-se negativo!");
				System.out.println("Deseja solicitar limite estudantil? \n 1 - Sim \n 2 - Não");
				limiteDecidir = leia.nextInt();

				if(limiteDecidir==1)
				{
					System.out.println("Digite um valor para o limite estudantil: ");
					valorLimite= leia.nextDouble();
					saldo=+valorLimite;
					valorLimite1=valorLimite1-valorLimite;
					System.out.println("Saldo atual em conta: "+saldo);
					System.out.println("Valor restante do limite estudantil para uso: "+valorLimite1);
				
				}
				else if(limiteDecidir==2)
				{
					System.out.println("Sessão encerrada\n"
							+ "Deseja continuar:\n"
							+ "1 - Sim\n"
							+ "2 - Não\n");
					continua = leia.nextInt();
					
				}
			}
		}while(continua!=2);
		return;
	}
}