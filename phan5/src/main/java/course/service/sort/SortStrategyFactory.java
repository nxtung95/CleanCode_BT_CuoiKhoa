package course.service.sort;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SortStrategyFactory {
	private final SortStrategyByName sortByName;
	private final SortStrategyByOpen sortByOpened;
	private final SortStrategyByNameOpen sortByNameOpened;
	
	public SortStrategy createSortStrategy(String sortName) {
		switch(sortName) {
			case "name":
				return sortByName;
			case "opened":
				return sortByOpened;
			case "name,opened":
				return sortByNameOpened;
			default:
				return null;
		}
	}
}
