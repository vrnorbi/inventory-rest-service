package com.webler.inventory.model.dtos.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;

import static org.springframework.data.domain.Sort.Direction.DESC;
import static org.springframework.data.domain.Sort.by;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SortingParams {
    private String sortBy = "name";
    private String sortDirection = "asc";

    public Sort getSorting() {
        if (DESC.name().equals(sortDirection.toUpperCase()))
            return by(sortBy).descending();
        return by(sortBy).ascending();
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }
}
