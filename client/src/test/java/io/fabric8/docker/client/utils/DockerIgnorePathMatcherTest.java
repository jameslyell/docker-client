/*
 * Copyright (C) 2016 Original Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.fabric8.docker.client.utils;

import junit.framework.Assert;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class DockerIgnorePathMatcherTest {

    @Test
    public void testMatching() {
        PathMatcher m = new DockerIgnorePathMatcher(".gitignore", ".git", ".git/*");
        Path path = Paths.get(".git/config");
        Assert.assertTrue(m.matches(path));
    }

}