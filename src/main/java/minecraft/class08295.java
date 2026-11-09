package minecraft;

import Nursultan.class10416;
import com.google.common.collect.Streams;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

class class08295 implements class08319 {
   private final class04490 y;
   private final String L;
   final class08296 N;
   private final class07741 u;

   class08295(class04490 var1, String var2, class08296 var3, class07741 var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.N = var3;
      this.u = var4;
   }

   @Override
   public Iterator<class08299> iterator() {
      Iterator<class07709> iterator = this.u.iterator();
      return new class08325(this, iterator);
   }

   @Override
   public Stream<class08299> y() {
      return Streams.mapWithIndex(this.u.stream(), (var1, var2) -> {
         if (var1 instanceof class07001 class07001) {
            return class08308.N(this.N((int)var2), this.N, class07001);
         } else {
            this.N((int)var2, var1);
            return null;
         }
      }).filter(Objects::nonNull);
   }

   void N(int var1, class07709 var2) {
      this.y.N_47(new class08324(this.L, var1, class07001.y, var2.u()));
   }

   class04490 N(int var1) {
      return this.y.N_46(new class10416(this.L, var1));
   }

   @Override
   public boolean N() {
      return this.u.isEmpty();
   }
}
