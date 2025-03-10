package com.example.contentnegotiation.config;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.example.contentnegotiation.constant.MediaTypeConstants;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlJackson2HttpMessageConverter extends AbstractJackson2HttpMessageConverter {

	protected YamlJackson2HttpMessageConverter() {
		super(new YAMLMapper().setSerializationInclusion(Include.NON_NULL), 
			MediaType.parseMediaType(MediaTypeConstants.APPLICATION_YAML)
		);
	}
}
