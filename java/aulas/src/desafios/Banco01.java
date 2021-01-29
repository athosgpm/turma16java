package desafios;

import java.util.Scanner;

public class Banco01 {

	public static void main(String[] args) {
		int conta=0;
		String tipo = "";
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

		
			System.out.println("### BANCO BYTE GENERATION ###\n --  Um banco para todos  -- \n");
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
	
	Scanner ler = new Scanner(System.in);
	
	int opcao, key = 0, key2 = 0, mes = 0;
	double valorTransferencia;
	String descricao = "", movimento = "";
	
	while (key2 == 0) {
	
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
					+ "3* - correção monetária (+1 Mês)\n",
					mes, saldoAtualPoupanca, (saldoAtualPoupanca * 0.0005), (mes + 1), (saldoAtualPoupanca * 1.0005));
	opcao = ler.nextInt();
	
	while (opcao < 1 || opcao > 3) {
		System.out.println("\nPor favor, escolha uma das opções disponiveis.\n");
		opcao = ler.nextInt();
	}
	
	if (opcao == 2) {
		return saldoAtualPoupanca;
	}
	if (opcao == 3) {
		mes++;
		saldoAtualPoupanca += saldoAtualPoupanca * 0.0005;
		key2 = 1;
	}
	
	if (key2 != 1) {
	
		do {
			System.out.print("\n-----------------------\n" 
							+ "Opção de transferencia!" 
							+ "\n----------------------\n");
			
			// opção de movimento
	
			System.out.println("Selecione o movimento:\n" 
							+ "1 - Debito\n" 
							+ "2 - Credito\n"
							+ "3 - voltar para o menu poupança");
			opcao = ler.nextInt();
	
			while (opcao < 1 || opcao > 3) {
				System.out.print("\nPor favor, escolha uma das opções disponiveis.\n");
				opcao = ler.nextInt();
			}
			if(opcao==1 && saldoAtualPoupanca==0) {
				key2=1;
				System.out.println("Você esta sem saldo no momento!");
			}
			if(opcao==3) {
				key2=1;
			}
			if(key2!=1) {
			if (opcao == 1) {
				movimento = "DEBITO";
			} else {
				movimento = "CREDITO";
			}
	
			// Valor de transferencia
	
			do {
				System.out.println("\nDigite o valor a ser transferido: ");
				valorTransferencia = ler.nextDouble();
				
				while(valorTransferencia<=0) {
					System.out.print("\nPor favor, insira um valor positivo.\n");
					valorTransferencia = ler.nextDouble();
				}
	
				if (opcao == 1) {
					if (saldoAtualPoupanca < valorTransferencia) {
						System.out.print("Saldo indisponivel para essa transação\n"
										+ "Você deseja fazer a transferencia de debito de um outro valor:\n" 
										+ "1-Sim\n"
										+ "2-Não\n");
						opcao = ler.nextInt();
	
						while (opcao < 1 || opcao > 2) {
							System.out.print("\nPor favor, escolha uma das opções disponiveis.\n");
							opcao = ler.nextInt();
						}
						if (opcao == 1) {
							key = 0;
						} else {
							key2 = 1;
							key=1;
						}
					} else {
						saldoAtualPoupanca -= valorTransferencia;
						key = 1;
					}
				} else {
					saldoAtualPoupanca += valorTransferencia;
					key = 1;
				}
			} while (key != 1);
			
			if (key2 != 1) {
				System.out.println("\nEscreva a descrição da transferência: ");
				descricao = ler.next();
	
				System.out.printf("\n--------------------------------\n" 
								+ "Transação realisada com sucesso!"
								+ "\n-------------------------------\n" 
								+ "CONTA POUPANÇA\n"
								+ "MOVIMENTO RESALIZADO: %s\n" 
								+ "VALOR: %.2f\n" 
								+ "DESCRIÇÃO: %s\n"
								+ "SALDO ATUAL: %.2f\n\n" 
								+ "Continua:\n" 
								+ "1 - Sim\n" 
								+ "2 - Não\n",
								movimento, valorTransferencia, descricao, saldoAtualPoupanca);
				opcao = ler.nextInt();
	
				while (opcao < 1 || opcao > 2) {
					System.out.println("Por favor, escolha uma das opções disponiveis.\n");
					opcao = ler.nextInt();
				}
				
			}
			}
			if (key2 == 1) {
				opcao = 0;			
			}
		} while (opcao == 1);		
	}
	key2 = 0;
	if(opcao==2) {
		key2=1;
	}
	}
	return saldoAtualPoupanca;
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
	            System.out.println("Bem vindo a sua Conta Corrente");
	        
	            System.out.printf("\nVocê tem %d taloês disponiveis, deseja solicitar?:",talao);
	            System.out.println("\nDigite 1 - Sim");
	            System.out.println("Digite 2 - Não");
	            opcao = ler.nextInt();

	            if(opcao == 1){
	                talao = talao -1;
	            }

	            if (talao == 0) {

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
	    
	                }
	                else{

	                    if (saldo <= 0) {
	                        System.out.println("---------------------------------------");
	                        System.out.println("Você não tem saldo para essa transação");
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
	                        }  
	                    }
	                    
	                }    
	           }
	           else{
	            System.out.printf("O saldo atual da sua conta é R$%.2f\n",saldo);
	            return;
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