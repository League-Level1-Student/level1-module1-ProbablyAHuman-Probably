package _06_vault;

public class SecretAgent {
	
	int findCode(Vault vault) {
				
		for (int i = 0; i < 1000001; i += 1) {
			
			boolean ifCodeWorks = vault.tryCode(i);			
			if (ifCodeWorks == true) {
				return i;
				
			}		
			
		}
		
		return -1;
		
	}

}
