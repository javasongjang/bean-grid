package com.vaadin.peter.addon.beangrid.converter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.vaadin.data.converter.StringToBigIntegerConverter;
import com.vaadin.peter.addon.beangrid.GridConfigurationProvider;

@Component
@Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StringToBigIntegerBeanConverter extends StringToBigIntegerConverter implements ConfigurableConverter {

	private String pattern;
	private GridConfigurationProvider configurationProvider;

	@Autowired
	public StringToBigIntegerBeanConverter(GridConfigurationProvider configurationProvider) {
		super(configurationProvider.getConversionErrorString());
		this.configurationProvider = configurationProvider;
	}

	@Override
	protected NumberFormat getFormat(Locale locale) {
		String selectedPattern = Optional.ofNullable(pattern)
				.orElse(configurationProvider.getNumberFormatPattern().orElse(null));

		if (selectedPattern == null) {
			return super.getFormat(locale);
		}

		DecimalFormat decimalFormat = new DecimalFormat(selectedPattern, new DecimalFormatSymbols(locale));
		decimalFormat.setParseBigDecimal(true);
		return decimalFormat;
	}

	@Override
	public StringToBigIntegerBeanConverter configureWithPattern(String pattern) {
		System.out.println("Configuring " + this + " with pattern " + pattern);
		this.pattern = pattern;
		return this;
	}
}
