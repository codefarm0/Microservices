package com.gl.userManagementApp.actuatorEndPoint;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		int errorCode = check(); // perform some specific health check
		if (errorCode != 0) {
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}

	/**
	 * condition check for health
	 * @return
	 */
	private int check() {
		//logic to check the health. this can be db hit or some other as per requirement
		// any value other than 0 is considered as health down
		return 0;
	}

}