package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++) {
		Vault vault = new Vault();
		
		SecretAgent agent = new SecretAgent();
		System.out.println(agent.findCode(vault));
		}
	}
}
