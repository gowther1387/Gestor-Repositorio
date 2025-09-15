package br.ufpb.dcx.dsc.repositorios.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.List;

public record ErrorResponse(
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime timestamp,
        Integer code,
        String status,
        String title,
        List<String> errors,
        String path
) {
    public static ErrorResponse of(int code, String status, String title, List<String> errors, String path) {
        return new ErrorResponse(LocalDateTime.now(), code, status, title, errors, path);
    }
}
