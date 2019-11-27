/**
 * @author Leon Chen
 * @since 2.6.0
 */
module com.moilioncircle.redis.sink.api {
    exports com.moilioncircle.redis.sink.api;
    exports com.moilioncircle.redis.sink.api.cmd;
    exports com.moilioncircle.redis.sink.api.parse;
    exports com.moilioncircle.redis.sink.api.example;
    exports com.moilioncircle.redis.sink.api.listener;
    requires org.slf4j;
    requires com.moilioncircle.redis.replicator;
}