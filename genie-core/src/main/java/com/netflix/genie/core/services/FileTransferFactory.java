/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.genie.core.services;

/**
 * Factory for FileTransfer implementation based on the scheme.
 *
 * Created by amajumdar on 7/21/16.
 */
public interface FileTransferFactory {
    /**
     * Factory method to return the FileTransfer implementation.
     * @param scheme URI scheme
     * @return FileTransfer
     */
    FileTransfer get(String scheme);
}