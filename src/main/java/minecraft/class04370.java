package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import dev.isxander.yacl3.mixin.OptionInstanceAccessor;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import org.slf4j.Logger;

public class class04370<T> implements OptionInstanceAccessor {
   private static final Logger field_37862 = LogUtils.getLogger();
   public static final class04380<Boolean> field_38278 = new class04380<>(ImmutableList.of(Boolean.TRUE, Boolean.FALSE), Codec.BOOL);
   public static final class04363<Boolean> field_41333 = (var0, var1) -> var1 ? class05220.y : class05220.L;
   private final class04355<T> field_37863;
   final Function<T, class00392> field_37864;
   private final class04344<T> field_37865;
   private final Codec<T> field_38279;
   private final T field_37866;
   private final Consumer<T> field_37867;
   final class00392 field_38280;
   private T field_37868;

   public static class04370<Boolean> method_41749(String var0, class04355<Boolean> var1, boolean var2) {
      return method_41750(var0, var1, var2, var0x -> {});
   }

   public static class04370<Boolean> method_42402(String var0, boolean var1) {
      return method_41750(var0, method_42399(), var1, var0x -> {});
   }

   public class06478 method_18520(class05630 var1, int var2, int var3, int var4) {
      return this.method_47603(var1, var2, var3, var4, var0 -> {});
   }

   public class04344<T> method_41754() {
      return this.field_37865;
   }

   public Codec<T> method_42404() {
      return this.field_38279;
   }

   public class06478 method_47603(class05630 var1, int var2, int var3, int var4, Consumer<T> var5) {
      return this.field_37865.N(this.field_37863, var1, var2, var3, var4, var5).apply(this);
   }

   public class06478 method_57701(class05630 var1) {
      return this.method_18520(var1, 0, 0, 150);
   }

   public class04370(String var1, class04355<T> var2, class04363<T> var3, class04344<T> var4, Codec<T> var5, T var6, Consumer<T> var7) {
      super();
      this.field_38280 = class00392.L(var1);
      this.field_37863 = var2;
      this.field_37864 = var2x -> var3.toString(this.field_38280, var2x);
      this.field_37865 = var4;
      this.field_38279 = var5;
      this.field_37866 = (T)var6;
      this.field_37867 = var7;
      this.field_37868 = this.field_37866;
   }

   public class04370(String var1, class04355<T> var2, class04363<T> var3, class04344<T> var4, T var5, Consumer<T> var6) {
      this(var1, var2, var3, var4, var4.y(), (T)var5, var6);
   }

   @Override
   public String toString() {
      return this.field_38280.getString();
   }

   public static class04370<Boolean> method_41751(String var0, boolean var1, Consumer<Boolean> var2) {
      return method_41750(var0, method_42399(), var1, var2);
   }

   public static <T> class04355<T> method_42399() {
      return var0 -> null;
   }

   public void method_41748(T var1) {
      Object object = this.field_37865.u((T)var1).orElseGet(() -> {
         field_37862.error("Illegal option value {} for {}", var1, this.field_38280.getString());
         return this.field_37866;
      });
      if (!class06202.Nq().r()) {
         this.field_37868 = (T)object;
      } else {
         if (!Objects.equals(this.field_37868, object)) {
            this.field_37868 = (T)object;
            this.field_37867.accept(this.field_37868);
         }
      }
   }

   public T method_41753() {
      return this.field_37868;
   }

   public static class04370<Boolean> method_47604(String var0, class04355<Boolean> var1, class04363<Boolean> var2, boolean var3, Consumer<Boolean> var4) {
      return new class04370<>(var0, var1, var2, field_38278, var3, var4);
   }

   public static class04370<Boolean> method_41750(String var0, class04355<Boolean> var1, boolean var2, Consumer<Boolean> var3) {
      return method_47604(var0, var1, field_41333, var2, var3);
   }

   public static <T> class04355<T> method_42717(class00392 var0) {
      return var1 -> class04141.N(var0);
   }
}
