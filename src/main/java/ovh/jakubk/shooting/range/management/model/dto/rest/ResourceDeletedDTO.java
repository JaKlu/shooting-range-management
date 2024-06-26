package ovh.jakubk.shooting.range.management.model.dto.rest;

import lombok.Builder;

import java.time.Instant;


@Builder
public record ResourceDeletedDTO(Instant timestamp,
                                 int status,
                                 String message,
                                 String description,
                                 String path) {
}