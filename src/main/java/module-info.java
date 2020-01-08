module com.moilioncircle.redis.sink.api {
    exports com.moilioncircle.redis.sink.api;
    exports com.moilioncircle.redis.sink.api.cmd;
    exports com.moilioncircle.redis.sink.api.parser;
    exports com.moilioncircle.redis.sink.api.example;
    exports com.moilioncircle.redis.sink.api.listener;
    requires org.slf4j;
    requires com.moilioncircle.redis.replicator;
}