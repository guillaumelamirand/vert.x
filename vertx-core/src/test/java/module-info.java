import io.vertx.core.spi.VerticleFactory;
import io.vertx.tests.deployment.ClasspathVerticleFactory;

open module io.vertx.core.tests {

  requires io.vertx.codegen.api;
  requires io.vertx.core;
  requires io.vertx.core.logging;

  requires static assertj.core;
  requires static org.hamcrest;

  requires junit;
  requires java.management;
  requires java.logging;

  requires org.slf4j;

  requires static apacheds.protocol.dns;
  requires static apacheds.i18n;
  requires static mina.core;
  requires static apacheds.protocol.shared;

  requires static org.apache.logging.log4j.core;

  requires static jmh.core;

  requires transitive com.fasterxml.jackson.core;
  requires static com.fasterxml.jackson.annotation;
  requires static com.fasterxml.jackson.databind;

  requires io.netty.common;
  requires io.netty.buffer;
  requires io.netty.transport;
  requires io.netty.handler;
  requires io.netty.codec;
  requires io.netty.codec.compression;
  requires io.netty.codec.http;
  requires static io.netty.codec.haproxy;
  requires io.netty.codec.http2;
  requires io.netty.resolver.dns;

  provides VerticleFactory with ClasspathVerticleFactory, io.vertx.tests.vertx.AccessEventBusFromInitVerticleFactory;

  exports io.vertx.test.core;
  exports io.vertx.test.fakecluster;
  exports io.vertx.test.fakedns;
  exports io.vertx.test.fakeloadbalancer;
  exports io.vertx.test.fakemetrics;
  exports io.vertx.test.fakeresolver;
  exports io.vertx.test.fakestream;
  exports io.vertx.test.faketracer;
  exports io.vertx.test.http;
  exports io.vertx.test.netty;
  exports io.vertx.test.proxy;
  exports io.vertx.test.tls;

}
