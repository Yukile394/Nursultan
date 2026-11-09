package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

class class07744 implements MapLike<class07709> {
   class07744(class07713 var1, class07001 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public String toString() {
      return "MapLike[" + this.N + "]";
   }

   public Stream<Pair<class07709, class07709>> entries() {
      return this.N.M().stream().map(var1 -> Pair.of(this.y.createString(var1.getKey()), var1.getValue()));
   }

   @Nullable
   public class07709 get(class07709 var1) {
      if (var1 instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            s1 = class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         String s = s1;
         return this.N.N(s);
      } else {
         throw new UnsupportedOperationException("Cannot get map entry with non-string key: " + var1);
      }
   }

   @Nullable
   public class07709 get(String var1) {
      return this.N.N(var1);
   }
}
