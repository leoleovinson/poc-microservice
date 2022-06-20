package com.leo.microservice.loggerservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.leo.microservice.loggerservice.dto.MessageLogDto;
import com.leo.microservice.loggerservice.entity.MessageLog;
import com.leo.microservice.loggerservice.repository.MessageLogRepository;
import com.leo.microservice.loggerservice.utilities.LogConverter;

@Service
public class LogService {
	
	@Autowired
	LogConverter logConverter;
	
	@Autowired
	MessageLogRepository logRepository;
	
	Logger logger = LoggerFactory.getLogger(LogService.class);
	
	@KafkaListener(groupId = "logs-topic-group-1", topics = "logs-topic")
	public void getMessageFromTopic(String data) {
		logger.info(data);
		logToDatabase(data);
	}
	
	public void logToDatabase(String data) {
		MessageLogDto messageLogDto = new MessageLogDto();
		messageLogDto.setDateCreated(new Date());
		messageLogDto.setMessage(data);
		logRepository.save(logConverter.dtoToEntity(messageLogDto));
	}
	
	public List<MessageLog> getAllLogs(){
		return logRepository.findAll();
	}
	
	public List<MessageLogDto> getAllLogsDto(){
		return logRepository.findAll().stream().map(logs->logConverter.entityToDto(logs)).toList();
	}

}
