package org.apache.lucene.codecs.lucene49;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.lucene.codecs.DocValuesFormat;
import org.apache.lucene.codecs.NormsFormat;

/**
 * Read-write version of {@link Lucene49Codec} for testing.
 */
@SuppressWarnings("deprecation")
public class Lucene49RWCodec extends Lucene49Codec {
  
  private static final DocValuesFormat docValues = new Lucene49RWDocValuesFormat();
  
  @Override
  public DocValuesFormat getDocValuesFormatForField(String field) {
    return docValues;
  }
  
  private static final NormsFormat norms = new Lucene49NormsFormat();

  @Override
  public NormsFormat normsFormat() {
    return norms;
  }
}