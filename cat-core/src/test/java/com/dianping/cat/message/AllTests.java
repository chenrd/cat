package com.dianping.cat.message;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.dianping.cat.message.configuration.ConfigTest;
import com.dianping.cat.message.internal.MessageIdFactoryTest;
import com.dianping.cat.message.internal.MessageProducerTest;
import com.dianping.cat.message.internal.MillisSecondTimerTest;
import com.dianping.cat.message.io.InMemoryTest;
import com.dianping.cat.message.io.TcpSocketTest;
import com.dianping.cat.message.spi.codec.HtmlMessageCodecTest;
import com.dianping.cat.message.spi.codec.PlainTextMessageCodecTest;
import com.dianping.cat.storage.BucketManagerTest;

@RunWith(Suite.class)
@SuiteClasses({

/* <default> */
EventTest.class,

HeartbeatTest.class,

TransactionTest.class,

/* .configuration.model */
ConfigTest.class,

/* .internal */
MessageIdFactoryTest.class,

MessageProducerTest.class,

MillisSecondTimerTest.class,

/* .io */
InMemoryTest.class,

TcpSocketTest.class,

/* .spi.codec */
PlainTextMessageCodecTest.class,

HtmlMessageCodecTest.class,

/* .storage */
BucketManagerTest.class

})
public class AllTests {

}
