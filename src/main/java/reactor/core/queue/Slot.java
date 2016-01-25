/*
 * Copyright (c) 2011-2016 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package reactor.core.queue;

import java.io.Serializable;

import reactor.core.trait.Recyclable;

/**
 * A simple holder
 * @param <T>
 */
public final class Slot<T> implements Recyclable, Serializable {

	private static final long serialVersionUID = 5172014386416785095L;

	public T value = null;

	@Override
	public void recycle() {
		value = null;
	}
}
