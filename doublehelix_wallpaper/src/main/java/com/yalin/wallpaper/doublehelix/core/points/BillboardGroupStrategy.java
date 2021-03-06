/*******************************************************************************
 * Copyright 2015 Cypher Cove, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.yalin.wallpaper.doublehelix.core.points;

import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.utils.Array;

/**
 * Created by Darren on 9/20/2015.
 */
public interface BillboardGroupStrategy {

    ShaderProgram getBillboardGroupShader(int group);
    int decideBillboardGroup(BillboardDecal decal);
    void beforeBillboardGroup(int group, Array<BillboardDecal> contents);
    void afterBillboardGroup(int group);
    void beforeBillboardGroups();
    void afterBillboardGroups();
}
