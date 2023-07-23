package com.devmedeiros.api.Enums;

public enum HttpStatus {

    // Códigos de sucesso (2xx)
    OK(200, "OK", "A requisição foi bem-sucedida."),
    CREATED(201, "Created", "A requisição foi bem-sucedida, e um novo recurso foi criado como resultado."),
    ACCEPTED(202, "Accepted", "A requisição foi recebida, mas ainda não foi processada."),
    NO_CONTENT(204, "No Content", "A requisição foi bem-sucedida, mas não há informações para retornar."),

    // Códigos de redirecionamento (3xx)
    MOVED_PERMANENTLY(301, "Moved Permanently", "O recurso foi movido permanentemente para uma nova URL."),
    FOUND(302, "Found", "O recurso foi encontrado temporariamente em uma diferente URL."),
    SEE_OTHER(303, "See Other", "O recurso pode ser encontrado em uma diferente URL usando um método GET."),
    NOT_MODIFIED(304, "Not Modified", "O recurso não foi modificado desde a última requisição."),
    TEMPORARY_REDIRECT(307, "Temporary Redirect", "O recurso foi redirecionado temporariamente para uma nova URL."),

    // Códigos de erro do cliente (4xx)
    BAD_REQUEST(400, "Bad Request", "A requisição não pode ser atendida devido a um erro de sintaxe."),
    UNAUTHORIZED(401, "Unauthorized", "O cliente deve se autenticar para obter a resposta solicitada."),
    FORBIDDEN(403, "Forbidden", "O cliente não tem direitos de acesso ao conteúdo, portanto, o servidor está rejeitando a requisição."),
    NOT_FOUND(404, "Not Found", "O servidor não pode encontrar o recurso solicitado."),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", "O método da requisição não é permitido para o recurso solicitado."),
    CONFLICT(409, "Conflict", "A requisição não pôde ser concluída devido a um conflito com o estado atual do recurso."),
    GONE(410, "Gone", "O recurso solicitado não está mais disponível e não será disponibilizado novamente."),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type", "O formato de mídia da requisição não é suportado pelo servidor."),

    // Códigos de erro do servidor (5xx)
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "O servidor encontrou uma situação com a qual não sabe lidar."),
    NOT_IMPLEMENTED(501, "Not Implemented", "O servidor não suporta a funcionalidade requerida para completar a requisição."),
    BAD_GATEWAY(502, "Bad Gateway", "O servidor está atuando como um gateway ou proxy e recebeu uma resposta inválida do servidor upstream."),
    SERVICE_UNAVAILABLE(503, "Service Unavailable", "O servidor não está pronto para manipular a requisição. Comum durante manutenção."),
    GATEWAY_TIMEOUT(504, "Gateway Timeout", "O servidor está atuando como um gateway ou proxy e não recebeu uma resposta oportuna do servidor upstream."),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported", "A versão do protocolo HTTP usado na requisição não é suportada pelo servidor.");

    private final int code;
    private final String reasonPhrase;
    private final String description;

    HttpStatus(int code, String reasonPhrase, String description) {
        this.code = code;
        this.reasonPhrase = reasonPhrase;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public String getDescription() {
        return description;
    }
}
