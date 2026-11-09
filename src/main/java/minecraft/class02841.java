package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public record class02841(Map<String, String> properties) implements class02694 {
   public static final class02841 N = new class02841(Map.of());
   public static final Codec<class02841> y = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(class02841::new, class02841::y);
   private static final class02362<ByteBuf, Map<String, String>> i = class02389.N(Object2ObjectOpenHashMap::new, class02389.s, class02389.s);
   public static final class02362<ByteBuf, class02841> L = i.N_10(class02841::new, class02841::y);

   public class02841(Map<String, String> properties) {
      super();
      this.properties = (Map<String, String>)properties;
   }

   public Map<String, String> y() {
      return this.properties;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      Integer integer = this.N(class04593.L);
      if (integer != null) {
         var2.accept(class00392.N("container.beehive.honey", integer, 5).N(class06541.field_1080));
      }
   }

   public <T extends Comparable<T>> class02841 N(class08092<T> var1, class00500 var2) {
      return this.N(var1, var2.L(var1));
   }

   @Nullable
   public <T extends Comparable<T>> T N(class08092<T> var1) {
      String s = this.properties.get(var1.R());
      return (T)(s == null ? null : var1.y(s).orElse(null));
   }

   public class00500 N(class00500 var1) {
      class00507<class00891, class00500> class00507 = var1.i().E();

      for (Entry entry : this.properties.entrySet()) {
         class08092<?> class08092 = class00507.N((String)entry.getKey());
         if (class08092 != null) {
            var1 = N(var1, class08092, (String)entry.getValue());
         }
      }

      return var1;
   }

   private static <T extends Comparable<T>> class00500 N(class00500 var0, class08092<T> var1, String var2) {
      return var1.y(var2).map(var2x -> var0.y(var1, var2x)).orElse(var0);
   }

   public boolean N() {
      return this.properties.isEmpty();
   }

   public <T extends Comparable<T>> class02841 N(class08092<T> var1, T var2) {
      return new class02841(class07536.N(this.properties, var1.R(), var1.y((T)var2)));
   }
}
