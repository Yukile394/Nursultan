package minecraft;

import Nursultan.class10758;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class07165 {
   private Optional<class01894> N = Optional.empty();
   private Optional<class06513> y = Optional.empty();
   private class07499 L = class07499.y;
   private final Builder<String, class06915<?>> u = ImmutableMap.builder();
   private Optional<class03753> i = Optional.empty();
   private class03741 R = class03741.N;
   private boolean M;

   public class07165 L() {
      this.M = true;
      return this;
   }

   public class07165() {
      super();
   }

   public class03711 y(class01894 var1) {
      ImmutableMap<String, class06915<?>> immutablemap = this.u.buildOrThrow();
      class03753 class03753 = this.i.orElseGet(() -> this.R.create(immutablemap.keySet()));
      return new class03711(var1, new class07151(this.N, this.y, this.L, immutablemap, class03753, this.M));
   }

   public static class07165 y() {
      return new class07165();
   }

   public class07165 N(class03741 var1) {
      this.R = var1;
      return this;
   }

   public class07165 N(String var1, class06915<?> var2) {
      this.u.put(var1, var2);
      return this;
   }

   public class07165 N(class07499 var1) {
      this.L = var1;
      return this;
   }

   public class07165 N(class03753 var1) {
      this.i = Optional.of(var1);
      return this;
   }

   public class03711 N(Consumer<class03711> var1, String var2) {
      class03711 class03711 = this.y(class01894.N(var2));
      var1.accept(class03711);
      return class03711;
   }

   public class07165 N(class06584 var1, class00392 var2, class00392 var3, @Nullable class01894 var4, class07296 var5, boolean var6, boolean var7, boolean var8) {
      return this.N(new class06513(var1, var2, var3, Optional.ofNullable(var4).map(class06953::new), var5, var6, var7, var8));
   }

   @Deprecated(
      forRemoval = true
   )
   public class07165 N(class01894 var1) {
      this.N = Optional.of(var1);
      return this;
   }

   public class07165 N(class03711 var1) {
      this.N = Optional.of(var1.N());
      return this;
   }

   public static class07165 N() {
      return new class07165().L();
   }

   public class07165 N(class07310 var1, class00392 var2, class00392 var3, @Nullable class01894 var4, class07296 var5, boolean var6, boolean var7, boolean var8) {
      return this.N(new class06513(new class06584(var1.B()), var2, var3, Optional.ofNullable(var4).map(class06953::new), var5, var6, var7, var8));
   }

   public class07165 N(class06513 var1) {
      this.y = Optional.of(var1);
      return this;
   }

   public class07165 N(class10758 var1) {
      return this.N(var1.N());
   }
}
