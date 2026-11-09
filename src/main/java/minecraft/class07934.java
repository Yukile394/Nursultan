package minecraft;

import Nursultan.class09364;
import Nursultan.class09366;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.ReadTimeoutException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07934 extends SimpleChannelInboundHandler<JsonElement> {
   private static final Logger N = LogUtils.getLogger();
   private static final AtomicInteger y = new AtomicInteger(0);
   private final class07932 L;
   private final class07403 u;
   private final class07911 i;
   private final Channel R;
   private final class07393 M;
   private final AtomicInteger B = new AtomicInteger();
   private final Int2ObjectMap<class07903<?>> Z = Int2ObjectMaps.synchronize(new Int2ObjectOpenHashMap());

   public class07934(Channel var1, class07911 var2, class07393 var3, class07932 var4) {
      super();
      this.u = class07403.N(y.incrementAndGet());
      this.i = var2;
      this.M = var3;
      this.R = var1;
      this.L = var4;
   }

   public <Result> CompletableFuture<Result> y(class03529<? extends class07940<Void, Result>> var1) {
      return this.N(var1, null, true);
   }

   private static boolean y(JsonElement var0) {
      return class05001.y(var0);
   }

   public <Params, Result> CompletableFuture<Result> y(class03529<? extends class07940<Params, Result>> var1, Params var2) {
      return this.N(var1, var2, true);
   }

   @Nullable
   public JsonElement N(String var1, @Nullable JsonElement var2) {
      class01894 class01894 = class01894.L(var1);
      if (class01894 == null) {
         throw new class09366("Failed to parse method value: " + var1);
      } else {
         Optional<class07945<?, ?>> optional = class04206.NQ.y(class01894);
         if (optional.isEmpty()) {
            throw new class09364("Method not found: " + var1);
         } else if (optional.get().y().N()) {
            try {
               return this.M.<JsonElement>N(() -> optional.get().N(this.M, var2, this.u)).join();
            } catch (CompletionException completionexception) {
               Throwable throwable = completionexception.getCause();
               if (throwable instanceof RuntimeException) {
                  throw (RuntimeException)throwable;
               } else {
                  throw completionexception;
               }
            }
         } else {
            return optional.get().N(this.M, var2, this.u);
         }
      }
   }

   @Nullable
   JsonObject N(JsonObject var1) {
      try {
         JsonElement jsonelement = class07916.N(var1);
         String s = class07916.y(var1);
         JsonElement jsonelement1 = class07916.u(var1);
         JsonElement jsonelement2 = class07916.L(var1);
         JsonObject jsonobject = class07916.i(var1);
         if (s != null && jsonelement1 == null && jsonobject == null) {
            return jsonelement != null && !N(jsonelement)
               ? class07918.field_62301.N("Invalid request id - only String, Number and NULL supported")
               : this.N(jsonelement, s, jsonelement2);
         } else if (s == null && jsonelement1 != null && jsonobject == null && jsonelement != null) {
            if (y(jsonelement)) {
               this.N(jsonelement.getAsInt(), jsonelement1);
            } else {
               N.warn("Received respose {} with id {} we did not request", jsonelement1, jsonelement);
            }

            return null;
         } else {
            return s == null && jsonelement1 == null && jsonobject != null
               ? this.N(jsonelement, jsonobject)
               : class07918.field_62301.N(Objects.requireNonNullElse(jsonelement, JsonNull.INSTANCE));
         }
      } catch (Exception exception) {
         N.error("Error while handling rpc request", exception);
         return class07918.field_62304.N("Unknown error handling request - check server logs for stack trace");
      }
   }

   @Nullable
   private JsonObject N(@Nullable JsonElement var1, String var2, @Nullable JsonElement var3) {
      boolean flag = var1 != null;

      try {
         JsonElement jsonelement = this.N(var2, var3);
         return jsonelement != null && flag ? class07916.N(var1, jsonelement) : null;
      } catch (class07400 class07400) {
         N.debug("Invalid parameter invocation {}: {}, {}", new Object[]{var2, var3, class07400.getMessage()});
         return flag ? class07918.field_62303.N(var1, class07400.getMessage()) : null;
      } catch (class07412 class07412) {
         N.error("Failed to encode json rpc response {}: {}", var2, class07412.getMessage());
         return flag ? class07918.field_62304.N(var1, class07412.getMessage()) : null;
      } catch (class09366 class09366) {
         return flag ? class07918.field_62301.N(var1, class09366.getMessage()) : null;
      } catch (class09364 class09364) {
         return flag ? class07918.field_62302.N(var1, class09364.getMessage()) : null;
      } catch (Exception exception) {
         N.error("Error while dispatching rpc method {}", var2, exception);
         return flag ? class07918.field_62304.N(var1) : null;
      }
   }

   public void N() {
      long ix = class07536.L();
      this.Z
         .int2ObjectEntrySet()
         .removeIf(
            var2 -> {
               boolean flag = ((class07903)var2.getValue()).N(ix);
               if (flag) {
                  ((class07903)var2.getValue())
                     .y()
                     .completeExceptionally(
                        new ReadTimeoutException("RPC method " + ((class07903)var2.getValue()).N().B().N() + " timed out waiting for response")
                     );
               }

               return flag;
            }
         );
   }

   @Nullable
   private JsonObject N(@Nullable JsonElement var1, JsonObject var2) {
      if (var1 != null && y(var1)) {
         class07903<?> class07903 = (class07903<?>)this.Z.remove(var1.getAsInt());
         if (class07903 != null) {
            class07903.y().completeExceptionally(new class07404(var1, var2));
         }
      }

      N.error("Received error (id: {}): {}", var1, var2);
      return null;
   }

   private void N(int var1, JsonElement var2) {
      class07903<?> class07903 = (class07903<?>)this.Z.remove(var1);
      if (class07903 == null) {
         N.warn("Received unknown response (id: {}): {}", var1, var2);
      } else {
         class07903.N(var2);
      }
   }

   private static boolean N(JsonElement var0) {
      return var0.isJsonNull() || class05001.y(var0) || class05001.N(var0);
   }

   protected void channelRead0(ChannelHandlerContext var1, JsonElement var2) {
      if (var2.isJsonObject()) {
         JsonObject jsonobject = this.N(var2.getAsJsonObject());
         if (jsonobject != null) {
            this.R.writeAndFlush(jsonobject);
         }
      } else if (var2.isJsonArray()) {
         this.R.writeAndFlush(this.N(var2.getAsJsonArray().asList()));
      } else {
         this.R.writeAndFlush(class07918.field_62301.N(null));
      }
   }

   public void N(class03529<? extends class07940<Void, ?>> var1) {
      this.N(var1, null, false);
   }

   public <Params> void N(class03529<? extends class07940<Params, ?>> var1, Params var2) {
      this.N(var1, var2, false);
   }

   @Nullable
   private <Params, Result> CompletableFuture<Result> N(class03529<? extends class07940<Params, ? extends Result>> var1, @Nullable Params var2, boolean var3) {
      List list = var2 != null ? List.of(Objects.requireNonNull(((class07940)var1.N()).N(var2))) : List.of();
      if (var3) {
         CompletableFuture completablefuture = new CompletableFuture();
         int ix = this.B.incrementAndGet();
         long j = class07536.u.get(TimeUnit.MILLISECONDS);
         this.Z.put(ix, new class07903(var1, completablefuture, j + 5000L));
         this.R.writeAndFlush(class07916.N(ix, var1.B().N(), list));
         return completablefuture;
      } else {
         this.R.writeAndFlush(class07916.N(null, var1.B().N(), list));
         return null;
      }
   }

   private JsonArray N(List<JsonElement> var1) {
      JsonArray jsonarray = new JsonArray();
      var1.stream().map(var1x -> this.N(var1x.getAsJsonObject())).filter(Objects::nonNull).forEach(jsonarray::add);
      return jsonarray;
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      if (var2.getCause() instanceof JsonParseException) {
         this.R.writeAndFlush(class07918.field_62300.N(var2.getMessage()));
      } else {
         super.exceptionCaught(var1, var2);
         this.R.close().awaitUninterruptibly();
      }
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      this.L.N(this.u, "Management connection opened for {}", this.R.remoteAddress());
      super.channelActive(var1);
      this.i.N(this);
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.L.N(this.u, "Management connection closed for {}", this.R.remoteAddress());
      super.channelInactive(var1);
      this.i.y(this);
   }
}
