/*
 * Copyright 2011-2012 the original author or authors.
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

package org.vertx.java.tests.core.filesystem;

import org.junit.Test;
import org.vertx.java.core.logging.Logger;
import org.vertx.java.core.logging.impl.LoggerFactory;
import org.vertx.java.framework.TestBase;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class RubyFileSystemTest extends TestBase {

  private static final Logger log = LoggerFactory.getLogger(RubyFileSystemTest.class);

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    startApp("core/filesystem/test_client.rb");
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Test
  public void test_copy() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void test_stats() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void test_async_file() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void test_async_file_streams() throws Exception {
    startTest(getMethodName());
  }


}
