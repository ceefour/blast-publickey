package com.hendyirawan.blastpublickey;

/**
 * A placeholder for tenantEtcFolder, to simulate a dynamic lookup app (with or without JNDI).
 * @author adri
 */
public class AppConfig {
	
	public String getTenantEtcFolder() {
		// can return values like:
		// classpath:META-INF/shell
		// file:/path/to/folder
		return "classpath:META-INF/shell";
	}

}
