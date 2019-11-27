/*
 * Copyright 2016-2017 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.sink.api.parse;

import java.io.File;
import java.io.IOException;

import com.moilioncircle.redis.replicator.Replicator;
import com.moilioncircle.redis.replicator.rdb.RdbVisitor;
import com.moilioncircle.redis.replicator.rdb.dump.DumpRdbVisitor;
import com.moilioncircle.redis.sink.api.ParseService;

/**
 * @author Baoyi Chen
 */
public class DumpParseService implements ParseService {
    
    @Override
    public String parse() {
        return "dump";
    }

    @Override
    public void init(File config) throws IOException {

    }

    @Override
    public RdbVisitor getVisitor(Replicator replicator) {
        return new DumpRdbVisitor(replicator);
    }
}