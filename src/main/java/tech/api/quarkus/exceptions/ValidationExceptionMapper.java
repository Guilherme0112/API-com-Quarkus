package tech.api.quarkus.exceptions;

import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import tech.api.quarkus.exceptions.dto.ValidationErrorsResponse;
import tech.api.quarkus.exceptions.dto.Violation;
import tech.api.quarkus.utils.ValidationUtil;

import java.util.List;
import java.util.stream.Collectors;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException exception){
        List<Violation> violations = exception.getConstraintViolations().stream()
                .map(cv -> new Violation(ValidationUtil.getSimpleProperty(cv.getPropertyPath().toString()), cv.getMessage()))
                .collect(Collectors.toList());

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ValidationErrorsResponse("Erro de validação", 400, violations))
                .build();
    }
}
