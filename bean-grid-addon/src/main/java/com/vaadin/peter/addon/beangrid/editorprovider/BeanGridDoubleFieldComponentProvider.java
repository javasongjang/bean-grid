package com.vaadin.peter.addon.beangrid.editorprovider;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.peter.addon.beangrid.ColumnDefinition;
import com.vaadin.ui.TextField;

/**
 * BeanGridDoubleFieldComponentProvider is component provider capable of Double
 * <-> String <-> Double conversion. As this bean implements
 * {@link ConfigurableBeanGridValueConvertingEditorComponentProvider} it's NOT
 * immutable and hence not singleton safe and should always be declared as
 * prototype scoped.
 * 
 * @author Peter / Vaadin
 */
@Component
@Scope(scopeName = "prototype")
public class BeanGridDoubleFieldComponentProvider
		extends AbstractGridValueConfigurableConvertingEditorComponentProvider<Double> {

	public BeanGridDoubleFieldComponentProvider() {
		super(Double.class);
	}

	@Override
	public TextField provideEditorComponent(ColumnDefinition columnDefinition) {
		return new TextField();
	}
}
