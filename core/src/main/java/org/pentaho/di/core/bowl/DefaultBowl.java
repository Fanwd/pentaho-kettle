/*!
 * Copyright 2024 Hitachi Vantara.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.pentaho.di.core.bowl;

import org.pentaho.di.metastore.MetaStoreConst;
import org.pentaho.metastore.api.exceptions.MetaStoreException;
import org.pentaho.metastore.api.IMetaStore;

/**
 * The default/global Bowl. A singleton for standard behavior when there is no custom Bowl.
 *
 */
public class DefaultBowl implements Bowl {
  private static final DefaultBowl INSTANCE = new DefaultBowl();

  private DefaultBowl() {
  }

  public static DefaultBowl getInstance() {
    return INSTANCE;
  }


  @Override
  public IMetaStore getExplicitMetastore() throws MetaStoreException {
    return MetaStoreConst.getDefaultMetastore();
  }

  @Override
  public IMetaStore getMetastore() throws MetaStoreException {
    return MetaStoreConst.getDefaultMetastore();
  }

}
