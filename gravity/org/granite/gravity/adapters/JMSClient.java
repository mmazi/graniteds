/*
  GRANITE DATA SERVICES
  Copyright (C) 2011 GRANITE DATA SERVICES S.A.S.

  This file is part of Granite Data Services.

  Granite Data Services is free software; you can redistribute it and/or modify
  it under the terms of the GNU Library General Public License as published by
  the Free Software Foundation; either version 2 of the License, or (at your
  option) any later version.

  Granite Data Services is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the GNU Library General Public License
  for more details.

  You should have received a copy of the GNU Library General Public License
  along with this library; if not, see <http://www.gnu.org/licenses/>.
*/

package org.granite.gravity.adapters;

import flex.messaging.messages.AsyncMessage;
import flex.messaging.messages.CommandMessage;

import java.util.Map;

public interface JMSClient {
	
	public static final String JMSCLIENT_KEY_PREFIX = "org.granite.gravity.jmsClient.";

    public void connect() throws Exception;

    public void subscribe(CommandMessage message) throws Exception;

	public void subscribe(String selector, String destination, String topic) throws Exception;

    public void unsubscribe(CommandMessage message) throws Exception;

	public void send(Map<String, ?> params, Object msg, long timeToLive) throws Exception;

    public void send(AsyncMessage message) throws Exception;

    public boolean hasActiveConsumer();

    public void close() throws Exception;
}