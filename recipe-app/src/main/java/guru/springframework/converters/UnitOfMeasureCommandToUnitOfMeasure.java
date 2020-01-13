package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;

import guru.springframework.commands.UnitOfMeasureCommand;
import guru.springframework.domain.UnitOfMeasure;

public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {

	@Override
	public UnitOfMeasure convert(UnitOfMeasureCommand source) {
		if (source != null) {
			final UnitOfMeasure uom = new UnitOfMeasure();
			uom.setId(source.getId());
			uom.setDescription(source.getDescription());
			return uom;
		}
		return null;
	}

}
