package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public record class01400(List<class01428> properties) {
   private static final Codec<List<class01428>> u = Codec.unboundedMap(Codec.STRING, class01426.L)
      .xmap(
         var0 -> var0.entrySet().stream().map(var0x -> new class01428((String)var0x.getKey(), (class01426)var0x.getValue())).toList(),
         var0 -> var0.stream().collect(Collectors.toMap(class01428::N, class01428::y))
      );
   public static final Codec<class01400> N = u.xmap(class01400::new, class01400::N);
   public static final class02362<ByteBuf, class01400> y = class01428.N.N_33(class02389.N()).N_10(class01400::new, class01400::N);

   public class01400(List<class01428> properties) {
      this.properties = (List<class01428>)properties;
   }

   public boolean N(class00500 var1) {
      return this.N(var1.i().E(), var1);
   }

   public Optional<String> N(class00507<?, ?> var1) {
      Iterator<class01428> iterator = this.properties.iterator();

      while (iterator.hasNext()) {
         Optional<String> optional = iterator.next().N(var1);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }

   public <S extends class00522<?, S>> boolean N(class00507<?, S> var1, S var2) {
      Iterator<class01428> iterator = this.properties.iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().N(var1, (S)var2)) {
            return false;
         }
      }

      return true;
   }

   public boolean N(class04688 var1) {
      return this.N(var1.N().R(), var1);
   }

   public List<class01428> N() {
      return this.properties;
   }
}
