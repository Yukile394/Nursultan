package minecraft;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Sharable
public class class00448 extends ChannelDuplexHandler {
   private final Logger y = LogUtils.getLogger();
   private static final AttributeKey<Boolean> L = AttributeKey.valueOf("authenticated");
   private static final AttributeKey<Boolean> u = AttributeKey.valueOf("websocket_auth_allowed");
   private static final String i = "minecraft-v1";
   private static final String R = "minecraft-v1,";
   public static final String N = "Bearer ";
   private final class00456 M;
   private final Set<String> B;

   @Nullable
   private String L(HttpRequest var1) {
      String s = var1.headers().get(HttpHeaderNames.AUTHORIZATION);
      return s != null && s.startsWith("Bearer ") ? s.substring("Bearer ".length()).trim() : null;
   }

   public class00448(class00456 var1, String var2) {
      super();
      this.M = var1;
      this.B = Sets.newHashSet(var2.split(","));
   }

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      if (var2 instanceof HttpResponse httpresponse
         && httpresponse.status().code() == HttpResponseStatus.SWITCHING_PROTOCOLS.code()
         && var1.channel().attr(u).get() != null
         && ((Boolean)var1.channel().attr(u).get()).equals(Boolean.TRUE)) {
         httpresponse.headers().set(HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL, "minecraft-v1");
      }

      super.write(var1, var2, var3);
   }

   @Nullable
   private String u(HttpRequest var1) {
      String s = var1.headers().get(HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL);
      return s != null && s.startsWith("minecraft-v1,") ? s.substring("minecraft-v1,".length()).trim() : null;
   }

   private boolean y(HttpRequest var1) {
      String s = var1.headers().get(HttpHeaderNames.ORIGIN);
      return s != null && !s.isEmpty() ? this.B.contains(s) : false;
   }

   private void N(ChannelHandlerContext var1, String var2) {
      byte[] abyte = ("{\"error\":\"Unauthorized\",\"message\":\"" + var2 + "\"}").getBytes(StandardCharsets.UTF_8);
      DefaultFullHttpResponse defaultfullhttpresponse = new DefaultFullHttpResponse(
         HttpVersion.HTTP_1_1, HttpResponseStatus.UNAUTHORIZED, Unpooled.wrappedBuffer(abyte)
      );
      defaultfullhttpresponse.headers().set(HttpHeaderNames.CONTENT_TYPE, "application/json");
      defaultfullhttpresponse.headers().set(HttpHeaderNames.CONTENT_LENGTH, abyte.length);
      defaultfullhttpresponse.headers().set(HttpHeaderNames.CONNECTION, "close");
      var1.writeAndFlush(defaultfullhttpresponse).addListener(var1x -> var1.close());
   }

   private class00441 N(HttpRequest var1) {
      String s = this.L(var1);
      if (s != null) {
         return this.N(s) ? class00441.N() : class00441.N("Invalid API key");
      } else {
         String s1 = this.u(var1);
         if (s1 != null) {
            if (!this.y(var1)) {
               return class00441.N("Origin Not Allowed");
            } else {
               return this.N(s1) ? class00441.N(true) : class00441.N("Invalid API key");
            }
         } else {
            return class00441.N("Missing API key");
         }
      }
   }

   private String N(ChannelHandlerContext var1) {
      return ((InetSocketAddress)var1.channel().remoteAddress()).getAddress().getHostAddress();
   }

   public boolean N(String var1) {
      if (var1.isEmpty()) {
         return false;
      } else {
         byte[] abyte = var1.getBytes(StandardCharsets.UTF_8);
         byte[] abyte1 = this.M.y().getBytes(StandardCharsets.UTF_8);
         return MessageDigest.isEqual(abyte, abyte1);
      }
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      String s = this.N(var1);
      if (var2 instanceof HttpRequest httprequest) {
         class00441 class00441 = this.N(httprequest);
         if (!class00441.y()) {
            this.y.debug("Authentication rejected for connection with ip {}: {}", s, class00441.L());
            var1.channel().attr(L).set(false);
            this.N(var1, class00441.L());
            return;
         }

         var1.channel().attr(L).set(true);
         if (class00441.u()) {
            var1.channel().attr(u).set(Boolean.TRUE);
         }
      }

      Boolean obool = (Boolean)var1.channel().attr(L).get();
      if (Boolean.TRUE.equals(obool)) {
         super.channelRead(var1, var2);
      } else {
         this.y.debug("Dropping unauthenticated connection with ip {}", s);
         var1.close();
      }
   }
}
