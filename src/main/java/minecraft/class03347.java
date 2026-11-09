package minecraft;

import Nursultan.class10415;
import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record class03347<T>(class05946<class00751<T>> registryKey, Codec<T> codec, class03350<T> validator) {
   public static final class03347<class05957> N = new class03347<>(class04227.yq, class05957.L, i());
   public static final class03347<class08122> y = new class03347<>(class04227.yo, class07439.L, i());
   public static final class03347<class05074> L = new class03347<>(class04227.yJ, class05074.u, R());

   public Codec<T> L() {
      return this.codec;
   }

   public class03347(class05946<class00751<T>> registryKey, Codec<T> codec, class03350<T> validator) {
      this.registryKey = registryKey;
      this.codec = codec;
      this.validator = validator;
   }

   private static <T extends class01381> class03350<T> i() {
      return (var0, var1, var2) -> var2.N(var0.N(new class10415(var1), var1));
   }

   public class03350<T> u() {
      return this.validator;
   }

   public class05946<class00751<T>> y() {
      return this.registryKey;
   }

   public static Stream<class03347<?>> N() {
      return Stream.of(N, y, L);
   }

   public void N(class05561 var1, class05946<T> var2, T var3) {
      this.validator.run(var1, var2, (T)var3);
   }

   private static class03350<class05074> R() {
      return (var0, var1, var2) -> var2.N(var0.N(var2.N()).N(new class10415(var1), var1));
   }
}
