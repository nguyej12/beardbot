package com.beard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.beard.api.SupremeBotAPI;
import com.beard.api.SupremeBotAPInterface;
import com.beard.pages.SupremeShopAllPage;

@Configuration
public class SupremeBotConfig {
	
	@Bean
	public SupremeBotAPInterface supremeBotAPI() {
		SupremeBotAPI supremeBotAPI = new SupremeBotAPI();
		supremeBotAPI.setSupremeShopAllPage(supremeShopAllPage());
		return supremeBotAPI;
	}
	
	@Bean
	public SupremeShopAllPage supremeShopAllPage() {
		SupremeShopAllPage supremeShopAllPage = new SupremeShopAllPage();
		return supremeShopAllPage;	
	}
	
}