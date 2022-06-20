package com.leo.microservice.productservice.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.leo.microservice.productservice.dto.ProductDto;
import com.leo.microservice.productservice.entity.Product;

@Configuration
public class ProductLogKafkaConfig {
	
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServer;
	
	@Bean
	public ProducerFactory<String, String> producerFactory(){
		Map<String,Object> config = new HashMap<>();
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<>(config);
	}
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());
	}
	
	@Bean
	public NewTopic createTopic() {
		return TopicBuilder.name("logs-topic").build();
	}
	
	@Bean
	public ProductDto createProductDto() {
		return new ProductDto();
	}
	
	@Bean
	public Product createProduct() {
		return new Product();
	}


}
