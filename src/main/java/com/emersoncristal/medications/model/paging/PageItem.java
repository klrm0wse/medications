package com.emersoncristal.medications.model.paging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageItem {
	// utility class for Thymeleaf pagination
    private PageItemType pageItemType;

    private int index;

    private boolean active;

}
