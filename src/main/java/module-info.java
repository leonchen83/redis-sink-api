import com.moilioncircle.redis.sink.api.ParserService;
import com.moilioncircle.redis.sink.api.SinkService;
import com.moilioncircle.redis.sink.api.example.ExampleSinkService;
import com.moilioncircle.redis.sink.api.parser.DefaultParserService;
import com.moilioncircle.redis.sink.api.parser.DumpParserService;

module com.moilioncircle.redis.sink.api {
    requires org.slf4j;
    requires com.moilioncircle.redis.replicator;

    exports com.moilioncircle.redis.sink.api;
    exports com.moilioncircle.redis.sink.api.cmd;
    exports com.moilioncircle.redis.sink.api.parser;
    exports com.moilioncircle.redis.sink.api.example;
    exports com.moilioncircle.redis.sink.api.listener;

    provides SinkService with ExampleSinkService;
    provides ParserService with DefaultParserService, DumpParserService;
}