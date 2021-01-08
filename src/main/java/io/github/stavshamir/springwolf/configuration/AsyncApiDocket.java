package io.github.stavshamir.springwolf.configuration;

import io.github.stavshamir.springwolf.asyncapi.types.ProducerData;
import io.github.stavshamir.springwolf.asyncapi.types.info.Info;
import io.github.stavshamir.springwolf.asyncapi.types.server.Server;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.Map;

@Data
@Builder
public class AsyncApiDocket {

    /**
     * <b>Required.</b>
     * Provide metadata about the API. The metadata can be used by the clients if needed.
     *
     * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#infoObject">Info specification</a>
     */
    @NonNull
    private final Info info;

    /**
     * Provides connection details of servers.
     */
    @Singular
    private final Map<String, Server> servers;

    /**
     * Provides information about the producers.
     */
    @Singular
    private final List<ProducerData> producers;

}
