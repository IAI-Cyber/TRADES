package dsm.oscal.model.transform.mappers;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import dsm.oscal.model.transform.ObjectMapper;

public abstract class AbstractObjectMapper<T extends EObject, U> implements ObjectMapper<T, U> {

	protected <T1 extends EObject, U1> void buildChildList(ObjectMapper<T1, U1> mapper, List<U1> inputs,
			Supplier<List<T1>> supListToUpdate) {
		List<T1> result = new ArrayList<>();
		if (inputs != null) {
			for (U1 input : inputs) {
				T1 transformed = mapper.toTrades(input);
				if (transformed != null) {
					result.add(transformed);
				}
			}
		}

		supListToUpdate.get().addAll(result);

	}

	protected <T1 extends EObject, U1> void buildXMLChildList(ObjectMapper<T1, U1> mapper, List<T1> inputs,
			Consumer<LinkedList<U1>> supListToUpdate) {
		LinkedList<U1> result = new LinkedList<>();
		if (inputs != null) {
			for (T1 input : inputs) {
				U1 transformed = mapper.toOscal(input);
				if (transformed != null) {
					result.add(transformed);
				}
			}
		}

		supListToUpdate.accept(result);

	}

	protected <E> void setXMLList(List<E> input, Consumer<LinkedList<E>> output) {
		if (input != null) {
			output.accept(input.stream().filter(e -> e != null).collect(Collectors.toCollection(LinkedList<E>::new)));
		}
	}

	protected <E> void setList(List<E> input, List<E> output) {
		if (input != null) {
			output.addAll(input.stream().filter(e -> e != null).collect(toList()));
		}
	}

	@Override
	public T toTrades(U oscalObject) {
		if (oscalObject == null) {
			return null;
		}
		return safeToTrades(oscalObject);
	}

	@Override
	public U toOscal(T tradesObject) {
		if (tradesObject == null) {
			return null;
		}
		return safeToOscal(tradesObject);
	}

	protected abstract T safeToTrades(U oscalObject);

	protected abstract U safeToOscal(T tardesObject);

}
